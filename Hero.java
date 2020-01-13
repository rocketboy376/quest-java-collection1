public class Hero {

    // attributs
    private String name;
    private int age;

    // constructor
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString() {
    	return "name: " + this.name + ", age: " + this.age;
    }
}