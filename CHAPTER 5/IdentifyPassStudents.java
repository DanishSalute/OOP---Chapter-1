public class IdentifyPassStudents {
    public static void main(String[] args) {
        byte[] testResults = {50, 78, 43, 90, 37, 40, 60, 70, 10, 20, 60, 70, 80, 90, 100};

        byte[] passStudents = new byte[testResults.length];
        byte[] failStudents = new byte[testResults.length];
        
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < testResults.length; i++) {
            if (testResults[i] >= 40) {
                passStudents[passCount] = testResults[i];
                passCount++;
            } else {
                failStudents[failCount] = testResults[i];
                failCount++;
            }
        }

        byte[] finalPassStudents = new byte[passCount];
        byte[] finalFailStudents = new byte[failCount];

        System.arraycopy(passStudents, 0, finalPassStudents, 0, passCount);
        System.arraycopy(failStudents, 0, finalFailStudents, 0, failCount);

        System.out.println("The number of students that passed are " + finalPassStudents.length);
        System.out.println("The number of students that failed are " + finalFailStudents.length);

        double passPercentage = ((double) passCount / testResults.length) * 100;

        if (passPercentage >= 50) {
            System.out.println("Bonus to instructor");
        }
    }
}
