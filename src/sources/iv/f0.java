package iv;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f34721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f34722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f34723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kv.g0 f34724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f34725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kv.i0 f34726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kv.i0 f34727h;

    public f0(boolean z11, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, kv.g0 g0Var, String str, kv.i0 i0Var, kv.i0 i0Var2) {
        this.f34720a = z11;
        this.f34721b = arrayList;
        this.f34722c = arrayList2;
        this.f34723d = arrayList3;
        this.f34724e = g0Var;
        this.f34725f = str;
        this.f34726g = i0Var;
        this.f34727h = i0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f34720a == f0Var.f34720a && this.f34721b.equals(f0Var.f34721b) && this.f34722c.equals(f0Var.f34722c) && this.f34723d.equals(f0Var.f34723d) && kotlin.jvm.internal.m.a(this.f34724e, f0Var.f34724e) && this.f34725f.equals(f0Var.f34725f) && kotlin.jvm.internal.m.a(this.f34726g, f0Var.f34726g) && kotlin.jvm.internal.m.a(this.f34727h, f0Var.f34727h);
    }

    public final int hashCode() {
        int iB = nv.p.b(this.f34723d, nv.p.b(this.f34722c, nv.p.b(this.f34721b, Boolean.hashCode(this.f34720a) * 31, 31), 31), 31);
        kv.g0 g0Var = this.f34724e;
        int iD = defpackage.e.d((iB + (g0Var == null ? 0 : g0Var.hashCode())) * 31, 31, this.f34725f);
        kv.i0 i0Var = this.f34726g;
        int iHashCode = (iD + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        kv.i0 i0Var2 = this.f34727h;
        return iHashCode + (i0Var2 != null ? i0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "JPSyllableIndexUiStateSuccess(isFirstTimeEnter=" + this.f34720a + ", hiraganaLessons=" + this.f34721b + ", katakanaLessons=" + this.f34722c + ", handWritingLessons=" + this.f34723d + ", currentClickLesson=" + this.f34724e + ", currentEnteredLessonKey=" + this.f34725f + ", hiraganaExamLesson=" + this.f34726g + ", katakanaExamLesson=" + this.f34727h + ")";
    }
}
