package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f50297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50299d;

    public qa(List dataSentences, List showSentences, int i11, boolean z11) {
        kotlin.jvm.internal.m.f(dataSentences, "dataSentences");
        kotlin.jvm.internal.m.f(showSentences, "showSentences");
        this.f50296a = dataSentences;
        this.f50297b = showSentences;
        this.f50298c = i11;
        this.f50299d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        return kotlin.jvm.internal.m.a(this.f50296a, qaVar.f50296a) && kotlin.jvm.internal.m.a(this.f50297b, qaVar.f50297b) && this.f50298c == qaVar.f50298c && this.f50299d == qaVar.f50299d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50299d) + defpackage.e.b(this.f50298c, hh.p0.b(this.f50296a.hashCode() * 31, 31, this.f50297b), 31);
    }

    public final String toString() {
        return "CourseTestDialogueRuntimeState(dataSentences=" + this.f50296a + ", showSentences=" + this.f50297b + ", showSentenceIndex=" + this.f50298c + ", showFinishLayout=" + this.f50299d + ")";
    }
}
