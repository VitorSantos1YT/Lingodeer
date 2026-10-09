package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfs implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map.Entry f12385a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12385a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzfv) this.f12385a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzgl)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        zzfv zzfvVar = (zzfv) this.f12385a.getValue();
        zzgl zzglVar = zzfvVar.f12387a;
        zzfvVar.f12388b = null;
        zzfvVar.f12387a = (zzgl) obj;
        return zzglVar;
    }
}
