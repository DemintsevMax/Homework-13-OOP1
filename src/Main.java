
public class Main {
    public static void main(String[] args) {
        // Создание объектов учеников с конкретными хатеристиками
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер",88,95, 54, 54,54);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 84,85,90, 54, 4
        );
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли",45,56, 80, 78, 84);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой",89,54,  75, 90, 80);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 65,54 ,80, 85, 85);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",84 ,54, 70, 85, 90);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит",65 ,96, 85, 95, 85);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори",58 ,63,87, 90, 90);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли",87,59, 80, 88, 85);

        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг",45,65, 95, 85, 95);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил",78,65, 90, 90, 90);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби",59,95, 80, 90, 85);

        // Вывод описания ученика
        harryPotter.printDescription();
        harryPotter.describe();
        System.out.println();
        dracoMalfoy.printDescription();
        dracoMalfoy.describe();
        System.out.println();
        zachariasSmith.printDescription();
        zachariasSmith.describe();
        System.out.println();
        choChang.printDescription();
        choChang.describe();
        // Сравнение учеников Гриффиндора
        harryPotter.compareStudents(hermioneGranger);
        hermioneGranger.compareStudents(ronWeasley);

        // Сравнение учеников Слизерин
        dracoMalfoy.compareStudents(gregoryGoyle);
        gregoryGoyle.compareStudents(grahamMontague);

        // Сравнение учеников Пуффендуй
        zachariasSmith.compareStudents(cedricDiggory);
        cedricDiggory.compareStudents(justinFinchFletchley);

        // Сравнение учеников Когтеврана
        choChang.compareStudents(padmaPatil);
        padmaPatil.compareStudents(marcusBelby);

        Hogwarts.compareMagicAndTransgression(harryPotter, justinFinchFletchley);

    }


}
