package n9;

import bw.ORXQ.ADSb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f43541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f43542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f43543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f43544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f43545e;

    public e(v refresh, v prepend, v append, x source, x xVar) {
        kotlin.jvm.internal.m.f(refresh, "refresh");
        kotlin.jvm.internal.m.f(prepend, "prepend");
        kotlin.jvm.internal.m.f(append, "append");
        kotlin.jvm.internal.m.f(source, "source");
        this.f43541a = refresh;
        this.f43542b = prepend;
        this.f43543c = append;
        this.f43544d = source;
        this.f43545e = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f43541a, eVar.f43541a) && kotlin.jvm.internal.m.a(this.f43542b, eVar.f43542b) && kotlin.jvm.internal.m.a(this.f43543c, eVar.f43543c) && kotlin.jvm.internal.m.a(this.f43544d, eVar.f43544d) && kotlin.jvm.internal.m.a(this.f43545e, eVar.f43545e);
    }

    public final int hashCode() {
        int iHashCode = (this.f43544d.hashCode() + ((this.f43543c.hashCode() + ((this.f43542b.hashCode() + (this.f43541a.hashCode() * 31)) * 31)) * 31)) * 31;
        x xVar = this.f43545e;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f43541a + ", prepend=" + this.f43542b + ", append=" + this.f43543c + ", source=" + this.f43544d + ADSb.kfAx + this.f43545e + ')';
    }
}
