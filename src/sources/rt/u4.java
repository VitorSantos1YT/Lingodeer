package rt;

import com.lingodeer.data.model.SRSStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SRSStatus f50474c;

    public u4(long j11, String unitName, SRSStatus review) {
        kotlin.jvm.internal.m.f(unitName, "unitName");
        kotlin.jvm.internal.m.f(review, "review");
        this.f50472a = j11;
        this.f50473b = unitName;
        this.f50474c = review;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return this.f50472a == u4Var.f50472a && kotlin.jvm.internal.m.a(this.f50473b, u4Var.f50473b) && kotlin.jvm.internal.m.a(this.f50474c, u4Var.f50474c);
    }

    public final int hashCode() {
        return this.f50474c.hashCode() + defpackage.e.d(Long.hashCode(this.f50472a) * 31, 31, this.f50473b);
    }

    public final String toString() {
        StringBuilder sbP = b7.e0.p(this.f50472a, "CourseListenAlongQueueSource(unitId=", ", unitName=", this.f50473b);
        sbP.append(", review=");
        sbP.append(this.f50474c);
        sbP.append(")");
        return sbP.toString();
    }
}
