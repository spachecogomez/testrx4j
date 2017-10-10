package com.test;

import io.reactivex.Observer;
import io.reactivex.functions.Action;
import io.reactivex.internal.operators.observable.ObservableScan;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.observers.DisposableObserver;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by sebastianpacheco on 9/10/17.
 */
public class Main {

    public static void main(String []args){
        Topic topic = new Topic();
        topic.getObservable().subscribe( x -> System.out.println("->"+x));


    }

}
