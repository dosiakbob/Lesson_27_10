package ua.com.cookbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.cookbook.entity.Dish;

public interface DishRepository extends JpaRepository<Dish, Integer> {

	@Query("select distinct d from Dish d left join fetch d.ingredients i")
	List<Dish> findAllByFetch();
	
	
}
