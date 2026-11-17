
package pp.objectorientedprogramming;

import javax.swing.JOptionPane;



public class ObjectOrientedProgramming {

    public static void main(String[] args) {
        Person z = new Person("Zofia", "Perepeczo", 12, 3, 476576);
//        z.setAge(20);
        JOptionPane.showMessageDialog(null, z);
        Person z2 = new Person ("Stanisław","Brzeszczyszkiewicz");
        JOptionPane.showMessageDialog(null,z2);
        Person z3 = new Person ("hgfdiuzh","hufilgukhgvkdfj");
        JOptionPane.showMessageDialog(null,z3);
    }
}
public class Person {
    //fields: (attributes to seperate between different object of the same class)
    private String name;
    private String surname;   //private means we can not access it outside the class(u dont wanna change the name or surname)
//    private int age = 5;
    private MyDate dayOfBirth;
    
    
    //methods: (something that we can use)
    //set is for methods we will change, get is for both changing and not?
//    public Person (String name, String surname, int age){
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//    }
    public Person (String name, String surname){ //overloading 
        this.name = name;
        this.surname = surname;
//        this.age = 445;
    }
    public Person(String name, String surname, MyDate dayOfBirth){
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
    }
    public Person(String name, String surname,int day, int month, int year){
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = new MyDate(day, month, year);
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public MyDate getDayOfBirth() {
        return dayOfBirth;
    }
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age){
//        this.age = age;  //this refers to the thing in the fields
//    }
//    //overriding - same name, same list of parametres
//
//  
    @Override
    public String toString(){
        return name + " " + surname + " " + dayOfBirth;
    }
}
package pp.objectorientedprogramming;



public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    } 
    
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
     @Override
    public String toString(){
        return day + " " + month + " " + year;
    }
    
}
