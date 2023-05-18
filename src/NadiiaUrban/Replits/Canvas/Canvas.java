package NadiiaUrban.Replits.Canvas;

import java.util.ArrayList;
public class Canvas {

// Finish the Canvas class

    String topic;
    ArrayList <Quiz> quizzes;
    ArrayList<Module> modules;



    public Canvas (String topic){
        this.topic = topic;
        quizzes = new ArrayList<>();
        modules  = new ArrayList<>();
    }

    public Canvas (String topic, ArrayList <Quiz> quizzes ,ArrayList<Module> modules ){
        this(topic);
        this.quizzes.addAll(quizzes);
        this.modules.addAll(modules);
    }

    public String toString(){

        return  topic +" course"+ "\nQuizzes: "+"\n"+quizzes+"\nModules: "+"\n"+modules;



    }
}