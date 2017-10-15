//package dsweb.Configurs;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//@Configuration
//public class SecurityCofing extends WebSecurityConfigurerAdapter{
//
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//    	http.csrf().disable()
//    	.authorizeRequests()
//		.antMatchers("/", "/css*/","/js/*","/img/*","/fonts/*").permitAll()
//		.antMatchers("/home/**").hasAnyRole("USER")
//		.anyRequest().authenticated()
//    .and()
//    .formLogin()
//		.loginPage("/index.jsp")
//		.defaultSuccessUrl("/home.jsp")
//		.permitAll()
//		.and()
//    .logout()
//		.permitAll();
//        
//    }
//    
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//            .inMemoryAuthentication()
//                .withUser("cliente").password("1234").roles("cliente");
//    }
//	
//	
//}
