//person class is created
//all the attributes related to person is defined
public class Person {
    String Title;
    String name;
    int number;
    String Email;
    String address;
//declare the attributes down below using 'this' function
    public Person(String Title, String name, int number, String Email, String address){
        this.Title = Title;
        this.name = name;
        this.number = number;
        this.Email = Email;
        this.address = address;
    }
//create a toString that structures out how the data must be outputed
    public String toString(){
        String output = "Title: " + Title;
        output += "\nName: " + name;
        output += "\nNumber: 0" + number;
        output += "\nEmail: " + Email;
        output += "\nAddress: " + address;
        return output;
    }

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
}
