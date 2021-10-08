package web.qnaservice.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import web.freeservice.impl.BoardFile;
import web.freeservice.impl.Notice;
import web.util.Paging;

public class QnAServiceImpl {

	public List<QnA> getList() {}
	public List<QnA> getList(Paging paging) {}
	public Paging getPaging(HttpServletRequest req) {}
	public QnA getNoticeno(HttpServletRequest req) {}
	public QnA getview(QnA boardno) {}
	public String getNick(QnA viewBoard) {}
	public void insert(HttpServletRequest req) {}
	public void delete(HttpServletRequest req) {}
	public void update(HttpServletRequest req) {}
	public BoardFile getviewFile(QnA viewBoard) {}
	public void commentsinsert(HttpServletRequest req);
	public void commentselete(HttpServletRequest req);
	public void commentupdate(HttpServletRequest req);
	public void declare(HttpServletRequest req);
}
