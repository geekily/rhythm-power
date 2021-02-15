package rhythm_power;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Rhythm_Login {

	Scanner sc = new Scanner(System.in);
	Rhythm_Music music=null;
	Rhythm_LoginVO vo;
	ArrayList<Rhythm_LoginVO> members = new ArrayList<Rhythm_LoginVO>(); // LoginVO 타입 리스트 vo 만들어서 초기화
	String blankUpside="\n\n\n\n\n\n\n\n\n\n";
	String blankLeft="                                                                                       ";


	public static boolean flag = false;

	public Rhythm_Login() { // 파일 불러오기

		try {
			FileInputStream fis = new FileInputStream(music.path.getAbsolutePath()+"\\logintxt\\logintxt.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			members = (ArrayList<Rhythm_LoginVO>)ois.readObject();
		} catch (Exception e) {
			//System.out.println(e.toString());
		}

	}

	public void menu() { // 메뉴화면

		int user;

		do {
			System.out.println(blankUpside);
			System.out.println(blankLeft+" -----------------------------------------------------");
			System.out.println(blankLeft+"|               Welcome to RHYTHM POWER               |");
			System.out.println(blankLeft+"|            자바콘솔을 최대화 시켜주세요♥           |");
			System.out.println(blankLeft+" -----------------------------------------------------");
			System.out.println(blankLeft+"|                                                     |");
			System.out.println(blankLeft+"| 01. 회원가입                                        |");
			System.out.println(blankLeft+"| 02. 로그인                                          |");
			System.out.println(blankLeft+" -----------------------------------------------------");
			System.out.println(blankLeft+"| 09. 게임종료                                        |");
			System.out.println(blankLeft+" -----------------------------------------------------");
			System.out.print(blankLeft+" 입력 : ");

			user = sc.nextInt();
			switch(user) {
			case 1: join(); break;			
			case 2: login(); break;
			case 9: System.exit(0);
			default: break;
			}

		}while(user!=2&&user!=9);

	}

	public void join() { // 1. 회원가입

		vo = new Rhythm_LoginVO();
		if(members == null) {
			members = new ArrayList<Rhythm_LoginVO>();
		}

		do {
			System.out.print(blankLeft+"아이디: ");
			String id = sc.next();
			if(idCheck(id)) {
				System.out.println(blankLeft+"중복된 아이디입니다.\n");
				flag = false;
			}else {
				vo.setId(id);
				flag = true;
			}
		}while(!flag);

		do {
			System.out.print(blankLeft+"비밀번호: ");
			String pw = sc.next();
			System.out.print(blankLeft+"비밀번호 재확인: ");
			String pwc = sc.next();
			if(pw.equals(pwc)) {
				System.out.println(blankLeft+"회원가입 완료!\n");
				vo.setPw(pw);
				flag = true;
			}else {
				System.out.println(blankLeft+"비밀번호가 일치하지 않습니다!\n");
				flag = false;
			}			
		}while(!flag);

		members.add(vo);

		accountFileMake();

	}

	public void login() { // 2. 로그인

		do {
			System.out.print(blankLeft+"아이디: ");
			String id = sc.next();
			System.out.print(blankLeft+"비밀번호: ");
			String pw = sc.next();
			Rhythm_LoginVO member = findid(id);	
			if(member == null) {
				System.out.println(blankLeft+"등록되지 않은 아이디입니다.\n");
				flag = false;
			}else if(member.getPw().equals(pw)) {
				System.out.println(blankLeft+ "'" + member.getId() + "' 님이 로그인 하셨습니다.\n");
				flag = true;
			}else {
				System.out.println(blankLeft+"비밀번호가 맞지 않습니다.\n");
				flag = false;
			}
		} while (!flag);

	}

	public Rhythm_LoginVO findid(String id) { // 아이디 리스트에서 검색

		for(Rhythm_LoginVO loginvo : members) {
			if(loginvo.getId().equals(id)){
				return loginvo;	
			}

		}
		return null;

	}

	public boolean idCheck(String id) { // 아이디 중복확인
		boolean check = true;
		Rhythm_LoginVO login = findid(id);
		if(login == null) {
			check = false;
		}
		return check;
	}

	public void accountFileMake() { // 계정 리스트 파일로 저장

		try {

			String path = music.path.getAbsolutePath()+"\\logintxt\\logintxt.txt";
			File f = new File(path);

			if(!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}

			FileOutputStream fos = new FileOutputStream(music.path.getAbsolutePath()+"\\logintxt\\logintxt.txt"); // db 파일 만들기
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(members);
			oos.close();
			fos.close();				

		} catch (Exception e) {
			// System.out.println(e.toString());
		}

	}
}
