package JavaProject02;

import javax.swing.*;

public abstract class Marks {/*We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentageof marks.
 Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code */

    abstract double getMarkPrcentage();

}
class StudentA extends Marks{
    private double mathMark;
    private double artMark;
    private double scienceMark;

    public StudentA(double mathMark, double artMark, double scienceMark) {
        this.mathMark = mathMark;
        this.artMark = artMark;
        this.scienceMark = scienceMark;
    }

    @Override
    double getMarkPrcentage() {
        double marks=(mathMark+artMark+scienceMark)/3;
        return marks;

    }
}
class StudentB extends Marks{
    private double mathMark;
    private double artMark;
    private double scienceMark;
    private double historyMark;

    public StudentB(double mathMark, double artMark, double scienceMark, double historyMark) {
        this.mathMark = mathMark;
        this.artMark = artMark;
        this.scienceMark = scienceMark;
        this.historyMark = historyMark;
    }



    @Override
    double getMarkPrcentage() {
        double marks=(mathMark+artMark+scienceMark+historyMark)/4;
        return marks;
    }
}
class MarkTester {
    public static void main(String[] args) {
        StudentA studentA=new StudentA(85.5,97.2,75);
        StudentB studentB=new StudentB(99.1,93.5,97.2,76);
        System.out.println("Average presentage of marks for Student A is: "+studentA.getMarkPrcentage());
        System.out.println("Average presentage of marks for Student B is: "+studentB.getMarkPrcentage());
        }
    }

