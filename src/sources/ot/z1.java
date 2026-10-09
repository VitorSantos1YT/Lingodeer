package ot;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f46065c;

    public z1(List optionWords, List optionTranslations, a2 matchType) {
        kotlin.jvm.internal.m.f(optionWords, "optionWords");
        kotlin.jvm.internal.m.f(optionTranslations, "optionTranslations");
        kotlin.jvm.internal.m.f(matchType, "matchType");
        this.f46063a = optionWords;
        this.f46064b = optionTranslations;
        this.f46065c = matchType;
    }

    public final List a() {
        return this.f46064b;
    }

    public final List b() {
        return this.f46063a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return kotlin.jvm.internal.m.a(this.f46063a, z1Var.f46063a) && kotlin.jvm.internal.m.a(this.f46064b, z1Var.f46064b) && this.f46065c == z1Var.f46065c;
    }

    public final int hashCode() {
        return this.f46065c.hashCode() + hh.p0.b(this.f46063a.hashCode() * 31, 31, this.f46064b);
    }

    public final String toString() {
        return "CourseWordM6(optionWords=" + this.f46063a + ", optionTranslations=" + this.f46064b + ", matchType=" + this.f46065c + ")";
    }
}
