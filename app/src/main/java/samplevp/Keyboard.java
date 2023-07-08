package samplevp;

import java.util.Scanner;

public class Keyboard {
    Scanner input = new Scanner(System.in);

    public String strInput() {
        return strInput("");
    }

    public String strInput(String prompt) {
        String value = "";
        while (value.length() == 0) {
            if (prompt.length() > 0) {
                System.out.print(prompt);
            }
            value = input.nextLine();
            try {
                if (value.length() == 0) {
                    throw new Exception("Can not have a 0 length");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return value;
    }

    public int intInput() {

        boolean isInt = false;
        int value = 0;
        while (!isInt) {
            String sChar = input.nextLine();
            try {
                value = Integer.parseInt(sChar);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Not an int");
            }
        }
        return value;
    }
}
