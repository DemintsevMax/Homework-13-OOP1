class Gryffindor extends Hogwarts {
    String name;
    int nobility;
    int honor;
    int bravery;

    Gryffindor(String name,int magicPower,int transgression,int nobility, int honor, int bravery) {
        super(magicPower,transgression);
        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    void printDescription() {
        System.out.println(name + " из Гриффиндора: благородство - " + nobility + ", честь - " + honor + ", храбрость - " + bravery);
    }

    void compareStudents(Gryffindor student) {
        int totalPointsThis = nobility + honor + bravery;
        int totalPointsOther = student.nobility + student.honor + student.bravery;

        if (totalPointsThis > totalPointsOther) {
            System.out.println(name + " лучший Гриффиндорец, чем " + student.name);
        } else {
            System.out.println(student.name + " лучший Гриффиндорец, чем " + name);
        }

    }

}