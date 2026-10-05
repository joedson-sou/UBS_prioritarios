public class UBS {

    private Paciente_UBS[] heap;
    private int tamanho;

    public UBS() {
        this(20);
    }

    public UBS(int capacidadeInicial) {
        this.heap = new Paciente_UBS[capacidadeInicial];
        this.tamanho = 0;
    }
    //*******************************************************
    // INSERÇÃO: cadastrar_atendimento_dia
    //*******************************************************

    public void cadastrarAtendimentoDia(Long cpf, String nome, String cartaoSus, tipos_atendimento atendimento, int idade){

        Paciente_UBS pacineteNovo = new Paciente_UBS(cpf, nome, idade, cartaoSus, atendimento);

        if (tamanho == heap.length) {
            redimensionar();
        }

        heap[tamanho] = pacineteNovo;
        subir(tamanho);
        tamanho++;

        imprimirPaciente(pacineteNovo);
    }

    //*******************************************************
    // REMOÇÃO: remover_paciente_prioritario
    //*******************************************************

    public Paciente_UBS removerPacientePrioritario(){

        if (estaVazio()){
            return null;
        }

        Paciente_UBS PacientePrioritario = heap[0];

        tamanho--;
        heap[0] = heap[tamanho];
        heap[tamanho] = null;
        if (tamanho > 0) {
            descer(0);
        }
        return PacientePrioritario;
    }

    //*******************************************************
    // CONSULTA À RAIZ: quem_eh_o_proximo
    //*******************************************************

    public Paciente_UBS quemEhOProximo(){
        if (estaVazio()){
            return null;
        }
        return heap[0];
    }



    public boolean estaVazio() {
        return tamanho == 0;
    }

    private void descer(int i) {
        while (true) {
            int esq = 2 * i + 1;
            int dir = 2 * i + 2;
            int maior = i;

            if (esq < tamanho && heap[esq].getIdade() > heap[maior].getIdade()) {
                maior = esq;
            }
            if (dir < tamanho && heap[dir].getIdade() > heap[maior].getIdade()) {
                maior = dir;
            }

            if (maior == i) {
                break;
            }
            trocar(i, maior);
            i = maior;
        }
    }

    private void subir(int i) {
        while (i > 0) {
            int pai = (i - 1) / 2;
            if (heap[i].getIdade() > heap[pai].getIdade()) {
                trocar(i, pai);
                i = pai;
            } else {
                break;
            }
        }
    }

    private void trocar(int a, int b) {
        Paciente_UBS temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    private void redimensionar() {
        Paciente_UBS[] novo = new Paciente_UBS[heap.length * 2];
        System.arraycopy(heap, 0, novo, 0, tamanho);
        heap = novo;
    }

    private void imprimirPaciente(Paciente_UBS p) {
        System.out.println("Paciente cadastrado com sucesso!");
        System.out.println("Nome: " + p.getNomeCompleto());
        System.out.println("Idade: " + p.getIdade() + " anos");
        System.out.println("CPF: " + p.getCpf());
        System.out.println("Tipo de atendimento: " + p.getAtendimento().getDescricao());
        System.out.println("-----------------------------");
    }

}
