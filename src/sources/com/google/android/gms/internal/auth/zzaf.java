package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaf extends zzah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzag f9427a;

    public zzaf(zzag zzagVar) {
        this.f9427a = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    public final void o0(boolean z11) {
        this.f9427a.a(new zzak(z11 ? Status.f8703e : zzal.f9432a));
    }
}
