package apple.of.my.i;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class rest {

	@RequestMapping("/getName")
	public String getName()
	{
		return "Hello";
	}
}
