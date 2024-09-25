public class Main {
    public static void main(String[] args) {
//Aluno presencial.
        double[] notasPresenciais = {9.0, 7.5, 10.0, 9.0}; 
        Aluno aluno1 = new Aluno("Lucas Yoshida", "248200", notasPresenciais, 80); 
        aluno1.Aluno();
        
        System.out.println();
        
        double[] notasPresenciais2 = {10.0, 9.5, 10.0, 8.0}; 
        Aluno aluno2 = new Aluno("Iralfredo Santos", "654321", notasPresenciais, 30); 
        aluno2.Aluno();
        
        System.out.println();

//Aluno EAD.
        double[] notasEAD = {7.0, 8.5, 10.0}; 
        Aluno aluno3 = new Aluno("Irineu da Silva", "123456", notasEAD); 
        aluno3.Aluno();
    }
}