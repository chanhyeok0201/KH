package web.noticeservice.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import web.dto.Board;
import web.dto.BoardFile;
import web.dto.Member;
import web.noticeservice.face.Notice;
import web.noticeservice.face.NoticeFile;
import web.util.Paging;

public class NoticeServiceImpl {

	
	public List<Notice> getList() {}
	public List<Notice> getList(Paging paging) {}
	public Paging getPaging(HttpServletRequest req) {}
	public Notice getNoticeno(HttpServletRequest req) {}
	public Notice getview(Notice boardno) {}
	public String getNick(Notice viewBoard) {}
	public void insert(HttpServletRequest req) {}
	public void delete(HttpServletRequest req) {}
	public void update(HttpServletRequest req) {}
	public BoardFile getviewFile(Notice viewBoard) {}
	public void commentsinsert(HttpServletRequest req);
	public void commentselete(HttpServletRequest req);
}
