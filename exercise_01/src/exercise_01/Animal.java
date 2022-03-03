package exercise_01;

public class Animal {
    protected String name;
    protected String food;
    protected int age;
    protected String breed;

    public Animal() {
    }

    public Animal(String name, String food, int age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void feed (){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "The animal named "+ name +", breeds correctly with "+food+".";
    }
}
