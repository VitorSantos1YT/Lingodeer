package gy;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Serializable {
    private static final long serialVersionUID = -8759979445933046293L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f29894a;

    public g(Throwable th2) {
        this.f29894a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return Objects.equals(this.f29894a, ((g) obj).f29894a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29894a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f29894a + "]";
    }
}
