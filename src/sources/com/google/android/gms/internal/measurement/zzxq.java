package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzxq extends zzxo implements zzxp {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zzxs f12150i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzxq(zzxs zzxsVar, Level level) {
        super(level);
        Objects.requireNonNull(zzxsVar);
        this.f12150i = zzxsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    public final /* synthetic */ zzxs e() {
        return this.f12150i;
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    public final /* bridge */ /* synthetic */ zzyi f() {
        return this;
    }
}
