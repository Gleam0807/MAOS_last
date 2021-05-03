package com.mcos.community.common;

import org.springframework.stereotype.Repository;

@Repository
public class Pagination {

	private int listSize = 10;  //초기값으로 목록개수를 10으로 셋팅
	private int rangeSize = 10; //초기값으로 페이지범위를 10으로 셋팅
	private int page;			//현재 목록의 페이지 번호
	private int range;			//각 페이지 범위 시작 번호
	private int listCnt;		//전체 개시물의 개수
	private int pageCnt;		//전체 페이지 범위의 개수
	private int startPage;		//각 페이지 범위 시작 번호
	private int startList;		//각 페이지의 게시판 시작 번호
	private int endPage;		//각 페이지 범위 끝 번호
	private boolean prev;		//이전 페이지 여부
	private boolean next;		//다음 페이지 여부
	
	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	public int getRangeSize() {
		return rangeSize;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getListCnt() {
		return listCnt;
	}
	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getStartList() {
		return startList;
	}
	public void setStartList(int startList) {
		this.startList = startList;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	
	public void pageInfo(int page, int range, int listCnt) { //현재 페이지 정보, 현재 페이지 범위, 게시물의 총 개수 
		this.page = page;
		this.range = range;
		this.listCnt = listCnt;
		
		//전체 페이지수
		this.pageCnt = (int)Math.ceil(listCnt/listSize);
		
		//시작 페이지 (각 페이지 범위의 시작 번호를 구하는 방법)
		this.startPage = (range - 1) * rangeSize + 1;
		
		//끝 페이지 (마지막 페이지의 번호를 구하는 이유는 [다음]버튼의 활성화 여부를 판단하기 위해)
		this.endPage = range * rangeSize;
		
		//게시판 시작번호 (MYSQL을 이용해 원하는 목록을 가져오기 위해)
		this.startList = (page - 1) * listSize;
		
		//이전 버튼 상태 (페이지범위가 1일 때는 [이전]버튼이 필요 없기 때문에 false)
		this.prev = range == 1 ? false : true;
		
		//다음 버튼 상태 (마지막 번호와 페이지의 총 갯수를 비교하여 마지막 번호가 총갯수 보다 크다면 마지막 번호로 셋팅 된다) 
		this.next = endPage > pageCnt ? false : true; 
		if(this.endPage > this.pageCnt) {
			this.endPage = this.pageCnt;
			this.next = false; //다음 페이지에 대한 이동도 할 수 없으므로 [다음]버튼 상태를 비활성화 한다
		}
	}
	
	
}
