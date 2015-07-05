package com.muzammilpeer.valuware.api;

/**
 * Created by muzammilpeer on 05/07/15.
 */

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class MyApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();
        // register resources and features
        classes.add(MultiPartFeature.class);
        classes.add(MultiPartResource.class);
        classes.add(HelloWorldService.class);
        classes.add(UploadFileService.class);
        classes.add(LoggingFilter.class);
        return classes;
    }
}