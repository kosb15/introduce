package com.kosb.chap1;

public class VersionPrinter {
	private int majorVersion;
	private int minorVersion;
	
	
	
	
	public VersionPrinter(int majorVersion, int minorVersion) {
		super();
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
	}
	public int getMajorVersion() {
		return majorVersion;
	}
	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}
	public int getMinorVersion() {
		return minorVersion;
	}
	public void setMinorVersion(int mainorVersion) {
		this.minorVersion = mainorVersion;
	}
	
	public void print()
	{
		System.out.printf("이 프로그램의 버전은 %d.%d입니다.\n\n",majorVersion,minorVersion);
	}

}
