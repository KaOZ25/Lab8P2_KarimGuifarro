/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_karimguifarro;

import java.util.Random;

public class random {

    private  Random r = new Random();

    public String random() {
        String in = "MI";
        for (int i = 0; i < 10; i++) {
            in += 0 + r.nextInt(9);
        }
        return in;
    }
}
