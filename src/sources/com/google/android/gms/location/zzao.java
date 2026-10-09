package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class zzao extends com.google.android.gms.internal.location.zzah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f12562a;

    public zzao(TaskCompletionSource taskCompletionSource) {
        this.f12562a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void b1(com.google.android.gms.internal.location.zzaa zzaaVar) {
        TaskUtil.a(zzaaVar.f11067a, null, this.f12562a);
    }

    public void zzc() {
    }
}
