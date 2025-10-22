package edu.sdsu.cs160l.university.lab5.course;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.sdsu.cs160l.university.lab5.course.Course;
//TODO make this singleton (DONE)
public class CS210 implements Course {
    private static CS210 instance;

    private CS210() {
    }

    public static CS210 getInstance()
    {
        if(instance == null)
        {
            instance = new CS210();
        }

        return instance;
    }

    @Override
    public String courseName() {
        return "CS210";
    }

    @Override
    public List<String> courseDescription() {
        return Arrays.asList("Software Programming","0 cost course");
    }

    @Override
    public Set<String> prerequisites() {
        return new HashSet<>(Arrays.asList("CS160","CS205"));
    }
}
