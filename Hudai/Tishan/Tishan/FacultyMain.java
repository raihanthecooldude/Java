public class FacultyMain
{
	public static void main (String args[])
	{
		FacultyGUI FG = new FacultyGUI ();
		FG.setVisible (true);
		
		ExamDuty ED = new ExamDuty ();
		ED.setVisible(true);
		
		QuizScheduling QS = new QuizScheduling ();
		QS.setVisible (true);
	}
}