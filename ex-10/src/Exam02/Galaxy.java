package Exam02;


// ctrl+space

public class Galaxy implements Phone{

    int batteryCapacity = 40;
    boolean isOn = false;

    @Override
    public void openingLog(){
        System.out.println("갤럭시폰");
    }

    @Override
    public void powerOn(){
        if(batteryCapacity > 20){
            System.out.println("전원 켜기!!");
            isOn = true;
        } else {
            System.out.println("배터리가 부족해요...");
        }
    }

    @Override
    public void powerOff(){
        System.out.println("전원 끄기!!");
        isOn = false;
    }

    @Override
    public void charge(){

        if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20){
            System.out.println("---- 충전중 ----");
            batteryCapacity += 5;
            System.out.println("배터리 : " + batteryCapacity + "%");

        } else{
            System.out.println("완충");
            System.out.println("배터리 : " + batteryCapacity + "%");
        }
    }

    @Override
    public boolean isOn(){
        if( isOn ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void watchUtube(){

        if(batteryCapacity > 15){
            System.out.println("유투브 시청 중....");
            batteryCapacity -= 5;
            System.out.println("배터리 : " + batteryCapacity + "%");
        } else{
            System.out.println("배터리가 부족합니다...");
            powerOff();
        }
    }
}









