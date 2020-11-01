import static javax.swing.JOptionPane.*;
class OppgaveoversiktClient{
	public static void main(String[]args){
		String navn = showInputDialog("Navn:");
		int antOppgGjort = Integer.parseInt(showInputDialog("Antall oppgaver:"));

		Student ole = new Student(navn, antOppgGjort);
		Oppgaveoversikt studentene = new Oppgaveoversikt(ole);

		System.out.println("Antall studenter: " + studentene.getAntStud());

		System.out.println("Antall oppgaver gjort av studenten: " + studentene.getAntOppgStud(0));


		boolean fortsett = true;
		while(fortsett != false){
			String[] ALTERNATIVER = {"Legge tl ny student", "Øk poeng", "Cancel"};
			int valg = showOptionDialog(null, "Valg:", "Valg", DEFAULT_OPTION, PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);

			switch(valg){
			case 0:
				String navn1 = showInputDialog("Navn:");
				int antOppgGjort1 = Integer.parseInt(showInputDialog("Antall oppgaver:"));
				studentene.registrerStud(navn1, antOppgGjort1);
				break;
			case 1:
				int nr = Integer.parseInt(showInputDialog("Student nr:"));
				nr--;
				studentene.økAntOppgStud(nr);
				break;
			case 2:
				fortsett = false;

			}
			System.out.println(studentene.toString());
		}
	}
}
