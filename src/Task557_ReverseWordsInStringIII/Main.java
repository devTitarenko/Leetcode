package Task557_ReverseWordsInStringIII;

public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        long time1 = System.nanoTime();
        String answer = solution.reverseWords("Let's take LeetCode contest");
        long time2 = System.nanoTime();

        System.out.println(answer);
        System.out.println((time2 - time1) / 1000);
    }
}