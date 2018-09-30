package tw.elliot.rs.ctrl;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/*")
public class ApiController {
	@RequestMapping("/first")
	public String first() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return "Success!";
	}
}
