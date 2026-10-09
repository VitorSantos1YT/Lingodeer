package et;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f25882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ot.c f25883b;

    public i(CourseSentence courseSentence, ot.c cVar) {
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        this.f25882a = courseSentence;
        this.f25883b = cVar;
    }

    @Override // et.o
    public final CourseSentence a() {
        return this.f25882a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f25882a, iVar.f25882a) && kotlin.jvm.internal.m.a(this.f25883b, iVar.f25883b);
    }

    public final int hashCode() {
        return this.f25883b.hashCode() + (this.f25882a.hashCode() * 31);
    }

    public final String toString() {
        return "TestSentenceM10(courseSentence=" + this.f25882a + ", data=" + this.f25883b + ")";
    }
}
