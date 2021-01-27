package com.team05.search.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.team05.command.ProductVO;
import com.team05.command.ReservationVO;
import com.team05.command.ReviewVO;
import com.team05.command.RoomVO;
import com.team05.command.util.Criteria;
import com.team05.command.util.SearchAreaVO;
import com.team05.command.util.SearchNameVO;

public interface SearchMapper {
	public ArrayList<ProductVO> getlist(SearchAreaVO searchvo);
	public ArrayList<RoomVO> getroom(int pro_no);
	public boolean insertReview(ReviewVO vo);
	public ArrayList<ReviewVO> getreview(@Param("cri") Criteria cri,@Param("pro_no") int pro_no);
	public int reviewtotal(int pro_no);
	public int reviewtotalSum(int pro_no);
	public String getaddress(int pro_no);
	public String gettitle(int pro_no);
	
	public ArrayList<ProductVO> searchname(SearchNameVO searchNameVO);
	public String getproductTitle(int pro_no);
	
	//예약등록
	public int reservationForm(ReservationVO vo);
	public ArrayList<ProductVO> productlist(int[] list);
	
	//호텔평점상위 5개
	public ArrayList<ProductVO> reviewRank();
}
