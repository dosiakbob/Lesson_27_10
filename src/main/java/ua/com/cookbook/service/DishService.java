package ua.com.cookbook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.com.cookbook.entity.Dish;
@Service
public interface DishService {

	
	void save(Dish dish);

	List<Dish> findAll();

	Dish findOne(int id);

	void delete(int id);

	List<Dish> findAllByFetch();

}
