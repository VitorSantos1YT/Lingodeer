package ht;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f33732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f33734g;

    public /* synthetic */ e(List list) {
        this(list, 0, 1.0f);
    }

    @Override // ht.l
    public final int a() {
        return this.f33733f;
    }

    @Override // ht.l
    public final float c() {
        return this.f33734g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f33732e, eVar.f33732e) && this.f33733f == eVar.f33733f && Float.compare(this.f33734g, eVar.f33734g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33734g) + defpackage.e.b(this.f33733f, this.f33732e.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayingPopupAudio(visemedMap=");
        sb2.append(this.f33732e);
        sb2.append(", currentIndex=");
        sb2.append(this.f33733f);
        sb2.append(", speed=");
        return nv.p.h(this.f33734g, ")", sb2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List visemedMap, int i11, float f5) {
        super(ns.o.K(visemedMap), i11, f5);
        kotlin.jvm.internal.m.f(visemedMap, "visemedMap");
        this.f33732e = visemedMap;
        this.f33733f = i11;
        this.f33734g = f5;
    }
}
