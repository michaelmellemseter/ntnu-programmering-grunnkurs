import java.util.*;
class Oppgaveoversikt{
	private Student student;
	private Student[] studenter;
	private int antStud = 0;

	public Oppgaveoversikt(Student student){
		this.studenter = new Student[1];
		this.antStud = studenter.length;
		studenter[0] = student;
	}

	public int getAntStud(){
		return antStud;
	}

	public int getAntOppgStud(int i){
		return studenter[i].getAntOppg();
	}

	public void registrerStud(String navn, int antOppg){
		utvidTabell();
		studenter[antStud] = new Student(navn, antOppg);
		antStud++;
	}
	private void utvidTabell(){
		Student[] nyTab = new Student[studenter.length + 1];
		for(int i = 0; i < studenter.length; i++){
			nyTab[i] = studenter[i];
		}
		studenter = nyTab;
	}

	public void økAntOppgStud(int i){
		Student student1 = studenter[i];
		student1.økAntOppg();
	}

	public String toString(){
		return "Det er " + antStud + " studenter\n" + Arrays.toString(studenter);
	}
}