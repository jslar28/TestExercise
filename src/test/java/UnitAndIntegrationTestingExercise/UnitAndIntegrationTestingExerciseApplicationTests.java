package UnitAndIntegrationTestingExercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.runner.JUnitCore;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UnitAndIntegrationTestingExerciseApplicationTests {

	@Test
	void contextLoads() {

	}



	@Test
    public void addNumbers(int a, int b) {
	    assertThat(a+b).isEqualTo(2);
    }
}
