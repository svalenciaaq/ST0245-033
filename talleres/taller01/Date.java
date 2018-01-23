/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;


public class Date {

    /**
     * @param args the command line arguments
     */
    
    int month;
    int day;
    int year;
    
    public static void main(String[] args) {
        
    }
    
     Date(int month,int day, int year){
        this.month=month;
        this.day=day;
        this.year=year;
    }
     
     static Date dia1 = new Date(3,20,2015);
     static Date dia2 = new Date(3,10,2015);
     
     
    //Getters
        public int getMonth(){
         return month;
        }
   
         public int getDay(){
         return day;
        }
   
         public int getYear(){
         return year;
        }

    @Override
        public String toString() {
        return "Date{" + "month=" + month + ", day=" + day + ", year=" + year + '}';
        }
    
    public boolean equals(Date dia1){
        if(dia1.equals(dia2)){
            return true;
        }
        return false;
    }
   
    
}
