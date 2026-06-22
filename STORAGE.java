class STORAGAE {


    static void save(Library library) {
        System.out.println("\n--- INFORMATIONS ---");
        System.out.println("LIBRARY: " + library.name);
        System.out.println("BOOKS: " + library.bookCount);
        System.out.println("STDENTS: " + library.studentCount);
        System.out.println("LIBRARIAN: " + library.librarianCount);
        System.out.println("LOANS: " + library.loanCount);
        System.out.println("SAVED SUCCESSFULLY!");
    }

    static Library load() {
        System.out.println("LOADNG");
        return new Library("MAIN LIBRARY");
    }
}