package ��Ӳ��;

import java.util.Scanner;
public class Main1 {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("���������");
  int Coin = input.nextInt();
  int zheng = 0;
  int fan = 0;
  for (int i = 0; i < Coin; i++) {
   int number = (int) (Math.random() * 2);
   if (number == 0)
    zheng++;
   else if (number == 1)
    fan++;
   else
    System.err.println("Wrong result.");
  }
  System.out.println("����:" + zheng + "," + (float) zheng / (float) Coin
    * 100 + "%");
  System.out.println("����:" + fan + "," + (float) fan / (float) Coin * 100
    + "%");
 }
}