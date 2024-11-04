package Exercicio8;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Palindrome p = new Palindrome();

        System.out.print("Digite uma palavra: ");
        String palavra = s.nextLine();
        char[] word= palavra.toCharArray();
        System.out.println(p.isPalindrome(word));
    }

    public boolean isPalindrome(char word[]) throws IllegalArgumentException{
        if(word == null) throw new IllegalArgumentException();
        return isPalindrome(word, 0);
    }
         
    private boolean isPalindrome(char[] word, int i){
        if(i >= word.length/2) return true;
        return word[i] == word[word.length-1-i] ? isPalindrome(word, i+1) : false;
    }
}
