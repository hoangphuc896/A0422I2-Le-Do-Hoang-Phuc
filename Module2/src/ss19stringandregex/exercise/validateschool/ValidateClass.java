package ss19stringandregex.exercise.validateschool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String CLASS_REGEX = "^[CAP][\\d]{4}[G-M&&[^J]]$";

    public ValidateClass() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
