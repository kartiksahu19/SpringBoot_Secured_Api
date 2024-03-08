package in.kartik.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests((request) -> request
				.antMatchers("/", "/login", "/about").permitAll()
				.anyRequest().authenticated())
				.formLogin();

		return http.build();
	}

	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("ram").password("ram@123").authorities("admin").and()
		.withUser("laxman").password("laxman@123").authorities("read").and()
		.withUser("sita").password("sita@123").authorities("read").and()
		.passwordEncoder(NoOpPasswordEncoder.getInstance());

	}
}
