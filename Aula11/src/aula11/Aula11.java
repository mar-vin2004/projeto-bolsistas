package aula11;

public class Aula11 {

    public static void main(String[] args) {
        // Programa Principal
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString()); */
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(22);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("biologia");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
    
}
