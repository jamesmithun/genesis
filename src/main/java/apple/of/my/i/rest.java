package apple.of.my.i;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class rest {

	@RequestMapping("/getName")
	public String getName()
	{
		String out="";
		try {
			HttpURLConnection uc = (HttpURLConnection) new URL("www.google.com").openConnection();
			InputStream ou =uc.getInputStream();
			
			byte[] b = new byte[1024];
			int read;
			while ((read = ou.read(b)) !=-1)
			{
				out=out.concat(new String(b,0,read));
			}
			
			ou.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out=e.getMessage();
		}
		return out;
	}
}
