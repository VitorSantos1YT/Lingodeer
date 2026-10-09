package tz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f52706b = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f52707a;

    public static final Object a(Object obj) {
        if (obj instanceof n) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return kotlin.jvm.internal.m.a(this.f52707a, ((o) obj).f52707a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f52707a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f52707a;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
