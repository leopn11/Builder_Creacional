package com.buider;

public interface IBuilder<T> {
    // utilizamos esta interfas con un generico para poder
    // implementar el patron de diseño en cualquier otra clase.

    public T build();
}
