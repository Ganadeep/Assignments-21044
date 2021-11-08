package com.sonata.Assignment;

public class Student 
{
      String name;
      int stdid;
      int stdmarks;
       public Student() {}
       public Student(String stdname,int stdid,int stdmarks) {
    	   super();
    	   this.name=stdname;
    	   this.stdid=stdid;
    	   this.stdmarks=stdmarks;
       }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public int getStdmarks() {
		return stdmarks;
	}
	public void setStdmarks(int stdmarks) {
		this.stdmarks = stdmarks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", stdid=" + stdid + ", stdmarks=" + stdmarks + "]";
	}
}
