package ot;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CourseSentence f45892b;

    public m0(ht.o oVar, CourseSentence courseSentence) {
        this.f45891a = oVar;
        this.f45892b = courseSentence;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45891a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.m.a(this.f45891a, m0Var.f45891a) && kotlin.jvm.internal.m.a(this.f45892b, m0Var.f45892b);
    }

    public final int hashCode() {
        return this.f45892b.hashCode() + (this.f45891a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelM0(courseTestParams=" + this.f45891a + ", data=" + this.f45892b + ")";
    }
}
