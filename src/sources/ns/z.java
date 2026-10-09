package ns;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f44043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f44044g;

    public z(long j11, String str, String str2, String str3, String sourceMeaning, String correctAnswer, String userResponse) {
        kotlin.jvm.internal.m.f(sourceMeaning, "sourceMeaning");
        kotlin.jvm.internal.m.f(correctAnswer, "correctAnswer");
        kotlin.jvm.internal.m.f(userResponse, "userResponse");
        this.f44038a = j11;
        this.f44039b = str;
        this.f44040c = str2;
        this.f44041d = str3;
        this.f44042e = sourceMeaning;
        this.f44043f = correctAnswer;
        this.f44044g = userResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f44038a == zVar.f44038a && kotlin.jvm.internal.m.a(this.f44039b, zVar.f44039b) && kotlin.jvm.internal.m.a(this.f44040c, zVar.f44040c) && kotlin.jvm.internal.m.a(this.f44041d, zVar.f44041d) && kotlin.jvm.internal.m.a(this.f44042e, zVar.f44042e) && kotlin.jvm.internal.m.a(this.f44043f, zVar.f44043f) && kotlin.jvm.internal.m.a(this.f44044g, zVar.f44044g);
    }

    public final int hashCode() {
        return this.f44044g.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(Long.hashCode(this.f44038a) * 31, 31, this.f44039b), 31, this.f44040c), 31, this.f44041d), 31, this.f44042e), 31, this.f44043f);
    }

    public final String toString() {
        StringBuilder sbP = b7.e0.p(this.f44038a, "CourseMistakeExplainContext(contextId=", ", uiLanguage=", this.f44039b);
        com.google.android.material.datepicker.d.w(sbP, ", targetLanguage=", this.f44040c, ", questionTypeId=", this.f44041d);
        com.google.android.material.datepicker.d.w(sbP, ", sourceMeaning=", this.f44042e, ", correctAnswer=", this.f44043f);
        return nv.p.u(sbP, ", userResponse=", this.f44044g, ")");
    }
}
