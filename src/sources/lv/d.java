package lv;

import java.util.List;
import kotlin.jvm.internal.m;
import kv.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f40338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f40339b;

    public d(s0 script, List list) {
        m.f(script, "script");
        this.f40338a = script;
        this.f40339b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f40338a == dVar.f40338a && m.a(this.f40339b, dVar.f40339b);
    }

    public final int hashCode() {
        return this.f40339b.hashCode() + (this.f40338a.hashCode() * 31);
    }

    public final String toString() {
        return "LegacyHandWritingGroup(script=" + this.f40338a + ", sourceLessonIds=" + this.f40339b + ")";
    }
}
