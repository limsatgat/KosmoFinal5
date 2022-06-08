package com.example.community;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.example.domain.AgencyVO;
import com.example.domain.CommentVO;
import com.example.domain.ImgVO;


public interface CommunityService {
	
	/* public List<ImgFileVO> saveDaily(String p_imgname, String p_rimgname); */
	
	//게시글 등록
	public void insertDaily(String userEmail, String communityTitle, String communityContent, MultipartFile[] file);
	
	//일상공유 게시판 상세보기
	public CommunityVO getCommunity(CommunityVO vo);
	
	//**************************************************************
	//일상공유 게시글 페이지 처리
	public List<CommunityVO> getCommunityPaging(Pageable paging);
	
	public int countCommunityRecord();
	//**************************************************************
	
	//일상공유 게시글 수정
	public void updateCommunity(Integer communityNum, String communityTitle, String communityContent);
	
	//일상공유 게시글 삭제
	public void deleteCommunity(Integer communityNum);
	
	//일상공유 댓글 작성
	public void writeCommunitycomment(Integer communityNum, String userEmail, String commentContent);
	
	//일상공유 댓글 리스트
	public List<CommentVO> commentList(Integer communityNum);
	
	//일상공유 이미지 첨부
	public void insertImgVo(ImgVO imgvo);
	
	//일상공유 이미지 첨부에 이용
	public CommunityVO getCommunityByUser(String userEmail);
	
	//일상공유 이미지 리스트
	public List<ImgVO> imgList(Integer communityNum);
	
	//일상공유 신고
	public void reportCommunity(Integer communityNum, String user, String rReason);
}
