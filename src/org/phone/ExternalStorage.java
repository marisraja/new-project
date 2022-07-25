package org.phone;

public class ExternalStorage {
		private void size() {
		System.out.println("size:16gb");
		}
			private void InternalStorage() {
				System.out.println("ProcessorName:snap");
				System.out.println("ramsize:4gb");
				
			}
public static void main(String[] args) {
	ExternalStorage e=new ExternalStorage();
	e.size();
	e.InternalStorage();
	
}
}
