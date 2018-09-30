package tw.elliot.basic.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/easy/*")
public class EasyController {

	@RequestMapping("/index")
	public String index() {
		return "123";
	}

	@RequestMapping("/500")
	public String exception500() throws Exception {
		throw new Exception("Test");
	}

}
