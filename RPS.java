public class RPS {
    // Assign all the choices to number binary
    /*
     * Rock = 11
     * Paper = 10
     * Scissor = 01
     *
     * Binary Operations
     * 11 - 11 = 00 Tie
     * 11 - 01 = 10 Win
     * 11 - 10 = 01 lose
     * 10 - 11 = -01 Win
     * 01 - 11 = -10 lose
     * 10 - 01 = 01 lose
     * 01 - 10 = -01 Win
     */

    private int playerIndex = 0;
    private int randIndex = (int) (Math.random() * 3);
    private String[] RPSList = { "rock", "paper", "scissors" };
    private byte[] RPSByteList = { 0b11, 0b10, 0b01 };

    public RPS(String choice) {
        for(int i = 0; i < RPSList.length; i++) {
            if(RPSList[i].equals(choice)) {
                playerIndex = i;
                break;
            }
            
        }
    }

    public String computerChoice() {
        return RPSList[randIndex];
    }

    public void winner() {
        if((RPSByteList[playerIndex] ^ RPSByteList[randIndex]) == 0) {
            System.out.println("Tie!");
        } else if((RPSByteList[playerIndex] - RPSByteList[randIndex]) == 2 || (RPSByteList[playerIndex] - RPSByteList[randIndex]) == -1) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}
