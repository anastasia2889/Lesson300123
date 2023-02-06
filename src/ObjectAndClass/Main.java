package ObjectAndClass;

public class Main {
    public static void main(String[] args) {
       Author author = new Author (" Маргарет ", " Митчелл ");
       Author author1 = new Author (" Федор ", " Достоевский ");
       Book book = new Book( "Унесенные ветром", 1936, author);
       Book book1 = new Book("Преступление и наказание", 1866, author1);
       System.out.println("Название книги: " + book.getName());
       System.out.println("Название книги: " + book1.getName());
       System.out.println("Автор книги " + author.getName()  +  author.getSurname());
       System.out.println("Автор книги "+ author1.getName() + author1.getSurname());
       System.out.println("Год выпуска " + book.getYear());
       System.out.println("Год выпуска " + book1.getYear());
       book.setYear(1933);
       System.out.println("Исправленный год выпуска книги на " + book.getYear());
       System.out.println(author);
       System.out.println(author1);
       System.out.println(book);
       System.out.println(book1);
       System.out.println(book.equals(book));
       System.out.println(author.equals(author));
       System.out.println(book.hashCode());
       System.out.println(author.hashCode());








}
}