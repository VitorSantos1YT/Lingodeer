package rt;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f50114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f50115c;

    public n1(long j11, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.f50113a = j11;
        this.f50114b = arrayList;
        this.f50115c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f50113a == n1Var.f50113a && this.f50114b.equals(n1Var.f50114b) && this.f50115c.equals(n1Var.f50115c);
    }

    public final int hashCode() {
        return this.f50115c.hashCode() + nv.p.b(this.f50114b, Long.hashCode(this.f50113a) * 31, 31);
    }

    public final String toString() {
        return "CourseFlashCardFutureReviewSource(revision=" + this.f50113a + ", reviews=" + this.f50114b + ", unitInfoById=" + this.f50115c + ")";
    }
}
