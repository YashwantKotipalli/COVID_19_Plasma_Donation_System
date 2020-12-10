/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodGroup;

/**
 *
 * @author adwai
 */
public class BloodGroup {
    
    private static int aPositive = 0;
    private static int aNegative = 0;
    private static int bPositive = 0;
    private static int bNegative = 0;
    private static int oPositive = 0;
    private static int oNegative = 0;
    private static int abPositive = 0;
    private static int abNegative = 0;

    public BloodGroup(String bloodGroup){
        if(bloodGroup.equals("A+")){
            aPositive++;
        }
        else if(bloodGroup.equals("A-")){
            aNegative++;
        }
        else if(bloodGroup.equals("B+")){
            bPositive++;
        }
        else if(bloodGroup.equals("B-")){
            bNegative++;
        }
        else if(bloodGroup.equals("AB+")){
            abPositive++;
        }
        else if(bloodGroup.equals("AB-")){
            abNegative++;
        }
        else if(bloodGroup.equals("O+")){
            oPositive++;
        }
        else if(bloodGroup.equals("O-")){
            oNegative++;
        }
        else{
            System.out.println("Blood Group invalid");
        }
        
    }
    
    
    public static int getaPositive() {
        return aPositive;
    }

    public static void setaPositive(int aPositive) {
        BloodGroup.aPositive = aPositive;
    }

    public static int getaNegative() {
        return aNegative;
    }

    public static void setaNegative(int aNegative) {
        BloodGroup.aNegative = aNegative;
    }

    public static int getbPositive() {
        return bPositive;
    }

    public static void setbPositive(int bPositive) {
        BloodGroup.bPositive = bPositive;
    }

    public static int getbNegative() {
        return bNegative;
    }

    public static void setbNegative(int bNegative) {
        BloodGroup.bNegative = bNegative;
    }

    public static int getoPositive() {
        return oPositive;
    }

    public static void setoPositive(int oPositive) {
        BloodGroup.oPositive = oPositive;
    }

    public static int getoNegative() {
        return oNegative;
    }

    public static void setoNegative(int oNegative) {
        BloodGroup.oNegative = oNegative;
    }

    public static int getAbPositive() {
        return abPositive;
    }

    public static void setAbPositive(int abPositive) {
        BloodGroup.abPositive = abPositive;
    }

    public static int getAbNegative() {
        return abNegative;
    }

    public static void setAbNegative(int abNegative) {
        BloodGroup.abNegative = abNegative;
    }
    
    
    public static void subtractBloodGroup(String bloodGroup){
        if(bloodGroup.equals("A+")){
            aPositive--;
        }
        else if(bloodGroup.equals("A-")){
            aNegative--;
        }
        else if(bloodGroup.equals("B+")){
            bPositive--;
        }
        else if(bloodGroup.equals("B-")){
            bNegative--;
        }
        else if(bloodGroup.equals("AB+")){
            abPositive--;
        }
        else if(bloodGroup.equals("AB-")){
            abNegative--;
        }
        else if(bloodGroup.equals("O+")){
            oPositive--;
        }
        else if(bloodGroup.equals("O-")){
            oNegative--;
        }
        else{
            System.out.println("Blood Group invalid");
        }
        
    }
    
    
    
    
}
