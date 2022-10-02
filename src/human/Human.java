package human;

public class Human {
    String name;
    String town;
    String job;
    int yearOfBirthge;


    public Human ( String name,String town,String job,int yearOfBirthge ){
        this.name = name;
        this.town = town;
        this.job = job;
        this.yearOfBirthge = yearOfBirthge;

        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirthge + " году.Я работаю на должности " + job +". Будем знакомы! " );

    }



}
