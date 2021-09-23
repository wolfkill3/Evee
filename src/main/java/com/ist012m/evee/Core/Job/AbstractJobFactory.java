package com.ist012m.evee.Core.Job;

import java.util.*;

import com.ist012m.evee.Core.Factories.EntityFactory;

public abstract class AbstractJobFactory implements EntityFactory<Job, Object> {
    @Override
    public Job create(final Object response) {
        return null;
    }

    @Override
    public void delete(final Job entity) {

    }
}
