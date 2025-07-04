package board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import board.dto.Board;
import board.service.BoardService;
import board.service.BoardServiceImpl;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	private static BoardService boardServiceImpl = new BoardServiceImpl(); // 게시판 비즈니스 로직 객체
	private static List<Board> boardList = null; // 게시글 목록 
	/**
	 * 메뉴판
	 */
	public static void menu() {
		
		System.out.println("========== 게시판 ==========");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 게시글 등록");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("번호 입력: ");
		
	}
	/**
	 * 게시글 목록
	 */
	private static void list() {
		System.out.println("========== 게시글 목록 ==========");
		
		// BoardServiceIpml에 게시글 목록 데이터 요청
		boardList = boardServiceImpl.list();
		printALL(boardList);
		
	}
	/**
	 * 글 목록 전체를 출력하는 메소드
	 * @param boardList
	 */
	private static void printALL(List<Board> boardList) {
		// 글 목록이 존재하는지 확인
		if (boardList == null || boardList.isEmpty()) {
			System.out.println("조회된 글이 없습니다.");
			return;
		}
		
		// 글 목록 출력
		for (Board board : boardList) {
			print(board);
		}
	}
	/**
	 * 게시글 출력
	 * @param board
	 */
	private static void print(Board board) {
		if (board == null) {
			System.out.println("조회할 수 없는 게시글입니다.");
			return;
		}
		
		int no = board.getNo();
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		LocalDateTime regDate = board.getRegDate();
		LocalDateTime updDate = board.getUpdDate();
	
		
		// 날짜 포맷: yyyy/MM/dd HH:mm:ss
		DateTimeFormatter fommatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String reg = regDate.format(fommatter);
		String upd = updDate.format(fommatter);
		
		System.out.println("========================================");
		System.out.println("★ 글 번호: " + no);
		System.out.println("★ 제목: " + title);
		System.out.println("★ 작성자: " + writer);
		System.out.println("----------------------------------------");
		System.out.println(" " + content);
		System.out.println();
		System.out.println("★ 등록일자: " + reg);
		System.out.println("★ 수정일자: " + upd);
		System.out.println("========================================");
		System.out.println();
	}
	/**
	 * 게시물 조회
	 * @param args
	 */
	private static void select() {
		System.out.println("========== 게시글 조회 ==========");
		System.out.print("글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		Board board = boardServiceImpl.select(no);
		print(board);
	}
	
	/**
	 * 
	 */
	private static Board input() {
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("작성자: ");
		String writer = sc.nextLine();
		System.out.print("내용: ");
		String content = sc.nextLine();
		
		Board board = new Board(title, writer, content);
		return board;
	}
	
	/**
	 * 
	 */
	private static void insert() {
		System.out.println("========== 게시글 등록 ==========");
		
		Board board = input();
		
		// 게시글 등록 요청
		int result = boardServiceImpl.insert(board);
		if (result > 0) {
			System.out.println("★ 게시글이 등록되었습니다.");
		} else {
			System.out.println("★ 게시글 등록에 실패하였습니다.");
		}
	}
	
	/**
	 * 게시글 수정
	 */
	private static void update() {
		System.out.println("========== 게시글 수정 ==========");
		
		System.out.print("게시글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		
		Board board = input();
		board.setNo(no);
		int result = boardServiceImpl.update(board);
		
		if (result > 0) {
			System.out.println("※ 수정에 성공하였습니다.");
		} else {
			System.out.println("※ 수정에 실패했습니다.");
		}
	}
	
	/**
	 * 게시글 삭제
	 */
	private static void delete() {
		System.out.println("========== 게시글 삭제 ==========");
		
		System.out.print("게시글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		int result = boardServiceImpl.delete(no);
		
		if (result > 0) {
			System.out.println("◈ 삭제 성공하였습니다.");
		} else {
			System.out.println("◈ 삭제 실패했습니다.");
		}
	}
	
	public static void main(String[] args) {
		
		int menuNo = 0;
		
		while (true) {
			// 메뉴판 출력
			menu();
			
			// 메뉴 번호 입력
			menuNo = sc.nextInt();
			sc.nextLine();
			
			// 0 -> 프로그램 종료
			if (menuNo == 0) break;
			
			// 메뉴 선택
			switch (menuNo) {
			case 1:
				list(); // 게시글 목록
				break;
			case 2:
				select(); // 게시글 조회
				break;
			case 3:
				insert(); // 게시글 등록
				break;
			case 4:
				update(); // 게시글 수정
				break;
			case 5:
				delete(); // 게시글 삭제
				break;
			}
			
		}

		System.out.println("프로그램을 종료합니다!");
	}


}
