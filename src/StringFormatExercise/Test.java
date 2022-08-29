package StringFormatExercise;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Test {

	public static void main(String[] args) {
		String sampleInput = "Hello World How Are You";
		display(formatTheInput(sampleInput));
		
		//Sample Output
		// H : Hello How
		// W : World 
		// A : Are
		// Y : You
	}
	
	private static String formatTheInput(String in) {
		String out = "";
		String[] strSplit = in.split(" ");
		LinkedHashMap<Character, ArrayList<String>> map = new LinkedHashMap<Character, ArrayList<String>>();
		
		for (String obj : strSplit) {
			char ch = obj.charAt(0);
			map.putIfAbsent(ch, new ArrayList<String>());
			map.get(ch).add(obj);
		}
		
		for (Character charKey: map.keySet()) {
			String item = "";
			for(String str: map.get(charKey)) {
				item += str + " ";
			}
			out += charKey + " : " + item + "\n";
		}
		return out;
	}

	private static void display(String in) {
		System.out.println(in);
	}
}
