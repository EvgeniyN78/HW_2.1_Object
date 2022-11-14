public class Human {

    public int yearOfBirth;
    public String name;
    public String town;
    public String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0) {
            yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (name == null || name.equals("")) {
            this.name = "\"Информация не указана\"";
        } else {
            this.name = name;
        }

        if (town == null || town.equals("")) {
            this.town = "\"Информация не указана\"";
        } else {
            this.town = town;
        }

        if (job == null || job.equals("")) {
            this.job = "\"Информация не указана\"";
        } else {
            this.job = job;
        }

    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
