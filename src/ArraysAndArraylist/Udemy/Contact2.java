package ArraysAndArraylist.Udemy;

public class Contact2 {
    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Contact2(String name, String number) {
        this.name = name;
        this.number = number;
    }
    //createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.
    private static Contact2 createContact(String name,String number){
        return new Contact2(name,number);
    }
}
