class manager {
    String firstName;
    String lastName;
    String educationLevel;

    manager(String firstName, String lastName, String educationLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.educationLevel = educationLevel;
    }

    void display() {
        System.out.println("manager: " + firstName + " " + lastName +
                ", education: " + educationLevel);
    }
}
