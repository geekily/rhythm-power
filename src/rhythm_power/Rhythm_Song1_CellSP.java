package rhythm_power;


public class Rhythm_Song1_CellSP extends Thread{

	String white=Rhythm_Cell.white;
	String black=Rhythm_Cell.black;
	String whiteSP=Rhythm_Cell.whiteSP;
	String blackSP=Rhythm_Cell.blackSP;
	
	int speedA;
	int speedB;
	
	public Rhythm_Song1_CellSP(int speedA, int speedB) {
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
				//-----------------------------------------------------------------
				if(sec==9) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellSP.set(i-1, whiteSP);
						}
						Rhythm_Cell.cellSP.set(i,blackSP);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellSP.set(30, Rhythm_Cell.cellSP.get(29));
							if(Rhythm_Cell.cellSP.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellSP.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellSP.set(29, whiteSP);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==39) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellSP.set(i-1, whiteSP);
						}
						Rhythm_Cell.cellSP.set(i,blackSP);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellSP.set(30, Rhythm_Cell.cellSP.get(29));
							if(Rhythm_Cell.cellSP.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellSP.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellSP.set(29, whiteSP);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==69) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellSP.set(i-1, whiteSP);
						}
						Rhythm_Cell.cellSP.set(i,blackSP);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellSP.set(30, Rhythm_Cell.cellSP.get(29));
							if(Rhythm_Cell.cellSP.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellSP.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellSP.set(29, whiteSP);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==99) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellSP.set(i-1, whiteSP);
						}
						Rhythm_Cell.cellSP.set(i,blackSP);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellSP.set(30, Rhythm_Cell.cellSP.get(29));
							if(Rhythm_Cell.cellSP.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellSP.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellSP.set(29, whiteSP);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==129) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellSP.set(i-1, whiteSP);
						}
						Rhythm_Cell.cellSP.set(i,blackSP);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellSP.set(30, Rhythm_Cell.cellSP.get(29));
							if(Rhythm_Cell.cellSP.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellSP.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellSP.set(29, whiteSP);
						}
					}
				}
			}
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}		
	}
}
