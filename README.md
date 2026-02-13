# Завдання №12 "Перевірка чи є програма паліндромом"

## Код у класі Exercise
```java
public class Exercise {
    public static boolean Calculate(String word){
        if(word == null || word.isEmpty()){
            return false;
        }
        int left = 0;
        int right = word.length() - 1;
        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String Reverse(String word){
        if(word == null || word.isEmpty()){
            return "error";
        }
        String reversedWord = new StringBuilder(word).reverse().toString();
        return reversedWord;
    }
}
```

### Коротке пояснення коду

Тож, ми із самого початку отримуємо уже відформатоване, як нам потріно із малої літери, слово для перевірки. Тут є два метода Calculate та Reverse. 
Друга функція, просто розвертає слово задом на перед, за допомогою reverse().
Щодо головної функії Calculate, то ми просто робимо дві змінні left та right, та потім порівнюємо ліву літеру слова з правою, поки ліва змінна менша за праву.

## Код классу TestResult

```java
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
```

## Коротке пояснення коду (2 ч.)

На мою думку просто вводити перед кожним запуском "прогрми" власноруч у змінну значення не цікаво, тому додав клас Scanner щоб додати можливості input-а у програмі.
Також після самого вводу створюю змінну слова, яка вже у нижньому регістрі, щоб можна було нормально виконати перевірку.
У методі Reverse класу Exercise, якщо слово було б null або пустим, то повертався текст error, то тут іде продовження перевірки, та якщо змінна reversedWord є error то програма повністю зупиняється, та повідомляє про помилку.
Ну у разі ж ноормального вводу слова то програма продовжує роботу.

## Фото із різними випадками виконання програми

![alt text](https://github.com/ppc-ntu-khpi/java-2-AlexRubanUa/blob/master/.gradle/true.png "Logo Title Text 1")

Що виводить у консоль, при поверненні значення true
***
![alt text](https://github.com/ppc-ntu-khpi/java-2-AlexRubanUa/blob/master/.gradle/false.png "Logo Title Text 1")

Що виводить у консоль, при поверненні значення false
***
![alt text](https://github.com/ppc-ntu-khpi/java-2-AlexRubanUa/blob/master/.gradle/error.png "Logo Title Text 1")

Що виводить у консоль, при поверненні помилки
