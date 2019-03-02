package kata;


import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void onePlusOneEqualsTwo() {
        assertThat(calculator.compute("1 + 1")).isEqualTo(2);
    }

}