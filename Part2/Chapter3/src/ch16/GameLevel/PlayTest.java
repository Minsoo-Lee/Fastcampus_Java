package ch16.GameLevel;

public class PlayTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.getLevel();
        player.play(1);

        PlayerLevel newLevel = new AdvancedLevel();
        player.upgradeLevel(newLevel);
        player.getLevel();
        player.play(2);

        newLevel = new SuperLevel();
        player.upgradeLevel(newLevel);
        player.getLevel();
        player.play(3);

    }
}
