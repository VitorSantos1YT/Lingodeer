package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzu extends com.google.android.gms.internal.fido.zzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9326a;

    public zzu(TaskCompletionSource taskCompletionSource) {
        this.f9326a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void b0(boolean z11) {
        this.f9326a.setResult(Boolean.valueOf(z11));
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void k(Status status) {
        this.f9326a.trySetException(new ApiException(status));
    }
}
