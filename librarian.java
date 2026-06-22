
    class Librarian {
        String firstName;
        String lastName;
        String employeeId;


        Librarian(String firstName, String lastName, String employeeId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.employeeId = employeeId;
        }

        void display() {
            System.out.println("name: " + firstName + " " + lastName +
                    ",  Id: " + employeeId);
        }
    }
