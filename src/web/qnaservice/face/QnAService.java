package web.qnaservice.face;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import web.freeservice.face.BoardFile;
import web.freeservice.face.Notice;
import web.util.Paging;

public interface QnAService {

	public List<QnA> getList();
	public List<QnA> getList(Paging paging);
	public Paging getPaging(HttpServletRequest req);
	public QnA getBoardno(HttpServletRequest req);
	public QnA getview(QnA boardNo);
	public String getNick(QnA viewNotice);
	public void insert(HttpServletRequest req);
	public void delete(HttpServletRequest req);
	public void update(HttpServletRequest req);
	public BoardFile getviewFile(QnA viewNotice);
	public void commentsinsert(HttpServletRequest req);
	public void commentsdelete(HttpServletRequest req);
	public void commentsupdate(HttpServletRequest req);
	public void declare(HttpServletRequest req)
}
