public class Book {
    String Title;
    String Publisher;
    String Author;
    int DateOfPub;
    int NumberPage;
    int Cost;

    static void CalculateCost(int money) {
        float a = (float) money * 118/100;
        System.out.print(a);
    }
    static void PrintBook(Book sena) {
        System.out.println("Book Title is = " + sena.Title);
        System.out.println("Book Publisher is = " + sena.Publisher);
        System.out.println("Book Author is " + sena.Author);
        System.out.println("Book Date of Publication is =" + sena.DateOfPub);
        System.out.println("Book Number of page is = " + sena.NumberPage);
        System.out.print("Book Price is= ");
        CalculateCost(sena.Cost);
    }
    public static void main(String[] args) {
        Book book = new Book();
        book.Title = "My Book";
        book.Publisher = "Sena Book";
        book.Author = "Sena";
        book.DateOfPub = 2022;
        book.NumberPage = 344;
        book.Cost = 123;
        PrintBook(book);
    }
}
