import java.util.Arrays;

public class leet_881 {
    public static void main(String[] args) {
        int[] people = { 3,2,2,1 };
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int boats = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            boats++;
        }

        return boats;
    }
}
