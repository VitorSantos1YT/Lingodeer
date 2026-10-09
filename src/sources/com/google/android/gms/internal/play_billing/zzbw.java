package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbw implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient zzbx f12268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient zzbx f12269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient zzbq f12270c;

    public static void b(zzil zzilVar, zzil zzilVar2, zzil zzilVar3) {
        zzbo.a(zzilVar, "com.android.vending.billing.PURCHASES_UPDATED");
        zzbo.a(zzilVar2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        zzbo.a(zzilVar3, "com.android.vending.billing.ALTERNATIVE_BILLING");
        zzcf.e(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", zzilVar, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", zzilVar2, "com.android.vending.billing.ALTERNATIVE_BILLING", zzilVar3}, null);
    }

    public abstract zzbq a();

    public abstract zzbx c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zzbq zzbqVarA = this.f12270c;
        if (zzbqVarA == null) {
            zzbqVarA = a();
            this.f12270c = zzbqVarA;
        }
        return zzbqVarA.contains(obj);
    }

    public abstract zzbx d();

    @Override // java.util.Map
    public final Set entrySet() {
        zzbx zzbxVar = this.f12268a;
        if (zzbxVar != null) {
            return zzbxVar;
        }
        zzbx zzbxVarC = c();
        this.f12268a = zzbxVarC;
        return zzbxVarC;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        zzbx zzbxVarC = this.f12268a;
        if (zzbxVarC == null) {
            zzbxVarC = c();
            this.f12268a = zzbxVarC;
        }
        Iterator it = zzbxVarC.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzbx zzbxVar = this.f12269b;
        if (zzbxVar != null) {
            return zzbxVar;
        }
        zzbx zzbxVarD = d();
        this.f12269b = zzbxVarD;
        return zzbxVarD;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(p.j(size, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z11 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z11 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zzbq zzbqVar = this.f12270c;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        zzbq zzbqVarA = a();
        this.f12270c = zzbqVarA;
        return zzbqVarA;
    }
}
