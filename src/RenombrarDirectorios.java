import java.io.File;
public class RenombrarDirectorios {
    public void renombrarDirectorios(String path) {
        File directorio = new File(path);
        if(!directorio.exists() || !directorio.isDirectory()){
            System.out.println("La ruta path no es un directorio valido");
            return;
        }
        System.out.println("La ruta path es valida");
        renombrarDirectoriosInternos(directorio);
    }

    public void renombrarDirectoriosInternos(File directorio){
        //Listar todos los archivos y/o archetas hijas
        File[] directoriosArchivosInternos = directorio.listFiles();
        if(directoriosArchivosInternos == null){
            return;
        }
        for(File directorioArchivo :directoriosArchivosInternos){
            if(directorioArchivo.isDirectory()){
                String nombreOriginal = directorioArchivo.getName();
                String nuevoNombre = "Nuevo_" + nombreOriginal;

                File nuevoDirectorio = new File(directorioArchivo.getParent(), nuevoNombre);
                
            }
        }

    }
}