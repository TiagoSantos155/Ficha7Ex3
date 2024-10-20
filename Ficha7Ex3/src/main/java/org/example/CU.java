package org.example;
import java.util.ArrayList;

public class CU {
    private String nameCU;
    private ArrayList<Mark> marks;
    private int totalStudents;

    // Construtor
    public CU(String nameCU, int totalStudents) {
        this.nameCU = nameCU;
        this.totalStudents = totalStudents;
        this.marks = new ArrayList<>(totalStudents);
    }

    // Método para inserir a nota de um aluno
    public boolean insertMarkCU(int numStudent, double mark) {
        if (marks.size() < totalStudents) {
            marks.add(new Mark(numStudent, mark));
            return true; // Nota inserida com sucesso
        }
        return false; // Não é possível inserir mais notas
    }

    // Método para buscar a nota de um aluno
    public double searchStudent(int numStudent) {
        for (Mark m : marks) {
            if (m.getNumStudent() == numStudent) {
                return m.getMark(); // Retorna a nota do aluno
            }
        }
        return -1; // Aluno não encontrado
    }

    // Método para calcular a média da UC
    public double averageCU() {
        if (marks.isEmpty()) {
            return 0; // Evitar divisão por zero
        }
        double totalMarks = 0;
        for (Mark m : marks) {
            totalMarks += m.getMark();
        }
        return totalMarks / marks.size();
    }

    // Método para verificar se o aluno foi aprovado
    public boolean isApproved(int numStudent) {
        double mark = searchStudent(numStudent);
        return mark >= 9.5; // Retorna true se aprovado, false caso contrário
    }

    // Método para obter o nome da UC
    public String getNameCU() {
        return nameCU;
    }
}

