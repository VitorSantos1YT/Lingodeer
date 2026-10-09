package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdh extends zzeo {
    public final /* synthetic */ zzez H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11511f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f11512t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzez zzezVar, String str, String str2, Bundle bundle) {
        super(zzezVar, true);
        this.f11510e = str;
        this.f11511f = str2;
        this.f11512t = bundle;
        Objects.requireNonNull(zzezVar);
        this.H = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.H.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.clearConditionalUserProperty(this.f11510e, this.f11511f, this.f11512t);
    }
}
