public class main {
    public static void main(String[] args) {
        UBS ubs = new UBS();

        ubs.cadastrarAtendimentoDia(11111111111L, "Maria Oliveira Souza", "898004561237890", tipos_atendimento.CONSULTA, 45);
        ubs.cadastrarAtendimentoDia(22222222222L, "Juliana Martins Alves", "898001234567890", tipos_atendimento.TRIAGEM, 78);
        ubs.cadastrarAtendimentoDia(33333333333L, "Ana Beatriz Lima", "898002587413690", tipos_atendimento.VACINACAO, 5);
        ubs.cadastrarAtendimentoDia(44444444444L, "Pedro Henrique Souza", "898006543219870", tipos_atendimento.CONSULTA, 62);
        ubs.cadastrarAtendimentoDia(55555555555L, "Carlos Eduardo Santos", "898007894561230", tipos_atendimento.TRIAGEM, 57);

        System.out.println("\nProximo paciente:");
        System.out.println(ubs.quemEhOProximo().getNomeCompleto());

        while (!ubs.estaVazio()) {
            Paciente_UBS p = ubs.removerPacientePrioritario();
            System.out.println("\nAtendido: " + p.getNomeCompleto() + " (" + p.getIdade() + " anos)");
        }
    }
}
