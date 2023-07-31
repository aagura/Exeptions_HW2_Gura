import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        try {
            System.out.println(inputNonNull());
        } catch (EmptyString e) {
            e.printStackTrace();
        }
    }

    private static String inputNonNull() throws EmptyString {

        System.out.println("Введите выражение:");
        String data = null;
        Scanner sc = new Scanner(System.in);
        data = sc.nextLine();
        if(data == null ||  data.isEmpty()) throw new EmptyString("Ввеодить пустую строку нельзя");



        return data;
    }
}
    class EmptyString extends   Throwable{
        private String data;

        public EmptyString(String message){

            super(message);

        }

    }




