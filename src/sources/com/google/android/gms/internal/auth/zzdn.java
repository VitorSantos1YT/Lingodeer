package com.google.android.gms.internal.auth;

import ep.a;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzdn implements Serializable, zzdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9469a;

    public zzdn(Object obj) {
        this.f9469a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdn)) {
            return false;
        }
        Object obj2 = ((zzdn) obj).f9469a;
        Object obj3 = this.f9469a;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9469a});
    }

    public final String toString() {
        return a.g("Suppliers.ofInstance(", this.f9469a.toString(), ")");
    }
}
