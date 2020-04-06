public class Basketball extends Sports
{
    private int highestScore;
    public Basketball(String sport, String ball, String team, String equipment, int highestScore)
    {
        super(sport, ball, team, equipment);
        this.highestScore = highestScore;
    }
    public String toString()
    {
        String output = super.toString();
        output += "\nHighest Score: " + highestScore;
        return output;
    }
}