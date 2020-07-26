public class Main {
	/*
	 * S1: NP_002115.2
	 * S2: NP_001230894.1
	 * S3: NP_072049.2
	 * S4: NP_00134613
	 * S5: NP_00134612
	 */
	
	public static void main(String[] args) throws Exception 
	{
		System.out.println();
		String[] array;
		int count = 0;
		
		File read = new File();
		read.readFile();
		array = read.readFile();
		count = read.getCount();
		
		//BuildMatrix m = new BuildMatrix();
		//m.matrix();

		Identity object = new Identity(array, count);
		object.PID();
		
		System.out.println();
			
			MSA obj = new MSA(array, count);
			obj.alignSequence();
    }
}


