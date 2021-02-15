package rhythm_power;

import java.util.ArrayList;

public class Rhythm_Cell {
	
	public static ArrayList<String> cellS=new ArrayList<String>();
	public static ArrayList<String> cellD=new ArrayList<String>();
	public static ArrayList<String> cellSP=new ArrayList<String>();
	public static ArrayList<String> cellK=new ArrayList<String>();
	public static ArrayList<String> cellL=new ArrayList<String>();
	
	static String white="¡¡¡¡¡¡¡¡¡¡¡¡";
	static String black="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ";
	static String whiteSP="¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡";
	static String blackSP="¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ";
	
	public static void cellSetup() {
		for(int i=0;i<31;i++) {
			cellS.add(i, white);
			cellD.add(i, white);
			cellSP.add(i, whiteSP);
			cellK.add(i, white);
			cellL.add(i, white);
		}
	}

		
}
