package homeWork1;

import java.security.cert.PolicyNode;

public class Book implements Printable {
    String name;

    public Book(String name) {
        this.name = name;
    }

    public static void printBooks(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book) {
                System.out.println(printable[i] + " , ");
            }

        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print(String name) {
    }

    @Override
    public void print() {
        System.out.println(" Book print -- " + name);
    }
}
