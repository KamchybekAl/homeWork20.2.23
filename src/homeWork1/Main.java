package homeWork1;
//Определить интерфейс Printable, содержащий метод void print().
// Определить класс Book, реализующий интерфейс Printable.
// Определить класс Magazine, реализующий интерфейс Printable.
// Создать массив типа Printable, который будет содержать книги и журналы.
// В цикле пройти по массиву и вызвать метод print() для каждого объекта.
// Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
// Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг.

public class Main {
    public static void main(String[] args) {

        Printable[] printables1 = {new Book("Babur"), new Magazine("O&R"),
                new Book("Java Core"), new Magazine("Telecommunucation") };

        for (int i = 0; i < printables1.length; i++) {
            ((Printable)printables1[i]).print();
        }

        Book.printBooks(printables1);
        Magazine.printBooks(printables1);
    }
}
