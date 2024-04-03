package challengeEight;

import java.util.TreeSet;

public class NumAvg {
	
	private TreeSet<Integer> numSet;

	public TreeSet<Integer> getNumSet() {
		return numSet;
	}

	public void setNumSet(TreeSet<Integer> numSet) {
		this.numSet = numSet;
	}
	
	public void addNum(int num) {
		if(numSet==null) {
		  setNumSet(new TreeSet<>());
		}
		if(!(num%5==0 || num%6==0)) {
			numSet = getNumSet();
			numSet.add(num);
		}
	}
	
	public double calAvg() {
		
		if(numSet==null) {
			setNumSet(new TreeSet<>());
		}
		TreeSet<Integer> nSet = getNumSet();
		if(!nSet.isEmpty()) {
			int size = nSet.size();
			int n=0;
			for(Integer i : nSet) {
				n = n + i;
			}
			return (double)n/size;
		}else {
			return 0.0;
		}
	}
	

}
