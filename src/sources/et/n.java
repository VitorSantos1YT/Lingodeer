package et;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f25894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25895b;

    public n(CourseSentence courseSentence, String translation) {
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        kotlin.jvm.internal.m.f(translation, "translation");
        this.f25894a = courseSentence;
        this.f25895b = translation;
    }

    @Override // et.o
    public final CourseSentence a() {
        return this.f25894a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f25894a, nVar.f25894a) && kotlin.jvm.internal.m.a(this.f25895b, nVar.f25895b);
    }

    public final int hashCode() {
        return this.f25895b.hashCode() + (this.f25894a.hashCode() * 31);
    }

    public final String toString() {
        return "TipsSentence(courseSentence=" + this.f25894a + ", translation=" + this.f25895b + ")";
    }
}
