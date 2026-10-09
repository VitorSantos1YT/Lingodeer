package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzv extends com.google.android.gms.internal.fido.zzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9327a;

    public zzv(TaskCompletionSource taskCompletionSource) {
        this.f9327a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzg
    public final void L(ArrayList arrayList) {
        this.f9327a.setResult(arrayList);
    }

    @Override // com.google.android.gms.internal.fido.zzg
    public final void k(Status status) {
        this.f9327a.trySetException(new ApiException(status));
    }
}
