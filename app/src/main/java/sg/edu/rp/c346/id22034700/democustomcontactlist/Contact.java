package sg.edu.rp.c346.id22034700.democustomcontactlist;

public class Contact {

    private String name;
    private int countryCode;
    private int contactNum;
    private char gender;

    public Contact(String name, int countryCode, int contactNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.contactNum = contactNum;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getContactNum() {
        return contactNum;
    }

    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", countryCode=" + countryCode +
                ", contactNum=" + contactNum +
                ", gender=" + gender +
                '}';
    }
}
