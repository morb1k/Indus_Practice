package NadiiaUrban.Replits.Canvas;

import java.util.ArrayList;

public class Module {
    // Finish the Module class
    public String name;
    public ArrayList<File>files;


    public Module(String name){
        this.name = name;
        files = new ArrayList<>();
    }


    public Module(String name, ArrayList<File> files){
        this(name);
        this.files.addAll(files);
    }

    public void addFile(File file){
        files.add(file);
    }

    public void removeFile(File file){
        files.removeIf(  p -> p.name.equals(file.name) && p.size == file.size);
    }


    public String toString(){
        return name +"\nFiles: "+ "\n"+files;
    }

}
