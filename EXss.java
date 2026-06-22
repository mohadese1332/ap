import java.util.Scanner;
//GITHUB ID : mohadese1332
public class EXss {
    public static void main(String[] args) {
        // [EX5_LM_4_3]
        Library library = STORAGAE.load();
     input input = new input();
        Scanner scanner = new Scanner(System.in);


        manager manager = new manager("Mohadese", "Afshari", "Karshenasi");
        manager.display();

        while (true) {
            // [EX5_LM_4_2]
            System.out.println("1. student");
            System.out.println("2. librarian");
            System.out.println("3. manager");


            int userType = scanner.nextInt();


            if (userType == 1) {
                // [EX5_LM_4_2]
                while (true) {
                    MENU.showStudentMenu();
                    int choice = scanner.nextInt();

                    if (choice == 1) {
                        // [EX5_LM_1_1]
                        System.out.print("name: ");
                        String firstName = scanner.next();
                        System.out.print("family: ");
                        String lastName = scanner.next();
                        System.out.print("id: ");
                        String studentId = scanner.next();
                        System.out.print("major: ");
                        String major = scanner.next();
                        System.out.print("date: ");
                        String date = scanner.next();

                        Student newStudent = new Student(firstName, lastName,
                                studentId, major, date);
                        library.addStudent(newStudent);
                        // [EX5_LM_4_3]
                        STORAGAE.save(library);

                    } else if (choice == 2) {
                        // [EX5_LM_1_2]
                        System.out.print("enter: ");
                        String id = scanner.next();
                        Student found = library.findStudent(id);


                    } else if (choice == 3) {
                        // [EX5_LM_1_3]
                        System.out.print("enter ");
                        String title = scanner.next();
                        Book found = library.searchBook(title);



                    } else if (userType == 2) {
                        // [EX5_LM_4_2]
                        while (true) {
                            MENU.showLibrarianMenu();
                            int choice2 = scanner.nextInt();

                            if (choice2 == 1) {
                                // [EX5_LM_2_1]
                                System.out.print("enter: ");
                                String id = scanner.next();
                                Librarian found = library.findLibrarian(id);


                            } else if (choice2 == 2) {
                                // [EX5_LM_2_2]
                                System.out.print("enter: ");
                                String id = scanner.next();
                                Librarian found = library.findLibrarian(id);
                                    found.display();
                                    System.out.println("enter new info:");
                                    System.out.print("name: ");
                                    found.firstName = scanner.next();
                                    System.out.print("family : ");
                                    found.lastName = scanner.next();
                                    // [EX5_LM_4_3]
                                    STORAGAE.save(library);


                            } else if (choice == 3) {
                                // [EX5_LM_2_3]
                                System.out.print("name: ");
                                String title = scanner.next();
                                System.out.print("authohr: ");
                                String author = scanner.next();
                                System.out.print("year : ");
                                int year = scanner.nextInt();
                                System.out.print("pages : ");
                                int pages = scanner.nextInt();

                                Book newBook = new Book(title, author, year, pages);
                                library.addBook(newBook);
                                // [EX5_LM_4_3]
                                STORAGAE.save(library);


                            }

                        }
                        if (userType == 3) {
                            // [EX5_LM_4_2]
                            while (true) {
                                MENU.showManagerMenu();
                                int choice1 = scanner.nextInt();

                                if (choice1 == 1) {
                                    // [EX5_LM_3_1]
                                    System.out.print("naame: ");
                                    String firstName = scanner.next();
                                    System.out.print("family: ");
                                    String lastName = scanner.next();
                                    System.out.print("id: ");
                                    String employeeId = scanner.next();

                                    Librarian newLibrarian = new Librarian(firstName, lastName, employeeId);
                                    library.addLibrarian(newLibrarian);
                                    // [EX5_LM_4_3]
                                    STORAGAE.save(library);


                                }
                            }
                        }

                        scanner.close();
                    }
                }
            }
        }
    }
}
