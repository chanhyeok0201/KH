package web.noticeservice.face;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import web.dto.Board;
import web.dto.BoardFile;
import web.util.Paging;

public interface NoticeService {

	public List<Notice> getList();
	public List<Notice> getList(Paging paging);
	public Paging getPaging(HttpServletRequest req);
	public Notice getBoardno(HttpServletRequest req);
	public Notice getview(Notice boardNo);
	public String getNick(Notice viewNotice);
	public void insert(HttpServletRequest req);
	public void delete(HttpServletRequest req);
	public void update(HttpServletRequest req);
	public BoardFile getviewFile(Notice viewNotice);
	public void commentsinsert(HttpServletRequest req);
	public void commentsDelete(HttpServletRequest req);
	
	
	
	
}
