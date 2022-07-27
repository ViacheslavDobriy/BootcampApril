package Day1;

public class DeleteDigits {

    public String ClearString(String str) {

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
