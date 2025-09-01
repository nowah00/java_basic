package java00_basic.homework.BoardPrj;

import java.text.SimpleDateFormat;
import java.util.*;
//사용자가 현재 게시물 목록 읽기 가능
//사용자가 메튜를 선택하여 글을 생성, 생성한 글을 읽고, 삭제 가능
//사용자는 게시판을 종료 가능

public class BoardExample {
    static Scanner scanner = new Scanner(System.in); //해당 클래스에서 Scanner 객체는 공용객체

    private static final String menuNumberRegex = "[1-4]"; //1부터 4까지만 선택할 수 있도록 해줌
    private static final String checkNumberRegex = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    private static int bNo = 1;

    SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd"); //날짜 포맷을 만들어줌

    //Board 매니저가 게시판을 관리한다.
    BoardManger boardManger;

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
        System.out.println("메인 메뉴: 1.Create  |  2.Read  |  3.Clear  |  4.Exit");
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
                    case "2": Read(); break;
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
        System.out.println("보조 메뉴: 1.Ok  |  2.Cancel");
        System.out.print("메뉴 선택: ");
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

        public void Read(){
            System.out.println("\n[게시물 읽기]");
            Scanner input = new Scanner(System.in);
            int numberInput = 0;
            while (true){
                try {
                    System.out.print("bno: ");
                    numberInput = input.nextInt();
                    if (numberInput < 0 || numberInput > boardManger.getBoardMap().size()){
                        throw new IllegalArgumentException("해당 게시물은 존재하지 않습니다.");
                    } else {
                        Map<String,Board> boardMap = boardManger.getBoardMap();
                        System.out.println("#".repeat(30));
                        Board boardOne = boardMap.get(String.valueOf(numberInput));
                        System.out.println("번호" + boardOne.getBNo());
                        System.out.println("제목: " + boardOne.getBTitle());
                        System.out.println("내용: " + boardOne.getBContent());
                        System.out.println("작성자: " + boardOne.getBWriter());
                        System.out.println("날짜: " + dateFormatter.format(boardOne.getBDate()));
                        System.out.println("#".repeat(30));
                        readOption(numberInput);
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    public void readOption(int numberInput){
        System.out.println("-".repeat(60));
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("보조 메뉴: 1.Update  |  2.Delete  |  3.List");
        System.out.print("메뉴 선택: ");

        while (true) {
            String input = scanner1.nextLine();
            if (input.matches(readOptionRegex)){
                switch (input){
                    case "1": Update(numberInput); break;
                    case "2": Delete(); break;
                    case "3": list(); break;
                }
                break;
            } else {
                System.out.println("[1-3]번을 입력해주세요"); break;
            }
        }
    }

    public void Update(int numberInput){
        Board boardOne = boardManger.getBoardMap().get(String.valueOf(numberInput));
        System.out.println("\n[수정 내용 입력]");

        System.out.print("제목: ");
        String title = scanner.nextLine();

        System.out.print("내용: ");
        String content = scanner.nextLine();

        System.out.print("작성자: ");
        String writer = scanner.nextLine();

        if(checkMenu()) {
            boardOne.setBTitle(title);
            boardOne.setBContent(content);
            boardOne.setBWriter(writer);
        }
    }

    public void Delete(){}









//    public void Read(){
//            System.out.println("\n[게시물 읽기]");
//            System.out.print("bno: ");
//            int choiceNo = scanner.nextInt();
//            System.out.println("#".repeat(13));
//            Board choiceBoard = boardManger.getBoardMap().get(String.valueOf(choiceNo));
//            System.out.println("번호: " + choiceBoard.getBNo());
//            System.out.println("제목: " + choiceBoard.getBTitle());
//            System.out.println("내용: " + choiceBoard.getBContent());
//            System.out.println("작성자: " + choiceBoard.getBWriter());
//            System.out.println("날짜: " + dateFormatter.format(choiceBoard.getBDate()));
//            System.out.println("#".repeat(13));
//
//            readMenu(choiceBoard);

//    public void readMenu(Board choiceBoard){
//        System.out.println("-".repeat(60));
//        System.out.println("보조 메뉴: 1.Update  |  2.Delete  |  3.List");
//        System.out.print("메뉴 선택: ");
//
//
//        while (true) {
//            scanner.nextLine();
//            String input = scanner.nextLine();
//            if (input.matches(readOptionRegex)){
//                switch (input){
//                    case "1": Update(choiceBoard); break ;
//                    case "2": Delete(); break;
//                    case "3": list(); break;
//                }
//            } else {
//                System.out.println("[1-3]번을 입력해주세요"); break;
//            } break;
//        }
//    }
//
//    public void Update(Board choiceBoard){
//        System.out.println("\n[수정 내용 입력]");
//
//        System.out.print("제목: ");
//        String title = scanner.nextLine();
//
//        System.out.print("내용: ");
//        String content = scanner.nextLine();
//
//        System.out.print("작성자: ");
//        String writer = scanner.nextLine();
//
//        if(checkMenu()) {
//            choiceBoard.setBTitle(title);
//            choiceBoard.setBContent(content);
//            choiceBoard.setBWriter(writer);
//        }
//    }






    }


