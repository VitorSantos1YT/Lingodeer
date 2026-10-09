package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdq extends zzeo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzez f11525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdq(zzez zzezVar, String str) {
        super(zzezVar, true);
        this.f11524e = str;
        Objects.requireNonNull(zzezVar);
        this.f11525f = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.f11525f.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.beginAdUnitExposure(this.f11524e, this.f11561b);
    }
}
