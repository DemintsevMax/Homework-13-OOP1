class Hogwarts extends Main {
    int magicPower;
    int transgression;

    Hogwarts(int magicPower, int transgression) {
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    void describe() {
        System.out.println("Сила магии: " + this.magicPower + ", Трансгресивность: " + this.transgression);
    }

    static void compareMagicAndTransgression(Hogwarts student1, Hogwarts student2) {
        if (student1.magicPower > student2.magicPower && student1.transgression > student2.transgression) {
            System.out.println("Студент 1 сильнее в силе магии и дальности трансгрессии.");
        } else if (student1.magicPower < student2.magicPower && student1.transgression < student2.transgression) {
            System.out.println("Студент 2 сильнее в силе магии и дальности трансгрессии.");
        } else {
            System.out.println("Студенты ровны по силе");
        }
    }
}
