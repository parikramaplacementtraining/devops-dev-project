package rwl.rest_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControl {

	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome to Right Way Learning Training Center!";
	}
}
