package human2;

public class Human2 {
    String name;
    String town;
    String job;
    int yearOfBirthge;


    public Human2(String name, String town, String job, int yearOfBirthge) {
        this.name = name;
        this.town = town;
        this.job = job;
        this.yearOfBirthge = yearOfBirthge;


        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirthge + " году.Я работаю на должности " + job + ". Будем знакомы! ");

    }

    public Human2(String name, String town, String job) {
        this.name = name;
        this.town = town;
        this.job = job;
        if (yearOfBirthge <= 0) {
            this.yearOfBirthge = 0;
        }

        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirthge + " году.Я работаю на должности " + job + ". Будем знакомы! ");

    }

    public Human2(String town, String job, int yearOfBirthge) {
        if (name == null) {
            this.name = " Информация не указана ";
        }
        this.town = town;
        this.job = job;
        this.yearOfBirthge = yearOfBirthge;


        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirthge + " году.Я работаю на должности " + job + ". Будем знакомы! ");

    }

    public Human2( int yearOfBirthge) {
        if ( name == null) {
            this.name = " Информация не указана ";
        }
        if (town == null) {
            this.town = " Информация не указана ";
        }
        if (job == null){
            this.job = " Информация не указана ";
        }
        this.yearOfBirthge = yearOfBirthge;


        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirthge + " году.Я работаю на должности " + job + ". Будем знакомы! ");


    }
}



