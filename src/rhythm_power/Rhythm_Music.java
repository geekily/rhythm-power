package rhythm_power;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.player.Player;


public class Rhythm_Music extends Thread{

	private FileInputStream fis;
	public static Player play;
	public static Boolean flag;
	public static String songName;
	public static File path=new File("");

	int num;

	public Rhythm_Music(int num) {
		this.num=num;
	}

	@Override
	public void run() {
		try {

			switch(num) {
			case 1:
				flag=false;
				fis=new FileInputStream(path.getAbsolutePath()+"\\songs\\song1.mp3");
				songName="M2U - The Queen";
				play=new Player(fis);
				play.play();
				if(play.isComplete()) {
					flag=true;
				}
				fis.close();play.close();
				break;
				
			case 2:
				flag=false;
				fis=new FileInputStream(path.getAbsolutePath()+"\\songs\\song2.mp3");
				songName="BTS - Dynamite";
				play=new Player(fis);
				play.play();
				if(play.isComplete()) {
					flag=true;
				}
				fis.close();play.close();
				break;
			}



		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
