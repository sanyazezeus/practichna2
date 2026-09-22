import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Інформація про примітивні типи даних ===");

        System.out.println("Тип: byte");
        System.out.println("Розмір: " + Byte.BYTES + " байт");
        System.out.println("Мін: " + Byte.MIN_VALUE + " | Макс: " + Byte.MAX_VALUE);

        System.out.println("Тип: short");
        System.out.println("Розмір: " + Short.BYTES + " байт");
        System.out.println("Мін: " + Short.MIN_VALUE + " | Макс: " + Short.MAX_VALUE);

        System.out.println("Тип: int");
        System.out.println("Розмір: " + Integer.BYTES + " байт");
        System.out.println("Мін: " + Integer.MIN_VALUE + " | Макс: " + Integer.MAX_VALUE);

        System.out.println("Тип: long");
        System.out.println("Розмір: " + Long.BYTES + " байт");
        System.out.println("Мін: " + Long.MIN_VALUE + " | Макс: " + Long.MAX_VALUE);

        System.out.println("Тип: float");
        System.out.println("Розмір: " + Float.BYTES + " байт");
        System.out.println("Мін: " + Float.MIN_VALUE + " | Макс: " + Float.MAX_VALUE);

        System.out.println("Тип: double");
        System.out.println("Розмір: " + Double.BYTES + " байт");
        System.out.println("Мін: " + Double.MIN_VALUE + " | Макс: " + Double.MAX_VALUE);

        System.out.println("Тип: char");
        System.out.println("Розмір: " + Character.BYTES + " байт");
        System.out.println("Мін: " + (int) Character.MIN_VALUE + " | Макс: " + (int) Character.MAX_VALUE);

        System.out.println("Тип: boolean");
        System.out.println("Можливі значення: " + Boolean.TRUE + " або " + Boolean.FALSE);

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Перевірка ===");

        System.out.print("Введіть значення для типу byte: ");
        String byteInput = scanner.nextLine();
        byte b = Byte.parseByte(byteInput);
        System.out.println("перетворено в byte: " + b + "\n");

        System.out.print("Введіть значення для типу short: ");
        String shortInput = scanner.nextLine();
        short s = Short.parseShort(shortInput);
        System.out.println("перетворено в short: " + s + "\n");

        System.out.print("Введіть значення для типу int: ");
        String intInput = scanner.nextLine();
        int i = Integer.parseInt(intInput);
        System.out.println("перетворено в int: " + i + "\n");

        System.out.print("Введіть значення для типу long: ");
        String longInput = scanner.nextLine();
        long l = Long.parseLong(longInput);
        System.out.println("перетворено в long: " + l + "\n");

        System.out.print("Введіть значення для типу float: ");
        String floatInput = scanner.nextLine();
        float f = Float.parseFloat(floatInput);
        System.out.println("перетворено в float: " + f + "\n");

        System.out.print("Введіть значення для типу double: ");
        String doubleInput = scanner.nextLine();
        double d = Double.parseDouble(doubleInput);
        System.out.println("перетворено в double: " + d + "\n");

        System.out.print("Введіть значення для типу boolean: ");
        String booleanInput = scanner.nextLine();
        boolean bool = Boolean.parseBoolean(booleanInput);
        System.out.println("перетворено в boolean: " + bool + "\n");

        scanner.close();
    }
}