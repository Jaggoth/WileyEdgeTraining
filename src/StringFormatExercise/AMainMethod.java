package StringFormatExercise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AMainMethod {
	
	final static int Y = 10;
	final static int X = 20;

	public static void main(String[] args) {
		String sampleInput = "Hello World How Are You";
		display(formatTheInput(sampleInput));
		
		//Sample Output
		// H : Hello How
		// W : World 
		// A : Are
		// Y : You
	}
	
	private static LinkedHashMap<Character, ArrayList<String>> formatTheInput(String in) {
		String[] strSplit = in.split(" ");
		LinkedHashMap<Character, ArrayList<String>> map = new LinkedHashMap<Character, ArrayList<String>>();
		
		for (String obj : strSplit) {
			char ch = obj.charAt(0);
			map.putIfAbsent(ch, new ArrayList<String>());
			map.get(ch).add(obj);
		}
		return map;
	}

	private static void display(LinkedHashMap<Character, ArrayList<String>> in) {
		for (Character charKey: in.keySet()) {
			String item = "";
			for(String str: in.get(charKey)) {
				item += str + " ";
			}
			System.out.println(charKey + " : " + item);
		}
	}
}
