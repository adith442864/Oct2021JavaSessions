package AbstractConcept;

public class ApplicationTesting {

	public static void main(String[] args) {
		
		WhatsApp wt = new WhatsApp();
		wt.dbSetup();
		wt.envSetup();
		wt.serverSetup();
		
		wt.UILayerComponents();

	}

}
