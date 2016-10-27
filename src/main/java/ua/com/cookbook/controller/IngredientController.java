package ua.com.cookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.cookbook.entity.Ingredient;
import ua.com.cookbook.service.IngredientService;

@Controller
public class IngredientController {

	@Autowired
	private IngredientService ingredientService;

	@RequestMapping(value = "/ingredient", method = RequestMethod.GET)
	public String ingredientPage(Model model) {
		model.addAttribute("ingredients", ingredientService.findAll());

		return "ingredient";
	}

	@RequestMapping(value = "/newIngredient", method = RequestMethod.POST)
	public String saveIngredient(@RequestParam String ingredientName, @RequestParam String ingredientAmount) {

		ingredientService.save(new Ingredient(ingredientName, ingredientAmount));
		return "redirect:/ingredient";
	}

	@RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
	public String deleteIngredient(@PathVariable String id) {

		ingredientService.delete(Integer.parseInt(id));

		return "redirect:/ingredient";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String updateIngredient(@PathVariable String id, Model model) {
		Ingredient ingredient = ingredientService.findOne(Integer.parseInt(id));

		model.addAttribute("ingredientForUpdate", ingredient);
		return "updateIngredient";

	}
	
	@RequestMapping(value="/update/saveUpdateIngredient/{id}", method=RequestMethod.POST)
	public String update(@PathVariable String id, @RequestParam String newName, @RequestParam String newAmount){
		
		Ingredient ingredient = ingredientService.findOne(Integer.parseInt(id));
		
		ingredient.setName(newName);
		ingredient.setAmount(newAmount);
		
		ingredientService.save(ingredient);
		
		
		return "redirect:/ingredient";
		
	}

}
