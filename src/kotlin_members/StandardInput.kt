package kotlin_members

import  java.util.Scanner;

fun main() {

    // std Input 'in'
    val scanner = Scanner(System.`in`);
    print("Masukkan nama Anda : ")
    val name = readLine();

    print("Masukkan umur anda : ")
    val age = readln().toInt();

    println("Hello, $name");
    println("Your age is, $age");
    scanner.close()
}