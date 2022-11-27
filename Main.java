public class Main {
    public static void main(String[] args) {

        System.out.println("");
        Human Maxim = new Human(-1988, null, null, "");
        Human Anna = new Human(1993, "Аня", "Москва", "Методиста образовательных программ");
        Human Katya = new Human(1992, "Катя", "Калиниград", "Продакт менеджера");
        Human Artem = new Human(1995, "Артём", "Москва", "Директора по развитию бизнеса");
        Human Vladimir = new Human(2001, "Владимир", "Казань", "Временно безработный");

        System.out.println(Maxim.toString());
        System.out.println(Anna.toString());
        System.out.println(Katya.toString());
        System.out.println(Artem.toString());
        System.out.println(Vladimir.toString());

        System.out.println();

        Maxim.setTown("");
        System.out.println(Maxim.getTown());

        Maxim.setYearOfBirth(-2);
        System.out.println(Maxim.getYearOfBirth());


    }
}
