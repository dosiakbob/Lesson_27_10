package ua.com.cookbook.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.cookbook.entity.Dish;
import ua.com.cookbook.entity.Ingredient;
import ua.com.cookbook.service.DishService;
import ua.com.cookbook.service.IngredientService;

@Controller
public class DishController {

	@Autowired
	private DishService dishService;
	
	@Autowired
	private IngredientService ingredientService;
	
	@RequestMapping(value="/dish", method=RequestMethod.GET)
	public String dish(Model model){
		model.addAttribute("dishes", dishService.findAllByFetch());
		model.addAttribute("ingredients", ingredientService.findAll());
		
		model.addAttribute("dish", new Dish());
		return "dish";
	}
	
	@RequestMapping(value="/newDish", method=RequestMethod.POST)
	public String newDish(@ModelAttribute Dish dish, @RequestParam String [] choosenIngredients){
		
//		Dish dish = new Dish();
//		dish.setName(dishName);
//		dish.setWeight(Double.parseDouble(dishWeight));
	
		
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		
		for (int i = 0; i < choosenIngredients.length; i++) {
			ingredients.add(ingredientService.findOne(Integer.parseInt(choosenIngredients[i])));
		}
		
		dish.setIngredients(ingredients);
		dishService.save(dish);
		return "redirect:/dish";
		
	}
	
	
	
}
