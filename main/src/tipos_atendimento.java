public enum tipos_atendimento {

    TRIAGEM("Triagem"),
    VACINACAO("Vacinaçao"),
    CONSULTA("Consulta Agendada");

    private String descricao;
    tipos_atendimento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
