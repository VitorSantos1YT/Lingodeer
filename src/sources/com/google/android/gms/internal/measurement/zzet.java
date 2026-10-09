package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzet extends zzeo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f11570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzey f11571f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(zzey zzeyVar, Activity activity) {
        super(zzeyVar.f11581a, true);
        this.f11570e = activity;
        this.f11571f = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.f11571f.f11581a.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.onActivityResumedByScionActivityInfo(zzdd.D1(this.f11570e), this.f11561b);
    }
}
