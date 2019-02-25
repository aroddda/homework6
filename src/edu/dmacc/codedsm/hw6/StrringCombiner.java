package edu.dmacc.codedsm.hw6;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
public class StrringCombiner {


    public static void main(String[] args) {
        String name = "amare";
        int age = 31;

     System.out.println(name + "" + age + "Today is " + outputdate());


        System.out.println(name + "" + age);
        System.out.println("Today is" + outputdate());

    }
              public static String outputdate(){
        SimpleDateFormat format = new SimpleDateFormat("29 02 2019");

    {
        return format.format(Date.from(Instant.now()));

    }}}