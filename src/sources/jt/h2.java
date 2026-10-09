package jt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseWord f36962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36965d;

    public h2(CourseWord courseWord, long j11, long j12, long j13) {
        kotlin.jvm.internal.m.f(courseWord, "courseWord");
        this.f36962a = courseWord;
        this.f36963b = j11;
        this.f36964c = j12;
        this.f36965d = j13;
    }

    public static h2 a(h2 h2Var, long j11, long j12, int i11) {
        CourseWord courseWord = h2Var.f36962a;
        if ((i11 & 2) != 0) {
            j11 = h2Var.f36963b;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            j12 = h2Var.f36964c;
        }
        long j14 = h2Var.f36965d;
        kotlin.jvm.internal.m.f(courseWord, "courseWord");
        return new h2(courseWord, j13, j12, j14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return kotlin.jvm.internal.m.a(this.f36962a, h2Var.f36962a) && f2.b.c(this.f36963b, h2Var.f36963b) && f2.b.c(this.f36964c, h2Var.f36964c) && f2.b.c(this.f36965d, h2Var.f36965d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f36965d) + defpackage.e.f(this.f36964c, defpackage.e.f(this.f36963b, this.f36962a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strJ = f2.b.j(this.f36963b);
        String strJ2 = f2.b.j(this.f36964c);
        String strJ3 = f2.b.j(this.f36965d);
        StringBuilder sb2 = new StringBuilder("DragItemState(courseWord=");
        sb2.append(this.f36962a);
        sb2.append(", offset=");
        sb2.append(strJ);
        sb2.append(", position=");
        return defpackage.e.p(sb2, strJ2, ", fingerPosition=", strJ3, ")");
    }
}
