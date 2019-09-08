public class Perros extends ColegioPerros {

   
    private static int contadorPerro = 0; // codigo del perro
    private static String diasSemana[] = new String[8]; 
        // 1=lunes, 2=martes, 3=miercoles, 4=jueves, 5=viernes, 6=sabado, 7=domingo.
    private static String listaLocalidad[] = new String[5]; // 1=Engativa, 2=Suba, 3=Usaquen y 4=Chapinero.
    private int idPerro; // identificacion del perro
    
    private String nombre; // nombre del perro
    private String raza; // Se le puede colocar cualquiera, de preferencia dos opciones, raza y criollo
    private double localidad; // Solo cuatro: 1=Engativa, 2=Suba, 3=Usaquen y 4=Chapinero.
    private double diaAsiste; // numero de 1 a 7 respecto a los dias de la semana
    // 1=lunes, 2=martes, 3=miercoles, 4=jueves, 5=viernes, 6=sabado, 7=domingo.
    private double cedulaDueño; // numero de identificacion del dueÃ±o del perro
    private String nombreDueño; // nombre del cliente
    private String telefono; // numero de contacto del cliente

    
    public Perros() {
        contadorPerro++;
        idPerro = contadorPerro;
        if (diasSemana[0] == null) {
            inicializarDias(); 
        }
        if (listaLocalidad[0] == null) {
            inicializarLocalidad(); 
        }
    }

    
    public Perros(String nombreParametroLlegada, String razaParametroLlegada, double localidadParametroLlegada, 
            double diaAsisteParametroLlegada, double cedulaDueñoParametroLlegada, String nombreDueñoParametroLlegada, String telefonoParametroLlegada) {
                  
        
        
        contadorPerro++;
        idPerro = contadorPerro;
        if (diasSemana[0] == null) {
            inicializarDias(); //metodo de inicializarDias
        }
        if (listaLocalidad[0] == null) {
            inicializarLocalidad(); //metodo de inicializarLocalidad
        }
        //-------------------------------------------------------------------
        
        
        diaAsiste = diaAsisteParametroLlegada;
        localidad = localidadParametroLlegada;
        nombre = nombreParametroLlegada;
        raza = razaParametroLlegada;
        cedulaDueño = cedulaDueñoParametroLlegada;
        nombreDueño = nombreDueñoParametroLlegada;
        telefono = telefonoParametroLlegada;
    }

    public void imprimirPerros(Perros vectorPerros[], int totalPerros) { 
        for (int aux = 0; aux < totalPerros; aux++) { 
            System.out.println("Perro " + (aux + 1) + ": " + vectorPerros[aux].nombre + ",\tlocalidad: " + Perros.listaLocalidad[(int)vectorPerros[aux].localidad] + ",\tAsiste: " + Perros.diasSemana[(int)vectorPerros[aux].diaAsiste] + ""
                    + ",\traza: " + vectorPerros[aux].raza + ",\tDueÃ±o: " + vectorPerros[aux].nombreDueño + ",\ttelefono: " + vectorPerros[aux].telefono + ",\tId dueño: " + vectorPerros[aux].cedulaDueño);
        }
    }

    //Perros por localidad
    public void imprimirPerrosLocalidad(Perros vectorPerros[], int totalPerros) {
        for (int aux2 = 0; aux2 < 4; aux2++) { 
            System.out.println("\nLocalidad: " + Perros.listaLocalidad[(int)vectorPerros[(aux2)].localidad]); 
            for (int aux = 0; aux < totalPerros; aux++) { 
                if ((aux2+1) == vectorPerros[aux].localidad) { 
                    System.out.println("Perro " + (aux + 1) + ": " + vectorPerros[aux].nombre + ",\tAsiste: " + Perros.diasSemana[(int)(vectorPerros[aux].diaAsiste)] + ""
                            + ",\traza: " + vectorPerros[aux].raza + ",\tDueño: " + vectorPerros[aux].nombreDueño + ",\ttelefono: " + vectorPerros[aux].telefono + ",\tId dueño: " + vectorPerros[aux].cedulaDueño);
                }
            }
            
        }

    }

    public static void inicializarDias() {
        Perros.diasSemana[0] = "vacio";
        Perros.diasSemana[1] = "Lunes";
        Perros.diasSemana[2] = "Martes";
        Perros.diasSemana[3] = "Miercoles";
        Perros.diasSemana[4] = "Jueves";
        Perros.diasSemana[5] = "Viernes";
        Perros.diasSemana[6] = "Sabado";
        Perros.diasSemana[7] = "Domingo";
    }

    public static void inicializarLocalidad() {
        Perros.listaLocalidad[0] = "vacio";
        Perros.listaLocalidad[1] = "Engativa";
        Perros.listaLocalidad[2] = "Suba";
        Perros.listaLocalidad[3] = "Usaquen";
        Perros.listaLocalidad[4] = "Chapinero";

    }

    
    
    public int getContadorPerros() { 
        return contadorPerro;
    }
    
    public double getDiaAsiste() { 
        return this.diaAsiste;
    }

    public double getLocalidad() {
        return this.localidad;
    }
    
    public String getNombrePerro() {
        return this.nombre;
    }
    
    public String getRazaPerro() {
        return this.raza;
    }
    
    public String getNombreDueno() {
        return this.nombreDueño;
    }
    
    public String getTelefonoContacto() {
        return this.telefono;
    }
    
    public double getCedulaDueno() {
        return this.cedulaDueño;
    }
    

    
    public void setDiaAsiste(int aux) { 
        this.diaAsiste=aux;
    }

    public void setLocalidad(int aux) { 
        this.localidad =aux;
    }
    
    public void setNombrePerro(String aux) {
        this.nombre=aux;
    }
    
    public void setRazaPerro(String aux) {
        this.raza=aux;
    }
    
    public void setNombreDueno(String aux) {
        this.nombreDueño=aux;
    }
    
    public void setTelefonoContacto(String aux) {
        this.telefono=aux;
    }
    
    public void setCedulaDueno(int aux) {
        this.cedulaDueño=aux;
    }


}
