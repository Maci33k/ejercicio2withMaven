import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyDateTest {

    MyDate date = new MyDate();
    //CorrectDayTest
    @Test
    void correctDate() {
        boolean result = date.isDateCorrect(5,6,2023);
        Assertions.assertEquals(true,result);
    }
    @Test
    void IncorrectDay() {
        boolean result = date.isDateCorrect(-5,6,2023);
        Assertions.assertEquals(false,result);
    }
    @Test
    void IncorrectMonth() {
        boolean result = date.isDateCorrect(5,5,2023);
        Assertions.assertEquals(false,result);
    }
    @Test
    void IncorrectYear() {
        boolean result = date.isDateCorrect(5,5,1000);
        Assertions.assertEquals(false,result);
    }
    @Test
    void IncorrectDayAndMonth() {
        boolean result = date.isDateCorrect(-10,-10,1000);
        Assertions.assertEquals(false,result);
    }
    @Test
    void IncorrectDayAndYear() {
        boolean result = date.isDateCorrect(-10,6,1000);
        Assertions.assertEquals(false,result);
    }
    @Test
    void IncorrectMonthAndYear() {
        boolean result = date.isDateCorrect(5,4,1000);
        Assertions.assertEquals(false,result);
    }
}