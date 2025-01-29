package je08_javabeans;

public class Objetos {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Jr");
        felipe.setIdade(151);

        System.out.println(felipe.getNome());

    }
}
