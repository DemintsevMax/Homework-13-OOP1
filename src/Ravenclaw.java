class Ravenclaw extends Hogwarts {
    String name;
    int wise;
    int witty;
    int creative;

    Ravenclaw(String name,int magicPower,int transgression , int wise, int witty, int creative) {
        super(magicPower, transgression);
        this.name = name;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    void printDescription() {
        System.out.println(name + " из Когтевран: мудрость - " + wise + ", остроумие - " + witty + ", креотивность - " + creative);
    }

    void compareStudents(Ravenclaw student) {
        int totalPointsThis = wise + witty + creative;
        int totalPointsOther = student.wise + student.witty + student.creative;

        if (totalPointsThis > totalPointsOther) {
            System.out.println(name + " лучший из Когтевран, чем " + student.name);
        } else {
            System.out.println(student.name + " лучший из Когтевран, чем " + name);
        }
    }
}