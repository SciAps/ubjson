package com.devsmart.ubjson;


public final class UBNull extends UBValue {

    @Override
    public Type getType() {
        return Type.Null;
    }

    @Override
    public String toString() {
        return "null";
    }
}
