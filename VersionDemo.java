package co1n2;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Version {
    String author();
    String date();
}

@Version(author = "Varshitha", date = "2025-11-09")
class App {
    @Version(author = "Team", date = "2025-11-09")
    public void display() { System.out.println("Running display method"); }
}

public class VersionDemo {
    public static void main(String[] args) throws Exception {
        Class<App> obj = App.class;

        if (obj.isAnnotationPresent(Version.class)) {
            Version v = obj.getAnnotation(Version.class);
            System.out.println("Class Version -> Author: " + v.author() + ", Date: " + v.date());
        }

        Method m = obj.getMethod("display");
        if (m.isAnnotationPresent(Version.class)) {
            Version v2 = m.getAnnotation(Version.class);
            System.out.println("Method Version -> Author: " + v2.author() + ", Date: " + v2.date());
        }

        new App().display();
    }
}

