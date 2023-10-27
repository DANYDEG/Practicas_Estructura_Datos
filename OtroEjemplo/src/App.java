public class App {
    public static void main(String[] args){
      Estudiante[] grupo4c = new Estudiante[2];
      Estudiante miguel = new Estudiante();

      miguel.setNombre("Miguel");
      miguel.setCarrera("TIADSM"); 
      miguel.setCuatri(4); 
      miguel.setGrupo('C'); 
      miguel.setPromedio(2.5); 
      grupo4c[0] = miguel;
      
      Estudiante Juan = new Estudiante();
      Juan.setNombre("Juan");
      Juan.setCarrera("TIADSM"); 
      Juan.setCuatri(4); 
      Juan.setGrupo('C'); 
      Juan.setPromedio(7.6); 
      grupo4c[1] = Juan;

      for(Estudiante unEstudiante : grupo4c){
        System.out.println(unEstudiante.getNombre() + " - "+unEstudiante.getPromedio());
      }
      
    }
}
