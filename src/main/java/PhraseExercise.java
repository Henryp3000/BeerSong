public class PhraseExercise {

    public static void main(String[] args) {

        String[] wordlistone = { " is Love ", "When times get hard", " We keep our Faith"};

        String[] wordListTwo = { "Never Put our Heads down", "We are Victorious", " WE will Raise"};

        String[] wordListThree = { "Keep our heads held High", "You Are my You are my ","SunShine"};

        int oneLenght = wordlistone.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String Phrase = wordlistone [rand1] + " " + wordListTwo[rand2] + " " + wordListThree [rand3];

        System.out.println("All We need" + Phrase);
    }
}
