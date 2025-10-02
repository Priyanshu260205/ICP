import java.util.*;
public class leet_406 {
    public static void main(String[] args) {
        int people[][] = { {7,0},{4,4},{7,1},{5,0},{6,1},{5,2} };
        reconstructQueue(people);
        for (int i=0 ; i<people.length; i++) {
            for(int j=0; j<people[0].length; j++){
                System.out.print(people[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return b[0] - a[0];
            }
        });

        List<int[]> result = new LinkedList<>();
        for (int[] p : people) {
            result.add(p[1], p);
        }

        return result.toArray(new int[people.length][]);
    }
}
