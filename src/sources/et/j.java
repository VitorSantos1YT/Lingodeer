package et;

import com.lingodeer.data.model.CourseSentence;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f25884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ot.f f25885b;

    public j(CourseSentence courseSentence, ot.f fVar) {
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        this.f25884a = courseSentence;
        this.f25885b = fVar;
    }

    @Override // et.o
    public final CourseSentence a() {
        return this.f25884a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f25884a, jVar.f25884a) && kotlin.jvm.internal.m.a(this.f25885b, jVar.f25885b);
    }

    public final int hashCode() {
        return this.f25885b.hashCode() + (this.f25884a.hashCode() * 31);
    }

    public final String toString() {
        return "TestSentenceM13(courseSentence=" + this.f25884a + ", data=" + this.f25885b + ealNNtLp.itSNTuwUCZ;
    }
}
