package fb;

import android.net.NetworkRequest;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f27064j = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f27065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pb.f f27066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f27071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f27072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f27073i;

    public f() {
        w requiredNetworkType = w.NOT_REQUIRED;
        kotlin.jvm.internal.m.f(requiredNetworkType, "requiredNetworkType");
        this.f27066b = new pb.f(null);
        this.f27065a = requiredNetworkType;
        this.f27067c = false;
        this.f27068d = false;
        this.f27069e = false;
        this.f27070f = false;
        this.f27071g = -1L;
        this.f27072h = -1L;
        this.f27073i = ry.t.f50856a;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.f27066b.f46737a;
    }

    public final boolean b() {
        return !this.f27073i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !f.class.equals(obj.getClass())) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f27067c == fVar.f27067c && this.f27068d == fVar.f27068d && this.f27069e == fVar.f27069e && this.f27070f == fVar.f27070f && this.f27071g == fVar.f27071g && this.f27072h == fVar.f27072h && kotlin.jvm.internal.m.a(a(), fVar.a()) && this.f27065a == fVar.f27065a) {
            return kotlin.jvm.internal.m.a(this.f27073i, fVar.f27073i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f27065a.hashCode() * 31) + (this.f27067c ? 1 : 0)) * 31) + (this.f27068d ? 1 : 0)) * 31) + (this.f27069e ? 1 : 0)) * 31) + (this.f27070f ? 1 : 0)) * 31;
        long j11 = this.f27071g;
        int i11 = (iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f27072h;
        int iHashCode2 = (this.f27073i.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f27065a + ", requiresCharging=" + this.f27067c + ", requiresDeviceIdle=" + this.f27068d + ", requiresBatteryNotLow=" + this.f27069e + ", requiresStorageNotLow=" + this.f27070f + ", contentTriggerUpdateDelayMillis=" + this.f27071g + ", contentTriggerMaxDelayMillis=" + this.f27072h + ", contentUriTriggers=" + this.f27073i + ", }";
    }

    public f(pb.f fVar, w requiredNetworkType, boolean z11, boolean z12, boolean z13, boolean z14, long j11, long j12, Set set) {
        kotlin.jvm.internal.m.f(requiredNetworkType, "requiredNetworkType");
        this.f27066b = fVar;
        this.f27065a = requiredNetworkType;
        this.f27067c = z11;
        this.f27068d = z12;
        this.f27069e = z13;
        this.f27070f = z14;
        this.f27071g = j11;
        this.f27072h = j12;
        this.f27073i = set;
    }

    public f(f other) {
        kotlin.jvm.internal.m.f(other, "other");
        this.f27067c = other.f27067c;
        this.f27068d = other.f27068d;
        this.f27066b = other.f27066b;
        this.f27065a = other.f27065a;
        this.f27069e = other.f27069e;
        this.f27070f = other.f27070f;
        this.f27073i = other.f27073i;
        this.f27071g = other.f27071g;
        this.f27072h = other.f27072h;
    }
}
