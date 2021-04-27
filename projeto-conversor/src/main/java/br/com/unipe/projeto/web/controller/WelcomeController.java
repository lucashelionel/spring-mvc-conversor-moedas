package br.com.unipe.projeto.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipe.projeto.dao.MoedaDAO;
import br.com.unipe.projeto.model.Moedas;

@Controller
public class WelcomeController {
	
	private MoedaDAO dao;

	@RequestMapping(value = "/formulario", method = RequestMethod.GET)
	public ModelAndView formulario(Model model) {
		model.addAttribute("moedas", new Moedas());
		
		return new ModelAndView("formulario");
	}
	
	@PostMapping(value = "/cadastro")
    public ModelAndView cadastrarMoeda(@ModelAttribute Moedas moedas) {
        
        dao = new MoedaDAO();
        dao.salvar(moedas);
        
        ModelAndView view = new ModelAndView("formulario");
        
        view.addObject("result_euro","O valor de Ienes para Euros é: " + moedas.getEuro() * moedas.getCotacao_iene() +" euros" );
        view.addObject("result_iene","O valor Euro para  Ienes é: " + moedas.getIene() * moedas.getCotacao_euro() +" ienes");     
        
        return view;
    }
}
