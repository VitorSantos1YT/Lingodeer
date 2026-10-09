package rg;

import kotlin.jvm.internal.m;
import sg.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f49242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f49244c;

    public a(q astNode, boolean z11, Integer num) {
        m.f(astNode, "astNode");
        this.f49242a = astNode;
        this.f49243b = z11;
        this.f49244c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f49242a, aVar.f49242a) && this.f49243b == aVar.f49243b && m.a(this.f49244c, aVar.f49244c);
    }

    public final int hashCode() {
        int iE = defpackage.e.e(this.f49242a.hashCode() * 31, 31, this.f49243b);
        Integer num = this.f49244c;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "AstNodeTraversalEntry(astNode=" + this.f49242a + ", isVisited=" + this.f49243b + ", formatIndex=" + this.f49244c + ")";
    }
}
