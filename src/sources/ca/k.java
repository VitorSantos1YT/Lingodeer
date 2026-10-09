package ca;

import hh.p0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import oz.r;
import oz.x;
import pt.ImS.aYZzTH;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6801d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public k(String name, boolean z11, List columns, List orders) {
        m.f(name, "name");
        m.f(columns, "columns");
        m.f(orders, "orders");
        this.f6798a = name;
        this.f6799b = z11;
        this.f6800c = columns;
        this.f6801d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                orders.add("ASC");
            }
        }
        this.f6801d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            String str = kVar.f6798a;
            if (this.f6799b == kVar.f6799b && m.a(this.f6800c, kVar.f6800c) && m.a(this.f6801d, kVar.f6801d)) {
                String str2 = this.f6798a;
                return x.s0(str2, "index_", false) ? x.s0(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6798a;
        return this.f6801d.hashCode() + p0.b((((x.s0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f6799b ? 1 : 0)) * 31, 31, this.f6800c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Index {\n            |   name = '");
        sb2.append(this.f6798a);
        sb2.append("',\n            |   unique = '");
        sb2.append(this.f6799b);
        sb2.append("',\n            |   columns = {");
        r.e0(ry.m.y0(this.f6800c, ",", null, null, null, 62), "    ");
        r.e0("},", "    ");
        b0 b0Var = b0.f48488a;
        sb2.append(b0Var);
        sb2.append("\n            |   orders = {");
        r.e0(ry.m.y0(this.f6801d, ",", null, null, null, 62), "    ");
        r.e0(" }", "    ");
        sb2.append(b0Var);
        sb2.append(aYZzTH.zaGzhYaxWT);
        return r.e0(r.h0(sb2.toString()), "    ");
    }
}
