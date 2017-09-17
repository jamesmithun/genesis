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
			
			out=System.currentTimeMillis()+"Hello";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out=e.getMessage();
		}
		return out;
	}
}
