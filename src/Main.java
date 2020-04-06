 public class Main {
    public static void main(String[] args) {
        Basketball lakers = new Basketball("Basketball", "basketball", "Lakers", "ball and hoop", 100);
        Soccer psg = new Soccer("Soccer", "soccer ball", "Paris Saint-Germain F.C.", "soccer ball and net", 31);
        Tennis vvhstt = new Tennis("Tennis", "tennis ball", "Valley View High School Tennis Team", "tennis ball, racketm, net", 1);

        System.out.println(lakers);
        System.out.println("\n" + psg);
        System.out.println("\n" + vvhstt);
    }
}

