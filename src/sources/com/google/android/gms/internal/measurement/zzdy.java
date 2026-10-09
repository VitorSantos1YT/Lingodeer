package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdy extends zzeo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzcm f11539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzez f11540f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(zzez zzezVar, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f11539e = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.f11540f = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.f11540f.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.getCurrentScreenClass(this.f11539e);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void b() {
        this.f11539e.A0(null);
    }
}
