package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zziv implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f13170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjd f13171c;

    public zziv(zzjd zzjdVar, zzr zzrVar, Bundle bundle) {
        this.f13169a = zzrVar;
        this.f13170b = bundle;
        Objects.requireNonNull(zzjdVar);
        this.f13171c = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        zzjd zzjdVar = this.f13171c;
        zzjdVar.f13199a.W();
        return zzjdVar.f13199a.e0(this.f13170b, this.f13169a);
    }
}
