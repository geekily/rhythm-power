package rhythm_power;


public class Rhythm_Song1_CellS2 extends Thread{

	String white=Rhythm_Cell.white;
	String black=Rhythm_Cell.black;
	String whiteSP=Rhythm_Cell.whiteSP;
	String blackSP=Rhythm_Cell.blackSP;
	
	int speedA;
	int speedB;
	
	public Rhythm_Song1_CellS2(int speedA, int speedB) {
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
				if(sec==7) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==17) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==27) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==37) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==47) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==57) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==67) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==77) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==87) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==97) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==107) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==117) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==127) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
				//-----------------------------------------------------------------
				if(sec==137) {
					for(int i=0;i<30;i++) {
						if(Rhythm_Music.flag) {
							break;
						}
						if(i>0&&i<30) {
							Rhythm_Cell.cellS.set(i-1, white);
						}
						Rhythm_Cell.cellS.set(i,black);
						sleep(speedA);
						if(i==29) {
							sleep(speedB);
							Rhythm_Cell.cellS.set(30, Rhythm_Cell.cellS.get(29));
							if(Rhythm_Cell.cellS.get(30)=="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ") {
								Rhythm_Frame_Thread.score--;
								Rhythm_Frame_Thread.miss++;
								Rhythm_Console.lbl.setText("Miss");
								Rhythm_Cell.cellS.set(30, "¡¡¡¡¡¡¡¡¡¡¡¡");
							}
							Rhythm_Cell.cellS.set(29, white);
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}		
	}
}
