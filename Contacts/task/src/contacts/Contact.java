package contacts;

import java.util.regex.Pattern;

public class Contact {
    private String name;
    private String surName;
    private String phoneNumber;

    public Contact() {
    }

    public Contact(String name, String surName, String phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        if (phoneNumber.isEmpty()) {
            this.phoneNumber = "[no number]";
        } else if (isPhoneNumberCorrect(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = "[no number]";
            System.out.println("Wrong number format!");
        }
    }

    private boolean isPhoneNumberCorrect(String phoneNumber) {
        String regExp = "\\+?(\\([a-zA-Z0-9]+\\)" +
                "|[a-zA-Z0-9]+[ -]\\([a-zA-Z0-9]{2,}\\)|[a-zA-Z0-9]+)" +
                "([ -]?[a-zA-Z0-9]{2,})*";
        Pattern pattern = Pattern.compile(regExp);
        return pattern.matcher(phoneNumber).matches();
    }

    public boolean hasNumber() {
        return !phoneNumber.isEmpty();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return name + " " + surName + ", " + phoneNumber;
    }
}
