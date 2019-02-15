package katas;

public class Song {
    public static void main(String[] args) {
        new Song().execute();
    }

    public void execute() {
        String fly = "fly";
        String flyRhyme = "I don't know why she swallowed a fly - perhaps she'll die!\n";

        String spider = "spider";
        String spiderRhyme = "That wriggled and wiggled and tickled inside her.\n";

        String bird = "bird";
        String birdRhyme = "How absurd to swallow a bird.\n";

        String cat = "cat";
        String catRhyme = "Fancy that to swallow a cat!\n";

        String dog = "dog";
        String dogRhyme = "What a hog, to swallow a dog!\n";

        String cow = "cow";
        String cowRhyme = "I don't know how she swallowed a cow!\n";

        String horse = "horse";
        String horseRhyme = "...She's dead, of course!";

        String song = "There was an old lady who swallowed a " + fly + ".\n" +
                flyRhyme +
                "\n" +
                "There was an old lady who swallowed a " + spider + ";\n" +
                spiderRhyme +
                "She swallowed the " + spider + " to catch the " + fly + ";\n" +
                flyRhyme +
                "\n" +
                "There was an old lady who swallowed a " + bird + ";\n" +
                birdRhyme +
                "She swallowed the " + bird + " to catch the " + spider + ",\n" +
                "She swallowed the " + spider + " to catch the " + fly + ";\n" +
                flyRhyme +
                "\n" +
                "There was an old lady who swallowed a " + cat + ";\n" +
                catRhyme +
                "She swallowed the " + cat + " to catch the " + bird + ",\n" +
                "She swallowed the " + bird + " to catch the " + spider + ",\n" +
                "She swallowed the " + spider + " to catch the " + fly + ";\n" +
                flyRhyme +
                "\n" +
                "There was an old lady who swallowed a " + dog + ";\n" +
                dogRhyme +
                "She swallowed the " + dog + " to catch the " + cat + ",\n" +
                "She swallowed the " + cat + " to catch the " + bird + ",\n" +
                "She swallowed the " + bird + " to catch the " + spider + ",\n" +
                "She swallowed the " + spider + " to catch the " + fly + ";\n" +
                flyRhyme +
                "\n" +
                "There was an old lady who swallowed a " + cow + ";\n" +
                cowRhyme +
                "She swallowed the " + cow + " to catch the " + dog + ",\n" +
                "She swallowed the " + dog + " to catch the " + cat + ",\n" +
                "She swallowed the " + cat + " to catch the " + bird + ",\n" +
                "She swallowed the " + bird + " to catch the " + spider + ",\n" +
                "She swallowed the " + spider + " to catch the " + fly + ";\n" +
                flyRhyme +
                "\n" +
                "There was an old lady who swallowed a " + horse + "...\n" +
                horseRhyme;

        System.out.println(song);
    }
}
