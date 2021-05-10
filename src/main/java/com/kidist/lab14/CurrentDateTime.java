package com.kidist.lab14;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime extends SimpleTagSupport {
    String color;
    String size;

    // render custom tag
    public void doTag() throws JspException, IOException {
//        JspWriter out = getJspContext().getOut();
//        if (color != null) {
//            out.write("<div style=\"color:"+foreColor+"; background-color: "+backColor+"\">"+text+"</div>");
//        } else {
//            out.write(String.format("<span>%s</span>", text));
//        }
        JspWriter out = getJspContext().getOut();
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
//        System.out.println("Current Date: " + ft.format(dNow));
        out.write("<div style=\"color:"+color+"; size: "+size+"\">"+ft.format(dNow)+"</div>");
    }

    // Need a setter for each attribute of custom tag
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

}