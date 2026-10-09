package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class TaskUtil {
    public static void a(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.D1()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(ApiExceptionUtil.a(status));
        }
    }

    public static boolean b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        return status.D1() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(ApiExceptionUtil.a(status));
    }
}
