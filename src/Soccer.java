public class Soccer extends Sports
{
    private int numOfP;
    public Soccer(String sport, String ball, String team, String equipment, int numOfP)
    {
        super(sport, ball, team, equipment);
        this.numOfP = numOfP;
    }
    public String toString()
    {
        String output = super.toString();
        output += "\nNumber of Players: " + numOfP;
        return output;
    }
}