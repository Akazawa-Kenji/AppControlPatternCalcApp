/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontrollercalcapp;

import java.util.HashMap;

/**
 *
 * @author Crazian
 */
public class controller {

    private static final HashMap<String, compute> mathSymbolMap = new HashMap<>();

    public controller() {
    }

    static {
        mathSymbolMap.put("+", (compute) new Add());
        mathSymbolMap.put("/", (compute) new Divide());
        mathSymbolMap.put("*", (compute) new Multiply());
        mathSymbolMap.put("-", (compute) new Subtract());
    }

    public void handleCommand(String command, Integer num1, Integer num2) {

        compute handler = mathSymbolMap.get(command);

        handler.execute(num1, num2);

    }

}
