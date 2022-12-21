import java.util.Scanner;

    public class Caesar_code {
        private static String getCodingIncodMessage(String message, int key, char firstCharAlfabet, char lastCharAlfabet) {
            StringBuilder strBox = new StringBuilder(message.length());
            char tmp;
            int countCharsAlfabet = (lastCharAlfabet - firstCharAlfabet) + 1;
            for (int i = 0; i < message.length(); i++) {
                tmp = message.charAt(i);
                if (Character.isLetter(message.charAt(i))) {
                    tmp += key % countCharsAlfabet;
                    if (tmp > lastCharAlfabet)
                        tmp = (char) (tmp % lastCharAlfabet + firstCharAlfabet - 1);
                    else if (tmp < firstCharAlfabet)
                        tmp = (char) (tmp + countCharsAlfabet);
                }
                strBox.append(tmp);
            }
            return strBox.toString();
        }

        public static void main(String[] args) {
            String  message = "what are you doing man this is problem";
            String codeMessage = codeMessage = getCodingIncodMessage(message, 10, 'a', 'z');
            System.out.println(message + " -> " + codeMessage);
            String deCodeMessage = deCodeMessage = getCodingIncodMessage(codeMessage, -10, 'a', 'z');
            System.out.println(codeMessage + " -> " + deCodeMessage);
        }
    }
/*    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("[A шифрування] [J розшифрування], будь ласка, виберіть один варіант");
        Scanner c=new Scanner(System.in); // Створити об'єкт сканера
        String s1=c.nextLine();// Отримати рядок цього рядка

        if(s1.equalsIgnoreCase("A")) { // Визначаємо, чи рівні змінні s1 та A, та ігноруємо розмір
            System.out.println("будь ласка, введіть простий текст:");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            System.out.println("Будь ласка, введіть ключ:");
            Scanner sc1=new Scanner(System.in);
            int key=sc1.nextInt();// Перетворити наступний елемент введення на int
            Encryption(s,key);// Викликаємо метод шифрування
        }

        else if(s1.equalsIgnoreCase("J")) {
            System.out.println("Будь ласка, введіть зашифрованний текст:");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            System.out.println("Будь ласка, введіть ключ:");
            Scanner sc1=new Scanner(System.in);
            int key=sc1.nextInt();
            Decrypt(s,key);// Викликаємо метод шифрування
        }
    }

    public static void Decrypt(String str, int n) {
        // TODO Auto-generated method stub
        // Розшифровуємо
        int k=Integer.parseInt("-"+n);
        String string="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z') // Якщо символ у рядку малий
            {
                c+= k % 26;  // мобільний ключ % 26 біт
                if(c<'a')
                    c+=26; // зліва наліво
                if(c>'z')
                    c-=26;// направо
            }else if(c>='A'&&c<='Z')// Якщо символ у рядку у верхньому регістрі
            {
                c+=k%26;// мобільний ключ % 26 біт
                if(c<'A')
                    c+=26;// зліва наліво
                if(c>'Z')
                    c-=26;// направо
            }
            string +=c; // Об'єднуємо розшифровані символи в рядок
        }
        System.out.println(str+" Після разшифрування:" +string);
    }

    public static void Encryption(String str, int k) {
        // TODO Auto-generated method stub
        // Зашифровать
        String string="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z') // Якщо символ у рядку рядковий
            {
                c+=k%26;// мобільний ключ % 26 біт
                if(c<'a')
                    c+=26;// зліва наліво
                if(c>'z')
                    c-=26;// направо
            }else if(c>='A'&&c<='Z') // Якщо символ у рядку у верхньому регістрі
            {
                c+=k%26;// мобільний ключ % 26 біт
                if(c<'A')
                    c+=26;// зліва наліво
                if(c>'Z')
                    c-=26;// направо
            }
            string +=c;// Об'єднуємо розшифровані символи в рядок
        }
        System.out.println(str+ " Після шифрування:" + string);
    }*/


