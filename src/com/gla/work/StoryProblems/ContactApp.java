
class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phone) {
        this.name = name;
        this.phoneNumber = phone;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
    }
}

class BusinessContact extends Contact {
    String companyName;

    BusinessContact(String name, String phone, String companyName) {
        super(name, phone);
        this.companyName = companyName;
    }

    void display() {
        System.out.println("Name: " + name.toUpperCase());
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Company: " + companyName);
    }
}

public class ContactApp {
    public static void main(String[] args) {
        Contact c = new BusinessContact("Sarthak", "9999999999", "Google");
        c.display();
    }
}
