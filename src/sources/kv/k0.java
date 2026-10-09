package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f38773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f38775e;

    public k0(String str, String str2, x0 x0Var, List list, List list2) {
        this.f38771a = str;
        this.f38772b = str2;
        this.f38773c = x0Var;
        this.f38774d = list;
        this.f38775e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.m.a(this.f38771a, k0Var.f38771a) && kotlin.jvm.internal.m.a(this.f38772b, k0Var.f38772b) && kotlin.jvm.internal.m.a(this.f38773c, k0Var.f38773c) && kotlin.jvm.internal.m.a(this.f38774d, k0Var.f38774d) && kotlin.jvm.internal.m.a(this.f38775e, k0Var.f38775e);
    }

    public final int hashCode() {
        return this.f38775e.hashCode() + hh.p0.b((this.f38773c.hashCode() + defpackage.e.d(this.f38771a.hashCode() * 31, 31, this.f38772b)) * 31, 31, this.f38774d);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("JPSyllableLessonSource(lessonID=", this.f38771a, ", title=", this.f38772b, ", description=");
        sbS.append(this.f38773c);
        sbS.append(", introSections=");
        sbS.append(this.f38774d);
        sbS.append(", models=");
        return b7.e0.n(sbS, this.f38775e, ")");
    }
}
