package memupan;

public class MenuGuestInfo {

    private String user_name;
    private String user_phoneNumber;

    MenuGuestInfo() {}

    MenuGuestInfo(String user_name, String user_phoneNumber){
        this.user_name = user_name;
        this.user_phoneNumber = user_phoneNumber;
    }

    public void printUser(){
        System.out.println("고객의 이름 : " + user_name + " 고객의 전화번호 : " + user_phoneNumber);
    }


























}
