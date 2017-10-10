package com.test;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.subjects.Subject;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Arrays;

/**
 * Created by sebastianpacheco on 9/10/17.
 */
public class Topic{

    public Observable<Integer> getObservable(){
        Observable<Integer> observable = Observable.just(10,20);
        return observable;
    }
}
