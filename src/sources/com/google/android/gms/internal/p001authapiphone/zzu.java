package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzu extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9382a;

    public zzu(TaskCompletionSource taskCompletionSource) {
        this.f9382a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void W(Status status) {
        int i11 = status.f8706a;
        TaskCompletionSource taskCompletionSource = this.f9382a;
        if (i11 == 6) {
            taskCompletionSource.trySetException(ApiExceptionUtil.a(status));
        } else {
            TaskUtil.a(status, null, taskCompletionSource);
        }
    }
}
