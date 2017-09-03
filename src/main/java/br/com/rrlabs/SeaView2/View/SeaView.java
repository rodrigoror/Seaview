/**
 * 
 */
package br.com.rrlabs.SeaView2.View;

import br.com.rrlabs.SeaView2.Controller.CommandController;

/**
 * @author rodri
 *
 */
public class SeaView {
	
	/**
	 * Class para commandar o submarino
	 * Nota: Envie o maximo de commandos por vez
	 * @param args
	 */
	public static void main(String[] commands) {
		if (commands.length == 0) {
			System.out.println("Sequência de comandos é obrigatória!");
            System.exit(1);
        }

        String comandos = commands[0];
        
        CommandController cc = new CommandController();
        
        System.out.println(cc.inCommand(comandos));
        
	}

}
