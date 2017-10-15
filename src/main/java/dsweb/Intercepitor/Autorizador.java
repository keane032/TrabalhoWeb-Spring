package dsweb.Intercepitor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


@Component
public class Autorizador extends HandlerInterceptorAdapter{
	
	//ClienteJdbsDao jdbc = new ClienteJdbsDao();
	
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler) throws Exception {
		
		System.out.println("executando interceptor - preHandle");

//		String uri = request.getRequestURI();
//
//		if(uri.endsWith("home") || 
//				uri.endsWith("login")){
//			return true;
//		}
//
//		if(request.getSession().getAttribute("usuario") != null){
//			return true;
//		}
//				
//		response.sendRedirect("/");
//		return false;
		return true;
	}
}

