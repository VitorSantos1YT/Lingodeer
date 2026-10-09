package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37135b;

    public q2(String reference, String translation) {
        kotlin.jvm.internal.m.f(reference, "reference");
        kotlin.jvm.internal.m.f(translation, "translation");
        this.f37134a = reference;
        this.f37135b = translation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return kotlin.jvm.internal.m.a(this.f37134a, q2Var.f37134a) && kotlin.jvm.internal.m.a(this.f37135b, q2Var.f37135b);
    }

    public final int hashCode() {
        return this.f37135b.hashCode() + (this.f37134a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h("SpellingAiJudgeContext(reference=", this.f37134a, ", translation=", this.f37135b, ")");
    }
}
