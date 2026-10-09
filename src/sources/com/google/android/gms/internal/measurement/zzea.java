package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzea extends zzeo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Exception f11545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzez f11546f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzez zzezVar, Exception exc) {
        super(zzezVar, false);
        this.f11545e = exc;
        this.f11546f = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.f11546f.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.logHealthData(5, "Error with data collection. Data lost.", new ObjectWrapper(this.f11545e), new ObjectWrapper(null), new ObjectWrapper(null));
    }
}
