/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TASYA WIDIA MIGIANTO
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Tasya10519006_soal3 {
 public static void main(String[] args){
   double tinggi1;
   int tinggi2;
   try{
     BufferedReader input= new
       BufferedReader(new InputStreamReader(System.in));
     System.out.print("input tinggi 1:");
     tinggi1=Double.parseDouble(input.readLine());
     System.out.print("input tinggi 2:");
     tinggi2=Double.parseDouble(input.readLine());
     System.out.println(tinggi1+"+"+tinggi2+"="+(tinggi1+tinggi2 ));
   }
 }
}
