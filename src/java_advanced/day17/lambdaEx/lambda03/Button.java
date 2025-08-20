package java_advanced.day17.lambdaEx.lambda03;

public class Button {
    //정적 멤버 인터페이스
    public static interface ClickListener{
        void onClick();
    }

    private ClickListener clickListener;
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }

    public static void main(String[] args) {
        Button okButton = new Button();

        //ok 버튼 객체에 람다식 주입
        okButton.setClickListener(
               ()->{
                   System.out.println("ok 버튼 클릭!");
               }
        );

        okButton.click();
        Button cancelButton = new Button();
        cancelButton.setClickListener(()-> System.out.println("cancel 버튼 클릭!"));
        cancelButton.click();
    }
}
