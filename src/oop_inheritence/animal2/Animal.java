package oop_inheritence.animal2;

public abstract class Animal {
    private String name, size;
    private final String breed, color;
    private int age;
    private final char gender;
    private final static String canBreathe = "Yes";

    public Animal(String name, String size, String breed, String color, int age, char gender) {
        setName(name);
        setSize(size);
        this.breed = breed;
        this.color = color;
        setAge(age);
        if(!(gender == 'M' || gender == 'F')){
            throw new RuntimeException();
        }
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name.isEmpty()) {
            throw new RuntimeException();
        }
        this.name = name;
    }

    public final void drink(){
        System.out.println(name + " is drinking");
    }

    public abstract void eat();

    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
