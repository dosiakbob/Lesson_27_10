package ua.com.cookbook.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.cookbook.entity.Dish;
import ua.com.cookbook.repository.DishRepository;
import ua.com.cookbook.service.DishService;

@Service
public class DishServiceImpl implements DishService {

	@Autowired
	private DishRepository dishRepository;

	public void save(Dish dish) {
		dishRepository.save(dish);
		
	}

	public List<Dish> findAll() {
		
		// TODO Auto-generated method stub
		return dishRepository.findAll();
	}

	public Dish findOne(int id) {
		// TODO Auto-generated method stub
		return dishRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		dishRepository.delete(id);
		
	}

	@Override
	public List<Dish> findAllByFetch() {
		// TODO Auto-generated method stub
		return dishRepository.findAllByFetch();
	}
	
	
	
}
