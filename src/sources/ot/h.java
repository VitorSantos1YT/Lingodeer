package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f45828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45830c;

    public h(CourseSentence sentence, long j11, List options) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        kotlin.jvm.internal.m.f(options, "options");
        this.f45828a = sentence;
        this.f45829b = j11;
        this.f45830c = options;
    }

    public static h a(h hVar, ArrayList arrayList) {
        CourseSentence sentence = hVar.f45828a;
        long j11 = hVar.f45829b;
        kotlin.jvm.internal.m.f(sentence, "sentence");
        return new h(sentence, j11, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.f45828a, hVar.f45828a) && this.f45829b == hVar.f45829b && kotlin.jvm.internal.m.a(this.f45830c, hVar.f45830c);
    }

    public final int hashCode() {
        return this.f45830c.hashCode() + defpackage.e.f(this.f45829b, this.f45828a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CourseSentenceM1(sentence=" + this.f45828a + ", answerId=" + this.f45829b + ", options=" + this.f45830c + ")";
    }
}
