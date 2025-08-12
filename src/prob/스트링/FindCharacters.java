package prob.스트링;

public class FindCharacters {


    public static void main(String[] args) {
        FindCharacters fc=new FindCharacters();
        int count=fc.countChar("Boys, be ambitious", 'b');
        System.out.println(count);

    }
    public int countChar(String str, char c) {
        int count = 0;
        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if (ch == c) {
                count++;
            }
        }

        return count;
    }
}
