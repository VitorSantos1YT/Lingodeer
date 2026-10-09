package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzew extends zzeo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f11576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzcm f11577f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzey f11578t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(zzey zzeyVar, Activity activity, zzcm zzcmVar) {
        super(zzeyVar.f11581a, true);
        this.f11576e = activity;
        this.f11577f = zzcmVar;
        this.f11578t = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.f11578t.f11581a.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.onActivitySaveInstanceStateByScionActivityInfo(zzdd.D1(this.f11576e), this.f11577f, this.f11561b);
    }
}
