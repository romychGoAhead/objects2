public class Main {
    public static void print() {
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();

        Author pushkin = new Author("Александр ", "Пушкин");
        Book dubrovsky = new Book("Дубровский", pushkin, 1833);

        System.out.println(dubrovsky);
        System.out.println(pushkin);

        print();

        dubrovsky.setYear(1841);
        System.out.println(dubrovsky);
        print();

        Author gogol = new Author("Николай ", "Гоголь");
        Book viy = new Book("Вий", gogol, 1835);

        System.out.println(viy);
        System.out.println(gogol);
        print();
        System.out.println(dubrovsky.equals(viy));
        System.out.println(pushkin.equals(gogol));
    }
}
