public class Ex11_01 {
    public static void main(String[] args) {
        Java0621 mycar1 = new Java0621();
        mycar1.color = "빨강";
        mycar1.speed = 0;

        Java0621 mycar2 = new Java0621();
        mycar2.color = "노랑";
        mycar2.speed = 0;

        Java0621 mycar3 = new Java0621();
        mycar3.color = "파랑";
        mycar3.speed = 0;

        mycar1.upSpeed(60);
        mycar2.upSpeed(30);
        mycar3.upSpeed(0);

        System.out.println("자동차1의 색상은 "+mycar1.color+"이며, 속도는 "+mycar1.speed+"km 입니다.");
        System.out.println("자동차2의 색상은 "+mycar2.color+"이며, 속도는 "+mycar2.speed+"km 입니다.");
        System.out.println("자동차3의 색상은 "+mycar3.color+"이며, 속도는 "+mycar3.speed+"km 입니다.");
    }
}
