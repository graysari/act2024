public class Main{
    public static void main(String[] args) {

        Book[] book = new Book[4];

        book[0] = new Book("Java","Reb",2022,55.45);
        book[1] = new Book("C#","Nick",2018,44.45);
        book[2]= new Book("C++","Jegs",2010,88.45);
        book[3]= new Book("PHP","Carj",2000,77.45);
    
        {int x = 0;
            for (Book book2 : book) {
                
                System.out.println("Book"+ ++x);
                book2.bookDetails();
            }
        }
        
    }
}
