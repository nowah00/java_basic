package java_advanced.day23.threadEx;

public class ThreadEx01 {
    public static void main(String[] args) {

        //Thread.currentThread(): 실행하는 스레드 객체 참조 얻기
       Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + "실행");

        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread(){
                @Override
                public void run() {
                    System.out.println(getName() + "실행");
                }
            };
            //getName(): Thread 의 인스턴스 메소드로 스레드들의 이름을 리턴
            threadA.start();
        }

        Thread chatThread = new Thread(){
            @Override
            public void run() {
                System.out.println(getName() + "실행");
            }
        };
        chatThread.setName("chatting-thread");
        chatThread.setPriority(Thread.MIN_PRIORITY);
        chatThread.start();
    }
}
