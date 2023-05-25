import static org.junit.Assert.*;

public class MathTest {

    private Math math_obj;

    @org.junit.Before
    public void Before() {
        math_obj = new Math();
    }

//    @org.junit.After
//    public void tearDown() throws Exception {
//
//    }

    @org.junit.Test
    public void adding_numbers() {
        assertEquals("should add two numbers when method is used", 10, math_obj.add(5, 5));
        assertEquals("should add two numbers when method is used", 366, math_obj.add(250, 116));
        assertEquals("should add two numbers when method is used", 1001, math_obj.add(550, 451));
    }

    @org.junit.Test
    public void subtract() {
        assertEquals("should subtract two numbers when method is used", 20, math_obj.subtract(25, 5));
        assertEquals("should subtract two numbers when method is used", 1, math_obj.subtract(50, 49));
        assertEquals("should subtract two numbers when method is used", 1033, math_obj.subtract(1490, 457));

    }

    @org.junit.Test
    public void multiply() {
        assertEquals("should multiply two numbers when method is used", 25, math_obj.multiply(5, 5));
        assertEquals("should multiply two numbers when method is used", 1485, math_obj.multiply(33, 45));
        assertEquals("should multiply two numbers when method is used", 272994, math_obj.multiply(789, 346));

    }

    @org.junit.Test
    public void divide() {
        assertEquals("should divide two numbers when method is used", 9, math_obj.divide(45, 5));
        assertEquals("should divide two numbers when method is used", 40, math_obj.divide(10000, 250));
        assertEquals("should divide two numbers when method is used", 929, math_obj.divide(78965, 85));
    }
}
