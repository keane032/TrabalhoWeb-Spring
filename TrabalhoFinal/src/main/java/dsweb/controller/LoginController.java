package dsweb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dsweb.dao.ClientesJpaDao;
import dsweb.model.Cliente;

@Controller
public class LoginController {
	
//	 @RequestMapping("loginForm")
//	  public String loginForm() {
//	    return "formulario-login";
//	  }
//	
//	 
//	 @RequestMapping("efetuaLogin")
//	 public String efetuaLogin(Cliente cliente, HttpSession session) {
//	   if(new ClientesJpaDao().existe(cliente)) {
//	     session.setAttribute("usuarioLogado", cliente);
//	     return "index";
//	   }
//	   return "redirect:loginForm";
//	 }
	 
}
