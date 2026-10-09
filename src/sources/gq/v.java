package gq;

import java.util.Iterator;
import java.util.List;
import vt.e1;
import vt.f1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f29644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f29646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f29647d;

    public v(Long l9, int i11, c0 c0Var, List list) {
        this.f29644a = l9;
        this.f29645b = i11;
        this.f29646c = c0Var;
        this.f29647d = list;
    }

    public final boolean a() {
        Object next;
        Iterator it = this.f29647d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f1) next).f54221a != e1.REVIEW);
        f1 f1Var = (f1) next;
        return f1Var != null && f1Var.f54222b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.m.a(this.f29644a, vVar.f29644a) && this.f29645b == vVar.f29645b && this.f29646c == vVar.f29646c && kotlin.jvm.internal.m.a(this.f29647d, vVar.f29647d);
    }

    public final int hashCode() {
        Long l9 = this.f29644a;
        return this.f29647d.hashCode() + ((this.f29646c.hashCode() + ((((l9 != null ? l9.hashCode() : 0) * 31) + this.f29645b) * 31)) * 31);
    }

    public final String toString() {
        return "SyncResult(syncId=" + this.f29644a + ", keyLanguage=" + this.f29645b + ", terminalState=" + this.f29646c + ", stepOutcomes=" + this.f29647d + ")";
    }
}
