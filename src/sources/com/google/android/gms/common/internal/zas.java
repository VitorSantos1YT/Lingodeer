package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zas implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PendingResult f8986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PendingResultUtil.ResultConverter f8988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zav f8989d;

    public zas(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, zav zavVar) {
        this.f8986a = pendingResult;
        this.f8987b = taskCompletionSource;
        this.f8988c = resultConverter;
        this.f8989d = zavVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void a(Status status) {
        boolean zD1 = status.D1();
        TaskCompletionSource taskCompletionSource = this.f8987b;
        if (!zD1) {
            taskCompletionSource.setException(ApiExceptionUtil.a(status));
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f8986a.b();
        taskCompletionSource.setResult(null);
    }
}
