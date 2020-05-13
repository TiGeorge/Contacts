
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName.trim();
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName.trim();
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "Unknown";
        } else if (lastName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
