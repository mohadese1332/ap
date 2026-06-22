class input {
    java.util.Scanner scanner = new java.util.Scanner(System.in);


    int getInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }


    String getString(String message) {
        System.out.print(message);
        scanner.nextLine();
        return scanner.nextLine();
    }


    String getString() {
        scanner.nextLine();
        return scanner.nextLine();
    }
}
