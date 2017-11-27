package me.jrmensah.roboresumesec;

import me.jrmensah.roboresumesec.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetailsService userDetailsServiceBean() throws Exception{
        return new SSUserDetailsService(userRepository);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests().antMatchers("/css/**").permitAll()
                .antMatchers("/searchbyname,/searchbyworkplace ,/searchbycollege,/searchbyskill").hasAuthority("RECRUITER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login")
                .permitAll()
                .and()
                .httpBasic();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
        throws Exception {

        auth.userDetailsService(userDetailsServiceBean());
        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER").and().
                withUser("user2").password("password2").roles("RECRUITER").and().
                withUser("Dave").password("begreat").roles("RECRUITER").and().
                withUser("Afua").password("becold").roles("RECRUITER");
    }
}



