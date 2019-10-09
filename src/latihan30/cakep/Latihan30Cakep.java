/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author Aero
 * NAMA  : IRMAN NOVRYANSAH
 * KELAS : IF 1
 * NIM   : 10118018
 * Deskripsi Program : Program ini untuk menampilkan output dengan disertai 
 *                     warna pada teksnya.
 */
public class Latihan30Cakep {

      //kode warna teks (text color)
    public static final String TGT_RESET = "\u001B[0m";
    public static final String TGT_BLACK = "\u001B[30m";
    public static final String TGT_RED = "\u001B[31m";
    public static final String TGT_GREEN = "\u001B[32m";
    public static final String TGT_YELLOW = "\u001B[33m";
    public static final String TGT_BLUE = "\u001B[34m";
    public static final String TGT_PURPLE = "\u001B[35m";
    public static final String TGT_CYAN = "\u001B[36m";
    public static final String TGT_WHITE = "\u001B[37m";
//    kode background color
    public static final String TGT_BLACK_BACKGROUND = "\u001B[40m";
    public static final String TGT_RED_BACKGROUND = "\u001B[41m";
    public static final String TGT_GREEN_BACKGROUND = "\u001B[42m";
    public static final String TGT_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String TGT_BLUE_BACKGROUND = "\u001B[44m";
    public static final String TGT_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String TGT_CYAN_BACKGROUND = "\u001B[46m";
    public static final String TGT_WHITE_BACKGROUND = "\u001B[47m";
    

    public static void main(String[] args) {
        
        //variabel
        String jawab;
        
        //scanner
        Scanner scn = new Scanner(System.in);
        
        //input
        System.out.print(TGT_RED+"Kamu "+TGT_RESET);
        System.out.print(TGT_GREEN+"ngerjain sendiri "+TGT_RESET);
        System.out.print(TGT_YELLOW+"latihan 17 sampe "+TGT_RESET);
        System.out.print(TGT_BLUE+"latihan 30 ini? \n"+TGT_RESET);
        System.out.print(TGT_BLUE+"Jawab "+TGT_RESET);
        System.out.print(TGT_RED+"(Yoi/Enggak) : "+TGT_RESET);
        jawab = scn.next();
        
        //input pilihan
        String jawaban = jawab.toUpperCase();
        if (jawaban.equals("YOI")) {
            System.out.print(TGT_RED+"\nCakep Bener. "+TGT_RESET);
            System.out.print(TGT_PURPLE+"Good Job \n"+TGT_RESET);
        }
        
        //output
        else{
            System.out.print(TGT_RED+"\nTetep cakep sih. "+TGT_RESET);
            System.out.print(TGT_CYAN+"\nSing penting paham konsep nya yee. "
                    +TGT_RESET);
            System.out.print(TGT_BLACK+"\nKeep the code works dude."+TGT_RESET);  
        }
    }
    
}
