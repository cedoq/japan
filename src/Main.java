//libs
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader bR = new BufferedReader(new InputStreamReader(System.in))
            ;
    public static void main(String[] args) throws IOException {
        System.out.println("1 = первое задание, 2= второе задание ");
        int a = Integer.parseInt(bR.readLine());
        if(a==1){
            int i;
            for(i = 0; i<=100;i++){
                String k = String.valueOf(i);
                if (!k.contains("4") && !k.contains("9") ) {
                    System.out.println(i);
                }
            }
            } else if (a==2) {


        int i = 2; //day count
            int k = 1; //money per day
            int sum=1;//total money
            System.out.println("1 день -> " + sum);
            while(sum<1000000){
                k = k*3;
                if(sum+k>1000000){break;}

                sum = sum + k;
                System.out.println(i + " день -> "+ sum);
                i++;

            }


        }
        else{
            System.out.println("ярик ну ты тупой чтоль?");
        }
        }
}
