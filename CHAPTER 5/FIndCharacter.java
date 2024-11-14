public class FIndCharacter {
    public static void main(String[]arge){
        String searchMe = "She sells sea shell by the sea shore";
        searchMe = searchMe.toLowerCase();
        int max = searchMe.length();
        int numSs = 0;
        for (int i = 0;i < max;i++){
            if(searchMe.charAt(i) != 's')
            continue;

            numSs++;
        }
        System.out.println("Found " + numSs + " s's in the string");
    }
}
