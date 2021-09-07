import java.util.HashMap;
import java.util.Map;


public class stringclass {

    static String myName = "Ramitaeeee Bhadaniuuu";

    public static void main(String[] args) {
        stringclass string_class = new stringclass();
//        System.out.println(string_class.in1020(99, 19));
//        System.out.println(string_class.delDel("adedbc"));
//        System.out.println(string_class.mixStart("9iz"));
//        System.out.println(string_class.startOz("ozymandias"));
//        System.out.println(myName.indexOf('R'));
//        System.out.println(string_class.returnLargest(5,3,3));
//        System.out.println(string_class.in3050(30, 41));
        System.out.println(string_class.stringE(myName));
    }


    public boolean in1020(int a, int b) {
        boolean z = (a >= 13 && a <= 19);
        boolean x = (b >= 13 && b <= 19);
        if (x != z) {
            return true;
        } else
            return false;
    }

    public String delDel(String str) {
        int x = str.indexOf("del");
        System.out.println(x);
        return x == 1 ? str.replace("del", "") : str;
    }

    public boolean mixStart(String str) {

        if (str.length() >= 3 && (str.substring(1, 3).contains("ix"))) {
            return true;
        }
        return false;
    }

    public String startOzq(String str) {
        if (str.length() < 2) {
            return str;
        }
        String a = str.substring(0, 2);
        if (str.substring(0, 2).equals("oz")) {
            return a;
        } else if (str.substring(0, 2).charAt('o') == 0) {
            return "0";
        } else if (str.substring(0, 2).indexOf('z') == 1) {
            return "z";
        }
        return str;
    }

    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }

        return result;
    }

    public int returnLargest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }

    public boolean stringE(String str) {
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();
        char[] countE = str.toCharArray();
        for (char countMe : countE) {
            if (countMap.containsKey(countMe)) {
                countMap.put(countMe, countMap.get(countMe) + 1);
            } else {
                countMap.put(countMe, 1);
            }
        }
        for (Map.Entry entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if (entry.getKey().equals('e')) {
                String a = String.valueOf(entry.getValue());
                if (Integer.parseInt(a) == 1 || Integer.parseInt(a) == 3) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
