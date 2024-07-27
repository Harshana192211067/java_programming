import java.util.Scanner;

public class e13_sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[n];

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.print("Order(A/D): ");
        char order = scanner.nextLine().toUpperCase().charAt(0);

        switch (order) {
            case 'A':
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (compareStrings(names[i], names[j]) > 0) {
                            // Swap names[i] and names[j]
                            String temp = names[i];
                            names[i] = names[j];
                            names[j] = temp;
                        }
                    }
                }
                break;

            case 'D':
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (compareStrings(names[i], names[j]) < 0) {
                            String temp = names[i];
                            names[i] = names[j];
                            names[j] = temp;
                        }
                    }
                }
                break;

            default:
                System.out.println("Invalid order choice. Please enter 'A' for ascending or 'D' for descending.");
                scanner.close();
                return;
        }

        System.out.println("The names in " + (order == 'A' ? "ascending" : "descending") + " order are:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }

    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minlength;
        if(length1<length2)
        {minlength=length1;}
        else{minlength=length2;}
       // int minLength = Math.min(length1, length2);

        for (int i = 0; i < minlength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 != char2) {
                return char1 - char2;
            }
        }

        return length1 - length2;
    }
}
