package bv;

import g00.d1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class v0 {
    public static final u0 Companion = new u0();
    public static final qy.h[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f6364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f6365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f0 f6366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f6369l;

    static {
        qy.j jVar = qy.j.PUBLICATION;
        m = new qy.h[]{null, null, null, null, null, null, com.bumptech.glide.d.u(jVar, new bq.u(14)), com.bumptech.glide.d.u(jVar, new bq.u(15)), null, null, null, null};
    }

    public /* synthetic */ v0(int i11, List list, int i12, String str, String str2, String str3, int i13, List list2, List list3, f0 f0Var, String str4, String str5, y0 y0Var) {
        if (4031 != (i11 & 4031)) {
            d1.k(i11, 4031, t0.f6356a.getDescriptor());
            throw null;
        }
        this.f6358a = list;
        this.f6359b = i12;
        this.f6360c = str;
        this.f6361d = str2;
        this.f6362e = str3;
        this.f6363f = i13;
        if ((i11 & 64) == 0) {
            this.f6364g = null;
        } else {
            this.f6364g = list2;
        }
        this.f6365h = list3;
        this.f6366i = f0Var;
        this.f6367j = str4;
        this.f6368k = str5;
        this.f6369l = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.m.a(this.f6358a, v0Var.f6358a) && this.f6359b == v0Var.f6359b && kotlin.jvm.internal.m.a(this.f6360c, v0Var.f6360c) && kotlin.jvm.internal.m.a(this.f6361d, v0Var.f6361d) && kotlin.jvm.internal.m.a(this.f6362e, v0Var.f6362e) && this.f6363f == v0Var.f6363f && kotlin.jvm.internal.m.a(this.f6364g, v0Var.f6364g) && kotlin.jvm.internal.m.a(this.f6365h, v0Var.f6365h) && kotlin.jvm.internal.m.a(this.f6366i, v0Var.f6366i) && kotlin.jvm.internal.m.a(this.f6367j, v0Var.f6367j) && kotlin.jvm.internal.m.a(this.f6368k, v0Var.f6368k) && kotlin.jvm.internal.m.a(this.f6369l, v0Var.f6369l);
    }

    public final int hashCode() {
        int iB = defpackage.e.b(this.f6363f, defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.b(this.f6359b, this.f6358a.hashCode() * 31, 31), 31, this.f6360c), 31, this.f6361d), 31, this.f6362e), 31);
        List list = this.f6364g;
        return this.f6369l.hashCode() + defpackage.e.d(defpackage.e.d((this.f6366i.hashCode() + hh.p0.b((iB + (list == null ? 0 : list.hashCode())) * 31, 31, this.f6365h)) * 31, 31, this.f6367j), 31, this.f6368k);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WordResult(word_parts=");
        sb2.append(this.f6358a);
        sb2.append(", charType=");
        sb2.append(this.f6359b);
        sb2.append(", pinyin=");
        com.google.android.material.datepicker.d.w(sb2, this.f6360c, ", rawpinyin=", this.f6361d, ", symbolpinyin=");
        sb2.append(this.f6362e);
        sb2.append(", readType=");
        sb2.append(this.f6363f);
        sb2.append(", repetition=");
        sb2.append(this.f6364g);
        sb2.append(", phonemes=");
        sb2.append(this.f6365h);
        sb2.append(", span=");
        sb2.append(this.f6366i);
        sb2.append(", word=");
        sb2.append(this.f6367j);
        sb2.append(", tone=");
        sb2.append(this.f6368k);
        sb2.append(", scores=");
        sb2.append(this.f6369l);
        sb2.append(")");
        return sb2.toString();
    }
}
