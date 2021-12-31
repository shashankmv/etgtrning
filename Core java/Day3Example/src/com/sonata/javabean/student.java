package com.sonata.javabean;

public class student {
private int stdid;
private String stdname;
private double stdmarks;
adress obj;
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getStdname() {
	return stdname;
}
public void setStdname(String stdname) {
	this.stdname = stdname;
}
public double getStdmarks() {
	return stdmarks;
}
public int setStdmarks(double stdmarks) {
	this.stdmarks = stdmarks;
	return stdid;
	
}
public adress getObj() {
	return obj;
}
public void setObj(adress obj) {
	this.obj = obj;
}
@Override
public String toString() {
	return "student [stdid=" + stdid + ", stdname=" + stdname + ", stdmarks=" + stdmarks + ", obj=" + obj + "]";
}


}
