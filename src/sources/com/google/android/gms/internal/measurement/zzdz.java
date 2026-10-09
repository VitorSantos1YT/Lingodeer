package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdz extends zzeo {
    public final /* synthetic */ zzcm H;
    public final /* synthetic */ zzez K;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11542f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f11543t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzez zzezVar, String str, String str2, boolean z11, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f11541e = str;
        this.f11542f = str2;
        this.f11543t = z11;
        this.H = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.K = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.K.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.getUserProperties(this.f11541e, this.f11542f, this.f11543t, this.H);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void b() {
        this.H.A0(null);
    }
}
