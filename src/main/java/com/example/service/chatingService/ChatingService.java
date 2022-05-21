package com.example.service.chatingService;

import java.util.List;

import com.example.domain.ChatingRoomVO;
import com.example.domain.UserVO;

public interface ChatingService {
	
	public void deleteByRoomMember(ChatingRoomVO vo);
	
	public void insertRoomMember(ChatingRoomVO vo);
	
	public List<ChatingRoomVO> findByRoomName(ChatingRoomVO vo);
	
	public List<ChatingRoomVO> getAllRooms();
	
	public List<ChatingRoomVO> getLastRoomNumber();
	

}
