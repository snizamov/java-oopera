import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        System.out.println("Актеры спектакля " + title + ":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println("---------------------");
    }

    public void addNewActor(Actor actor) {

        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже есть в списке актеров");
        } else {
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor newActor, String surname) {
        int count = 0;
        for (Actor a : listOfActors) {
            if (a.getSurname().equals(surname)) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Замена невозможна, так как кандидатов с фамилией " + surname + " больше, чем ожидалось");
            System.out.println("---------------------");
            return;
        }

        for (Actor a : listOfActors) {
            if (a.getSurname().equals(surname)) {
                a.setName(newActor.name);
                a.setSurname(newActor.surname);
                a.setGender(newActor.gender);
                a.setHeight(newActor.height);
                System.out.println("Актер " + newActor + " заменил актера с фамилией " + surname);
                return;
            }
        }
        System.out.println("Актера с фамилией " + surname + " нет в списке спектакля " + title);
        System.out.println("---------------------");
    }

    public void printDirectorInfo() {
        System.out.println(director);
    }


}













