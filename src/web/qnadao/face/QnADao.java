package web.qnadao.face;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import web.freedao.face.BoardFile;
import web.freedao.face.Notice;
import web.util.Paging;

public interface QnADao {

	private PreparedStatement ps = null; //SQL수행 객체
	private ResultSet rs = null; //SQL조회 결과 객체
	
	public List<QnA> selectAll(Connection conn);
	public List<QnA> selectAll(Connection conn, Paging paging);
	public int selectCntAll(Connection conn);
	public Notice selectBoardByBoardno(Connection conn, QnA boardno);
	public int updateHit(Connection conn, QnA boardno);
	public String selectNickByUserid(Connection conn, QnA viewBoard);
	public int insert(Connection conn, QnA board);
	public int delete(Connection conn, QnA board);
	public int update(Connection conn, QnA board);
	public int selectNextBoardno(Connection conn);
	public int selectinsertFile(Connection conn, BoardFile boardFile);
	public BoardFile File(Connection conn, QnA viewBoard);
	public int commentsinsert(Connection conn, QnAcomments board);
	public int commentsdelete(Connection conn, QnAcomments board);
	public int commentsupdate(Connection conn, QnAcomments board);
	public int declare(Connection conn);
}
