package lotto.util;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RandomLottoTest {

    @Test
    void 랜덤_로또_번호_중복_테스트() {
        RandomLotto randomLotto = new RandomLotto();
        Set lotto = new HashSet<>(randomLotto.randomLotto());
        assertThat(lotto.size()).isEqualTo(6);
    }
}