class Library {
    String name;
    Book[] books;
    Student[] students;
    Librarian[] librarians;
    LOAN[] loans;
    int bookCount = 0;
    int studentCount = 0;
    int librarianCount = 0;
    int loanCount = 0;


    Library(String name) {
        this.name = name;
        books = new Book[100];
        students = new Student[100];
        librarians = new Librarian[100];
        loans = new LOAN[100];
    }
    void addBook(Book book) {
    if (bookCount < 100) {
        books[bookCount] = book;
        bookCount++;
        System.out.println("BOOK IS ADDED: " + book.title);
    } else {
        System.out.println("FULL!");
    }
}


    void addStudent(Student student) {
        if (studentCount < 100) {
            students[studentCount] = student;
            studentCount++;
            System.out.println("STUDENT IS ADDED: " + student.firstName + " " + student.lastName);
        } else {
            System.out.println("FULL!");
        }
    }


    void addLibrarian(Librarian librarian) {
        if (librarianCount < 100) {
            librarians[librarianCount] = librarian;
            librarianCount++;
            System.out.println("LIBRARIAN IS ADDED: " + librarian.firstName + " " + librarian.lastName);
        } else {
            System.out.println("FULL!");
        }
    }

    void addLoan(LOAN loan) {
        if (loanCount < 100) {
            loans[loanCount] = loan;
            loanCount++;
            System.out.println("LOAN IS ADDED");
        } else {
            System.out.println("FULL!");
        }
    }

    Book searchBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.toLowerCase().contains(title.toLowerCase())) {
                return books[i];
            }
        }
        return null;
    }

    Student findStudent(String studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].studentId.equals(studentId)) {
                return students[i];
            }
        }
        return null;
    }

    Librarian findLibrarian(String employeeId) {
        for (int i = 0; i < librarianCount; i++) {
            if (librarians[i].employeeId.equals(employeeId)) {
                return librarians[i];
            }
        }
        return null;
    }

    void displayBooks() {
        System.out.println("\n---  BOOKS ---");
        for (int i = 0; i < bookCount; i++) {
            books[i].display();
        }
    }
}
