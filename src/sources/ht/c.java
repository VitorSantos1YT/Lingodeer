package ht;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f33726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f33728g;

    public /* synthetic */ c(List list) {
        this(list, 0, 1.0f);
    }

    @Override // ht.l
    public final int a() {
        return this.f33727f;
    }

    @Override // ht.l
    public final float c() {
        return this.f33728g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f33726e, cVar.f33726e) && this.f33727f == cVar.f33727f && Float.compare(this.f33728g, cVar.f33728g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33728g) + defpackage.e.b(this.f33727f, this.f33726e.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayingNormal(visemedMap=");
        sb2.append(this.f33726e);
        sb2.append(", currentIndex=");
        sb2.append(this.f33727f);
        sb2.append(", speed=");
        return nv.p.h(this.f33728g, ")", sb2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List visemedMap, int i11, float f5) {
        super(ns.o.K(visemedMap), i11, f5);
        kotlin.jvm.internal.m.f(visemedMap, "visemedMap");
        this.f33726e = visemedMap;
        this.f33727f = i11;
        this.f33728g = f5;
    }
}
