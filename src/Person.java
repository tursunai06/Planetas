public class Person {
    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private String profession;


    public void setFirstName(String firstName){
       this.firstName = firstName;

    }
   public void setLastName(String lastName){
        this.lastName = lastName;
   }
   public void setGender(char gender){
        this.gender = gender;
   }
   public void setAge(int age){
        this.age = age;
   }
   public void setProfession(String profession){
        this.profession = profession;
   }
   //getter
   public String getFirstName(){
       return  firstName;
   }
   public String getLastName(){
        return lastName;
   }
   public String getProfession(){
        return profession;
   }
   public int getAge(){
        return age;
   }
   public char getGender(){
        return gender;
   }



}
