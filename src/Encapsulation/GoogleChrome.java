package Encapsulation;

public class GoogleChrome {
	
	public void launchChrome() {
		System.out.println("checking google chrome");
		
		checkBrowserVersion();
		checkOSCompatibility();
		checkWindowsRAM();
		checkChromeUpdates();
		
		System.out.println(" google chrome launched");
	}
	
	
	private void checkOSCompatibility() {
		System.out.println("checkOSCompatibility");
	}
	
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}
	
	private void checkWindowsRAM() {
		System.out.println("checkWindowsRAM");
	}
	
	
	private void checkChromeUpdates() {
		System.out.println("checkChromeUpdates");
	}

}
