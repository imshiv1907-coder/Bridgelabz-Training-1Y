class Book
{
    String title;
    int publicationYear;

    void displayInfo()
    {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book
{
    String name;
    String bio;

    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

public class LibrarySystem
{
    public static void main(String[] args)
    {
        Author a = new Author();

        a.title = "Java Programming";
        a.publicationYear = 2023;
        a.name = "James Gosling";
        a.bio = "Known as the creator of Java";

        a.displayInfo();
    }
}