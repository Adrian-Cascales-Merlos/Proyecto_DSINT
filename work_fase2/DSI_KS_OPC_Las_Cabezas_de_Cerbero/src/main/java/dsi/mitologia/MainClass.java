package dsi.mitologia;

import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;

public class MainClass {

	public static void main(String[] args) {
		try {
			// Cargamos la base de conocimiento (y la base de hechos)
			KieServices ks = KieServices.Factory.get();
			KieBaseConfiguration kbConf = ks.newKieBaseConfiguration();
			KieSessionConfiguration ksConf = ks.newKieSessionConfiguration();

			KieContainer kContainer = ks.getKieClasspathContainer();

			KieSession kSession = kContainer.newKieSession("DSISesionStateful", ksConf);

			// Aquí insertamos los hechos en la BH
			// Los hechos son objetos (instancias de una clase java)

			// POR EJEMPLO (de prácticas)
			// Person p1 = new Person("Juan", 21, 1.75); // Creamos hecho
			// kSession.insert(p1); // Insertamos hecho

			// Para ejecutar
			// kSession.fireAllRules();

			// Otra forma de ejecutar? (diap. 44)
			// ExecutionResults res = kieSession.execute(...);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
