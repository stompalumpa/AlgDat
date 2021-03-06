package org.pg4200.exercise.ex01;

import org.pg4200.datastructure.delete.DeleteContainer;
import org.pg4200.datastructure.delete.DeleteContainerTestTemplate;

import static org.junit.Assert.*;

/**
 * Created by arcuri82 on 15-Aug-17.
 */
public class MyArrayListTest extends DeleteContainerTestTemplate{

    @Override
    protected <T> DeleteContainer<T> getNewInstance(Class<T> klass) {
        return new MyArrayList<>(1);
    }
}