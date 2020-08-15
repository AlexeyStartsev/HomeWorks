package Calculator;
import java.io.*;
import java.util.regex.Pattern;
public class Calculator1 {
   // String str;
    public static double sum(String a){
        String[] param = a.split(Pattern.quote("+"), 2);

        return Double.parseDouble(param[0])+Double.parseDouble(param[1]);
    }
    static double substraction(String a) {
        String[] param = a.split(Pattern.quote("-"), 2);
        return Double.parseDouble(param[0]) - Double.parseDouble(param[1]);
    }

    static double multiplication(String a) {
        String[] param = a.split(Pattern.quote("*"), 2);
        return Double.parseDouble(param[0]) * Double.parseDouble(param[1]);
    }
    static double division(String a) {
        String[] param = a.split(Pattern.quote("/"), 2);
        return Double.parseDouble(param[0]) / Double.parseDouble(param[1]);
    }
    static double percent(String a) {
        String[] param = a.split(Pattern.quote("%"), 2);
        return Double.parseDouble(param[0]) * Double.parseDouble(param[1]) / 100;
    }

    public static void calc(String str){
       if (str.contains("+")){
            System.out.println(sum(str));
        }
       if (str.contains("-")){
            System.out.println(substraction(str));}
       if (str.contains("*")){
            System.out.println(multiplication(str));}
       if (str.contains("/")){
            System.out.println(division(str));}
       if (str.contains("%")){
            System.out.println(percent(str));}
       System.out.println("There is no operation");

       
    }

   // public Calculator1(String a){
   //     this.str = a;
    //}
}
