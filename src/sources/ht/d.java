package ht;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f33729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f33730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f33731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j11, List visemedMap) {
        super(ns.o.K(visemedMap), 0, 1.0f, j11);
        kotlin.jvm.internal.m.f(visemedMap, "visemedMap");
        this.f33729e = visemedMap;
        this.f33730f = 1.0f;
        this.f33731g = j11;
    }

    @Override // ht.l
    public final int a() {
        return 0;
    }

    @Override // ht.l
    public final long b() {
        return this.f33731g;
    }

    @Override // ht.l
    public final float c() {
        return this.f33730f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f33729e, dVar.f33729e) && Float.compare(this.f33730f, dVar.f33730f) == 0 && this.f33731g == dVar.f33731g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33731g) + defpackage.e.a(defpackage.e.b(0, this.f33729e.hashCode() * 31, 31), this.f33730f, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayingOptionAudio(visemedMap=");
        sb2.append(this.f33729e);
        sb2.append(", currentIndex=0, speed=");
        sb2.append(this.f33730f);
        sb2.append(", playingId=");
        return defpackage.e.i(this.f33731g, ")", sb2);
    }
}
