package w5;

public class AbsolutePath {
	public static String ensureAbsolute(String path){
		String currentDir = System.getProperty("user.dir");
		if (path.substring(0,1).equals("/")) return path;
		else return currentDir+"/"+path;		
	}
	public static String[] absoluteSplitPath(String s){
		return SplitPathName.splitPath(s);
	}
	public static void main(String args[]){
		for (int i=0;i<args.length;i++){
			String[] components = (absoluteSplitPath(ensureAbsolute(args[i])));
			System.out.println("File: "+components[1]+" Type: "+components[3]+" ["+components[0]+"]");
		}
	}
}
