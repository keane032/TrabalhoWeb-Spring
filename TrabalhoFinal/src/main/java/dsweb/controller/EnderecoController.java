package dsweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import dsweb.model.Cliente;
import dsweb.model.Endereco;
import dsweb.service.EnderecoService;

@Controller
public class EnderecoController {

	@Autowired
	private EnderecoService service;
	
	@RequestMapping("/insere_endereco_form")
	public String insereFormEndereco(Model model) {
		model.addAttribute("endereco",new Endereco());
		model.addAttribute("acao", "/add_endereco");
		return "CadastrarEndereco";
	}

	@RequestMapping("/add_endereco")
	public String addEndereco(@Valid Endereco endereco, BindingResult result, 
			Model model, RedirectAttributes redirectAttributes){
		if(result.hasErrors()) {
			model.addAttribute("endereco", endereco);
			model.addAttribute("acao", "/add_endereco");
			return "CadastrarEndereco";
		}
		service.save(endereco);
		redirectAttributes.addFlashAttribute("msg", "Endereco inserido com sucesso.");
		return "redirect:/insere_cliente_form";	
		
	}
	
}
