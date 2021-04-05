/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneNumber;

/**
 *
 * @author Khuong Hung
 */
public class IntPhoneNumber extends PhoneNumber{
    String countryCode;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(String countryCode) {
        this.countryCode = countryCode;
    }

    public IntPhoneNumber(String countryCode, int area, String number) {
        super(area, number);
        this.countryCode = countryCode;
    }
    
    
    
}
