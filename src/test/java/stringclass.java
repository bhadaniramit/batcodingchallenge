

public class stringclass {

    String myName = "Ramit Bhadani";
    public static void main(String[] args) {
        stringclass string_class = new stringclass();
        string_class.replace();
    }

    public void replace(){
        System.out.println( myName.replace('a','y'));
    }
}
