package Day1;

public class WorkWithStrings {

    public static void main(String[] args) {

        System.out.println(ClearString("901754787634321301936111uh1"));

    }

    public static String ClearString(String str) {

        String result = "";
        String[] strArray = str.split("");

        for (int i = 0; i < strArray.length; i++) {

            try{

                int j = Integer.parseInt(strArray[i]);

            } catch (NumberFormatException e) {

                result = result + strArray[i];

            }
        }

        return result;
    }
}
