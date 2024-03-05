public class Main {
    public static void main(String[] args) {
       String s[][] = { { "Bobby" }, { "87", "83", "88", "85" }, 
						 { "Charles" }, { "100", "94", "92", "90" },
						 { "David" }, { "56", "58", "54", "59" } };

		for (int i = 1; i < s.length; i += 2) {
			String name = s[i - 1][0];
			double sum = 0;
			for (String score : s[i]) {
				sum += Double.parseDouble(score);
			}
double avg = sum / 4;
			Character grade;
			if(avg>90) {
				grade='A';
			}
			else if(avg<=90 && avg>=80) {
				grade = 'B';
			}
			else {
				grade = 'C';
			}
			System.out.println("Average score of " + name + ": " + grade);
		}
	}
}
