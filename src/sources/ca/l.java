package ca;

import bw.ORXQ.ADSb;
import dl.ExOZ.xItStCyvVEZ;
import fb.g0;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f6804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f6805d;

    public l(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        m.f(foreignKeys, "foreignKeys");
        this.f6802a = str;
        this.f6803b = map;
        this.f6804c = foreignKeys;
        this.f6805d = abstractSet;
    }

    public static final l a(la.b bVar, String str) {
        return g0.x(new z9.a(bVar), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f6802a.equals(lVar.f6802a) || !this.f6803b.equals(lVar.f6803b) || !m.a(this.f6804c, lVar.f6804c)) {
            return false;
        }
        Set set2 = this.f6805d;
        if (set2 == null || (set = lVar.f6805d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f6804c.hashCode() + ((this.f6803b.hashCode() + (this.f6802a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f6802a);
        sb2.append(xItStCyvVEZ.ugsh);
        sb2.append(ff.h.p(ry.m.S0(this.f6803b.values(), new b4.e(5))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(ff.h.p(this.f6804c));
        sb2.append("\n            |    indices = {");
        Set set = this.f6805d;
        sb2.append(ff.h.p(set != null ? ry.m.S0(set, new b4.e(6)) : r.f50854a));
        sb2.append(ADSb.buqGJtkkPUtz);
        return oz.r.h0(sb2.toString());
    }
}
