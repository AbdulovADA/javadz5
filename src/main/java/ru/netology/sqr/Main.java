package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int result = service.squareCount(400, 700);
        System.out.println(result);
    }
}
