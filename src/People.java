public class People {
    int user;
    //탑승가능로직이랑 탑승불가로직을 여기서 구현
    public void getout(int num){
        System.out.println(num+"명 하차!");
        user-=num;
    }
    public void cantgetout(){
        System.out.println("내릴 승객이 부족합니다!");
        System.out.println("현재승객 수 :"+user);
    }
    public void canride(int num){
        System.out.println(num+"명 탑승!");
        user+=num;
    }
    public void cantride(){
        System.out.println("인원 초과!");
    }
}
