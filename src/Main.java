public class Main {
    public static void main(String[] args) {
        Bus bs1=new Bus();//1번버스 생성
        Bus bs2=new Bus();//2번버스 생성
        bs1.carinfo();//차정보 확인
        bs1.speed(50);//속도 높이기
        bs1.carinfo();
        bs1.ride(5);//승객 5명 탑승
        bs1.userinfo();//승객정보확인
        bs1.ride (25);//25명탑승
        bs1.ride(1);//30이상 탑승불가
        bs1.userinfo();//승객정보 확인
        bs1.bye(30);//30명 하차
        bs1.usegas(90);//기름 90 사용//주유량 확인 알림
        bs1.bye(1);//0명에서1명 하차시도
        bs1.userinfo();//승객정보
        bs1.carinfo();
        bs1.usegas(10);//기름 10사용//시동 꺼짐
        bs1.carinfo();
        bs1.ride(1);//1명 탑승시도했으나 시동이 꺼져있어 탑승불가
        bs1.refuelgas(8);//주유8
        bs1.ride(1);//1명 탑승시도 했으나 차고지행이라 탑승불가
        bs1.refuelgas(10);//주유10//상태 운행
        bs1.ride(25);//25명 탑승
        bs1.userinfo();
    }
}
class TaxiMain{
    public static void main(String[] args) {
    Taxi tx1 = new Taxi();
    Taxi tx2 = new Taxi();
    tx1.carinfo();
    tx1.speed(20);
    tx1.ride(5,"서울역",5);
    tx1.ride(3,"서울역",5);
    tx1.ride(1,"어디로든문",2);
    tx1.userinfo();
    tx1.bye();
    tx1.userinfo();
    tx1.usegas(95);
        tx1.ride(1,"어디로든문",2);
    }
}