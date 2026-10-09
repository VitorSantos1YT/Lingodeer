package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzy extends zzj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9583a;

    public zzy(TaskCompletionSource taskCompletionSource) {
        this.f9583a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzk
    public final void S0(Status status, Bundle bundle) {
        zzab.c(status, bundle, this.f9583a);
    }
}
