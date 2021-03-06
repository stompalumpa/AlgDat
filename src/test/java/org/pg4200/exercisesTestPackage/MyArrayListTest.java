package org.pg4200.exercisesTestPackage;

import org.pg4200.datastructure.delete.DeleteContainer;
import org.pg4200.datastructure.delete.DeleteContainerTestTemplate;
import org.pg4200.exercisePackage.MyArrayList;

/**
 * Created by eirik on 05.09.2017.
 * Deliberately set capacity to a value thats "bound" to cause size issues, and mitigate this issue by doubling the array: New arr*2.
 */
public class MyArrayListTest extends DeleteContainerTestTemplate {
    @Override
    protected <T> DeleteContainer<T> getNewInstance(Class<T> klass) {
        return new MyArrayList<T>(1);
    }
}
