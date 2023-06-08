import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> allGrades;
    private ArrayList<Integer> passingGrades;
    private static final int PASSING_GRADE = 50;

    public Grades() {
        this.allGrades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
    }

    private boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 100;
    }

    public void add(int grade) {
        if (isValidGrade(grade)) {
            this.allGrades.add(grade);

            if (grade >= PASSING_GRADE) {
                this.passingGrades.add(grade);
            }
        }
    }

    public double getPassingAverage() {
        return this.calculateAverage(passingGrades);
    }
    public double getAverage() {
        return calculateAverage(allGrades);
    }

    private double calculateAverage(ArrayList<Integer> grades) {
        double total = 0;
        for (int number : grades) {
            total += number;
        }
        return total / grades.size();
    }

    public double getPassingPercentage() {
        return 100 *  ((double) this.passingGrades.size() / this.allGrades.size());
    }

    public void printGradeDistribution() {
        int[] stars = new int[6];

        for (int grade : this.allGrades) {
            if (grade < 50) {
                stars[0]++;
            } else if (grade < 60) {
                stars[1]++;
            } else if (grade < 70) {
                stars[2]++;
            } else if (grade < 80) {
                stars[3]++;
            } else if (grade < 90) {
                stars[4]++;
            } else {
                stars[5]++;
            }
        }

        System.out.println("Grade distribution:");
        System.out.println("5: " + printStars(stars[5]));
        System.out.println("4: " + printStars(stars[4]));
        System.out.println("3: " + printStars(stars[3]));
        System.out.println("2: " + printStars(stars[2]));
        System.out.println("1: " + printStars(stars[1]));
        System.out.println("0: " + printStars(stars[0]));
    }

    public String printStars(int amount) {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            stars.append("*");
        }
        return stars.toString();
    }


}
