public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.\n");
        Human Maxim = new Human(-1988, null, "", "");
        Human Anna = new Human(1993, "Аня", "Москва", "Методиста образовательных программ");
        Human Katya = new Human(1992, "Катя", "Калиниград", "Продакт менеджера");
        Human Artem = new Human(1995, "Артём", "Москва", "Директора по развитию бизнеса");

        System.out.println(Maxim.toString());
        System.out.println(Anna.toString());
        System.out.println(Katya.toString());
        System.out.println(Artem.toString());

    }
}
