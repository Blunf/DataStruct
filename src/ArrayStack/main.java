package ArrayStack;

import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("입력하세요");
        String input = sc.nextLine();

        ArrayStack stack = new ArrayStack(input.length());

        for(int i = 0; i<input.length(); i++){
            char c = input.charAt(i);
            stack.push(c);
        }

        for(int i = 0; i<stack.size(); i++){
            System.out.println(stack.pop());
        }
    }
}
