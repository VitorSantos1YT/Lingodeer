package com.alibaba.sdk.android.oss;

import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class TaskCancelException extends Exception {
    public TaskCancelException() {
    }

    public TaskCancelException(String str) {
        super(a.e("[ErrorMessage]: ", str));
    }

    public TaskCancelException(Throwable th2) {
        super(th2);
    }
}
