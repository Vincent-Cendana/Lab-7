package edu.sdsu.cs160l.university.lab7.exceptions;

import java.util.NoSuchElementException;

//TODO (done?) implement this exception as per the bluePrint in ClassFullException
public class NoSuchCourseException extends NoSuchElementException {
    public NoSuchCourseException(String message)
    {
        super(message);
    }
}
