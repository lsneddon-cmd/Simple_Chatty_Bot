package bot;

public class SimpleBot {
    public static void main(String[] args) {
        runProgram();
    }

    private static void runProgram() {
        Bot bot = Bot.getInstance("BigBot");
        System.out.println(bot.greeting());
    }
}
