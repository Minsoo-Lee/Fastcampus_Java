package ch16.GameLevel;

public class Player {
    PlayerLevel level = new BeginnerLevel();

    public void getLevel() {
        level.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel newLevel) {
        level = newLevel;
    }
    public void play(int count) {
        level.go(count);
    }
}
