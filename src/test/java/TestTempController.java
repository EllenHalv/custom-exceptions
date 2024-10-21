import org.example.Main;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = Main.class)
@AutoConfigureMockMvc
public class TestTempController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads(){}

    @Test
    void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(post("/set-temp")
                        .contentType("application/json")  // Set the content type to JSON
                        .content("25")  // Pass the temperature value as the request body
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Temperature set")));
    }
}
