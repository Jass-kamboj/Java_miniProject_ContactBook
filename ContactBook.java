import java.util.ArrayList;

class ContactBook {

    ArrayList<Contact> contacts = new ArrayList<>();

    void addContact(String name, String number){
        if(name.isEmpty() || number.isEmpty()){
            System.out.println("Name and number cannot be empty.");
            return;
        }else if(!number.matches("\\d+")){
            System.out.println("Number must contain only digits.");
            return;
        }else if(number.length()!=10){
            System.out.println("Number must be 10 digits long.");
            return;
        }
        contacts.add(new Contact(name, number));
        System.out.println("Contact saved!");
    }

    void searchContact(String name){
        for(Contact c : contacts){
            if(c.name.equalsIgnoreCase(name)){
                c.display();
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    void displayAll(){
        if(contacts.isEmpty()){
            System.out.println("No contacts saved.");
            return;
        }

        for(Contact c : contacts){
            c.display();
        }
    }

    void deleteContact(String name){
        for(Contact c : contacts){
            if(c.name.equalsIgnoreCase(name)){
                contacts.remove(c);
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}