package rhythm_power;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


import javazoom.jl.player.Player;


public class Rhythm_Main {

	public static Rhythm_Console cs;

	public static void main(String[] args) {

		int num;
		
		

		Scanner sc=new Scanner(System.in);
		Rhythm_Music music = null;
		Rhythm_Frame_Thread frame;
		Rhythm_Song1 song1;
		Rhythm_Loading rl;

		try {
			FileInputStream fisEnterSound;
			Player playEnterSound;
			FileInputStream fisResultSound;;
			Player playResultSound;
			
			String blankUpside="\n\n\n\n\n\n\n\n\n\n";
			String blankLeft="                                                                                       ";

			while(true) {

				Rhythm_Login lg=new Rhythm_Login();
				lg.menu();

				do {
					System.out.println(blankUpside);
					System.out.println(blankLeft+" -----------------------------------------------------");
					System.out.println(blankLeft+"|               Welcome to RHYTHM POWER               |");
					System.out.println(blankLeft+"|            �ڹ��ܼ��� �ִ�ȭ �����ּ��䢾           |");
					System.out.println(blankLeft+" -----------------------------------------------------");
					System.out.println(blankLeft+"|                   ��� ���á�                       |");
					System.out.println(blankLeft+"| 01. M2U - The Queen                                 |");
					System.out.println(blankLeft+"| 02. BTS - Dynamite                                  |");
					System.out.println(blankLeft+" -----------------------------------------------------");
					System.out.println(blankLeft+"| 09. ��������                                        |");
					System.out.println(blankLeft+" -----------------------------------------------------");
					System.out.print(blankLeft+" �� ��ȣ : ");
					num=sc.nextInt();

				}while(num<1||num>9);

				switch (num) {
				case 1: 
					fisEnterSound=new FileInputStream(music.path.getAbsolutePath()+"\\songs\\entersound.mp3");
					playEnterSound=new Player(fisEnterSound);
					playEnterSound.play();
					
					rl=new Rhythm_Loading();
					rl.start();rl.join();

					cs=new Rhythm_Console();
					music=new Rhythm_Music(num);frame=new Rhythm_Frame_Thread();song1=new Rhythm_Song1();
					music.start();frame.start();song1.start();music.join();frame.join();
					cs.setVisible(false);Rhythm_Frame_Thread.resultFrame();

					fisResultSound=new FileInputStream(music.path.getAbsolutePath()+"\\songs\\resultsound.mp3");
					playResultSound=new Player(fisResultSound);
					playResultSound.play();break;

				case 2:
					fisEnterSound=new FileInputStream(music.path.getAbsolutePath()+"\\songs\\entersound.mp3");
					playEnterSound=new Player(fisEnterSound);
					playEnterSound.play();
					
					rl=new Rhythm_Loading();
					rl.start();rl.join();

					cs=new Rhythm_Console();
					music=new Rhythm_Music(num);frame=new Rhythm_Frame_Thread();song1=new Rhythm_Song1();
					music.start();frame.start();song1.start();music.join();frame.join();
					cs.setVisible(false);Rhythm_Frame_Thread.resultFrame();
					
					fisResultSound=new FileInputStream(music.path.getAbsolutePath()+"\\songs\\resultsound.mp3");
					playResultSound=new Player(fisResultSound);
					playResultSound.play();break;


				case 9:
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
							+blankLeft+"��������"
							+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.exit(0);
				}

			}
		} catch (Exception e1) {
			System.out.println(e1.toString());
		}

	}
}
