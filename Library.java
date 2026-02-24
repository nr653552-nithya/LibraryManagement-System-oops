import java.util.*;
import java.io.*;
class LibraryManagement {
 String name;
 String author;
 String language;
 int issueyear;
 long idnumber;
 LibraryManagement(String name, String author, String language,
 int issueyear, long idnumber) {
 this.name = name;
 this.author = author;
 this.language = language;
 this.issueyear = issueyear;
 this.idnumber = idnumber;
 }
 void BookDetails() {
 System.out.println("\nBook Details:");
 System.out.println("Book Name : " + name);
 System.out.println("Author : " + author);
 System.out.println("Language : " + language);
 System.out.println("Issue Year: " + issueyear);
 System.out.println("Student ID: " + idnumber);
 }
}
class Main {
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the Book Name:");
 String name = s.nextLine();
 System.out.println("Enter the Book Author:");
 String author = s.nextLine();
 System.out.println("Enter the Book Language:");
 String language = s.nextLine();
 System.out.println("Enter the Issue Year:");
 int issueyear = s.nextInt();
 System.out.println("Enter the Student ID number:");
 long idnumber = s.nextLong();
 LibraryManagement lm =
 new LibraryManagement(name, author, language, issueyear, idnumber);
 lm.BookDetails();
 }
}