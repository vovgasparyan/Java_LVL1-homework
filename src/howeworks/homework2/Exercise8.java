package howeworks.homework2;

import java.util.Objects;
import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner inputSymbol = new Scanner(System.in);
        System.out.println("Input letter");
        String word = inputSymbol.nextLine();
        getLettersType(word);
    }

    public static void getLettersType(String ch) {
        if (!Objects.equals(ch, "A") && !Objects.equals(ch, "E") && !Objects.equals(ch, "I") && !Objects.equals(ch, "O") && !Objects.equals(ch, "U") && !Objects.equals(ch, "a") && !Objects.equals(ch, "e") && !Objects.equals(ch, "i") && !Objects.equals(ch, "o") && !Objects.equals(ch, "u")) {
            if (!Objects.equals(ch, "B") && !Objects.equals(ch, "C") && !Objects.equals(ch, "D") && !Objects.equals(ch, "F") && !Objects.equals(ch, "G") && !Objects.equals(ch, "H") && !Objects.equals(ch, "J") && !Objects.equals(ch, "K") && !Objects.equals(ch, "L") && !Objects.equals(ch, "M") && !Objects.equals(ch, "N") && !Objects.equals(ch, "P") && !Objects.equals(ch, "Q") && !Objects.equals(ch, "R") && !Objects.equals(ch, "S") && !Objects.equals(ch, "T") && !Objects.equals(ch, "V") && !Objects.equals(ch, "W") && !Objects.equals(ch, "X") && !Objects.equals(ch, "Y") && !Objects.equals(ch, "Z") && !Objects.equals(ch, "b") && !Objects.equals(ch, "c") && !Objects.equals(ch, "d") && !Objects.equals(ch, "f") && !Objects.equals(ch, "g") && !Objects.equals(ch, "h") && !Objects.equals(ch, "j") && !Objects.equals(ch, "k") && !Objects.equals(ch, "l") && !Objects.equals(ch, "m") && !Objects.equals(ch, "n") && !Objects.equals(ch, "p") && !Objects.equals(ch, "q") && !Objects.equals(ch, "r") && !Objects.equals(ch, "s") && !Objects.equals(ch, "t") && !Objects.equals(ch, "v") && !Objects.equals(ch, "w") && !Objects.equals(ch, "x") && !Objects.equals(ch, "y") && !Objects.equals(ch, "z")) {
                if (ch.length() > 0) {
                    System.out.println("Error in char length");
                } else {
                    System.out.println("Input invalid letter");
                }
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Input letter is Vowel");
        }
    }
}
