import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть слово для перевірки його поліндрома: ");

        String word = scanner.nextLine();
        String lowerWord = word.toLowerCase();
        
        String reversedWord = Exercise.Reverse(lowerWord);
        
        if( reversedWord.equals("error")){
            System.out.println("Упсс, схоже ви ввели шось не то, перезапустіть програму та повторіть спробу.");
            return;
        }
        System.out.println("Відзеркаленням даного слова — є "+reversedWord+".");
        System.out.println("Тобто слово "+lowerWord+(Exercise.Calculate(lowerWord) ? " є ": " не є ")+"поліндромом.");

        scanner.close();

    }

}
