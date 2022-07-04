import java.util.Scanner;
public class armstrongSayiKontrolu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");//407
        int number = input.nextInt();//Kullanıcı değeri giriyor
        int basNumber = 0;
        int tempNumber = number;//407
        int basValue;
        int result = 0 ;
        int basPow;

        while (tempNumber!=0) {
            tempNumber/=10;
            //System.out.println("tempNumber değeri : "  + tempNumber);
            basNumber++;
            //System.out.println("basNumber değeri : "  + basNumber);
        }

        tempNumber=number;
        System.out.println("tempNumber değeri : " + tempNumber);
        while (tempNumber!=0) {
            basValue = tempNumber %10;
            //System.out.println("basValue değeri : " + basValue);
            basPow = 1;
            //System.out.println("basPow değeri : " + basPow);
            for (int i = 1; i <=basNumber;i++) {
                basPow *=basValue;
                //System.out.println("basPow değeri : " + basPow);
            }
            result+=basPow;
            //System.out.println("result değeri : " + result);
            tempNumber /=10;
            //System.out.println("tempNumber değeri : " + tempNumber);
        }
    if(number==result) {
        System.out.println(number + " sayısı bir Armstrong sayıdır.");
    }else {
        System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
    }



    }
}
