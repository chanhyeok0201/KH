package web.noticedao.face;

import java.sql.Connection;
import java.util.List;

import web.util.Paging;

public interface BoardDao {

	public List<Free> selectAll(Connection conn);
	public List<Free> selectAll(Connection conn, Paging paging);
	public int selectCntAll(Connection conn);
	public Free selectBoardByBoardno(Connection conn, Free boardno);
	public int updateHit(Connection conn, Free boardno);
	public String selectNickByUserid(Connection conn, Free viewBoard);
	public int insert(Connection conn, Free board);
	public int delete(Connection conn, Free board);
	public int update(Connection conn, Free board);
	public int selectNextBoardno(Connection conn);
	public int selectinsertFile(Connection conn, FreeFile boardFile);
	public BoardFile File(Connection conn, Free viewBoard);
	public int commentsinsert(Connection conn, Freecomments board);
	public int commentsdelete(Connection conn, Freecomments board);
	public int commentsupdate(Connection conn, Freecomments board);
	public int declare(Connection conn);
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
	public List<Notice> selectAll(Connection conn);
	public List<Notice> selectAll(Connection conn, Paging paging);
	public int selectCntAll(Connection conn);
	public Notice selectBoardByBoardno(Connection conn, Notice boardno);
	public int updateHit(Connection conn, Notice boardno);
	public String selectNickByUserid(Connection conn, Notice viewBoard);
	public int commentsinsert(Connection conn, Notice board);
	public int commentsdelete(Connection conn, Notice board);
}
