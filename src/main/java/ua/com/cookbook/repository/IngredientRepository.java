package ua.com.cookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.cookbook.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

	
}
