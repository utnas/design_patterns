package com.training.architecture.src.clean_code.srp.editor;

import com.training.architecture.src.clean_code.srp.Image;

public interface Editor<T> {
    public Image increase(final T subject, final int value);

    public Image decrease(final T subject, final int value);
}
