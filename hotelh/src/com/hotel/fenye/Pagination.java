package com.hotel.fenye;

public class Pagination {
	
	public int lineNum=2;//ÿҳ��ʾ����¼��
	public int startPage=0 ;//�ӵڼ�ҳ��ʼ��ʾ
	public int pageNum=0 ;//��ҳ��
    public int allJlNum=0;//�ܼ�¼��
    
	public String jsc;//�������ֶ���
	public String keyWord;//����������
	
    public void setPageNum(int allJlNum) 
    {   
    	this.allJlNum=allJlNum;
		if(allJlNum%lineNum==0)
			pageNum=allJlNum/lineNum;
		else
			pageNum=allJlNum/lineNum+1;
    }

	public int getLineNum() {
		return lineNum;
	}

	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public String getJsc() {
		return jsc;
	}

	public void setJsc(String jsc) {
		this.jsc = jsc;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public int getPageNum() {
		return pageNum;
	}

	public int getAllJlNum() {
		return allJlNum;
	}

	public void setAllJlNum(int allJlNum) {
		this.allJlNum = allJlNum;
	}	

}
