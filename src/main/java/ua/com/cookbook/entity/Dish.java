package ua.com.cookbook.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Dish {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double weight;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "dish_ingredient", joinColumns = @JoinColumn(name = "id_dish"), inverseJoinColumns = @JoinColumn(name = "id_ingredient"))
	private List<Ingredient> ingredients;

	public Dish() {
		// TODO Auto-generated constructor stub
	}

	public Dish(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", weight=" + weight + "]";
	}
	
	
	
}
