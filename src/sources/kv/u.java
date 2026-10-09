package kv;

import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f38819a;

    public u(x0 x0Var) {
        this.f38819a = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && kotlin.jvm.internal.m.a(this.f38819a, ((u) obj).f38819a);
    }

    public final int hashCode() {
        return this.f38819a.hashCode();
    }

    public final String toString() {
        return "Paragraph(text=" + this.f38819a + PQgum.XDn;
    }
}
