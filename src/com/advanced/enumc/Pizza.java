package com.advanced.enumc;

import java.util.Objects;

public class Pizza implements Cloneable {

	private String name;
	private PizzaSize pizzaSize;
	private double price;

	public Pizza(String name, PizzaSize pizzaSize) {
		this.name = name;
		this.pizzaSize = pizzaSize;
		this.price = calculatePrice();
	}

	private double calculatePrice() {
		switch (pizzaSize) {
		case LARGE:
			return 10.99;
		case MEDIUM:
			return 7.99;
		case SMALL:
		default:
			return 5.99;
		}
	}

	public String getName() {
		return this.name + " Pizza";
	}

	public PizzaSize getPizzaSize() {
		return this.pizzaSize;
	}

	public double getPrice() {
		return this.price;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Pizza)) {
			return false;
		}

		Pizza pizza = (Pizza) object;

		return Objects.equals(pizza.name, name) && pizza.price == price && pizza.pizzaSize == pizzaSize;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, pizzaSize, price);

//		int result = 7;
//
//		result = 31 * result + Double.valueOf(price).hashCode();
//		result = 31 * result + (name == null ? 0 : name.hashCode());
//		result = 31 * result + (pizzaSize == null ? 0 : pizzaSize.hashCode());
//
//		return result;
	}

	@Override
	public String toString() {
		return "Pizza{name='" + name + "'" + ", pizzaSize=" + pizzaSize + ", price=" + price + '}';
	}

}
