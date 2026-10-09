package ht;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f33739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f33741g;

    public /* synthetic */ h(List list) {
        this(list, 0, 1.0f);
    }

    @Override // ht.l
    public final int a() {
        return this.f33740f;
    }

    @Override // ht.l
    public final float c() {
        return this.f33741g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.f33739e, hVar.f33739e) && this.f33740f == hVar.f33740f && Float.compare(this.f33741g, hVar.f33741g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33741g) + defpackage.e.b(this.f33740f, this.f33739e.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayingResult(visemedMap=");
        sb2.append(this.f33739e);
        sb2.append(", currentIndex=");
        sb2.append(this.f33740f);
        sb2.append(", speed=");
        return nv.p.h(this.f33741g, ")", sb2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List visemedMap, int i11, float f5) {
        super(ns.o.K(visemedMap), i11, f5);
        kotlin.jvm.internal.m.f(visemedMap, "visemedMap");
        this.f33739e = visemedMap;
        this.f33740f = i11;
        this.f33741g = f5;
    }
}
