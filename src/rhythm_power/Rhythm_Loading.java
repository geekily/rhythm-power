package rhythm_power;

public class Rhythm_Loading extends Thread{

	private static String blankUpside="\n\n\n\n\n\n\n\n";
	private static String blankLeft="                                                                                       ";

	@Override
	public void run() {
		try {
			int i=0;
			while(i<2) {
				System.out.println(loading1());
				sleep(500);
				System.out.println(loading2());
				sleep(500);
				System.out.println(loading3());
				sleep(500);
				System.out.println(loading4());
				sleep(500);
				System.out.println(loading5());
				sleep(500);
				i++;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	//_       ____   _____  _____  _   _   _____             
	//| |     / __ \ |  __ \|_   _|| \ | | / ____|            
	//| |    | |  | || |  | | | |  |  \| || |  __             
	//| |    | |  | || |  | | | |  | . ` || | |_ |            
	//| |____| |__| || |__| |_| |_ | |\  || |__| | _  _  _  _ 
	//|______|\____/ |_____/|_____||_| \_| \_____|(_)(_)(_)(_)


	public String loading1() {

		Rhythm_MelonDB md=new Rhythm_MelonDB();
		md.chart();

		String loading1=
				blankUpside
				+blankLeft+" _       ____   _____  _____  _   _   _____             \n"
				+blankLeft+"| |     / __ \\ |  __ \\|_   _|| \\ | | / ____|            \n"
				+blankLeft+"| |    | |  | || |  | | | |  |  \\| || |  __             \n"
				+blankLeft+"| |    | |  | || |  | | | |  | . ` || | |_ |            \n"
				+blankLeft+"| |____| |__| || |__| |_| |_ | |\\  || |__| | \n"
				+blankLeft+"|______|\\____/ |_____/|_____||_| \\_| \\_____|\n"
				+"\n\n\n\n\n\n\n\n\n\n\n\n"
				+blankLeft+" -----------------------------------------------------\n"
				+blankLeft+"                  현재 멜론 인기차트                  \n"
				+blankLeft+"\n"                                                   
				+blankLeft+"  "+md.songtitles.get(0)+"\n"
				+blankLeft+"  "+md.songtitles.get(1)+"\n"
				+blankLeft+"  "+md.songtitles.get(2)+"\n"
				+blankLeft+"  "+md.songtitles.get(3)+"\n"
				+blankLeft+"  "+md.songtitles.get(4)+"\n"
				+blankLeft+"  "+md.songtitles.get(5)+"\n"
				+blankLeft+"  "+md.songtitles.get(6)+"\n"
				+blankLeft+"  "+md.songtitles.get(7)+"\n"
				+blankLeft+"  "+md.songtitles.get(8)+"\n"
				+blankLeft+"  "+md.songtitles.get(9)+"\n"
				+blankLeft+" -----------------------------------------------------"
				+ "\n\n\n\n\n\n\n\n\n\n\n";
		return loading1;
	}

	public String loading2() {

		Rhythm_MelonDB md=new Rhythm_MelonDB();
		md.chart();

		String loading1=
				blankUpside
				+blankLeft+" _       ____   _____  _____  _   _   _____             \n"
				+blankLeft+"| |     / __ \\ |  __ \\|_   _|| \\ | | / ____|            \n"
				+blankLeft+"| |    | |  | || |  | | | |  |  \\| || |  __             \n"
				+blankLeft+"| |    | |  | || |  | | | |  | . ` || | |_ |            \n"
				+blankLeft+"| |____| |__| || |__| |_| |_ | |\\  || |__| | _  \n"
				+blankLeft+"|______|\\____/ |_____/|_____||_| \\_| \\_____|(_)\n"
				+"\n\n\n\n\n\n\n\n\n\n\n\n"
				+blankLeft+" -----------------------------------------------------\n"
				+blankLeft+"                  현재 멜론 인기차트                  \n"
				+blankLeft+"\n"                                                   
				+blankLeft+"  "+md.songtitles.get(0)+"\n"
				+blankLeft+"  "+md.songtitles.get(1)+"\n"
				+blankLeft+"  "+md.songtitles.get(2)+"\n"
				+blankLeft+"  "+md.songtitles.get(3)+"\n"
				+blankLeft+"  "+md.songtitles.get(4)+"\n"
				+blankLeft+"  "+md.songtitles.get(5)+"\n"
				+blankLeft+"  "+md.songtitles.get(6)+"\n"
				+blankLeft+"  "+md.songtitles.get(7)+"\n"
				+blankLeft+"  "+md.songtitles.get(8)+"\n"
				+blankLeft+"  "+md.songtitles.get(9)+"\n"
				+blankLeft+" -----------------------------------------------------"
				+ "\n\n\n\n\n\n\n\n\n\n\n";
		return loading1;
	}

	public String loading3() {

		Rhythm_MelonDB md=new Rhythm_MelonDB();
		md.chart();

		String loading1=
				blankUpside
				+blankLeft+" _       ____   _____  _____  _   _   _____             \n"
				+blankLeft+"| |     / __ \\ |  __ \\|_   _|| \\ | | / ____|            \n"
				+blankLeft+"| |    | |  | || |  | | | |  |  \\| || |  __             \n"
				+blankLeft+"| |    | |  | || |  | | | |  | . ` || | |_ |            \n"
				+blankLeft+"| |____| |__| || |__| |_| |_ | |\\  || |__| | _  _  \n"
				+blankLeft+"|______|\\____/ |_____/|_____||_| \\_| \\_____|(_)(_)\n"
				+"\n\n\n\n\n\n\n\n\n\n\n\n"
				+blankLeft+" -----------------------------------------------------\n"
				+blankLeft+"                  현재 멜론 인기차트                  \n"
				+blankLeft+"\n"                                                   
				+blankLeft+"  "+md.songtitles.get(0)+"\n"
				+blankLeft+"  "+md.songtitles.get(1)+"\n"
				+blankLeft+"  "+md.songtitles.get(2)+"\n"
				+blankLeft+"  "+md.songtitles.get(3)+"\n"
				+blankLeft+"  "+md.songtitles.get(4)+"\n"
				+blankLeft+"  "+md.songtitles.get(5)+"\n"
				+blankLeft+"  "+md.songtitles.get(6)+"\n"
				+blankLeft+"  "+md.songtitles.get(7)+"\n"
				+blankLeft+"  "+md.songtitles.get(8)+"\n"
				+blankLeft+"  "+md.songtitles.get(9)+"\n"
				+blankLeft+" -----------------------------------------------------"
				+ "\n\n\n\n\n\n\n\n\n\n\n";
		return loading1;
	}

	public String loading4() {

		Rhythm_MelonDB md=new Rhythm_MelonDB();
		md.chart();

		String loading1=
				blankUpside
				+blankLeft+" _       ____   _____  _____  _   _   _____             \n"
				+blankLeft+"| |     / __ \\ |  __ \\|_   _|| \\ | | / ____|            \n"
				+blankLeft+"| |    | |  | || |  | | | |  |  \\| || |  __             \n"
				+blankLeft+"| |    | |  | || |  | | | |  | . ` || | |_ |            \n"
				+blankLeft+"| |____| |__| || |__| |_| |_ | |\\  || |__| | _  _  _  \n"
				+blankLeft+"|______|\\____/ |_____/|_____||_| \\_| \\_____|(_)(_)(_)\n"
				+"\n\n\n\n\n\n\n\n\n\n\n\n"
				+blankLeft+" -----------------------------------------------------\n"
				+blankLeft+"                  현재 멜론 인기차트                  \n"
				+blankLeft+"\n"                                                   
				+blankLeft+"  "+md.songtitles.get(0)+"\n"
				+blankLeft+"  "+md.songtitles.get(1)+"\n"
				+blankLeft+"  "+md.songtitles.get(2)+"\n"
				+blankLeft+"  "+md.songtitles.get(3)+"\n"
				+blankLeft+"  "+md.songtitles.get(4)+"\n"
				+blankLeft+"  "+md.songtitles.get(5)+"\n"
				+blankLeft+"  "+md.songtitles.get(6)+"\n"
				+blankLeft+"  "+md.songtitles.get(7)+"\n"
				+blankLeft+"  "+md.songtitles.get(8)+"\n"
				+blankLeft+"  "+md.songtitles.get(9)+"\n"
				+blankLeft+" -----------------------------------------------------"
				+ "\n\n\n\n\n\n\n\n\n\n\n";
		return loading1;
	}

	public String loading5() {

		Rhythm_MelonDB md=new Rhythm_MelonDB();
		md.chart();

		String loading1=
				blankUpside
				+blankLeft+" _       ____   _____  _____  _   _   _____             \n"
				+blankLeft+"| |     / __ \\ |  __ \\|_   _|| \\ | | / ____|            \n"
				+blankLeft+"| |    | |  | || |  | | | |  |  \\| || |  __             \n"
				+blankLeft+"| |    | |  | || |  | | | |  | . ` || | |_ |            \n"
				+blankLeft+"| |____| |__| || |__| |_| |_ | |\\  || |__| | _  _  _  _ \n"
				+blankLeft+"|______|\\____/ |_____/|_____||_| \\_| \\_____|(_)(_)(_)(_)\n"
				+"\n\n\n\n\n\n\n\n\n\n\n\n"
				+blankLeft+" -----------------------------------------------------\n"
				+blankLeft+"                  현재 멜론 인기차트                  \n"
				+blankLeft+"\n"                                                   
				+blankLeft+"  "+md.songtitles.get(0)+"\n"
				+blankLeft+"  "+md.songtitles.get(1)+"\n"
				+blankLeft+"  "+md.songtitles.get(2)+"\n"
				+blankLeft+"  "+md.songtitles.get(3)+"\n"
				+blankLeft+"  "+md.songtitles.get(4)+"\n"
				+blankLeft+"  "+md.songtitles.get(5)+"\n"
				+blankLeft+"  "+md.songtitles.get(6)+"\n"
				+blankLeft+"  "+md.songtitles.get(7)+"\n"
				+blankLeft+"  "+md.songtitles.get(8)+"\n"
				+blankLeft+"  "+md.songtitles.get(9)+"\n"
				+blankLeft+" -----------------------------------------------------"
				+ "\n\n\n\n\n\n\n\n\n\n\n";
		return loading1;
	}
}
