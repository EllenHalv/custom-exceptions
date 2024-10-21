import org.example.Main;
import org.example.controller.TemperatureController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = Main.class)
public class SmokeTest {

    @Autowired
    private TemperatureController controller;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }
}
