package org.example;

public class Mark {
    private int numStudent;  // Número do aluno
    private double mark;      // Nota do aluno

    // Construtor
    public Mark(int numStudent, double mark) {
        this.numStudent = numStudent;
        this.mark = mark;
    }

    // Métodos getters
    public int getNumStudent() {
        return numStudent;
    }

    public double getMark() {
        return mark;
    }
}
