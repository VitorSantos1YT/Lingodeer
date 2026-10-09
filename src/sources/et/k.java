package et;

import com.lingodeer.data.model.CourseSentence;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f25886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ot.h f25888c;

    public k(CourseSentence courseSentence, ArrayList arrayList, ot.h hVar) {
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        this.f25886a = courseSentence;
        this.f25887b = arrayList;
        this.f25888c = hVar;
    }

    @Override // et.o
    public final CourseSentence a() {
        return this.f25886a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.f25886a, kVar.f25886a) && this.f25887b.equals(kVar.f25887b) && this.f25888c.equals(kVar.f25888c);
    }

    public final int hashCode() {
        return this.f25888c.hashCode() + nv.p.b(this.f25887b, this.f25886a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TestSentenceM1(courseSentence=" + this.f25886a + ", stemWords=" + this.f25887b + ", data=" + this.f25888c + ")";
    }
}
