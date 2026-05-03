package java.example;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        // Kiểm tra 5 + 10 = 15
        assertEquals(99, calc.add(5, 10));
    }

    @Test
    public void testFilePathOS() {
        // Cố tình gõ đường dẫn cứng theo kiểu Windows (dùng dấu \)
        File file = new File("config\\settings.xml");

        // Trên Windows: Máy tính tự hiểu "config" là thư mục mẹ. getParent() trả về "config".
        // Trên Linux/Mac: Máy tính hiểu "config\settings.xml" là... tên của 1 cái file dài ngoẵng. getParent() trả về null.
        assertEquals("config", file.getParent());
    }

//    @Test
//    public void testFilePathOSFixed() {
//        // Dùng API Path của Java: Nó sẽ tự động nối chuỗi bằng "\" nếu chạy trên Win, và "/" nếu chạy trên Linux
//        Path path = Paths.get("config", "settings.xml");
//
//        // Bây giờ thì chạy ở đâu thư mục mẹ cũng sẽ tên là "config"
//        assertEquals("config", path.getParent().toString());
//    }
}