package w7;

public class ReadingInFiles {
	public static void main(String[] args) {
		In file = new In("http://www.puzzlers.org/pub/wordlists/pocket.txt");
		{
			while (!file.isEmpty()) {
				String line = file.readLine();
				if (!line.contains("mountain")) {
					System.out.println(line);
				}
			}
		}
	}
}