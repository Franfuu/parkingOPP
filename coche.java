public class coche {
    private String matricula;
    private String marca;
    private int nPuertas;
    private boolean eco;

    public coche(String matricula,String marca,int nPuertas,boolean eco){
        this.matricula = matricula;
        this.marca = marca;
        this.nPuertas = nPuertas;
        this.eco = eco;
    }
    public coche(){
        this("","",0,false);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public boolean isEco() {
        return eco;
    }

    public void setEco(boolean eco) {
        this.eco = eco;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", nPuertas=" + nPuertas +
                ", eco=" + eco +
                '}';
    }
}