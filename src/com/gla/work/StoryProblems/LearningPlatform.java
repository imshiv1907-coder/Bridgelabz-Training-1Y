
class Course {
    int courseId;
    String courseName;
    double price;
    static String platformName = "LearnHub";

    Course(int id, String name, double price) {
        courseId = id;
        courseName = name;
        this.price = price;
    }

    double getFinalPrice() {
        return price;
    }

    void display() {
        System.out.println("Platform: " + platformName);
        System.out.println("Course: " + courseName);
        System.out.println("Price: " + getFinalPrice());
    }
}

class RecordedCourse extends Course {
    RecordedCourse(int id, String name, double price) {
        super(id, name, price);
    }

    double getFinalPrice() {
        return price - price * 0.10;
    }
}

class LiveCourse extends Course {
    LiveCourse(int id, String name, double price) {
        super(id, name, price);
    }

    double getFinalPrice() {
        return price - price * 0.05;
    }
}

public class LearningPlatform {
    public static void main(String[] args) {
        Course c1 = new RecordedCourse(1, "Java Programming", 5000);
        Course c2 = new LiveCourse(2, "Data Structures", 6000);

        c1.display();
        c2.display();
    }
}
