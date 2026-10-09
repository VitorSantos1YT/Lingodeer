package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaaq implements zzaai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Level f11149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f11150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzq f11151c;

    private zzaaq() {
        this(Level.ALL, zzaas.f11155f, zzaas.f11156g);
    }

    @Override // com.google.android.gms.internal.measurement.zzaai
    public final zzzf zza(String str) {
        return new zzaas(str, this.f11149a, this.f11150b, this.f11151c);
    }

    public zzaaq(Level level, Set set, zzzq zzzqVar) {
        this.f11149a = level;
        this.f11150b = set;
        this.f11151c = zzzqVar;
    }
}
