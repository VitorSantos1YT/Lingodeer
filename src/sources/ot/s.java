package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f45981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45983c;

    public s(CourseSentence sentence, long j11, List options) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        kotlin.jvm.internal.m.f(options, "options");
        this.f45981a = sentence;
        this.f45982b = j11;
        this.f45983c = options;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.m.a(this.f45981a, sVar.f45981a) && this.f45982b == sVar.f45982b && kotlin.jvm.internal.m.a(this.f45983c, sVar.f45983c);
    }

    public final int hashCode() {
        return this.f45983c.hashCode() + defpackage.e.f(this.f45982b, this.f45981a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CourseSentenceM8(sentence=" + this.f45981a + ", answerId=" + this.f45982b + ", options=" + this.f45983c + ")";
    }
}
