package nx;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Serializable {
    private static final long serialVersionUID = -8759979445933046293L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f44290a;

    public f(Throwable th2) {
        this.f44290a = th2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).f44290a;
        Throwable th2 = this.f44290a;
        if (th2 != obj2) {
            return th2 != null && th2.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return this.f44290a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f44290a + "]";
    }
}
