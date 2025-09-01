package java_basic.homework.StringProb;

public class Prob4 {
    public static void main(String[] args) {
        Prob4 p = new Prob4();
        String addr = "서울시,강남구,싹아트홀,신세계아이앤씨";
        String[] addrArr = p.split(addr, ',');
        System.out.println("배열 크기 : " + addrArr.length);
        for (int i = 0; i < addrArr.length; i++) {
            System.out.print(addrArr[i] + " ");
        }
    }

    public String[] split(String str, char separator) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == separator) {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == separator) {
                result[index++] = temp.toString();
                temp.setLength(0);
            } else {
                temp.append(str.charAt(i));
            }
        }
        result[index] = temp.toString();

        return result;
    }
}
