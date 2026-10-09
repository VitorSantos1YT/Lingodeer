package qy;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f48498a;

    public static final Throwable a(Object obj) {
        if (obj instanceof n) {
            return ((n) obj).f48497a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return kotlin.jvm.internal.m.a(this.f48498a, ((o) obj).f48498a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f48498a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f48498a;
        if (obj instanceof n) {
            return ((n) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
