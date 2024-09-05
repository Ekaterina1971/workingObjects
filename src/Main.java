public class Main {
    public static void main(String[] args) {
        Author bookOne = new Author("Наталья", "Александрова");
        Author bookTwo = new Author("Анатолий", "Иванов");
        Author bookThree = bookOne;
        Book one = new Book("Под знаком черепа", bookOne,  2021);
        Book two = new Book("Тени исчезают в полдень", bookTwo, 1986);
        String book1 = one.toString();
        int i = 1996;
        System.out.println("Название книги " + one.getBookName() + " Автор " + bookOne.getFirstName() + " " + bookOne.getLastName() + " год выпуска "+ one.getBookAge());
        System.out.println("Название книги " + two.getBookName() + " Автор " + bookTwo.getFirstName() + " " + bookTwo.getLastName() + " год выпуска "+ two.getBookAge());
        System.out.println("Название книги " + two.getBookName() + " Автор " + bookTwo.getFirstName() + " " + bookTwo.getLastName() + " год выпуска " + i);
        System.out.println(bookOne.equals(bookThree));
        System.out.println(bookOne.equals(bookTwo));
        System.out.println(book1);
    }
}