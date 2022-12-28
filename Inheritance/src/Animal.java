
public class Animal {
private int height = 20;
private int weight = 50;
private String animal_type = "Bird";

public Animal(int height, int weight, String animal_type) {
	super();
	this.height = height;
	this.weight = weight;
	this.animal_type = animal_type;
}

public int getHeight() {
	return height;
}

public int getWeight() {
	return weight;
}

public String getAnimal_type() {
	return animal_type;
}

}
