package human;

import human.Human;

public class Main {
    public static void main(String[] args) {

        Human maksim =  new Human();

        maksim.name = " Максим ";
        maksim.yearOfBirthge = 1987;
        maksim.town = " Минск ";
        maksim.job = " бренд-менеджером ";
        maksim.outputInformation();

        Human anna =  new Human();

        anna.name = " Аня ";
        anna.yearOfBirthge = 1993;
        anna.town = " Москва ";
        anna.job = " методистом образовательных программ ";
        anna.outputInformation();

        Human katya =  new Human();

        katya.name = " Катя ";
        katya.yearOfBirthge = 1994;
        katya.town = " Калининград ";
        katya.job = "продакт-менеджером ";
        katya.outputInformation();

        Human artem =  new Human();

        artem.name = " Артем ";
        artem.yearOfBirthge = 1995;
        artem.town = " Москва ";
        artem.job = "директором по развитию бизнеса ";
        artem.outputInformation();

          }
}