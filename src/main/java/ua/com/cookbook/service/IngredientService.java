package ua.com.cookbook.service;

import java.util.List;

import ua.com.cookbook.entity.Ingredient;

public interface IngredientService {

	void save(Ingredient ingredient);

	List<Ingredient> findAll();

	Ingredient findOne(int id);

	void delete(int id);

}
