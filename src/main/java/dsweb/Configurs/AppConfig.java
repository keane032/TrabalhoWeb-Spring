package dsweb.Configurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import dsweb.Intercepitor.Interceptor;
import dsweb.Intercepitor.Autorizador;

@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private Autorizador autorizador;
	@Autowired
	private Interceptor inter; 

	@Override
	public void addInterceptors(InterceptorRegistry registry)	{	
		//registry.addInterceptor(autorizador);
		//registry.addInterceptor(inter);
	}
	
}
