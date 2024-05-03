class Hufflepuff extends Hogwarts {
    String name;
    int hardworking;
    int loyal;
    int honest;

    Hufflepuff(String name,int magicPower,int transgression, int hardworking, int loyal, int honest) {
        super(magicPower, transgression);
        this.name = name;
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    void printDescription() {
        System.out.println(name + " из Пуффендуя : трудолюбие - " + hardworking + ", верность - " + loyal + ", чесность - " + honest);
    }

    void compareStudents(Hufflepuff student) {
        int totalPointsThis = hardworking + loyal + honest;
        int totalPointsOther = student.hardworking + student.loyal + student.honest;

        if (totalPointsThis > totalPointsOther) {
            System.out.println(name + " лучший из Пуффендуя , чем " + student.name);
        } else {
            System.out.println(student.name + " лучший из Пуффендуя , чем " + name);
        }
    }
}