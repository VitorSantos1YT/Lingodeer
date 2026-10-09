package com.google.android.gms.internal.fido;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzbb extends zzbc {
    @Override // com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = n().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // com.google.android.gms.internal.fido.zzbc, java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzbx.a(n().entrySet());
    }

    @Override // com.google.android.gms.internal.fido.zzbc
    public final boolean j() {
        return false;
    }

    public abstract zzbg n();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return n().f9658c.size();
    }
}
