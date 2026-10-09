package et;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f25889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ot.l f25890b;

    public l(CourseSentence courseSentence, ot.l lVar) {
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        this.f25889a = courseSentence;
        this.f25890b = lVar;
    }

    @Override // et.o
    public final CourseSentence a() {
        return this.f25889a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.f25889a, lVar.f25889a) && kotlin.jvm.internal.m.a(this.f25890b, lVar.f25890b);
    }

    public final int hashCode() {
        return this.f25890b.hashCode() + (this.f25889a.hashCode() * 31);
    }

    public final String toString() {
        return "TestSentenceM3(courseSentence=" + this.f25889a + ", data=" + this.f25890b + ")";
    }
}
