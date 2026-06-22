class Book {
    String title;
    String author;
    int year;
    int pages;


    Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    void display() {
        System.out.println("name: " + title + ", author: " + author +
                ", year: " + year + ", page: " + pages);
    }
}