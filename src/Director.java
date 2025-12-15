public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void printDirectorInfo(Director director) {
        System.out.println(director);
    }

    @Override
    public String toString() {
        String result = "Режиссер данного спектакля - многоуважаемый " + super.toString();
        return result;
    }





}
