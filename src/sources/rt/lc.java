package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fv.a f50031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50032b;

    public lc(fv.a aVar, int i11) {
        this.f50031a = aVar;
        this.f50032b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj;
        return kotlin.jvm.internal.m.a(this.f50031a, lcVar.f50031a) && this.f50032b == lcVar.f50032b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50032b) + (this.f50031a.hashCode() * 31);
    }

    public final String toString() {
        return "RetryRequest(entry=" + this.f50031a + ", retryCount=" + this.f50032b + ")";
    }
}
