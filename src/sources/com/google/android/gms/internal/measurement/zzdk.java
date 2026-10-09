package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdk extends zzeo {
    public final /* synthetic */ zzez H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzdd f11518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11519f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f11520t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(zzez zzezVar, zzdd zzddVar, String str, String str2) {
        super(zzezVar, true);
        this.f11518e = zzddVar;
        this.f11519f = str;
        this.f11520t = str2;
        Objects.requireNonNull(zzezVar);
        this.H = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.H.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.setCurrentScreenByScionActivityInfo(this.f11518e, this.f11519f, this.f11520t, this.f11560a);
    }
}
