package qx;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f48467b = new f(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f48468a;

    public f(Object obj) {
        this.f48468a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Objects.equals(this.f48468a, ((f) obj).f48468a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f48468a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f48468a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (obj instanceof gy.g) {
            return "OnErrorNotification[" + ((gy.g) obj).f29894a + "]";
        }
        return "OnNextNotification[" + obj + "]";
    }
}
