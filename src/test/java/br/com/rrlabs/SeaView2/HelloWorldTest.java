package br.com.rrlabs.SeaView2;

import static junit.framework.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.rrlabs.SeaView2.Entity.HelloWorld;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

@RunWith(DemoiselleRunner.class)
public class HelloWorldTest {

	@Inject
	private HelloWorld helloWorld;

	@Test
	public void say() {
		assertNotNull(helloWorld);
		helloWorld.say();
	}
}
