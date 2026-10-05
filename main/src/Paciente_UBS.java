public class Paciente_UBS {

    private Long cpf;
    private String nomeCompleto;
    private String cartaoSus;
    private tipos_atendimento atendimento;
    private int idade;

    public Paciente_UBS(Long cpf, String nomeCompleto, int idade, String cartaoSus, tipos_atendimento atendimento) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.cartaoSus = cartaoSus;
        this.atendimento = atendimento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public tipos_atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(tipos_atendimento atendimento) {
        this.atendimento = atendimento;
    }

}
