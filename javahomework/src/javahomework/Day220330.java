package javahomework;
import java.util.ArrayList;

public class Day220330 {

    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> soldiers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            soldiers.add(i);

        int die = 0;
        while (soldiers.size() > 1) {
            die = (die + k - 1) % soldiers.size();

            System.out.println(soldiers.remove(die) + "번 군사가 죽습니다.");
        }

        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}
