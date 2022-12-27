/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lr1;

/**
 *
 * @author hohlo
 */
import java.util.Scanner;

public class Lr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (;;) {

            Scanner in = new Scanner(System.in);
            System.out.println("Input a task number: ");
            int count = in.nextInt();
            switch (count) {
                /*
        1.Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
                 */
                case 1:
                    System.out.println("Input a number: ");
                    int num = in.nextInt();
                    int out = num % 10;
                    System.out.println("Output a number: " + out);
                    break;
                /*
        2.Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа. 
                 */
                case 2:
                    System.out.println("Input a number XXX: ");
                    int num_2 = in.nextInt();
                    if (num_2 > 100 & num_2 < 999) {
                        int num_21 = num_2 % 10;
                        int num_22 = num_21 % 10;
                        int num_23 = num_22 % 10;
                        int sum = num_21 + num_22 + num_23;
                        System.out.println("Output a number: " + sum);
                        break;
                    } else {
                        System.out.println("error");
                        break;
                    }
                /*
        3.Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1, 
            в противном случае не изменять его. Вывести полученное число.
                 */
                case 3:
                    System.out.print("Input a number: ");
                    int num_3 = in.nextInt();
                    if (num_3 > 0) {
                        num_3 = num_3 + 1;
                        System.out.println("Output a number: " + num_3);
                    } else {
                        System.out.println("Output a number: " + num_3);
                    }
                    break;
                /*
        4.Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; 
            если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.*/
                case 4:
                    System.out.print("Input a number: ");
                    int num_4 = in.nextInt();
                    if (num_4 > 0) {
                        num_4 = num_4 + 1;
                        System.out.println("Output a number: " + num_4);
                    } else if (num_4 < 0) {
                        num_4 = num_4 - 2;
                        System.out.println("Output a number: " + num_4);
                    } else if (num_4 == 0) {
                        num_4 = 10;
                        System.out.println("Output a number: " + num_4);
                    }
                    break;
                /*
        5.Ввести три целых числа с консоли. Вывести на экран наименьшее из них.*/
                case 5:
                    System.out.print("Input a 3 number: ");
                    int num_5 = in.nextInt();
                    int num_5_1 = in.nextInt();
                    int num_5_2 = in.nextInt();
                    if (num_5 < num_5_1 & num_5 < num_5_2) {
                        System.out.println("the smallest: " + num_5);
                    } else if (num_5_1 < num_5 & num_5_1 < num_5_2) {
                        System.out.println("the smallest: " + num_5_1);
                    } else {
                        System.out.println("the smallest: " + num_5_2);
                    }
                    break;
                /*
        6.Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», 
 «нулевое число», «положительное нечетное число» и т. д. */
                case 6:
                    System.out.print("Input a number: ");
                    int num_6 = in.nextInt();
                    int feature_1 = num_6 % 2;
                    if (num_6 != 0 & num_6 > 0 & feature_1 == 0) {
                        System.out.println("Number: " + num_6 + " positive, even");
                    } else if (num_6 != 0 & num_6 < 0 & feature_1 == 0) {
                        System.out.println("Number: " + num_6 + " negative, even");
                    } else if (num_6 != 0 & num_6 < 0 & feature_1 == 1) {
                        System.out.println("Number: " + num_6 + " negative, odd");
                    } else if (num_6 != 0 & num_6 > 0 & feature_1 == 1) {
                        System.out.println("Number: " + num_6 + " positive, odd");
                    } else if (num_6 == 0) {
                        System.out.println("Number: " + num_6 + " =0");
                    }
                    break;

                /*
        7.Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города. 
            (Москва(905) - 4.15 руб. Ростов(194) - 1.98 руб. Краснодар(491) - 2.69 руб. Киров(800) - 5.00руб.). 
            Пользователь в консоли должен ввести код города, а в ответ от программы получить, например, 
            при вводе кода 905, - «Москва. Стоимость разговора: 41.5» */
                case 7:
                    System.out.print("Input a cod city: ");
                    int num_7 = in.nextInt();
                    double mos_905 = 4.15;
                    double ros_194 = 1.98;
                    double krasn_491 = 2.69;
                    double kirov_800 = 5.00;
                    if (num_7 == 905) {
                        double out_7 = 10 * mos_905;
                        System.out.println("Moscow. Call cost: " + out_7);
                    } else if (num_7 == 194) {
                        double out_7 = 18 * ros_194;
                        System.out.println("Rostov. Call cost: " + out_7);
                    }
                    if (num_7 == 491) {
                        double out_7 = 10 * krasn_491;
                        System.out.println("Krasnodar. Call cost: " + out_7);
                    }
                    if (num_7 == 800) {
                        double out_7 = 10 * kirov_800;
                        System.out.println("Kirov. Call cost: " + out_7);
                    }
                    break;
                /*
        8.Дан массив целых чисел: [1,-10,5,6,45,23, 45,-34,0,32,56,-1,2,-2]. 
            Для данного массива найти и вывести на экран: максимальное значение, 
            сумму положительных элементов, сумму четных отрицательных элементов,   
            количество положительных элементов, среднее арифметическое отрицательных элементов.*/
                case 8:
                    int[] num_8;
                    num_8 = new int[]{1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
                    int max = -9999;
                    int sum_pos = 0;
                    int sum_neg_even = 0;
                    int count_pos = 0;
                    int avg_sum = 0;
                    int avg_count = 0;

                    for (int i = 0; i < num_8.length; i++) {
                        if (max <= num_8[i]) {
                            max = num_8[i];
                        }
                        if (num_8[i] > 0) {
                            sum_pos = sum_pos + num_8[i];
                            count_pos = count_pos + 1;
                        }
                        if (num_8[i] <= 0) {
                            avg_sum = avg_sum + num_8[i];
                            avg_count = avg_count + 1;
                            if (num_8[i] % 2 == 0) {
                                sum_neg_even = sum_neg_even + num_8[i];
                            }
                        }
                    }
                    System.out.println("Max number: " + max);
                    System.out.println("Count pozitive number: " + count_pos);
                    System.out.println("Sum pozitive number: " + sum_pos);
                    System.out.println("Avg negative number: " + avg_sum / avg_count);
                    System.out.println("Sum negative, even number: " + sum_neg_even);
                    break;
                /*
        9.Дан массив целых чисел: [15,10,51, 6, 5,3, 10,-34,0,32,56, 12,24, 52]. 
            Переставить элементы массива в обратном порядке. Вывести результат в консоль. */
                case 9:
                    int[] num_9;
                    num_9 = new int[]{15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
                    for (int i = 0; i < num_9.length / 2; i++) {
                        int temp = num_9[i];
                        num_9[i] = num_9[num_9.length - i - 1];
                        num_9[num_9.length - i - 1] = temp;
                    }
                    System.out.println("Array in reverse order ");
                    for (int i = 0; i < num_9.length; i++) {
                        System.out.print(" " + num_9[i] + " ");
                    }
                    break;
                /*
        10.Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52]. 
            Переместить нули в конец массива. Вывести результат в консоль.

                 */
                case 10:
                    int[] num_10;
                    int pos = 0;
                    num_10 = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};

                    for (int i = 0; i < num_10.length; i++) {
                        if (num_10[i] != 0) {
                            num_10[pos] = num_10[i];
                            pos++;
                            System.out.print(" " + num_10[i]+ " ");
                          
                        }
                    }
                    for (int i = pos; i < num_10.length; i++) {
                        num_10[pos++] = 0;
                        System.out.print(" " + num_10[i]+ " ");
                    }

                
                default:
                    break;

            }

            System.out.println("want to leave already? True or False");
            Boolean leave = in.nextBoolean();
            if (leave) {
                System.exit(0);
            } else {
                continue;
            }

        }

    }

}
