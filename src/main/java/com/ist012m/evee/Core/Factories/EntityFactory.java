package com.ist012m.evee.Core.Factories;

import java.util.*;

public interface EntityFactory<E, T> {
    E create(T response);

    void delete(E entity);
}
