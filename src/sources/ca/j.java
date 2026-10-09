package ca;

import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;
import oz.r;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6797e;

    public j(List columnNames, List referenceColumnNames, String referenceTable, String onDelete, String onUpdate) {
        m.f(referenceTable, "referenceTable");
        m.f(onDelete, "onDelete");
        m.f(onUpdate, "onUpdate");
        m.f(columnNames, "columnNames");
        m.f(referenceColumnNames, "referenceColumnNames");
        this.f6793a = referenceTable;
        this.f6794b = onDelete;
        this.f6795c = onUpdate;
        this.f6796d = columnNames;
        this.f6797e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (m.a(this.f6793a, jVar.f6793a) && m.a(this.f6794b, jVar.f6794b) && m.a(this.f6795c, jVar.f6795c) && m.a(this.f6796d, jVar.f6796d)) {
            return m.a(this.f6797e, jVar.f6797e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6797e.hashCode() + p0.b(defpackage.e.d(defpackage.e.d(this.f6793a.hashCode() * 31, 31, this.f6794b), 31, this.f6795c), 31, this.f6796d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(this.f6793a);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(this.f6794b);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(this.f6795c);
        sb2.append("',\n            |   columnNames = {");
        r.e0(ry.m.y0(ry.m.R0(this.f6796d), ",", null, null, null, 62), "    ");
        r.e0("},", "    ");
        b0 b0Var = b0.f48488a;
        sb2.append(b0Var);
        sb2.append("\n            |   referenceColumnNames = {");
        r.e0(ry.m.y0(ry.m.R0(this.f6797e), ",", null, null, null, 62), "    ");
        r.e0(" }", "    ");
        sb2.append(b0Var);
        sb2.append("\n            |}\n        ");
        return r.e0(r.h0(sb2.toString()), "    ");
    }
}
