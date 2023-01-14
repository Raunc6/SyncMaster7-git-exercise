import java.util.Scanner;

public class VowelCount {

    public void countVowels() {
        System.out.println("Enter your word/sentence for the program to count the vowels:");
//        Added the "sout" for user

        Scanner sc = new Scanner(System.in);
        int vowelCount = 0;
//        String[] vowelsList = {"a", "e", "i", "o", "u"};
//        char[] vowelsList = {'a', 'e', 'i', 'o', 'u'};
        String userSentence = sc.nextLine();
        String lowerCase = userSentence.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {

          if(lowerCase.charAt(i) == 'a' || lowerCase.charAt(i) == 'e' || lowerCase.charAt(i) == 'i' ||
             lowerCase.charAt(i) == 'o' || lowerCase.charAt(i) == 'u' || lowerCase.charAt(i) == 'õ' ||
             lowerCase.charAt(i) == 'ü' || lowerCase.charAt(i) == 'ö' || lowerCase.charAt(i) == 'ä') {
             vowelCount++;
            }
//          Added Ä, Ö, Ü and Õ to the list
        }
        System.out.println("There are " + vowelCount + " vowels in the given word/sentence.");
    }
}