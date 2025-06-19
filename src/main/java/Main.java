import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args){
        int x, y;
        Boolean result;
        String[] inputValues = readInput();
        x = parseInt(inputValues[0]);
        y = parseInt(inputValues[1]);
        result = x == y;
        System.out.println(result);
    }

    public static String[] readInput(){
        String[] values = new String[2];
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            values = scanner.nextLine().split(" ");
        }
        return values;
    }
}
