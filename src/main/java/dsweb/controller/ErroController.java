package dsweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErroController {

	 @RequestMapping("/500")
	    public String internalServerError () {
	        return "ErroPage";
	    }
	
}
