package kr;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38438e;

    public c1(List sentences, List picArray, int i11, boolean z11, boolean z12) {
        kotlin.jvm.internal.m.f(sentences, "sentences");
        kotlin.jvm.internal.m.f(picArray, "picArray");
        this.f38434a = sentences;
        this.f38435b = picArray;
        this.f38436c = i11;
        this.f38437d = z11;
        this.f38438e = z12;
    }

    public static c1 a(c1 c1Var, ArrayList arrayList, int i11, boolean z11, boolean z12, int i12) {
        List list = arrayList;
        if ((i12 & 1) != 0) {
            list = c1Var.f38434a;
        }
        List sentences = list;
        List picArray = c1Var.f38435b;
        if ((i12 & 4) != 0) {
            i11 = c1Var.f38436c;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            z11 = c1Var.f38437d;
        }
        boolean z13 = z11;
        if ((i12 & 16) != 0) {
            z12 = c1Var.f38438e;
        }
        c1Var.getClass();
        kotlin.jvm.internal.m.f(sentences, "sentences");
        kotlin.jvm.internal.m.f(picArray, "picArray");
        return new c1(sentences, picArray, i13, z13, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return kotlin.jvm.internal.m.a(this.f38434a, c1Var.f38434a) && kotlin.jvm.internal.m.a(this.f38435b, c1Var.f38435b) && this.f38436c == c1Var.f38436c && this.f38437d == c1Var.f38437d && this.f38438e == c1Var.f38438e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38438e) + defpackage.e.e(defpackage.e.b(this.f38436c, hh.p0.b(this.f38434a.hashCode() * 31, 31, this.f38435b), 31), 31, this.f38437d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(sentences=");
        sb2.append(this.f38434a);
        sb2.append(", picArray=");
        sb2.append(this.f38435b);
        sb2.append(", currentIndex=");
        sb2.append(this.f38436c);
        sb2.append(", finished=");
        sb2.append(this.f38437d);
        sb2.append(", showTranslation=");
        return hh.p0.p(sb2, this.f38438e, ")");
    }
}
