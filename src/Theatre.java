import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Начинаем представление!");

        Actor actor1 = new Actor("Сергей", "Иванов", Gender.MALE, 170);
        Actor actor2 = new Actor("Иван", "Галиев", Gender.MALE, 180);
        Actor actor3 = new Actor("Елена", "Высоцкая", Gender.FEMALE, 200);
        //добавлен новый актер для проверки одинаковых фамилий
        Actor actor4 = new Actor("Мария", "Высоцкая", Gender.FEMALE, 160);
        Director director1 = new Director("Константин", "Хабенский", Gender.MALE, 1);
        Director director2 = new Director("Федор", "Бондарчук", Gender.MALE, 1);
        Person musicAuthor = new Person("Игорь", "Ибрагимов", Gender.MALE);
        Person choreographer = new Person("Екатерина", "Мизерская", Gender.FEMALE);
        String librettoTextOpera = "В опере противопоставляются образ солнечной Испании, радостного " +
                "народного празднества и трагическая судьба Кармен.";
        String librettoTextBalet = "В основу либретто легли сказки европейских народов и писателей о девушках и " +
                "принцессах, превращённых злым колдуном в белых лебедей. Днём эти девушки в виде лебедей плавают по " +
                "озеру, образовавшемуся из слёз матери одной похищенной девушки, а по ночам снова превращаются " +
                "в людей. ";

        Show usualPerfomance = new Show("Щелкунчик", 180, director1, new ArrayList<>());
        Opera opera = new Opera("Кармен", 240, director2, new ArrayList<>(), musicAuthor,
                librettoTextOpera, 10);
        Ballet ballet =new Ballet("Лебединое озеро", 300, director1, new ArrayList<>(), musicAuthor,
                librettoTextBalet, choreographer );

        usualPerfomance.addNewActor(actor1);
        usualPerfomance.addNewActor(actor2);
        opera.addNewActor(actor2);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor3);
        ballet.addNewActor(actor4); //проверка одинаковых фамилий

        usualPerfomance.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        ballet.changeActor(actor2, actor1.surname);
        ballet.printListOfActors();

        opera.changeActor(actor1, actor3.surname);

        opera.printLibrettoText();
        ballet.printLibrettoText();

        ballet.changeActor(actor1, actor3.surname); //проверка одинаковых фамилий
        ballet.printDirectorInfo(); //проверка вывода информации о режиссере

    }
}
