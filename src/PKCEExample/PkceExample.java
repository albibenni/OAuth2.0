package PKCEExample;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author sergeykargopolov
 */

public class PkceExample {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */


    public static void main(String[] args) {

        try {

            PkceUtil pkce = new PkceUtil();

            String codeVerifier = pkce.generateCodeVerifier();
            System.out.println("Code verifier: " + codeVerifier);

            String codeChallenge = pkce.generateCodeChallange(codeVerifier);
            System.out.println("Code challenge: " + codeChallenge);

        } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
            Logger.getLogger(PkceExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
