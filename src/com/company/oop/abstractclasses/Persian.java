// src/com/company/oop/abstractclasses/Persian.java
package com.company.oop.abstractclasses;

import java.util.Objects;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Persian{name='" + getName() + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persian)) return false;
        Persian persian = (Persian) o;
        return Objects.equals(getName(), persian.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}