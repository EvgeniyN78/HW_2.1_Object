public class Human {

    private int yearOfBirth;
    public String name;
    private String town;
    public String job;

    public Human(int yearOfBirth, String name, String town, String job) {

        this.yearOfBirth = yearOfBirth;

        if (name == null || name.equals("")) {
            this.name = "\"Информация не указана\"";
        } else {
            this.name = name;
        }

        this.town = town;

        if (job == null || job.equals("")) {
            this.job = "\"Информация не указана\"";
        } else {
            this.job = job;
        }

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getJob() {
        return job;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()){
            this.town = town;
        } else {
            this.town = "\"Информация не указана\"";
        }
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
