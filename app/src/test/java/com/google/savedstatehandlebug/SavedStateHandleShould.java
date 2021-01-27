package com.google.savedstatehandlebug;

import androidx.annotation.NonNull;
import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.SavedStateHandle;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SavedStateHandleShould {

    @NonNull @Rule public InstantTaskExecutorRule rule = new InstantTaskExecutorRule();

    private final SavedStateHandle target = new SavedStateHandle();

    @Test
    public void getAfterGetLiveDataWithDefault() {
        String defaultValue = "defaultValue";
        String key = "key";
        target.getLiveData(key, defaultValue);

        assertThat(target.get(key), is(defaultValue));
    }

}
