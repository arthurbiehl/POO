public class curso extends escola {

    public int cargaHorarioa;

    public int getCargaHorarioa() {
        return cargaHorarioa;
    }

    public void setCargaHorarioa(int cargaHorarioa) {

        this.cargaHorarioa = cargaHorarioa;
        if (cargaHorarioa <= 0) {
            System.out.println("Este curso ainda nao possui hora!");
        } else {
            System.out.println(cargaHorarioa);
        }
    }

    public curso(String nome, String endereco, int cargaHoraria) {
        super(nome, endereco);
        this.cargaHorarioa = cargaHoraria;

    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        if (cargaHorarioa <= 0) {
            System.out.println("Este curso ainda nao possui hora!");
        } else {
            System.out.println("carga Horaria: " + this.cargaHorarioa);
        }
    }

    @Override
    public int calcularMensalidade() {
        return 10;
    }
}
