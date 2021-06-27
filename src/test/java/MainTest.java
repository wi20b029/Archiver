import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void test_helloworld() {
        // Arrange // 1. Test ohne Eingabe in controller über die API
        Main main = new Main();

        // Act
        String hello = main.print();

        //Arrange
        Assertions.assertEquals("Hello World", hello);
    }


}
