package w1;
import java.io.*;
import java.net.*;
import java.net.URLConnection;

public class HTTP {{
	try{
		
	    String lengthangle = URLEncoder.encode("lol", "UTF-8");
	    URL url = new URL("www.example.com");
	    URLConnection connection = url.openConnection();
	    connection.setDoOutput(true);
	    OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
	    out.write("string=" + lengthangle);
	    out.close();
	}
	catch (MalformedURLException ex)
	{
		System.out.println("HOW DID THIS HAPPEN");
	}
	catch (UnsupportedOperationException ex)
	{
		System.out.println("HOW DID THIS HAPPEN");
	}
	catch (IOException ex)
	{
		System.out.println("HOW DID THIS HAPPEN");
	}
	

}
}