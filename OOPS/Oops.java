public class Oops {

    public static void main(String[] args) {
        /*
         * Student s1 = new Student();
         * s1.calcPercentage(70, 60, 80);
         * System.out.println(s1.percentage);
         */

        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.getColor());
        /* System.out.println(p1.color); */ // error

        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen {

    private String color;
    private int tip;

    /* GETTER FOR COLOR */
    public String getColor() {
        return this.color;
    }

    /* SETTER FOR COLOR */
    public void setColor(String newColor) {
        this.color = newColor;
    }

    /* GETTER FOR TIP */
    public int getTip() {
        return this.tip;
    }

    /* SETTER FOR TIP */
    public void setTip(int newTip) {
        this.tip = newTip;
    }

}

class Student {
    String name;
    int age;
    int percentage;

    void calcPercentage(int phy, int chem, int bio) {
        int p = phy + chem + bio;
        int fpercentage = p / 3;
        percentage = fpercentage;
    }
}
