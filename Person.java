public class Person{

//objects have both atributes (properities)--aka variables
//and behaviors--aka methods

//declare variables
private String name;
private String email;
private String phoneNumber;

//constructor
public Person(String anotherName, String anotherEmail, String anotherNumber){
  name = anotherName;
  email = anotherEmail;
  phoneNumber = anotherNumber;
 }

//print all the data for a Person
public void print(){
 System.out.println("Name: " + name);
 System.out.println("Email: " + email);
 System.out.println("Phone Number: " + phoneNumber);
 }


}