package com.haigang.domain;
/**
 * 语言能力表
 * @author haigang
 *
 */
public class Language {      //为了简单起见，可以将下拉表写死（语言类别、等级等）
	
	private long id;
	
	private String languageMark;  //语种类别
	
    private String level;    //级别
    
    private float score;   //分数
    
    private Resume resume;

	

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLanguageMark() {
		return languageMark;
	}

	public void setLanguageMark(String languageMark) {
		this.languageMark = languageMark;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	
	

}
