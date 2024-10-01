import java.util.Scanner;

public class strings
{

    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        String game = "Cricket";
        String a = game.toLowerCase();
        String b = game.toUpperCase();

        System.out.println();
        System.out.println(game.length());
        System.out.println(game.toLowerCase());
        System.out.println(game.toUpperCase());
        System.out.println(game.startsWith("a"));
        System.out.println(game.endsWith("t"));
        System.out.println(game.replace("t","ter"));
        System.out.println(game.indexOf("C"));
        System.out.println(game.indexOf("C",3));
        System.out.println(game.charAt(3));
        System.out.println(game.substring(2,6));
        System.out.println(game.lastIndexOf("k"));
        System.out.println(game.equals("cricket"));
        System.out.println(game.equalsIgnoreCase("cricket"));

    }

}