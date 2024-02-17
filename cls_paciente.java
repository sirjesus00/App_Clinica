public class cls_paciente {
    private int codigoInt;
    private String nombreStr;
    private int contactoInt;
    private String epsStr;

    public cls_paciente(int codigoInt, String nombreStr, int contactoInt, String epsStr) {
        this.codigoInt = codigoInt;
        this.nombreStr = nombreStr;
        this.contactoInt = contactoInt;
        this.epsStr = epsStr;
    }

    public int getCodigoInt() {
        return codigoInt;
    }

    public void setCodigoInt(int codigoInt) {
        this.codigoInt = codigoInt;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public int getContactoInt() {
        return contactoInt;
    }

    public void setContactoInt(int contactoInt) {
        this.contactoInt = contactoInt;
    }

    public String getEpsStr() {
        return epsStr;
    }

    public void setEpsStr(String epsStr) {
        this.epsStr = epsStr;
    }
    
    
    
}
