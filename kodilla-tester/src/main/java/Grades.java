public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) return;
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
        if (this.size == 0) return -1;
        return this.grades[this.size - 1];
    }

    public double getAverage() {
        if (this.size == 0) return 0.0;
        double sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum += this.grades[i];
        }
        return sum / this.size;
    }


    public static void main(String[] args) {
        Grades myGrades = new Grades();
        myGrades.add(5);
        myGrades.add(4);
        myGrades.add(6);

        System.out.println("Last grade: " + myGrades.getLastGrade());
        System.out.println("Average grade: " + myGrades.getAverage());
    }
}