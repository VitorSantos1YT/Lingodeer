package ht;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f33723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f33725g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List visemedMap, int i11, float f5) {
        super(ns.o.K(visemedMap), i11, f5);
        kotlin.jvm.internal.m.f(visemedMap, "visemedMap");
        this.f33723e = visemedMap;
        this.f33724f = i11;
        this.f33725g = f5;
    }

    @Override // ht.l
    public final int a() {
        return this.f33724f;
    }

    @Override // ht.l
    public final float c() {
        return this.f33725g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.f33723e, bVar.f33723e) && this.f33724f == bVar.f33724f && Float.compare(this.f33725g, bVar.f33725g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33725g) + defpackage.e.b(this.f33724f, this.f33723e.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayingAnswer(visemedMap=");
        sb2.append(this.f33723e);
        sb2.append(", currentIndex=");
        sb2.append(this.f33724f);
        sb2.append(", speed=");
        return nv.p.h(this.f33725g, ")", sb2);
    }
}
