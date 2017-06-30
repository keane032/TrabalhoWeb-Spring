package dsweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import dsweb.model.Cliente;
import dsweb.model.Endereco;
import dsweb.service.ClienteService;
@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@RequestMapping("/login")
	public String login(){
		return"index";
	}
	
	
	
	@RequestMapping("/clientes")
	public String ListaClientes(Model model){
		model.addAttribute("clientes",service.ListAll());
		return "lista_clientes";
	}
	
	
	@RequestMapping("/insere_cliente_form")
	public String insereForm(Model model) {
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("acao", "/add_cliente");
		return "CadastrarCliente";
	}

	@PostMapping("/add_cliente")
	public String addContato(@Valid Cliente cliente, BindingResult result, 
			Model model, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			model.addAttribute("cliente", cliente);
			model.addAttribute("acao", "/add_cliente");
			return "CadastrarCliente";
		}
		service.save(cliente);
		redirectAttributes.addFlashAttribute("msg", "Cliente inserido com sucesso.");
		return "redirect:/clientes";
	}

	
	
	
}
