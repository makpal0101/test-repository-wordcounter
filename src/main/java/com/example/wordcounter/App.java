package com.example.wordcounter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
        	 if (Character.isLetter(s.charAt(i)) && i != endLine) {
	            isWord = true;
	        } else if (!Character.isLetter(s.charAt(i)) && isWord) {
	            count++;
	            isWord = false;
	        } else if (Character.isLetter(s.charAt(i)) && i == endLine) {
	            count++;
	        }
	    }
	    return count;
    }
}
