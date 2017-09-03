/**
 * Classe responsabel por executar os commandos enviados pela view
 */
package br.com.rrlabs.SeaView2.Controller;
import br.com.rrlabs.SeaView2.Entity.Constantes;
import br.com.rrlabs.SeaView2.Entity.Position;
import br.gov.frameworkdemoiselle.stereotype.Controller;

/**
 * @author Rodrigo Ramos
 *  Execute the commands
 */
@Controller
public class CommandController {
	Position actual = new Position();
	public CommandController() {
		actual.reset();
	}
	
	//recebe comando de entrada
	public String inCommand(String cmd) {
		//separa em atividades
		char[] command = cmd.toUpperCase().toCharArray();
		//percorre o array executando os comandos
		for (char c : command) {
			switch (c) {
			case 'D':
				actual.setZ(actual.getZ()-1);
				break;
			case 'U':
				if (actual.getZ() == 0) {
					System.out.println("O Objeto chegou a superfície");
				} else {
					actual.setZ(actual.getZ()+1);
				}
				break;
			case 'L':
				actual.setPos(mudarPosicaoDoBico("L",actual.getPos()));
				break;
			case 'R':
				actual.setPos(mudarPosicaoDoBico("R",actual.getPos()));
				break;
			case 'M':
				if(actual.getPos().equals(Constantes.NORTE)) {actual.setY(actual.getY()+1);}
				if(actual.getPos().equals(Constantes.SUL)) {actual.setY(actual.getY()-1);}
				if(actual.getPos().equals(Constantes.LESTE)) {actual.setX(actual.getX()+1);}
				if(actual.getPos().equals(Constantes.OESTE)) {actual.setX(actual.getX()-1);}
				break;
			default:
				System.out.println("O comando contém caracteres inválidos e foram ignorados: "+ c);
				break;
			}
		}
		return execCommand(actual);
	}
	
	//executa comando de saida
	public String execCommand(Position actual) {
		String retorno = actual.getX() + " " + actual.getY() + " "+ actual.getZ() + " " + actual.getPos();
		return retorno;
	}
	
	//muda a posição do bico do submarino
	public String mudarPosicaoDoBico(String Direction, String posicaoAtual) {
		String retorno = "";
		switch (Direction) {
		case "L":
			if (posicaoAtual.equals(Constantes.NORTE)) { retorno =  Constantes.OESTE;}
			if (posicaoAtual.equals(Constantes.OESTE)) { retorno =  Constantes.SUL;}
			if (posicaoAtual.equals(Constantes.SUL)) { retorno =  Constantes.LESTE;}
			if (posicaoAtual.equals(Constantes.LESTE)) { retorno =  Constantes.NORTE;}
			break;
		case "R":
			if (posicaoAtual.equals(Constantes.NORTE)) { retorno =  Constantes.LESTE;}
			if (posicaoAtual.equals(Constantes.LESTE)) { retorno =  Constantes.SUL;}
			if (posicaoAtual.equals(Constantes.SUL)) { retorno =  Constantes.OESTE;}
			if (posicaoAtual.equals(Constantes.OESTE)) { retorno =  Constantes.NORTE;}
			break;
		default:
			retorno = Constantes.NORTE;
			break;
		}
		return retorno;
	}
}
