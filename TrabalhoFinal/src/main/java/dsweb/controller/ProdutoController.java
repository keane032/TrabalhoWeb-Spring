package dsweb.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import dsweb.dao.ProdutoJpaDao;
import dsweb.model.Produto;
import dsweb.service.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	@Autowired
	private ProdutoJpaDao produtoDao;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/produtos")
	public String listaProdutos(Model model) {
		List<Produto> lista = (List<Produto>) service.ListAll();
		model.addAttribute("produtos", lista);
		return "lista_produtos";
	}
	
	@RequestMapping("/insere_produto_form")
	public String insereForm(Model model) {
		model.addAttribute("produto", new Produto());
		model.addAttribute("acao", "/add_produto");
		return "insere_produto";
	}

	@PostMapping("/add_produto")
	public String addContato(@Valid Produto produto, BindingResult result, 
			Model model, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			model.addAttribute("produto", produto);
			model.addAttribute("acao", "/add_produto");
			return "insere_produto";
		}
		service.save(produto);
		redirectAttributes.addFlashAttribute("msg", "Produto inserido com sucesso.");
		return "redirect:/produtos";
	}

	@RequestMapping("/altera_produto_form/{id}")
	public String alteraForm(@PathVariable Integer id, Model model) {
		System.out.println("id: " + id);
		Produto p = service.getById(id);
		System.out.println("produto: " + p);
		model.addAttribute("produto", p);
		model.addAttribute("acao", "/update_produto");
		return "altera_produto";
	}
	
	@PostMapping("/update_produto")
	public String updateContato(@Valid Produto produto, BindingResult result, 
		Model model, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			model.addAttribute("produto", produto);
			model.addAttribute("acao", "/update_produto");
			return "altera_produto";
		}
		produtoDao.altera(produto);
		redirectAttributes.addFlashAttribute("msg", "Produto alterado com sucesso.");
		return "redirect:/produtos";
	}
	
	@RequestMapping("/delete_produto/{id}")
	public String deleteContato(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
		System.out.println("id: " + id);
		Produto produto = new Produto(id);
		System.out.println("produto: " + produto);
		service.dell(id);
		redirectAttributes.addFlashAttribute("msg", "Produto removido com sucesso.");
		return "redirect:/produtos";
	}
	
	
}
