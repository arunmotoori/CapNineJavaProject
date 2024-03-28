package otherpackageone;

import protectedaccessmodifierdemo.ClassJ;

public class SampleFour extends ClassJ {

	public static void main(String[] args) {
		
		ClassJ cj = new ClassJ();
		//System.out.println(cj.a);
		//cj.sampleA();
		SampleFour sf = new SampleFour();
		sf.sFour();
	}
	
	public void sFour() {
		
		System.out.println(a);
		sampleA();
	}

}
