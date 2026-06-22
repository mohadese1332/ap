class LOAN {
    Book book;
    Student student;
    Librarian issuedBy;
    String issueDate;
    String dueDate;
    String returnDate;
    Librarian receivedBy;

    LOAN(Book book, Student student, Librarian issuedBy,
         String issueDate, String dueDate) {
        this.book = book;
        this.student = student;
        this.issuedBy = issuedBy;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.returnDate = null;
        this.receivedBy = null;
    }
}