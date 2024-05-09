public class Book{
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYearPublished() {
        return this.yearPublished;
    }
    public double getPrice() {
        return this.price;
    }

    

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    public void bookDetails(){
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Year: "+getYearPublished());
        System.out.println("Price: $"+getPrice());
        System.out.println("\n***************\n");
    }

}