import java.util.Scanner;

public class MainContactInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactBook book = new ContactBook();

        int choice;

        do{
            System.out.println("================================");
            System.out.println("\n1. Save Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.println("\n================================");
            System.out.print("Enter your choice: ");
            System.out.println();

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter number: ");
                    String number = sc.nextLine();

                    book.addContact(name, number);
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    book.searchContact(sc.nextLine());
                    break;

                case 3:
                    book.displayAll();
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    book.deleteContact(sc.nextLine());
                    break;
                default:
                    if(choice != 5){
                        System.out.println("Invalid choice. Please try again.");
                    }break;
            }

        }while(choice != 5);

        sc.close();
    }
}