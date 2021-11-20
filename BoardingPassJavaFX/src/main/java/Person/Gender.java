package Person;

import java.util.ArrayList;

public enum Gender {
  FEMALE("Female"),MALE("Male"),NON_BINARY("Non-binary"),UNDISCLOSED("Undisclosed");
    private String gender;

    private Gender(String gender) {
        this.gender = gender;
    }
}
