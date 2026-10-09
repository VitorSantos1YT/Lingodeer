package et;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f25881a;

    public h(CourseSentence courseSentence) {
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        this.f25881a = courseSentence;
    }

    @Override // et.o
    public final CourseSentence a() {
        return this.f25881a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.m.a(this.f25881a, ((h) obj).f25881a);
    }

    public final int hashCode() {
        return this.f25881a.hashCode();
    }

    public final String toString() {
        return "NormalSentence(courseSentence=" + this.f25881a + ")";
    }
}
