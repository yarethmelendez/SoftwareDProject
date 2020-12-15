package systemEvaluation;

public class EvidenceCalc {
	EvidenceCalc(int score){
		if (score >= 3 || score > 2)
			score = 3;
		else if (score == 2 || score > 1)
			score = 2;
		else if (score == 1 || score > 0)
			score = 1;
		else
			score = 0;
	}
}
