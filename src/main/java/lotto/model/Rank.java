package lotto.model;

public enum Rank {
    WIN1(6, 2_000_000_000),
    WIN2(5, 30_000_000),
    WIN3(5, 1_500_000),
    WIN4(4, 50_000),
    WIN5(3, 5_000);

    private int matchCount;
    private int winningMoney;

    private Rank(int matchCount, int winningMoney) {
        this.matchCount = matchCount;
        this.winningMoney = winningMoney;
    }
}
