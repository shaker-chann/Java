package designPattern.filterPattern;

/**
 * @Description:
 * @PackageName: designPattern.filterPattern
 * @Author: csc
 * @Create: 2020-08-19 15:34
 * @Version: 1.0
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
