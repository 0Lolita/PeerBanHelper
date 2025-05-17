package com.ghostchu.peerbanhelper.common.util;

import java.util.function.Supplier;

public final class LazyLoad<T> {
    private Supplier<T> loader;
    private T content;

    public LazyLoad(Supplier<T> loader) {
        this.loader = loader;
    }

    public T get() {
        if (loader == null) {
            return content;
        }
        this.content = loader.get();
        this.loader = null;
        return content;
    }

    @Override
    public String toString() {
        return get().toString();
    }
}
