package ns;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class r0 {
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qy.h[] f44013f = {null, null, null, null, com.bumptech.glide.d.u(qy.j.PUBLICATION, new d(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f44014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f44015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f44017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f44018e;

    public /* synthetic */ r0(int i11, f0 f0Var, y yVar, String str, v vVar, List list) {
        this.f44014a = (i11 & 1) == 0 ? new f0() : f0Var;
        if ((i11 & 2) == 0) {
            this.f44015b = null;
        } else {
            this.f44015b = yVar;
        }
        if ((i11 & 4) == 0) {
            this.f44016c = BuildConfig.VERSION_NAME;
        } else {
            this.f44016c = str;
        }
        if ((i11 & 8) == 0) {
            this.f44017d = null;
        } else {
            this.f44017d = vVar;
        }
        if ((i11 & 16) == 0) {
            this.f44018e = ry.r.f50854a;
        } else {
            this.f44018e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.m.a(this.f44014a, r0Var.f44014a) && kotlin.jvm.internal.m.a(this.f44015b, r0Var.f44015b) && kotlin.jvm.internal.m.a(this.f44016c, r0Var.f44016c) && kotlin.jvm.internal.m.a(this.f44017d, r0Var.f44017d) && kotlin.jvm.internal.m.a(this.f44018e, r0Var.f44018e);
    }

    public final int hashCode() {
        int iHashCode = this.f44014a.hashCode() * 31;
        y yVar = this.f44015b;
        int iD = defpackage.e.d((iHashCode + (yVar == null ? 0 : yVar.hashCode())) * 31, 31, this.f44016c);
        v vVar = this.f44017d;
        return this.f44018e.hashCode() + ((iD + (vVar != null ? vVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CourseMistakeExplainResponse(header=");
        sb2.append(this.f44014a);
        sb2.append(", comparisonView=");
        sb2.append(this.f44015b);
        sb2.append(", explanationMarkdown=");
        sb2.append(this.f44016c);
        sb2.append(", comparisonTable=");
        sb2.append(this.f44017d);
        sb2.append(", examples=");
        return b7.e0.n(sb2, this.f44018e, ")");
    }

    public r0(f0 header, y yVar, String str, v vVar, List examples) {
        kotlin.jvm.internal.m.f(header, "header");
        kotlin.jvm.internal.m.f(examples, "examples");
        this.f44014a = header;
        this.f44015b = yVar;
        this.f44016c = str;
        this.f44017d = vVar;
        this.f44018e = examples;
    }
}
