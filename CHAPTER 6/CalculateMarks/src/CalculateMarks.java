public class CalculateMarks {
    public void calculateAverage(float student1, float student2, float student3){
        float mark1 = student1 / 3, mark2 = student2 / 3, mark3 = student3 / 3;
        System.out.printf("Student 1 Average Marks : %.3f \nStudent 2 Average Marks : %.3f \nStudent 3 Average marks : %.3f", mark1, mark2, mark3);
        float highestAverage = Math.max(mark1, Math.max(mark2, mark3));
        System.out.println("\nThe highest average is " + highestAverage);
    }
}
