package com.google.firebase.database.core.utilities;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Pair<T, U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19422b;

    public Pair(Object obj, Object obj2) {
        this.f19421a = obj;
        this.f19422b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Pair.class != obj.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.f19422b;
        Object obj3 = pair.f19421a;
        Object obj4 = this.f19421a;
        if (obj4 == null ? obj3 != null : !obj4.equals(obj3)) {
            return false;
        }
        Object obj5 = this.f19422b;
        return obj5 == null ? obj2 == null : obj5.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f19421a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f19422b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair(" + this.f19421a + "," + this.f19422b + ")";
    }
}
