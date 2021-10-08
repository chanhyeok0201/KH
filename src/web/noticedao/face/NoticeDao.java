package web.noticedao.face;

import java.sql.Connection;
import java.util.List;

import web.dto.Board;
import web.dto.BoardFile;
import web.freedao.face.Free;
import web.freedao.face.Freecomments;
import web.qnadao.face.Notice;
import web.qnadao.face.QnA;
import web.qnadao.face.QnAcomments;
import web.util.Paging;

public interface NoticeDao {

	
	public List<Notice> selectAll(Connection conn);
	public List<Notice> selectAll(Connection conn, Paging paging);
	public int selectCntAll(Connection conn);
	public Notice selectBoardByBoardno(Connection conn, Notice boardno);
	public int updateHit(Connection conn, Notice boardno);
	public String selectNickByUserid(Connection conn, Notice viewBoard);
	public int insert(Connection conn, Notice board);
	public int delete(Connection conn, Notice board);
	public int update(Connection conn, Notice board);
	public int selectNextBoardno(Connection conn);
	public int selectinsertFile(Connection conn, BoardFile boardFile);
	public BoardFile File(Connection conn, Notice viewBoard);
	public int commentsinsert(Connection conn, Notice board);
	public int commentsdelete(Connection conn, Notice board);
	
}
