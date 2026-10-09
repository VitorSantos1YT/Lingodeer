package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzed extends zzeo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzcm f11549f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzez f11550t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzez zzezVar, String str, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f11548e = str;
        this.f11549f = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.f11550t = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.f11550t.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.getMaxUserProperties(this.f11548e, this.f11549f);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void b() {
        this.f11549f.A0(null);
    }
}
