package vg;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.h f54043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f54044b;

    public m(j3.h hVar, Map map) {
        this.f54043a = hVar;
        this.f54044b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.f54043a, mVar.f54043a) && kotlin.jvm.internal.m.a(this.f54044b, mVar.f54044b);
    }

    public final int hashCode() {
        return this.f54044b.hashCode() + (this.f54043a.hashCode() * 31);
    }
}
