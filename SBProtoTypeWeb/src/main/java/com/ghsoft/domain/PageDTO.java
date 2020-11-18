package com.ghsoft.domain;

public class PageDTO {

	 /** 한 페이지당 게시글 수 **/
    private int pageSize = 10;
    
    /** 한 블럭(range)당 페이지 수 **/
    private int rangeSize = 10;
    
    /** 현재 페이지 **/
    private int curPage = 1;
    
    /** 현재 블럭(range) **/
    private int curRange = 1;
    
    /** 총 게시글 수 **/
    private int listCnt;
    
    /** 총 페이지 수 **/
    private int pageCnt;
    
    /** 총 블럭(range) 수 **/
    private int rangeCnt;
    
    /** 시작 페이지 **/
    private int startPage = 1;
    
    /** 끝 페이지 **/
    private int endPage = 1;
    
    /** 시작 index **/
    private int startIndex = 0;
    
    /** 이전 페이지 **/
    private int prevPage;
    
    /** 다음 페이지 **/
    private int nextPage;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRangeSize() {
		return rangeSize;
	}

	public void setRangeSize(int rangeSize) {
		this.rangeSize = rangeSize;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getCurRange() {
		return curRange;
	}

	public void setCurRange(int curRange) {
		this.curRange = curRange;
	}

	public int getListCnt() {
		return listCnt;
	}

	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}

	public int getPageCnt() {
		return pageCnt;
	}

	public void setPageCnt(int pageCnt) {
		this.pageCnt = pageCnt;
	}

	public int getRangeCnt() {
		return rangeCnt;
	}

	public void setRangeCnt(int rangeCnt) {
		this.rangeCnt = rangeCnt;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	@Override
	public String toString() {
		return "PageDTO [pageSize=" + pageSize + ", rangeSize=" + rangeSize + ", curPage=" + curPage + ", curRange="
				+ curRange + ", listCnt=" + listCnt + ", pageCnt=" + pageCnt + ", rangeCnt=" + rangeCnt + ", startPage="
				+ startPage + ", endPage=" + endPage + ", startIndex=" + startIndex + ", prevPage=" + prevPage
				+ ", nextPage=" + nextPage + "]";
	}
	
    
    
	
	
	/*
	 * ...268p. 목록 하단 페이지나열자의 계산순서. ...예) IF 현재 페이지가 13p THEN, 시작페이지 : 11p, 끝페이지 :
	 * 20p이 되어야 함. ...13/10(페이지나열자에 보여줄 페이지수) = 1.3 을 반올림 → 2 : 페이지 나열자에서 두번째 위치.
	 * ...2*10(페이지나열자에 보여줄 페이지수) = 20(페이지 나열자의 10번째, 마지막 페이지번호). ...20 - 10 + 1 = 11
	 * : 시작 페이지 번호. ...시작페이지의 번호 = 마지막 페이지 번호 - 페이지나열자에 보여줄 페이지수 + 1.
	 * 
	 * ...목록 하단 페이지 나열자 산술시 한페이지에 몇개의 데이터를 보여줄지 결정해야 하는데 ...일반적으로 10을 기준으로 함. ...페이지
	 * 나열자에 보여줄 페이지수는 일반적으로 10개씩 보여줌. ...마지막 페이지번호를 먼저 구하고, 시작 페이지를 구하는 방법을 권장됨.
	 * ...마지막 페이지번호는 실제 데이터 개수와 관련이 있어서, 다시 계산해서 확인한다.
	 * 
	 * ...Prev = 시작페이지 == 1 ? false : true;
	 * 
	 * ...Next = 마지막 페이지번호 * 페이지 나열자에 보여줄 페이지수 >= DB전체데이터수 ? false : true;
	 * 
	 */
//	public class PageMaker {
//
//		private int totalCount;
//		private int startPage;
//		private int endPage;
//		private boolean blPrev;
//		private boolean blNext;
//
//		// ...화면에 보여지는 페이지 번호의 숫자.
//		private int displayPageNum = 10;
//
//		private Criteria cri;
//
//		public void setCri(Criteria cri) {
//			this.cri = cri;
//		}
//
//		public void setTotalCount(int totalCount) {
//			this.totalCount = totalCount;
//
//			calcData();
//		}
//
//		private void calcData() {
//
//			endPage = (int) (Math.ceil(cri.getPage() / (double) displayPageNum) * displayPageNum);
//
//			startPage = (endPage - displayPageNum) + 1;
//
//			int tempEndPage = (int) (Math.ceil(totalCount / (double) cri.getPerPageNum()));
//
//			if (endPage > tempEndPage) {
//				endPage = tempEndPage;
//			}
//
//			blPrev = startPage == 1 ? false : true;
//
//			blNext = endPage * cri.getPerPageNum() >= totalCount ? false : true;
//
//		}
//
//		public int getTotalCount() {
//			return totalCount;
//		}
//
//		public int getStartPage() {
//			return startPage;
//		}
//
//		public int getEndPage() {
//			return endPage;
//		}
//
//		public boolean isPrev() {
//			return blPrev;
//		}
//
//		public boolean isNext() {
//			return blNext;
//		}
//
//		public int getDisplayPageNum() {
//			return displayPageNum;
//		}
//
//		public Criteria getCri() {
//			return cri;
//		}
//
//		public String makeQuery(int page) {
//
//			UriComponents uriComponents = UriComponentsBuilder.newInstance().queryParam("page", page)
//					.queryParam("perPageNum", cri.getPerPageNum()).build();
//			String strTemp = uriComponents.toUriString();
//			return uriComponents.toUriString();
//		}
//
//	}
}
