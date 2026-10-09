package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f13543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13544b;

    public zzog(Clock clock) {
        Preconditions.g(clock);
        this.f13543a = clock;
    }
}
