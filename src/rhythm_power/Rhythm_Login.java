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
	ArrayList<Rhythm_LoginVO> members = new ArrayList<Rhythm_LoginVO>(); // LoginVO Ÿ�� ����Ʈ vo ���� �ʱ�ȭ
	String blankUpside="\n\n\n\n\n\n\n\n\n\n";
	String blankLeft="                                                                                       ";


	public static boolean flag = false;

	public Rhythm_Login() { // ���� �ҷ�����

		try {
			FileInputStream fis = new FileInputStream(music.path.getAbsolutePath()+"\\logintxt\\logintxt.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			members = (ArrayList<Rhythm_LoginVO>)ois.readObject();
		} catch (Exception e) {
			//System.out.println(e.toString());
		}

	}

	public void menu() { // �޴�ȭ��

		int user;

		do {
			System.out.println(blankUpside);
			System.out.println(blankLeft+" -----------------------------------------------------");
			System.out.println(blankLeft+"|               Welcome to RHYTHM POWER               |");
			System.out.println(blankLeft+"|            �ڹ��ܼ��� �ִ�ȭ �����ּ��䢾           |");
			System.out.println(blankLeft+" -----------------------------------------------------");
			System.out.println(blankLeft+"|                                                     |");
			System.out.println(blankLeft+"| 01. ȸ������                                        |");
			System.out.println(blankLeft+"| 02. �α���                                          |");
			System.out.println(blankLeft+" -----------------------------------------------------");
			System.out.println(blankLeft+"| 09. ��������                                        |");
			System.out.println(blankLeft+" -----------------------------------------------------");
			System.out.print(blankLeft+" �Է� : ");

			user = sc.nextInt();
			switch(user) {
			case 1: join(); break;			
			case 2: login(); break;
			case 9: System.exit(0);
			default: break;
			}

		}while(user!=2&&user!=9);

	}

	public void join() { // 1. ȸ������

		vo = new Rhythm_LoginVO();
		if(members == null) {
			members = new ArrayList<Rhythm_LoginVO>();
		}

		do {
			System.out.print(blankLeft+"���̵�: ");
			String id = sc.next();
			if(idCheck(id)) {
				System.out.println(blankLeft+"�ߺ��� ���̵��Դϴ�.\n");
				flag = false;
			}else {
				vo.setId(id);
				flag = true;
			}
		}while(!flag);

		do {
			System.out.print(blankLeft+"��й�ȣ: ");
			String pw = sc.next();
			System.out.print(blankLeft+"��й�ȣ ��Ȯ��: ");
			String pwc = sc.next();
			if(pw.equals(pwc)) {
				System.out.println(blankLeft+"ȸ������ �Ϸ�!\n");
				vo.setPw(pw);
				flag = true;
			}else {
				System.out.println(blankLeft+"��й�ȣ�� ��ġ���� �ʽ��ϴ�!\n");
				flag = false;
			}			
		}while(!flag);

		members.add(vo);

		accountFileMake();

	}

	public void login() { // 2. �α���

		do {
			System.out.print(blankLeft+"���̵�: ");
			String id = sc.next();
			System.out.print(blankLeft+"��й�ȣ: ");
			String pw = sc.next();
			Rhythm_LoginVO member = findid(id);	
			if(member == null) {
				System.out.println(blankLeft+"��ϵ��� ���� ���̵��Դϴ�.\n");
				flag = false;
			}else if(member.getPw().equals(pw)) {
				System.out.println(blankLeft+ "'" + member.getId() + "' ���� �α��� �ϼ̽��ϴ�.\n");
				flag = true;
			}else {
				System.out.println(blankLeft+"��й�ȣ�� ���� �ʽ��ϴ�.\n");
				flag = false;
			}
		} while (!flag);

	}

	public Rhythm_LoginVO findid(String id) { // ���̵� ����Ʈ���� �˻�

		for(Rhythm_LoginVO loginvo : members) {
			if(loginvo.getId().equals(id)){
				return loginvo;	
			}

		}
		return null;

	}

	public boolean idCheck(String id) { // ���̵� �ߺ�Ȯ��
		boolean check = true;
		Rhythm_LoginVO login = findid(id);
		if(login == null) {
			check = false;
		}
		return check;
	}

	public void accountFileMake() { // ���� ����Ʈ ���Ϸ� ����

		try {

			String path = music.path.getAbsolutePath()+"\\logintxt\\logintxt.txt";
			File f = new File(path);

			if(!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}

			FileOutputStream fos = new FileOutputStream(music.path.getAbsolutePath()+"\\logintxt\\logintxt.txt"); // db ���� �����
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(members);
			oos.close();
			fos.close();				

		} catch (Exception e) {
			// System.out.println(e.toString());
		}

	}
}
