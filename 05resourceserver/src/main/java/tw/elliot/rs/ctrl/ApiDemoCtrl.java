package tw.elliot.rs.ctrl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/*")
@Slf4j
public class ApiDemoCtrl {
	@RequestMapping("/first")
	public String first() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		log.warn("Find user: {}", authentication.getName());
		return "Success!";
	}
}
