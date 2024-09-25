//Classe Aluno com atributos todos atributos requisitados na atividade.
public class Aluno {
    private String nome;
    private String ra; 
    private double[] notas; 
    private double presenca; 
    private boolean ead; 

    // Constructor para inicialização dos atributos de alunos presencial.
    public Aluno(String nome, String ra, double[] notas, double presenca) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.presenca = presenca;
        this.ead = false; 
    }

    // Constructor para inicialização dos atributos de alunos EAD.
    public Aluno(String nome, String ra, double[] notas) {
        this(nome, ra, notas, 100); 
        this.ead = true; 
    }

    // Cálculo para notas dos alunos, utilizando condições "if/else" e loop for para armazenar notas.
    public double calcularNotaFinal() {
        double notaFinal = 0;
        int numNotas = notas.length;

        if (numNotas == 1 || numNotas == 2) {
            for (double nota : notas) {
                notaFinal += nota;
            }
            return notaFinal / numNotas;

        } else if (numNotas == 3) {
            notaFinal = (notas[0] + (2 * notas[1]) + (2 * notas[2])) / 5;
            return notaFinal;

        } else if (numNotas == 4) {
            notaFinal = (notas[0] * 0.15) + (notas[1] * 0.30) + (notas[2] * 0.10) + (notas[3] * 0.45);
            return notaFinal;
        }

        return 0; 
    }

    // Verifica se o aluno foi aprovado ou reprovado utilizando condições "if/else".
    public String verificarSituacao() {
        double notaFinal = calcularNotaFinal();
        if (ead) {
            return notaFinal >= 5 ? "Aprovado" : "Reprovado";
        } else {
            return (notaFinal >= 5 && presenca >= 75) ? "Aprovado" : "Reprovado";
        }
    }

    // Exibição da classe Aluno quando puxadas ao main.
    public void Aluno() {
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Nota Final: " + calcularNotaFinal());
        System.out.println("Situação: " + verificarSituacao());
    }
}
