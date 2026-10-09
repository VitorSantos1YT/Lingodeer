package jt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f37075c;

    public m2(int i11, String word, List list) {
        kotlin.jvm.internal.m.f(word, "word");
        this.f37073a = word;
        this.f37074b = i11;
        this.f37075c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return kotlin.jvm.internal.m.a(this.f37073a, m2Var.f37073a) && this.f37074b == m2Var.f37074b && kotlin.jvm.internal.m.a(this.f37075c, m2Var.f37075c);
    }

    public final int hashCode() {
        return this.f37075c.hashCode() + defpackage.e.b(this.f37074b, this.f37073a.hashCode() * 31, 31);
    }

    public final String toString() {
        return b7.e0.n(defpackage.e.q(this.f37074b, "SentenceSpellDisplayChar(word=", this.f37073a, ", wordType=", ", candidates="), this.f37075c, ")");
    }
}
