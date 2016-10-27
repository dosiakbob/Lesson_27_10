package ua.com.cookbook.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.cookbook.entity.Ingredient;
import ua.com.cookbook.repository.IngredientRepository;
import ua.com.cookbook.service.IngredientService;

@Service
public class IngredientServiceImpl implements IngredientService{

	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	public void save(Ingredient ingredient) {
		ingredientRepository.save(ingredient);
		
	}

	public List<Ingredient> findAll() {
		return ingredientRepository.findAll();
		
	}

	public Ingredient findOne(int id) {
		return ingredientRepository.findOne(id);
		
	}

	public void delete(int id) {
		ingredientRepository.delete(id);
		
	}

}
