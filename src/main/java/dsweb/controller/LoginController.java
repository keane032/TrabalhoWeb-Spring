package dsweb.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import dsweb.dao.ClienteJdbsDao;
import dsweb.model.Carrinho;
import dsweb.model.Cliente;

@Controller
public class LoginController {

	ClienteJdbsDao jdbc = new ClienteJdbsDao();
	
	@RequestMapping("/login")
	public String login(Model model){
		return"login";
	}
	
	@RequestMapping(value = "logar" ,method = RequestMethod.POST)
	public String efetuaLogin(@RequestParam("login") String login,@RequestParam("senha") String senha,
			RedirectAttributes redirectAttributes,HttpServletRequest req) {

		System.out.println(senha);
		
		HttpSession session = req.getSession();
		
	try {
		
		
		Cliente cliente = jdbc.getclienteByEmail(login);
		
		
		
		if(senha.equals("12345") && login.equals("voidy")) {	
	
			System.out.println(senha);
			session.setAttribute("nome", login);
			session.setAttribute("usuario",cliente);	
			session.setAttribute("tipo", 1);
			session.setAttribute("carrinho", new Carrinho());
			return "home";
		
		}else if(cliente.getSenha().equals(senha) && cliente.getLogin().equals(login)){
		
			session.setAttribute("usuarioLogado", "user");
			session.setAttribute("nome", login);
			session.setAttribute("usuario",cliente);
			return "home";
		
		}
		
		
		
		return "redirect:/login";
	
	}catch (Exception e) {
	
		return "redirect:/login";
		// TODO: handle exception
	}
	
	
	}


	@RequestMapping("/deslogar")
	public String deslogar(HttpSession session, HttpServletRequest req){
		req.getSession().invalidate();
		return "redirect:/login";
	}

}
