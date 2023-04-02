package app;

import entities.HinhThangVuong;
import entities.TamGiac;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        HinhThangVuong hinhThangVuong = applicationContext.getBean("hinhThangVuong1", HinhThangVuong.class);

        System.out.println("Chu vi hinh thang vuong: " + hinhThangVuong.chuVi());
        System.out.println("Dien tich hinh thang vuong: " + hinhThangVuong.dienTich());
    }
}