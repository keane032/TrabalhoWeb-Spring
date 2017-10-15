package dsweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import dsweb.model.Cliente;
import dsweb.service.ClienteService;
@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;
	

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
			System.out.println(result);
			model.addAttribute("cliente", cliente);
			model.addAttribute("acao", "/add_cliente");
			return "CadastrarCliente";
		}
		
		service.save(cliente);
		redirectAttributes.addFlashAttribute("msg", "Cliente inserido com sucesso.");
		return "redirect:/login";
	}

	
	@RequestMapping("/altera_cliente_form/{id}")
	public String alteraForm(@PathVariable Integer id, Model model) {
		System.out.println("id: " + id);
		Cliente cliente = service.getById(id); 
		System.out.println("cliente: " + cliente);
		model.addAttribute("cliente", cliente);
		model.addAttribute("acao", "/update_cliente");
		return "altera_cliente";
	}
	
	@PostMapping("/update_cliente")
	public String updateContato(@Valid Cliente cliente, BindingResult result, 
		Model model, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			model.addAttribute("cliente", cliente);
			model.addAttribute("acao", "/update_cliente");
			return "altera_cliente";
		}
		service.dell(cliente.getId());
		service.save(cliente);
		redirectAttributes.addFlashAttribute("msg", "Cliente alterado com sucesso.");
		return "redirect:/clientes";
	}
	
	@RequestMapping("/delete_cliente/{id}")
	public String deleteContato(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
		System.out.println("id: " + id);
		service.dell(id);
		redirectAttributes.addFlashAttribute("msg", "Cliente removido com sucesso.");
		return "redirect:/clientes";
	}

	
	
}

