package ot;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseWord f45945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45947c;

    public p2(CourseWord courseWord, int i11, int i12) {
        this.f45945a = courseWord;
        this.f45946b = i11;
        this.f45947c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.f45945a.equals(p2Var.f45945a) && this.f45946b == p2Var.f45946b && this.f45947c == p2Var.f45947c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45947c) + defpackage.e.b(this.f45946b, this.f45945a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FallbackWordCandidate(word=");
        sb2.append(this.f45945a);
        sb2.append(", sourceRank=");
        sb2.append(this.f45946b);
        sb2.append(", sourceIndex=");
        return hh.p0.i(this.f45947c, ")", sb2);
    }
}
