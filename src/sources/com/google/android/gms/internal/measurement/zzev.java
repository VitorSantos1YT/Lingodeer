package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzev extends zzeo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f11574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzey f11575f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzey zzeyVar, Activity activity) {
        super(zzeyVar.f11581a, true);
        this.f11574e = activity;
        this.f11575f = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.f11575f.f11581a.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.onActivityStoppedByScionActivityInfo(zzdd.D1(this.f11574e), this.f11561b);
    }
}
