package br.com.rrlabs.SeaView2;


import static junit.framework.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.rrlabs.SeaView2.Controller.CommandController;
import br.com.rrlabs.SeaView2.Entity.Constantes;
import br.com.rrlabs.SeaView2.Entity.Position;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

@RunWith(DemoiselleRunner.class)
public class SeaViewTest {
	
	@Inject
	CommandController cc;
	
	@Test
	public void inCommandTest1() {
		assertEquals(cc.inCommand("LMRDDMMUU"), "-1 2 0 NORTE");
	}
	@Test
	public void inCommandTest2() {
		assertEquals(cc.inCommand("RMMLMMMDDLL"), "2 3 -2 SUL");
	}
	@Test
	public void mudarPosicaoDoBicoTestL() {
		assertEquals(cc.mudarPosicaoDoBico("L", Constantes.NORTE),Constantes.OESTE);
	}
	@Test
	public void mudarPosicaoDoBicoTestR() {
		assertEquals(cc.mudarPosicaoDoBico("R", Constantes.NORTE),Constantes.LESTE);
		assertNotSame(cc.mudarPosicaoDoBico("R", Constantes.NORTE),Constantes.SUL);
	}
	@Test
	public void execCommandTest() {
		Position pos = new Position(10, 10, 10, Constantes.OESTE);
		assertEquals(cc.execCommand(pos), "10 10 10 OESTE");
	}
}
