package com.study.springboot.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Autowired
	public AuthenticationFailureHandler authenticationFailureHandler;
	
	@Autowired
	public AuthenticationSuccessHandler authenticationSuccessHandler;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/css/**", "/js/**", "/img/**").permitAll()
			.antMatchers("/guest/**").permitAll()
			.antMatchers("/member/**").hasAnyRole("USER", "ADMIN")
			.antMatchers("/admin/**").hasRole("ADMIN")
			.anyRequest().authenticated();
		
		// login != loginForm
		http.formLogin()
			.loginPage("/loginForm")
			.loginProcessingUrl("/j_spring_security_check")
//			.failureUrl("/loginForm?error")
			.failureHandler(authenticationFailureHandler)
//			.defaultSuccessUrl("/member/welcome")
//			.successForwardUrl("/forward")
			.successHandler(authenticationSuccessHandler)
			.usernameParameter("j_username")
			.passwordParameter("j_password")
			.permitAll();
		
		http.logout()
			.logoutUrl("/logout")
			.logoutSuccessUrl("/")
			.permitAll();
		
		http.csrf().disable();
		return http.build();
	}
	
	
	@Bean
	public InMemoryUserDetailsManager userDetailService() {
		UserDetails user = User.withUsername("user")
								.password(passwordEncoder().encode("1234"))
								.roles("USER")
								.build();
		UserDetails admin = User.withUsername("admin")	
								.password(passwordEncoder().encode("1234"))
								.roles("ADMIN")
								.build();
		
		UserDetails[] userDetails = new UserDetails[2];
		userDetails[0] = user;
		userDetails[1] = admin;
		
		System.out.println(passwordEncoder().encode("1234"));
		
		return new InMemoryUserDetailsManager(userDetails);
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
