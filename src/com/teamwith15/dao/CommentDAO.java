//작성자: 황규진 
package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.dto.CommentDTO;

public interface CommentDAO {
	/** CommentDTO 객체를 받아서 레코드를 추가한다.*/
	public int addComment(CommentDTO comment) throws Exception;
	/** commentId에 해당하는 레코드를 삭제한다.*/
	public int removeCommentByCommentId(String commentId) throws Exception;
	/** 특정 회원의 모든 Comment_tb 레코드를 삭제한다.*/
	public int removeCommentByMemberId(String memberId) throws Exception;
	/** comment_id에 해당하는 레코드의 comment_content를 변경한다. (업데이트 날짜는 현재 날짜로 바뀐다.)*/
	public int updateComment(CommentDTO comment) throws Exception;
	/** comment_id에 해당하는 레코드의 모든 속성을 변경한다.*/
	public int updateCommentAll(CommentDTO comment) throws Exception;
	/** 팀에 달린 모든 comment 찾기*/
	public List<CommentDTO> searchCommentByTeamId(String teamId) throws Exception;
	/** 특정 댓글에 달린 대댓글 찾기*/
	public List<CommentDTO> searchCommentByParentCommentId(String parentCommentId) throws Exception;
	/** 모든 댓글 레코드 불러오기*/
	public List<CommentDTO> searchCommentAll() throws Exception;
}
