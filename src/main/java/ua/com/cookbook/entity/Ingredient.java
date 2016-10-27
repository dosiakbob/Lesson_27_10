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
public class Ingredient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String amount;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "dish_ingredient", joinColumns = @JoinColumn(name = "id_ingredient"), inverseJoinColumns = @JoinColumn(name = "id_dish"))
	
	private List<Dish> dish;

	public Ingredient() {
		// TODO Auto-generated constructor stub
	}
	
	public Ingredient(String name, String amount) {
		super();
		this.name = name;
		this.amount = amount;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<Dish> getDish() {
		return dish;
	}

	public void setDish(List<Dish> dish) {
		this.dish = dish;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
	
	

}
