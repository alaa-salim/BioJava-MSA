import java.util.*; 

import org.biojava.nbio.alignment.Alignments;
import org.biojava.nbio.core.sequence.MultipleSequenceAlignment;
import org.biojava.nbio.core.sequence.ProteinSequence;
import org.biojava.nbio.core.sequence.template.Sequence;

public class MSA extends MultipleSequenceAlignment
{
	private MultipleSequenceAlignment msa;
	private String[] sequences;
	private int count;
	private List<Sequence> seqn;

	public MSA(String[] a, int count) 
	{
		this.seqn = new ArrayList();
		this.sequences = a;
		this.count = count;
	}

	public MSA() {
		// TODO Auto-generated constructor stub
	}

	public String[] getSequences() {
		return sequences;
	}

	public int getCount() {
		return count;
	}

	public List<Sequence> alignSequence() throws Exception 
	{
		List<Sequence> list = new ArrayList();
		try
		{
			msa = new MultipleSequenceAlignment();

			Sequence<?> protein1 = new ProteinSequence(sequences[0]);
			Sequence<?> protein2 = new ProteinSequence(sequences[1]);
			Sequence<?> protein3 = new ProteinSequence(sequences[2]);
			Sequence<?> protein4 = new ProteinSequence(sequences[3]);
			Sequence<?> protein5 = new ProteinSequence(sequences[4]);

			seqn.add(protein1);
			seqn.add(protein2);
			seqn.add(protein3);
			seqn.add(protein4);
			seqn.add(protein5);

			//Profile s = (align.getMultipleSequenceAlignment(seqn, null));

			msa.addAlignedSequence(protein1);
			msa.addAlignedSequence(protein2);
			msa.addAlignedSequence(protein3);
			msa.addAlignedSequence(protein4);
			msa.addAlignedSequence(protein5);

			Alignments.getMultipleSequenceAlignment(seqn, 0);

			for (int i = 1; i <= count; i++) 
			{  
				list.add(msa.getAlignedSequence(i));
				System.out.println("Sequence " + i + ": " + msa.getAlignedSequence(i) + "\n");
			} 	    

//			System.out.println("check1");
//			DistanceMatrix distMatrix = DistanceMatrixCalculator.fractionalDissimilarity(msa);
//			//				DistanceMatrix distMatrix = new DistanceMatrix();
//			//						DistanceMatrixCalculator.fractionalDissimilarity(msa);
//			System.out.println("check2");
//			//matrix = matrix.fractionalDissimilarity(msa);
//			System.out.println(distMatrix);
//			System.out.println("check3");
		}
		catch(Exception e)
		{
			e.toString();
		}

		return list;
	}

//	public DistanceMatrix matrix() throws Exception
//	{
//		@SuppressWarnings("unchecked")
//		DistanceMatrix distMatrix = DistanceMatrixCalculator.fractionalDissimilarity(msa);
//		//matrix = matrix.fractionalDissimilarity(msa);
//		System.out.println(distMatrix);
//		return distMatrix;
//
//	}
}


