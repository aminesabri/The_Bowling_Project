   import java.io.IOException;
        import java.util.ArrayList;
        import java.util.List;

public class Joueur {

    private String _joueurName;
    private List<Integer> _firstBall = new ArrayList<Integer>();
    private List<Integer> _secondBall = new ArrayList<Integer>();
    private int _bonusBall;
    private int _playerScore;
    private int _bonusCounter;

    // Sets player name
    public Joueur(String name){
        _joueurName = name;
    }

  
    public String getName(){
        return _joueurName;
    }

  
    public void setFirstBall(int frame, int score) throws IOException{
        _firstBall.add(score);
    }

    // Gets the first ball of a frame
    public int checkFirstBall(int frame) {
        return _firstBall.get(frame);
    }

    // Sets the second ball of a frame
    public void setSecondball(int frame, int score) throws IOException{
        _secondBall.add(score);
    }

    // Gets the second ball of a frame
    public int checkSecondBall(int frame) {
        return _secondBall.get(frame);
    }


    public void setBonusBall(int score) {
        _bonusBall = score;
    }


    public int checkBonusBall() {
        return _bonusBall;
    }


    public void setPlayerScore(int score) {
        _playerScore = _playerScore + score;
    }


    public int checkPlayerScore() {
        return _playerScore;
    }


    public void setBonusCounter(int bonusCounter) {
        _bonusCounter = bonusCounter;
    }


    public int checkBonusCounter() {
        return _bonusCounter;
    }
}