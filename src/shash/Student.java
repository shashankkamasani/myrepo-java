package shash;

public class Student {
private static int id = 1;
private int idNum;
	private String name;
private int age;
private int weight;

public Student(String name, int age, int weight) {
	this.name = name;
	this.age = age;
	this.weight = weight;
	idNum = id;
	id++;
}

public static int getId() {
	return id;
}

public static void setId(int id) {
	Student.id = id;
}

public int getIdNum() {
	return idNum;
}

public void setIdNum(int idNum) {
	this.idNum = idNum;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}


}
