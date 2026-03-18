class Course
{
    String courseName;
    int duration;
}

class OnlineCourse extends Course
{
    String platform;
    boolean isRecorded;
}

class PaidOnlineCourse extends OnlineCourse
{
    double fee;
    double discount;

    void displayCourse()
    {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

public class CourseSystem
{
    public static void main(String[] args)
    {
        PaidOnlineCourse p = new PaidOnlineCourse();

        p.courseName = "Java Programming";
        p.duration = 8;
        p.platform = "Udemy";
        p.isRecorded = true;
        p.fee = 5000;
        p.discount = 10;

        p.displayCourse();
    }
}