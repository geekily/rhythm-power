package rhythm_power;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Rhythm_MelonDB {

	static StringBuilder rank = new StringBuilder();
	public static ArrayList<String> songtitles=new ArrayList<String>();

	public void chart() {
		String url = "https://www.melon.com/chart/index.htm";

		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Elements element = doc.select("tbody");
		// System.out.println(element);

		Iterator<Element> title = element.select(".rank01 a").iterator();

		for (int i = 0; i < 10; i++) {
			songtitles.add((i + 1) + "À§ - " + (String) title.next().text());
		}
		
//		for(int i=0;i<10;i++) {
//			System.out.println(songtitles.get(i));
//		}

		/*
		 * while (title.hasNext()) {
		 * 
		 * str = (String)title.next().text();
		 * 
		 * System.out.println(i++ + "À§ " + str);
		 * 
		 * 
		 * 
		 * }
		 */
	}
}
