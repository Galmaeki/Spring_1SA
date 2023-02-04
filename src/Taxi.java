public class Taxi extends Car{
    static int txcount=0;
    int distance;
    String destination;
    boolean status=false;

    private int money(int num){
        if(num<=5){//거리 5이하라면 기본요금만
            return fee;
        }else{
            return fee+(num*500);
        }
    }
    public void getmoney(int num){//넘에 거리를 넣을거야
        //추가요금은 여기서 곱해줄거임 거리1당 500원으로
        earnMoney+=money(num);
    }
    public Taxi(){
        super();
        maxuser=4;
        txcount++;
        carnum=txcount;
        fee=3000;
        System.out.println(carnum+"번 택시 생성됨");
    }
    public void ride(int user,String destination,int distance){
        if(!power){
            System.out.println("시동이 꺼져 있어 태울 수 없습니다!");
        }else if(status){
            System.out.println("누군가 타고있습니다!");
        }else if(gas<10){
            System.out.println("기름이 모자라 태울 수 없습니다!");
        }else if(user>maxuser) {
            System.out.println("인원이 너무 많습니다!");
        }else{
            canride(user);
            System.out.println("예상 요금 :"+money(distance));
            this.destination=destination;
            this.distance=distance;
            status=true;
        }
    }
    public void bye(){
        getmoney(distance);
        getout(user);
        status=false;
    }
    @Override
    public void carinfo(){
        System.out.println("현재 택시는 "+carnum+"번 택시입니다.");
        System.out.println("현재속도 : "+speed);
        System.out.println("주유량 : "+gas);
        if (status){
            System.out.println("운행중");
        }else{
            System.out.println("상태 : "+(power?"일반":"시동꺼짐"));
        }
    }
    @Override
    public void userinfo(){
        super.userinfo();
        System.out.println("목적지 : "+destination);
        System.out.println("거리 : "+distance);
        System.out.println("예샹 요금 :"+money(distance));
    }
}