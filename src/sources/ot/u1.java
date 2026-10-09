package ot;

import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseWord f46012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46013b;

    public u1(CourseWord word, List options) {
        kotlin.jvm.internal.m.f(word, "word");
        kotlin.jvm.internal.m.f(options, "options");
        this.f46012a = word;
        this.f46013b = options;
    }

    public static u1 a(u1 u1Var, ArrayList arrayList) {
        CourseWord word = u1Var.f46012a;
        kotlin.jvm.internal.m.f(word, "word");
        return new u1(word, arrayList);
    }

    public final CourseWord b() {
        return this.f46012a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return kotlin.jvm.internal.m.a(this.f46012a, u1Var.f46012a) && kotlin.jvm.internal.m.a(this.f46013b, u1Var.f46013b);
    }

    public final int hashCode() {
        return this.f46013b.hashCode() + (this.f46012a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseWordM1(word=" + this.f46012a + ", options=" + this.f46013b + ")";
    }
}
