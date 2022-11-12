import java.util.Scanner;

public class ExseptionPrintStackTrace {
    public static void main(String[] args) {
    System.out.println("Введите дробное число");
    double DoubleNum = NumberDouble();
    }
    public static double NumberDouble(){
        double res = 0;
        Scanner numberSc = new Scanner(System.in);
        String temp = numberSc.nextLine();
        try {
             res = Double.parseDouble(temp);
        }
        catch (NumberFormatException Nfe){
            System.out.println("Ошибка ввода данных");
            Nfe.printStackTrace();
            main(new String[0]);
        }
        return res;
    }
}

