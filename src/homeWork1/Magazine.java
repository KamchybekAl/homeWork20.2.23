package homeWork1;

public class Magazine implements Printable {
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print(String name) {
        System.out.println();
    }

    public static void printBooks(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Magazine) {
                System.out.println(printable[i] + " , ");
            }

        }
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(" Magazine print -- " + name);

    }
}
