package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PendingResultUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zav f8944a = new zar();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ResultConverter<R extends Result, T> {
    }

    public static Task a(BasePendingResult basePendingResult) {
        zau zauVar = new zau();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResult.c(new zas(basePendingResult, taskCompletionSource, zauVar, f8944a));
        return taskCompletionSource.getTask();
    }
}
