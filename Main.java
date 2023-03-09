//자바 모음

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

// 변수 선언
    int a=5 ,b=9;
// 문자열 
    System.out.println("Hello world!");
// 칸 띄우기
    System.out.println();
// 덧셈 
    System.out.println(a+b);
    System.out.println();
    
// 배열   
    int[] i = new int[3];
    i[0]=3;
    i[1]=7;
    i[2]=9;

    System.out.println(i[0]);
    System.out.println(i[1]);
    System.out.println(i[2]);
  System.out.println(i[0]+i[1]+i[2]);
  System.out.println();
    

// 스캐너 
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("당신의 이름을 입력하세요 :");
        String name = scanner.next();
        System.out.println("당신의 이름은 "+name+"입니다");
        
        System.out.print("당신의 도시를 입력하세요 :");
        String city = scanner.next();  
        System.out.println("당신의 도시는 "+ city +"입니다");
        
        System.out.print("당신의 나이를 입력하세요 :");
        int age = scanner.nextInt();
        System.out.println("당신의 나이는 "+ age +"입니다");

        scanner.close();

    
//반복문
   for(int c=1; c<=9; c++){
      System.out.println(c);
    }
     System.out.println();

//조건문 
    //홀짝 판별
    int d=99;
    if(d % 2 == 1) {
      System.out.println("홀수");
    }
    else{
     System.out.println("짝수"); 
     System.out.println();
    }

     //구구단
	   int e=0,f=0;
	   for(e=2;e<=9;e++) {
		   for(f=1;f<10;f++){
//	    System.out.print(e);		
//	    System.out.print("*");
//	    System.out.print(f);	
//	    System.out.print("=");	
		System.out.println(e+"*"+f+"="+e*f);	   
   }
  }
 } 
}
  