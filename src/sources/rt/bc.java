package rt;

import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class bc implements cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f49544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49545c;

    public bc(long j11, long j12, boolean z11) {
        this.f49543a = j11;
        this.f49544b = j12;
        this.f49545c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return this.f49543a == bcVar.f49543a && this.f49544b == bcVar.f49544b && this.f49545c == bcVar.f49545c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49545c) + defpackage.e.f(this.f49544b, Long.hashCode(this.f49543a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbJ = w4.c.j(this.f49543a, "WordMatchSuccess(wordId=", OYAvlbfUyD.hkzMLehnQ);
        sbJ.append(this.f49544b);
        sbJ.append(", recordToReview=");
        sbJ.append(this.f49545c);
        sbJ.append(")");
        return sbJ.toString();
    }
}
