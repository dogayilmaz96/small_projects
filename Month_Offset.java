package com.company;

public class Month_Offset {
    public static void main(String[] args) {
        System.out.println("Offset for month 1:"+month_offset(1));
        System.out.println("Offset for month 2:"+month_offset(2));
        System.out.println("Offset for month 3:"+month_offset(3));
        System.out.println("Offset for month 4:"+month_offset(4));
        System.out.println("Offset for month 5:"+month_offset(5));
        System.out.println("Offset for month 6:"+month_offset(6));
        System.out.println("Offset for month 7:"+month_offset(7));
        System.out.println("Offset for month 8:"+month_offset(8));
        System.out.println("Offset for month 9:"+month_offset(9));
        System.out.println("Offset for month 10:"+month_offset(10));
        System.out.println("Offset for month 11:"+month_offset(11));
        System.out.println("Offset for month 12:"+month_offset(12));
        System.out.println("Offset for month 43:"+month_offset(43));
    }
    public static int month_offset(int num){
        int offset;
        if(num==1){
            offset=1;
        }
        else if (num==2){
            offset=4;
        }
        else if(num==3){
            offset=4;
        }
        else if (num==4){
            offset=0;
        }
        else if (num==5){
            offset=2;
        }
        else if(num==6){
        offset=5;
        }
        else if (num==7){
            offset=0;
            }
        else if(num==8){
            offset=9;
            }
        else  if(num==9){
            offset=6;
            }
        else if(num==10){
            offset=1;
            }
        else if(num==11){
            offset=4;
            }
        else if(num==12){
            offset=6;
            }
        else{
            offset=-1;
            }

        return offset;
    }
}
