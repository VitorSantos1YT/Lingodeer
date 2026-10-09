package et;

import com.lingodeer.data.model.CourseSentence;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f25891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ot.n f25893c;

    public m(CourseSentence courseSentence, ArrayList arrayList, ot.n nVar) {
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        this.f25891a = courseSentence;
        this.f25892b = arrayList;
        this.f25893c = nVar;
    }

    @Override // et.o
    public final CourseSentence a() {
        return this.f25891a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.f25891a, mVar.f25891a) && this.f25892b.equals(mVar.f25892b) && this.f25893c.equals(mVar.f25893c);
    }

    public final int hashCode() {
        return this.f25893c.hashCode() + nv.p.b(this.f25892b, this.f25891a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TestSentenceM5(courseSentence=" + this.f25891a + ", stemWords=" + this.f25892b + ", data=" + this.f25893c + ")";
    }
}
