package com.study.springboot.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/css/**", "/js/**", "/img/**").permitAll()
			.antMatchers("/guest/**").permitAll()
			.antMatchers("/member/**").hasAnyRole("USER", "ADMIN")
			.antMatchers("/admin").hasRole("ADMIN")
			.anyRequest().authenticated();
		
		http.formLogin().permitAll();
		http.logout().permitAll();
		
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
		
		return new InMemoryUserDetailsManager(userDetails);
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
