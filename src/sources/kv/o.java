package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38788b;

    public o(String text, List runs) {
        kotlin.jvm.internal.m.f(text, "text");
        kotlin.jvm.internal.m.f(runs, "runs");
        this.f38787a = text;
        this.f38788b = runs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f38787a, oVar.f38787a) && kotlin.jvm.internal.m.a(this.f38788b, oVar.f38788b);
    }

    public final int hashCode() {
        return this.f38788b.hashCode() + (this.f38787a.hashCode() * 31);
    }

    public final String toString() {
        return "Paragraph(text=" + this.f38787a + ", runs=" + this.f38788b + ")";
    }
}
