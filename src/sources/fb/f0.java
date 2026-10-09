package fb;

import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f27074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f27075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f27076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f27077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f27078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f27081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f27082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f27083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f27084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f27085l;

    public f0(UUID uuid, e0 state, HashSet hashSet, j outputData, j progress, int i11, int i12, f fVar, long j11, d0 d0Var, long j12, int i13) {
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(outputData, "outputData");
        kotlin.jvm.internal.m.f(progress, "progress");
        this.f27074a = uuid;
        this.f27075b = state;
        this.f27076c = hashSet;
        this.f27077d = outputData;
        this.f27078e = progress;
        this.f27079f = i11;
        this.f27080g = i12;
        this.f27081h = fVar;
        this.f27082i = j11;
        this.f27083j = d0Var;
        this.f27084k = j12;
        this.f27085l = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !f0.class.equals(obj.getClass())) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f27079f == f0Var.f27079f && this.f27080g == f0Var.f27080g && this.f27074a.equals(f0Var.f27074a) && this.f27075b == f0Var.f27075b && kotlin.jvm.internal.m.a(this.f27077d, f0Var.f27077d) && this.f27081h.equals(f0Var.f27081h) && this.f27082i == f0Var.f27082i && kotlin.jvm.internal.m.a(this.f27083j, f0Var.f27083j) && this.f27084k == f0Var.f27084k && this.f27085l == f0Var.f27085l && this.f27076c.equals(f0Var.f27076c)) {
            return kotlin.jvm.internal.m.a(this.f27078e, f0Var.f27078e);
        }
        return false;
    }

    public final int hashCode() {
        int iF = defpackage.e.f(this.f27082i, (this.f27081h.hashCode() + ((((((this.f27078e.hashCode() + ((this.f27076c.hashCode() + ((this.f27077d.hashCode() + ((this.f27075b.hashCode() + (this.f27074a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f27079f) * 31) + this.f27080g) * 31)) * 31, 31);
        d0 d0Var = this.f27083j;
        return Integer.hashCode(this.f27085l) + defpackage.e.f(this.f27084k, (iF + (d0Var != null ? d0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f27074a + "', state=" + this.f27075b + ", outputData=" + this.f27077d + ", tags=" + this.f27076c + ", progress=" + this.f27078e + ", runAttemptCount=" + this.f27079f + ", generation=" + this.f27080g + ", constraints=" + this.f27081h + ", initialDelayMillis=" + this.f27082i + ", periodicityInfo=" + this.f27083j + ", nextScheduleTimeMillis=" + this.f27084k + "}, stopReason=" + this.f27085l;
    }
}
