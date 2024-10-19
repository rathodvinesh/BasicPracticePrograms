package OOPS;


/**
 * Human
 */
class Human {

    private int age;
    private String name="Nemesis";

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    
    public int setAge(int age){
        return this.age=age;
    }

    
    public String setName(String n){
        return this.name=n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        
        Human h=new Human();

        // h.age=11;
        // h.name="Nemesis";
        h.setAge(15);
        h.setName("Nemesis");

        System.out.println(h.getName());

    }
}
