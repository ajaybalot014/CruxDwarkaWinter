package Lecture13;

import Lecture12.StackUsingArrays;

public class DynamicStack  extends StackUsingArrays{
 
	public DynamicStack()throws Exception {
		// TODO Auto-generated constructor stub
		this(DEFAULT_CAPACITY);
	}
	
	public DynamicStack(int capacity) throws Exception {
		super(capacity);
	}
	
	public void push(int element) throws Exception {
		if(this.data.length==this.size()) {
			int[] arr=new int[2*this.data.length];
			for(int i=0;i<this.data.length;i++) {
				arr[i]=this.data[i];
			}
			this.data=arr;
		}
		super.push(element);
	}
}
