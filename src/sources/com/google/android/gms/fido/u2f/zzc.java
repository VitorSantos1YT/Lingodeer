package com.google.android.gms.fido.u2f;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.fido.zzt;
import com.google.android.gms.internal.fido.zzu;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzc extends zzu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9365a;

    public zzc(TaskCompletionSource taskCompletionSource) {
        this.f9365a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzv
    public final void a(Status status, PendingIntent pendingIntent) {
        TaskUtil.a(status, new zzt(), this.f9365a);
    }
}
