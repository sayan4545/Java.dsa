package ArraysAndArraylist.Udemy;

public class Test {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        mobilePhone.addNewContact(Contact.createContact("Bob", "31415926"));
        mobilePhone.addNewContact(Contact.createContact("Alice", "16180339"));
        mobilePhone.addNewContact(Contact.createContact("Tom", "11235813"));
        mobilePhone.addNewContact(Contact.createContact("Jane", "23571113"));

        mobilePhone.printContacts();

        System.out.println("\nUpdating contact...");
        mobilePhone.updateContact(Contact.createContact("Bob", "31415926"), Contact.createContact("Bobby", "98765432"));
        mobilePhone.printContacts();

        System.out.println("\nRemoving contact...");
        mobilePhone.removeContact(Contact.createContact("Tom", "11235813"));
        mobilePhone.printContacts();

        System.out.println("\nQuerying contact...");
        Contact queriedContact = mobilePhone.queryContact("Alice");
        if (queriedContact != null) {
            System.out.println(STR."Queried Contact: \{queriedContact.getName()} -> \{queriedContact.getPhoneNumber()}");
        } else {
            System.out.println("Contact not found.");
        }
    }
}


