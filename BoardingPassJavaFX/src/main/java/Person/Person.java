package Person;

import BoardingPass.BoardingPass;

import java.util.ArrayList;

public class Person {
    private String name;
    private String email;
    private int age;
    private PhoneNumber phoneNumber;
    private boolean discount;
    private ArrayList<BoardingPass> boardingPass;
    private Gender gender;

    public Person(){
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public Gender getGender(){
        return gender;
    }

    public PhoneNumber getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public boolean getDiscount(){
        return discount;
    }


    //Setters
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDiscount(int age, Gender gender){
        if (this.getAge() <= 12){
            this.discount = true;
        }
        if(this.getAge() >= 65 ){
            this.discount= true;
        }
        if(this.getGender().equals("Female")){
            this.discount = true;
        }
        else
            this.discount = false;
    }
}


