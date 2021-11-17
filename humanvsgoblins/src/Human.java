import java.util.ArrayList;

public class Human extends Person{
    private String name = this.name;

    public Human {
        // WEAPON NEEDS TO BE MADE A CLASS TO BE CALLED AS AN OBJECT HERE;
        ArrayList<Object> weapon = new ArrayList<>();
        ArrayList<String> inventory = new ArrayList<>();
        String name;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public int getHealth(){
        return health;
    }
}


