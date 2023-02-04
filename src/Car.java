public abstract class Car extends People{
    int gas;//주유량
    int speed;//속도
    int maxuser;
    int fee;//요금
    int earnMoney=0;//번돈
    boolean power;//전원
    int carnum;
    public Car(){
        gas=100;
        speed = 0;
        power = true;
    }

    private boolean gascheck(){
        if(gas<=10){
            System.out.println("주유량을 확인해주세요!");
        }
        if(gas==0){
            power=false;
            speed=0;
            System.out.println("연료 부족으로 시동이 꺼졌습니다");
        }
        return gas>0?true:false;
    }
    public void speed(int num){
        if(gascheck()){
            speed+=num;
        }else{
            System.out.println("기름이 없어서 속도변경 불가!");
        }
    }
    public abstract void getmoney(int num);//차마다 벌이가 다르니까 추상화하고 올라가서 구현


    public void usegas(int gas){
        this.gas-=gas;
        gascheck();
    }
    public void refuelgas(int gas){
        this.gas+=gas;
        if(!power){
            power=true;
            System.out.println("꺼진 시동을 켰습니다");
        }
    }
    //public abstract void ride(int user,String destination, int distance);
    public void userinfo(){
        System.out.println("현재 승객 수 : "+user);
        System.out.println("빈자리 :"+(maxuser-user));
        System.out.println("누적 요금:"+earnMoney);
    }
    public void carinfo(){
        System.out.println("현재 버스는 "+carnum+"번 버스입니다.");
        System.out.println("현재속도 : "+speed);
        System.out.println("주유량 : "+gas);
        System.out.println("상태 : "+(power?"운행":"차고지행"));
    }
}
