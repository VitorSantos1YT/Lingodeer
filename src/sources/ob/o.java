package ob;

import fb.e0;
import hh.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f44832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fb.j f44833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f44834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f44835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f44836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fb.f f44837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f44838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fb.a f44839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f44840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f44841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f44842l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f44843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f44844o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f44845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f44846q;

    public o(String id2, e0 state, fb.j output, long j11, long j12, long j13, fb.f fVar, int i11, fb.a backoffPolicy, long j14, long j15, int i12, int i13, long j16, int i14, ArrayList tags, ArrayList progress) {
        kotlin.jvm.internal.m.f(id2, "id");
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(output, "output");
        kotlin.jvm.internal.m.f(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.m.f(tags, "tags");
        kotlin.jvm.internal.m.f(progress, "progress");
        this.f44831a = id2;
        this.f44832b = state;
        this.f44833c = output;
        this.f44834d = j11;
        this.f44835e = j12;
        this.f44836f = j13;
        this.f44837g = fVar;
        this.f44838h = i11;
        this.f44839i = backoffPolicy;
        this.f44840j = j14;
        this.f44841k = j15;
        this.f44842l = i12;
        this.m = i13;
        this.f44843n = j16;
        this.f44844o = i14;
        this.f44845p = tags;
        this.f44846q = progress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f44831a, oVar.f44831a) && this.f44832b == oVar.f44832b && kotlin.jvm.internal.m.a(this.f44833c, oVar.f44833c) && this.f44834d == oVar.f44834d && this.f44835e == oVar.f44835e && this.f44836f == oVar.f44836f && kotlin.jvm.internal.m.a(this.f44837g, oVar.f44837g) && this.f44838h == oVar.f44838h && this.f44839i == oVar.f44839i && this.f44840j == oVar.f44840j && this.f44841k == oVar.f44841k && this.f44842l == oVar.f44842l && this.m == oVar.m && this.f44843n == oVar.f44843n && this.f44844o == oVar.f44844o && kotlin.jvm.internal.m.a(this.f44845p, oVar.f44845p) && kotlin.jvm.internal.m.a(this.f44846q, oVar.f44846q);
    }

    public final int hashCode() {
        return this.f44846q.hashCode() + p0.b(defpackage.e.b(this.f44844o, defpackage.e.f(this.f44843n, defpackage.e.b(this.m, defpackage.e.b(this.f44842l, defpackage.e.f(this.f44841k, defpackage.e.f(this.f44840j, (this.f44839i.hashCode() + defpackage.e.b(this.f44838h, (this.f44837g.hashCode() + defpackage.e.f(this.f44836f, defpackage.e.f(this.f44835e, defpackage.e.f(this.f44834d, (this.f44833c.hashCode() + ((this.f44832b.hashCode() + (this.f44831a.hashCode() * 31)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31), 31), 31, this.f44845p);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f44831a + ", state=" + this.f44832b + ", output=" + this.f44833c + ", initialDelay=" + this.f44834d + ", intervalDuration=" + this.f44835e + ", flexDuration=" + this.f44836f + ", constraints=" + this.f44837g + ", runAttemptCount=" + this.f44838h + ", backoffPolicy=" + this.f44839i + ", backoffDelayDuration=" + this.f44840j + ", lastEnqueueTime=" + this.f44841k + ", periodCount=" + this.f44842l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.f44843n + ", stopReason=" + this.f44844o + ", tags=" + this.f44845p + ", progress=" + this.f44846q + ')';
    }
}
