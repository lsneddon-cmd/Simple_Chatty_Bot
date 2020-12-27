package bot;

import java.time.LocalDate;

public class Bot {
    private static Bot instance;
    private final String botName;
    private final LocalDate birthYear;

    private Bot(String name) {
        botName = name;
        birthYear = LocalDate.now();
    }

    public static Bot getInstance(String name) {
        if (instance == null) {
            return new Bot(name);
        } else {
            System.out.println("Bot has already been initialised");
            return instance;
        }
    }

    public String greeting() {
        StringBuilder str = new StringBuilder();
        str
                .append("Hello! My name is ")
                .append(botName)
                .append(".\n")
                .append("I was created in ")
                .append(birthYear)
                .append(".");
        return str.toString();
    }
}
