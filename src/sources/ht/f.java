package ht;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f33735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f33737g;

    public /* synthetic */ f(List list) {
        this(list, 0, 1.0f);
    }

    @Override // ht.l
    public final int a() {
        return this.f33736f;
    }

    @Override // ht.l
    public final float c() {
        return this.f33737g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f33735e, fVar.f33735e) && this.f33736f == fVar.f33736f && Float.compare(this.f33737g, fVar.f33737g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33737g) + defpackage.e.b(this.f33736f, this.f33735e.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayingQuestion(visemedMap=");
        sb2.append(this.f33735e);
        sb2.append(", currentIndex=");
        sb2.append(this.f33736f);
        sb2.append(", speed=");
        return nv.p.h(this.f33737g, ")", sb2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List visemedMap, int i11, float f5) {
        super(ns.o.K(visemedMap), i11, f5);
        kotlin.jvm.internal.m.f(visemedMap, "visemedMap");
        this.f33735e = visemedMap;
        this.f33736f = i11;
        this.f33737g = f5;
    }
}
