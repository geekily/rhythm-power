package rhythm_power;

public class Rhythm_Song1_CellK2 extends Thread{

	String white=Rhythm_Cell.white;
	String black=Rhythm_Cell.black;
	String whiteSP=Rhythm_Cell.whiteSP;
	String blackSP=Rhythm_Cell.blackSP;
	
	int speedA;
	int speedB;
	
	public Rhythm_Song1_CellK2(int speedA, int speedB) {
		super();
		this.speedA = speedA;
		this.speedB = speedB;
	}

	@Override
	public void run() {
		try {
			while(true) {
				if(Rhythm_Music.flag) {
					break;
				}
				int sec=Rhythm_Frame_Thread.sec;
				sleep(1);
	
				if(sec==14) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellK.set(i-1, white);
						}
						Rhythm_Cell.cellK.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellK.set(30, Rhythm_Cell.cellK.get(29));
							if(Rhythm_Cell.cellK.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellK.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellK.set(29, white);
						}
					}
				}
			}
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}		
	}
}
