import org.biojava.nbio.phylo.Comparison;

public class Identity extends Comparison
{
	private String[] s;
	private int count;
	
	
	public Identity(String[] array, int count)
	{
		this.count = count;
		s = array;
	}

	public void PID()
	{
		int i = count;
		float[] score = new float[5]; 
		
		for(i = 0; i < (count-1); i++)
		{
			score[i] = PID(s[i], s[i+1]);
			System.out.println("Percentage of Identity of Sequence " + (i+1) + " and " + (i+2) + " " + score[i] );
		}
	}
}
