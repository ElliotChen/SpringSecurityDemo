package tw.elliot.ou.ctrl;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoCtrl {

	@GetMapping("/me")
	public ResponseEntity<OAuth2AuthenticationToken> userinfo(OAuth2AuthenticationToken currentUser) {
		return ResponseEntity.ok(currentUser);
	}
}
