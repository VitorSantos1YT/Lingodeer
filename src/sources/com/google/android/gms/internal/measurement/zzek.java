package com.google.android.gms.internal.measurement;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzek extends zzeo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Intent f11553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzez f11554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzek(zzez zzezVar, Intent intent) {
        super(zzezVar, true);
        this.f11553e = intent;
        Objects.requireNonNull(zzezVar);
        this.f11554f = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.f11554f.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.setSgtmDebugInfo(this.f11553e);
    }
}
