package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaej implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map.Entry f11278a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11278a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzael zzaelVar = (zzael) this.f11278a.getValue();
        if (zzaelVar == null) {
            return null;
        }
        zzaelVar.c(null);
        return zzaelVar.f11280a;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzafc)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        zzael zzaelVar = (zzael) this.f11278a.getValue();
        zzafc zzafcVar = zzaelVar.f11280a;
        zzaelVar.f11281b = null;
        zzaelVar.f11280a = (zzafc) obj;
        return zzafcVar;
    }
}
