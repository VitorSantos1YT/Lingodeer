package vt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f54289c;

    public t0(String className, List list, long j11) {
        kotlin.jvm.internal.m.f(className, "className");
        this.f54287a = className;
        this.f54288b = list;
        this.f54289c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.m.a(this.f54287a, t0Var.f54287a) && kotlin.jvm.internal.m.a(this.f54288b, t0Var.f54288b) && this.f54289c == t0Var.f54289c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f54289c) + hh.p0.b(this.f54287a.hashCode() * 31, 31, this.f54288b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeaderboardAchievementServerRecord(className=");
        sb2.append(this.f54287a);
        sb2.append(", records=");
        sb2.append(this.f54288b);
        sb2.append(", earnTime=");
        return defpackage.e.i(this.f54289c, ")", sb2);
    }
}
