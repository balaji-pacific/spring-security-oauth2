/**
 * 
 */
package com.spring.security.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Balaji Soundarrajan
 *
 */
@RestController
public class OAuth2Controller {
	
	@GetMapping("")
	public String getMessage(Principal principal) {
		return "Hi, " + principal.getName() + " welcome to OAuth2 example";
	}

}
