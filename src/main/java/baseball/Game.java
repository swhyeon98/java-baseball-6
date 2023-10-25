package baseball;

public class Game {

    private Computer computer;
    private Player player;

    public Game(Computer computer, Player player) {
        this.computer = computer;
        this.player = player;
    }

    public void start() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        init();
    }

    private void init() {
        computer.generateRandomNumbers();
        player.setNumbers(new InputHandler().getPlayInput());
    }
}
