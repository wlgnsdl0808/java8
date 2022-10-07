package sec2;

import java.util.List;
import java.util.Vector;

import sec1.Board;

public class ListEx3 {
	public static void main(String[] args) {
		List<Board> bList = new Vector<Board>();
		//글쓰기 - 글 추가
		bList.add(new Board("제목1","내용1","강병수"));
		bList.add(new Board("제목2","내용2","정병진"));
		bList.add(new Board("제목3","내용3","박평화"));
		bList.add(new Board("제목4","내용4","김도연"));
		bList.add(new Board("제목5","내용5","한지은"));
		
		//글 목록
		System.out.println("제목\t내용\t글쓴이");
		for(int i=0;i<bList.size();i++){
			Board b = new Board();
			b = bList.get(i);
			System.out.println(b.getTitle()+"\t"+b.getContent()+"\t"+b.getAuthor());
		}
		//글 삭제
		bList.remove(3);
	}
}