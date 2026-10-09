package ns;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class o0 {
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44011c;

    public /* synthetic */ o0(int i11, String str, String str2, String str3) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, m0.f44005a.getDescriptor());
            throw null;
        }
        this.f44009a = str;
        this.f44010b = str2;
        this.f44011c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.m.a(this.f44009a, o0Var.f44009a) && kotlin.jvm.internal.m.a(this.f44010b, o0Var.f44010b) && kotlin.jvm.internal.m.a(this.f44011c, o0Var.f44011c);
    }

    public final int hashCode() {
        return this.f44011c.hashCode() + defpackage.e.d(this.f44009a.hashCode() * 31, 31, this.f44010b);
    }

    public final String toString() {
        return ep.a.k(defpackage.e.s("CourseMistakeExplainQuestionData(sourceMeaning=", this.f44009a, ", correctAnswer=", this.f44010b, ", userResponse="), this.f44011c, ")");
    }

    public o0(String sourceMeaning, String correctAnswer, String userResponse) {
        kotlin.jvm.internal.m.f(sourceMeaning, "sourceMeaning");
        kotlin.jvm.internal.m.f(correctAnswer, "correctAnswer");
        kotlin.jvm.internal.m.f(userResponse, "userResponse");
        this.f44009a = sourceMeaning;
        this.f44010b = correctAnswer;
        this.f44011c = userResponse;
    }
}
