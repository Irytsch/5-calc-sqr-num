import ru.netology.sqr.javaqa41mvn.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();


        System.out.println(service.calcSqrNum(100, 200));

    }
}
