
class Book extends LibraryItem implements Reservable{

    public Book(int id,String title,String author){
        super(id,title,author);
    }

    public int getLoanDuration(){
        return 14;
    }

    public void reserveItem(){
        System.out.println("Book Reserved");
    }

    public void checkAvailability(){
        System.out.println("Book Available");
    }
}
