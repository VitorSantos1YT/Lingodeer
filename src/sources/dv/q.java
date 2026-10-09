package dv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class q {
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f24501a;

    public /* synthetic */ q(int i11, w wVar) {
        if ((i11 & 1) == 0) {
            this.f24501a = new w();
        } else {
            this.f24501a = wVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && kotlin.jvm.internal.m.a(this.f24501a, ((q) obj).f24501a);
    }

    public final int hashCode() {
        return this.f24501a.f24529a.hashCode();
    }

    public final String toString() {
        return "GeminiCandidate(content=" + this.f24501a + ")";
    }
}
