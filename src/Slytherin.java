class Slytherin extends Hogwarts {
    String name;
    int cunning;
    int determination;
    int ambition;

    Slytherin(String name, int magicPower, int transgression, int cunning, int determination, int ambition) {
        super(magicPower, transgression);
        this.name = name;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

        void printDescription() {
            System.out.println(name + " из Слизерн: хитрость - " + cunning + ", решительность - " + determination + ", амбиционность - " + ambition);
        }

        void compareStudents(Slytherin student) {
            int totalPointsThis = cunning + determination + ambition;
            int totalPointsOther = student.cunning + student.determination + student.ambition;

            if (totalPointsThis > totalPointsOther) {
                System.out.println(name + " лучший из Слизерин, чем " + student.name);
            } else {
                System.out.println(student.name + " лучший из Слизерн, чем " + name);
            }

        }}