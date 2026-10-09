package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdg extends zzeo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f11508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzez f11509f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzez zzezVar, Bundle bundle) {
        super(zzezVar, true);
        this.f11508e = bundle;
        Objects.requireNonNull(zzezVar);
        this.f11509f = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.f11509f.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.setConditionalUserProperty(this.f11508e, this.f11560a);
    }
}
