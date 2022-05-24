/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;
import java.lang.String;

/**
 *
 * @author liangzeng
 */
public class PartTimeStudent extends Student {
    
    private int numOfCourse;
    
    public PartTimeStudent(int numOfCourse,String studentId,String studentName){
        super(studentId,studentName);
        this.numOfCourse = numOfCourse;
    
    }
    
    public int getNumberOfCourse(){
        return this.numOfCourse;
    }
    
 }
    
