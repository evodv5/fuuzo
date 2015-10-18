package pl.fuuzo.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.fuuzo.dao.CatDAO;
import pl.fuuzo.dto.CatDTO;
import pl.fuuzo.domain.Cat;

@Controller
public class CatController {

	@Autowired
	CatDAO catDAO;

	@RequestMapping("/cat")
	public String listaKotow(Model model) {
		model.addAttribute("cats", catDAO.findAll());
		return "cat/list";
	}

	@RequestMapping("/cat/add")
	public String dodajKota(HttpServletRequest request,  @ModelAttribute("catDTO") @Valid CatDTO catDTO, BindingResult result) {
		if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
			Cat cat = new Cat();
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			try {
				cat.setDateOfBirth(sdf.parse(catDTO.getDateOfBirth()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			cat.setName(catDTO.getName());
			cat.setGuardian(catDTO.getGuardian());
			cat.setWeight(catDTO.getWeight());

			catDAO.save(cat);
			return "redirect:/cats";
		}
		return "cat/add";
	}

	@RequestMapping("/cat/{id}")
	public String szczegolyKota(@PathVariable("id") Long id, Model model) {
		model.addAttribute("cat", catDAO.findById(id));
		return "cat/details";
	}

}
