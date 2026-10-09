package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zbz extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9421a;

    public zbz(TaskCompletionSource taskCompletionSource) {
        this.f9421a = taskCompletionSource;
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void W(Status status) {
        boolean zD1 = status.D1();
        TaskCompletionSource taskCompletionSource = this.f9421a;
        if (zD1) {
            taskCompletionSource.setResult(null);
        } else {
            taskCompletionSource.setException(ApiExceptionUtil.a(status));
        }
    }
}
