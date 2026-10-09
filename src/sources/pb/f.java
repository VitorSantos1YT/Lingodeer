package pb;

import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f46736b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46737a;

    static {
        kotlin.jvm.internal.m.e(fb.l.c("NetworkRequestCompat"), "tagWithPrefix(\"NetworkRequestCompat\")");
    }

    public f(NetworkRequest networkRequest) {
        this.f46737a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.m.a(this.f46737a, ((f) obj).f46737a);
    }

    public final int hashCode() {
        Object obj = this.f46737a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f46737a + ')';
    }
}
