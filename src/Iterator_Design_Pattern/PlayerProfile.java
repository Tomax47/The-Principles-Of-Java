package Iterator_Design_Pattern;

import lombok.Data;

@Data
public class PlayerProfile {
    private String name;
    private String surname;
    private int age;
    private String nationality;
    private boolean retired;

    public PlayerProfile(String name, String surname, int age, String nationality, boolean retired) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nationality = nationality;
        this.retired = retired;
    }

}
