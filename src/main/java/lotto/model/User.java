package lotto.model;

import lotto.util.RandomLotto;

import java.util.ArrayList;
import java.util.List;

public class User {
    public List<Lotto> lottoBuy(int money) {
        RandomLotto randomLotto = new RandomLotto();
        List<Lotto> user = new ArrayList<>();
        int count = money / 1000;
        for (int i=0; i<count; i++) {
            Lotto lotto = new Lotto(randomLotto.randomLotto());
            user.add(lotto);
        }
        return user;
    }
}
