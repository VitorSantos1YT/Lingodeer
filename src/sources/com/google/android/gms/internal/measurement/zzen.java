package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzen extends zzeo {
    public final /* synthetic */ boolean H;
    public final /* synthetic */ zzez K;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11558f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f11559t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzez zzezVar, String str, String str2, Bundle bundle, boolean z11) {
        super(zzezVar, true);
        this.f11557e = str;
        this.f11558f = str2;
        this.f11559t = bundle;
        this.H = z11;
        this.K = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        long j11 = this.f11560a;
        long j12 = this.f11561b;
        zzcp zzcpVar = this.K.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.logEventWithElapsedTime(this.f11557e, this.f11558f, this.f11559t, this.H, true, j11, j12);
    }
}
