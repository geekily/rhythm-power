package rhythm_power;

import rhythm_power.Rhythm_Cell;
import rhythm_power.Rhythm_Main;
import rhythm_power.Rhythm_Music;

public class Rhythm_Frame_Thread extends Thread{

	public static int sec=0;
	public static int score=0;
	public static int good=0;
	public static int bad=0;
	public static int miss=0;

	@Override
	public void run() {

		try {
			Rhythm_Cell.cellSetup();
			sec=0;
			score=0;
			good=0;
			bad=0;
			miss=0;
			while(true) {
				sec++;
				System.out.println(frame());
				sleep(500);
				System.out.println(frame().replaceAll("■", "□").replaceAll("♪", "♬").replaceAll("↓", "ⅴ").replaceAll("↑", "＾").replaceAll("●", "○").replaceAll("◆", "◇"));
				sleep(500);
				if(Rhythm_Music.flag) {
					break;
				}
				if(score==-10) {
					Rhythm_Main.cs.setVisible(false);
					Rhythm_Music.play.close();
					Rhythm_Music.flag=true;

				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static String frame() {




		String blank="                                                                          ";
		String upSign="  ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑  ";
		String downSign="  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  ";
		String msg="  ◆◆◆◆◆◆◆◆◆◆최소화 된 AWT창을 띄워주세요◆◆◆◆◆◆◆◆◆◆◆  ";
		String scoreBlank="               ";
		String frame="\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+upSign+"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■"+scoreBlank+"현재 시간 : "+new Rhythm_Time().time()+"\n"
				+msg+"■      ____   _           _   _                 ____                             ■\n"
				+blank+"■      |  _ \\| |__  _   _| |_| |__  _ __ ___   |  _ \\ _____      _____ _ __      ■\n"
				+blank+"■      | |_) | '_ \\| | | | __| '_ \\| '_ ` _ \\  | |_) / _ \\ \\ /\\ / / _ \\ '__|     ■\n"
				+blank+"■      |  _ <| | | | |_| | |_| | | | | | | | | |  __/ (_) \\ V  V /  __/ |        ■\n"
				+blank+"■      |_| \\_\\_| |_|\\__, |\\__|_| |_|_| |_| |_| |_|   \\___/ \\_/\\_/ \\___|_|        ■\n"
				+blank+"■                   |___/                                                        ■\n"
				+blank+"■                                                                                ■\n"
				+blank+"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"//		String blank="                                                                          ";
				+blank+"｜"+Rhythm_Cell.cellS.get(0)+"｜"+Rhythm_Cell.cellD.get(0)+"｜"+Rhythm_Cell.cellSP.get(0)+"｜"+Rhythm_Cell.cellK.get(0)+"｜"+Rhythm_Cell.cellL.get(0)+"｜"+scoreBlank+"♪♬♪♬♪♬♪♬♪♬♪♬♪♬♪♬"+"\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(1)+"｜"+Rhythm_Cell.cellD.get(1)+"｜"+Rhythm_Cell.cellSP.get(1)+"｜"+Rhythm_Cell.cellK.get(1)+"｜"+Rhythm_Cell.cellL.get(1)+"｜"+scoreBlank+"♬ ____   ___  __  ____  ____ ♪"+"\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(2)+"｜"+Rhythm_Cell.cellD.get(2)+"｜"+Rhythm_Cell.cellSP.get(2)+"｜"+Rhythm_Cell.cellK.get(2)+"｜"+Rhythm_Cell.cellL.get(2)+"｜"+scoreBlank+"♪/ ___) / __)/  \\(  _ \\(  __)♬"+"\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(3)+"｜"+Rhythm_Cell.cellD.get(3)+"｜"+Rhythm_Cell.cellSP.get(3)+"｜"+Rhythm_Cell.cellK.get(3)+"｜"+Rhythm_Cell.cellL.get(3)+"｜"+scoreBlank+"♬\\___ \\( (__(  O ))   / ) _) ♪"+"\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(4)+"｜"+Rhythm_Cell.cellD.get(4)+"｜"+Rhythm_Cell.cellSP.get(4)+"｜"+Rhythm_Cell.cellK.get(4)+"｜"+Rhythm_Cell.cellL.get(4)+"｜"+scoreBlank+"♪(____/ \\___)\\__/(__\\_)(____)♬"+"\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(5)+"｜"+Rhythm_Cell.cellD.get(5)+"｜"+Rhythm_Cell.cellSP.get(5)+"｜"+Rhythm_Cell.cellK.get(5)+"｜"+Rhythm_Cell.cellL.get(5)+"｜"+scoreBlank+"♬                            ♪"+"\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(6)+"｜"+Rhythm_Cell.cellD.get(6)+"｜"+Rhythm_Cell.cellSP.get(6)+"｜"+Rhythm_Cell.cellK.get(6)+"｜"+Rhythm_Cell.cellL.get(6)+"｜"+scoreBlank+"♪♬♪♬♪♬♪♬♪♬♪♬♪♬♪♬\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(7)+"｜"+Rhythm_Cell.cellD.get(7)+"｜"+Rhythm_Cell.cellSP.get(7)+"｜"+Rhythm_Cell.cellK.get(7)+"｜"+Rhythm_Cell.cellL.get(7)+"｜"+scoreBlank+"              ↓↓                 \n"
				+blank+"｜"+Rhythm_Cell.cellS.get(8)+"｜"+Rhythm_Cell.cellD.get(8)+"｜"+Rhythm_Cell.cellSP.get(8)+"｜"+Rhythm_Cell.cellK.get(8)+"｜"+Rhythm_Cell.cellL.get(8)+"｜"+scoreBlank+"              ↓↓                 \n"
				+blank+"｜"+Rhythm_Cell.cellS.get(9)+"｜"+Rhythm_Cell.cellD.get(9)+"｜"+Rhythm_Cell.cellSP.get(9)+"｜"+Rhythm_Cell.cellK.get(9)+"｜"+Rhythm_Cell.cellL.get(9)+"｜"+scoreBlank+"               "+score+"                 \n"
				+blank+"｜"+Rhythm_Cell.cellS.get(10)+"｜"+Rhythm_Cell.cellD.get(10)+"｜"+Rhythm_Cell.cellSP.get(10)+"｜"+Rhythm_Cell.cellK.get(10)+"｜"+Rhythm_Cell.cellL.get(10)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(11)+"｜"+Rhythm_Cell.cellD.get(11)+"｜"+Rhythm_Cell.cellSP.get(11)+"｜"+Rhythm_Cell.cellK.get(11)+"｜"+Rhythm_Cell.cellL.get(11)+"｜"+scoreBlank+"● 곡 제목 : "+Rhythm_Music.songName+"\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(12)+"｜"+Rhythm_Cell.cellD.get(12)+"｜"+Rhythm_Cell.cellSP.get(12)+"｜"+Rhythm_Cell.cellK.get(12)+"｜"+Rhythm_Cell.cellL.get(12)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(13)+"｜"+Rhythm_Cell.cellD.get(13)+"｜"+Rhythm_Cell.cellSP.get(13)+"｜"+Rhythm_Cell.cellK.get(13)+"｜"+Rhythm_Cell.cellL.get(13)+"｜"+scoreBlank+"● -10점되면 GAME OVER"+"\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(14)+"｜"+Rhythm_Cell.cellD.get(14)+"｜"+Rhythm_Cell.cellSP.get(14)+"｜"+Rhythm_Cell.cellK.get(14)+"｜"+Rhythm_Cell.cellL.get(14)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(15)+"｜"+Rhythm_Cell.cellD.get(15)+"｜"+Rhythm_Cell.cellSP.get(15)+"｜"+Rhythm_Cell.cellK.get(15)+"｜"+Rhythm_Cell.cellL.get(15)+"｜"+scoreBlank+"● 게임 중 멈추기 → \'Q\'버튼"+"\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(16)+"｜"+Rhythm_Cell.cellD.get(16)+"｜"+Rhythm_Cell.cellSP.get(16)+"｜"+Rhythm_Cell.cellK.get(16)+"｜"+Rhythm_Cell.cellL.get(16)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(17)+"｜"+Rhythm_Cell.cellD.get(17)+"｜"+Rhythm_Cell.cellSP.get(17)+"｜"+Rhythm_Cell.cellK.get(17)+"｜"+Rhythm_Cell.cellL.get(17)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(18)+"｜"+Rhythm_Cell.cellD.get(18)+"｜"+Rhythm_Cell.cellSP.get(18)+"｜"+Rhythm_Cell.cellK.get(18)+"｜"+Rhythm_Cell.cellL.get(18)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(19)+"｜"+Rhythm_Cell.cellD.get(19)+"｜"+Rhythm_Cell.cellSP.get(19)+"｜"+Rhythm_Cell.cellK.get(19)+"｜"+Rhythm_Cell.cellL.get(19)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(20)+"｜"+Rhythm_Cell.cellD.get(20)+"｜"+Rhythm_Cell.cellSP.get(20)+"｜"+Rhythm_Cell.cellK.get(20)+"｜"+Rhythm_Cell.cellL.get(20)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(21)+"｜"+Rhythm_Cell.cellD.get(21)+"｜"+Rhythm_Cell.cellSP.get(21)+"｜"+Rhythm_Cell.cellK.get(21)+"｜"+Rhythm_Cell.cellL.get(21)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(22)+"｜"+Rhythm_Cell.cellD.get(22)+"｜"+Rhythm_Cell.cellSP.get(22)+"｜"+Rhythm_Cell.cellK.get(22)+"｜"+Rhythm_Cell.cellL.get(22)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(23)+"｜"+Rhythm_Cell.cellD.get(23)+"｜"+Rhythm_Cell.cellSP.get(23)+"｜"+Rhythm_Cell.cellK.get(23)+"｜"+Rhythm_Cell.cellL.get(23)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(24)+"｜"+Rhythm_Cell.cellD.get(24)+"｜"+Rhythm_Cell.cellSP.get(24)+"｜"+Rhythm_Cell.cellK.get(24)+"｜"+Rhythm_Cell.cellL.get(24)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(25)+"｜"+Rhythm_Cell.cellD.get(25)+"｜"+Rhythm_Cell.cellSP.get(25)+"｜"+Rhythm_Cell.cellK.get(25)+"｜"+Rhythm_Cell.cellL.get(25)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(26)+"｜"+Rhythm_Cell.cellD.get(26)+"｜"+Rhythm_Cell.cellSP.get(26)+"｜"+Rhythm_Cell.cellK.get(26)+"｜"+Rhythm_Cell.cellL.get(26)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(27)+"｜"+Rhythm_Cell.cellD.get(27)+"｜"+Rhythm_Cell.cellSP.get(27)+"｜"+Rhythm_Cell.cellK.get(27)+"｜"+Rhythm_Cell.cellL.get(27)+"｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(28)+"｜"+Rhythm_Cell.cellD.get(28)+"｜"+Rhythm_Cell.cellSP.get(28)+"｜"+Rhythm_Cell.cellK.get(28)+"｜"+Rhythm_Cell.cellL.get(28)+"｜\n"
				+blank+"｜------------｜------------｜------------------------｜------------｜------------｜\n"
				+blank+"｜"+Rhythm_Cell.cellS.get(29)+"｜"+Rhythm_Cell.cellD.get(29)+"｜"+Rhythm_Cell.cellSP.get(29)+"｜"+Rhythm_Cell.cellK.get(29)+"｜"+Rhythm_Cell.cellL.get(29)+"｜\n"
				+blank+"｜------------｜------------｜------------------------｜------------｜------------｜\n"
				+blank+"｜     S      ｜     D      ｜         SPACE          ｜     K      ｜     L      ｜\n"
				+blank+"｜------------｜------------｜------------------------｜------------｜------------｜\n"
				+blank+"｜★                                                                              ｜\n"
				+blank+"｜★                                                                              ｜\n"
				+blank+"｜★                                                                              ｜\n"
				+msg+"｜★                                                                              ｜\n"
				+downSign+"｜________________________________________________________________________________｜"+sec+"초";

		return frame;
	}

	public static void resultFrame() {

		String blankUpside="\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String blankLeft="                                                                                       ";
		String resultFrame=blankUpside
				+blankLeft+" ----------------------------------------------------- \n"
				+blankLeft+"                                                       \n"
				+blankLeft+"                       게임결과                        \n"
				+blankLeft+"                                                       \n"
				+blankLeft+"  ● 곡 제목 : "+Rhythm_Music.songName+"               \n"
				+blankLeft+"                                                       \n"
				+blankLeft+"  ● 최종점수 : "+score+"                              \n"
				+blankLeft+"                                                       \n"
				+blankLeft+"  ● GOOD : "+good+"                                   \n"
				+blankLeft+"                                                       \n"
				+blankLeft+"  ● BAD  : "+bad+"                                    \n"
				+blankLeft+"                                                       \n"
				+blankLeft+"  ● MISS  : "+miss+"                                  \n"
				+blankLeft+"                                                       \n"
				+blankLeft+" ----------------------------------------------------- \n"
				+blankUpside;

		System.out.println(resultFrame);
	}
}
