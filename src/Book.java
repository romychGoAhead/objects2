import java.util.Objects;

public class Book {

    private String title;    // запишем свойства
    private int year;
    private Author author;

    public Book(String title, Author author, int year) {                         // можно this (title,author, year);
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {

        return this.title;
    }

    public int getYear() {

        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {

        return this.author;
    }

    @Override
    public String toString() {
        return "Название книги: " + title + ", год издания: " + year + " г.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }
}


//Задание
//Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
//Обратите внимание, что toString книги не должен дублировать код из toString автора,
// а должен делегировать (вызывать) его версию метода.