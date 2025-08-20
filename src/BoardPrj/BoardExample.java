package BoardPrj;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;
//사용자가 현재 게시물 목록 읽기 가능
//사용자가 메튜를 선택하여 글을 생성, 생성한 글을 읽고, 삭제 가능
//사용자는 게시판을 종료 가능

public class BoardExample {
    static Scanner scanner = new Scanner(System.in); //해당 클래스에서 Scanner 객체는 공용객체
    private static final String menuNumberRegex = "[1-4]"; //1부터 4까지만 선택할 수 있도록 해줌
    private static final String checkNumberRegex = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    private static int bNo = 1;

    SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    //Board 매니저가 게시판을 관리한다.
    BoardManger boardManger;
    public BoardExample(){}
    public BoardExample(BoardManger boardManger){
        this.boardManger = boardManger;
    }

    //현재 게시판의 전체 게시물 목록 출력 기능
    public void list() {
        Map<String,Board> boardMap = boardManger.getBoardMap(); //게시판은 매니저가 담당하고 있으므로, 매니저에게 받아온다.
        System.out.println("\n[게시물 목록]");
        System.out.println("-".repeat(60));
        System.out.printf("%-4s %-20s %-20s %-20s\n","no","writer","date","title");
        System.out.println("-".repeat(60));

        //Manger 에게 전체 게시물 목록을 요청
        List<Map.Entry<String,Board>> entryList = new LinkedList<>(boardMap.entrySet());
        Collections.reverse(entryList); //reverse 내림차순

        entryList.forEach(entry -> {
            Board value = entry.getValue();
            System.out.printf("%-4s %-20s %-20s %-20s\n",value.getBNo(),value.getBWriter(),dateFormatter.format(value.getBDate()),value.getBTitle());
        });
        System.out.println();
        mainMenu();
    }

    //메인 메뉴
    public void mainMenu() {
        System.out.println("-".repeat(60));
        System.out.printf("%-5s %-11s | %-9s | %-9s | %-9s\n","메인 메뉴:"," 1.Create"," 2.Read"," 3.Clear"," 4.Exit");
        System.out.print("메뉴 선택: ");
    }

    //게시물 메인 메뉴 선택 기능
    public void run(){
        while (true) {
            list();
            String input = scanner.nextLine(); //외부에서 사용자가 입력한 데이터 타입은 모두 문자열

            if (input.equals("4")) {
                System.out.println("\n게시판 종료");
                break;
            }
            if (input.matches(menuNumberRegex)){
                switch (input){
                    case "1": Create(); break;
                    case "2": System.out.println("Read();"); break;
                    case "3": System.out.println("Clear();"); break;
                }
            } else {
                System.out.println("[1-4]번 번호를 입력하세요"); break;
            }
        }
    }

    //checkMenu() : 보조메뉴 확인, 선택 메서드
    public boolean checkMenu(){
        System.out.println("-".repeat(60));
        System.out.println("\n보조 메뉴: 1. Ok  |  2. Cancel");
        System.out.println("메뉴 선택: ");
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(checkNumberRegex)){
                return input.equals("1");
            } else {
                System.out.println("[1 or 2]번을 입력하세요.");
            }
        }
    }

    //새글 작성 저장기능 => Map 컬렉션에
    public void Create(){
        System.out.println("\n[새 게시물 입력]");

        System.out.print("제목: ");
        String title = scanner.nextLine();

        System.out.print("내용: ");
        String content = scanner.nextLine();

        System.out.print("작성자: ");
        String writer = scanner.nextLine();

        //1번 입력
        if(checkMenu()) {
            //BoardBuilder 를 이용하여 새 글을 생성한다.
            Board board = Board.builder()
                    .bNo(bNo)
                    .bWriter(writer)
                    .bTitle(title)
                    .bContent(content)
                    .bDate(new Date())
                    .build();

            Map<String,Board> boardMap = boardManger.getBoardMap();
            boardMap.put(String.valueOf(bNo),board);
            boardManger.setBoardMap(boardMap);
            bNo++;
            }




        }
    }


