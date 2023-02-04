public class Bus extends Car{
    static int buscount=0;

    public void getmoney(int num){//버스에선 탑승객수를 구함
        earnMoney +=fee*num;
    }
    public Bus(){
        super();
        maxuser = 30;
        buscount++;
        fee=1000;
        carnum=buscount;
        System.out.println(carnum+"번 버스 생성됨");
    }
    public void ride(int num){
        if(maxuser>=num+user&&power&&gas>=10){
            canride(num);
            getmoney(num);
        }else if(!power){
            System.out.println("시동이 꺼져 있어 태울 수 없습니다!");
        }else if(gas<10){
            System.out.println("차고지행이므로 태울 수 없습니다!");
        }
        else{
            cantride();
        }
    }
    public void bye(int num){
        if(0<=user-num){
            getout(num);
        }else{
            cantgetout();
        }
    }
}
