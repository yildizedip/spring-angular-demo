import com.controller.BlogEntryController;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by pardus on 12/28/16.
 */
public class BlogEntryControllerTest {


    @InjectMocks
    private BlogEntryController blogEntryController;

    private MockMvc mockMvc;


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        mockMvc= MockMvcBuilders.standaloneSetup(blogEntryController).build();

    }

    @Test
    public void test() throws Exception{
       // mockMvc.perform(MockMvcRequestBuilders.get("/test2")).andDo(MockMvcResultHandlers.print());
        mockMvc.perform(MockMvcRequestBuilders
                .post("/test2")
                .content("{\"title\":\"Test data\"}")
                .contentType(MediaType.APPLICATION_JSON)


        ).andExpect(MockMvcResultMatchers.jsonPath("$.title", CoreMatchers.is("Test data"))).andDo(MockMvcResultHandlers.print());
    }

}
