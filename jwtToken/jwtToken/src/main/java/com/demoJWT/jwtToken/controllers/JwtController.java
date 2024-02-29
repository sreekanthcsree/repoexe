package com.demoJWT.jwtToken.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoJWT.jwtToken.entities.JwtRequest;
import com.demoJWT.jwtToken.entities.JwtResponse;
import com.demoJWT.jwtToken.entities.UserData;
import com.demoJWT.jwtToken.repositories.JwtRepo;
import com.demoJWT.jwtToken.services.UserService;
import com.demoJWT.jwtToken.utilities.JwtUtility;

@RestController
public class JwtController {

	@Autowired
	private JwtUtility jwtUtility;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserService userService;
	@Autowired
	private JwtRepo jwtRepo;

	@GetMapping("/welcome")
	public String home() {
		return "welcome jwt app";
	}

	@PostMapping("/authenticate")
	public String authenticate(@RequestBody JwtRequest authRequest) throws Exception {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		if (authentication.isAuthenticated()) {
		
			return jwtUtility.generateToken(authRequest.getUsername());
		} else {
			throw new UsernameNotFoundException("invalid user request !");
		}

	}

	@PostMapping("/signUp")
	public String signUp(@RequestBody UserData ud) {
		UserData newSignupData = new UserData();
		newSignupData.setUsername(ud.getUsername());
		newSignupData.setPassword(new BCryptPasswordEncoder().encode(ud.getPassword()));
		UserData sData = jwtRepo.save(newSignupData);
		if (sData != null) {
			return "SignedUp Successfull";
		}
		return "SignUp unsuccessfull";
	}
}
