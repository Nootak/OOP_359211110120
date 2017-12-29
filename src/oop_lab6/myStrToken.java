package oop_lab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
        //StringTokenizer
        String msg = "Hello Welcome MT RMUTSV 2017";
        StringTokenizer myToken = new StringTokenizer(msg);
        //countTokens()
        System.out.println(myToken.countTokens());
        while (myToken.hasMoreElements()){
            StringBuffer buffer =
                    new StringBuffer(myToken.nextToken());
            System.out.println(buffer.reverse()+" ");

        }

    }//main
}//class
