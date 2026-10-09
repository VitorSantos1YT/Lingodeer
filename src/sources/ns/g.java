package ns;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class g {
    public static final f Companion = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qy.h[] f43970d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f43971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f43972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f43973c;

    static {
        qy.j jVar = qy.j.PUBLICATION;
        f43970d = new qy.h[]{com.bumptech.glide.d.u(jVar, new ju.d(29)), com.bumptech.glide.d.u(jVar, new d(0)), com.bumptech.glide.d.u(jVar, new d(1))};
    }

    public /* synthetic */ g(int i11, q qVar, b bVar, s sVar) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, e.f43967a.getDescriptor());
            throw null;
        }
        this.f43971a = qVar;
        this.f43972b = bVar;
        this.f43973c = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f43971a == gVar.f43971a && this.f43972b == gVar.f43972b && this.f43973c == gVar.f43973c;
    }

    public final int hashCode() {
        return this.f43973c.hashCode() + ((this.f43972b.hashCode() + (this.f43971a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CourseAnswerJudgeResponse(judgment=" + this.f43971a + ", correctionCount=" + this.f43972b + ", retryReason=" + this.f43973c + ")";
    }
}
