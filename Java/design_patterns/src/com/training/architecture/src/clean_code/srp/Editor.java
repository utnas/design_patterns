package com.training.architecture.src.clean_code.srp;

public interface Editor<T> {
    public Image increase(final T subject, final int value);

    public Image decrease(final T subject, final int value);
}
