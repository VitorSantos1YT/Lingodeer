package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdi extends zzeo {
    public final /* synthetic */ zzez H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11514f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzcm f11515t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(zzez zzezVar, String str, String str2, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f11513e = str;
        this.f11514f = str2;
        this.f11515t = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.H = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.H.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.getConditionalUserProperties(this.f11513e, this.f11514f, this.f11515t);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void b() {
        this.f11515t.A0(null);
    }
}
