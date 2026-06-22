class Student {
    String firstName;
    String lastName;
    String studentId;
    String major;
    String membershipDate;

    Student(String firstName, String lastName, String studentId,
            String major, String membershipDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.major = major;
        this.membershipDate = membershipDate;
    }

    void display() {
        System.out.println("name: " + firstName + " " + lastName +
                ", ID : " + studentId +
                ", major: " + major + ",  date: " + membershipDate);
    }
}

