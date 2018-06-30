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

    private static final HashMap<String, Handler> mathSymbolMap = new HashMap<>();

    public controller() {
    }

    static {
        mathSymbolMap.put("+", (Handler) new Add());
        mathSymbolMap.put("/", (Handler) new Divide());
        mathSymbolMap.put("*", (Handler) new Multiply());
        mathSymbolMap.put("-", (Handler) new Subtract());
    }

    public void handleCommand(String command, Integer num1, Integer num2) {

        Handler handler = mathSymbolMap.get(command);

        handler.execute(num1, num2);

    }

}
