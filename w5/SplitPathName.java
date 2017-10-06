package w5;

public class SplitPathName {
	public static String[] splitPath(String s) {
		String path = new String(s.substring(0, s.lastIndexOf("/")+1));
		String filename = new String(s.substring(s.lastIndexOf("/")+1));
		String basename = new String(filename.substring(0, filename.indexOf(".")));
		String fileextension = new String(filename.substring(filename.indexOf(".")));
		String[] retArray = new String[4];
		retArray[0] = path;
		retArray[1] = filename;
		retArray[2] = basename;
		retArray[3] = fileextension;
		return retArray;
	}
	public static void main(String args[]){
		for (int i=0;i<args.length;i++){
			String[] components = (splitPath(args[i]));
			System.out.println("File: "+components[1]+" Type: "+components[3]+" ["+components[0]+"]");
		}
	}
	
}
