package mv;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f42197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f42198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kv.h0 f42199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f42200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kv.j0 f42201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kv.j0 f42202h;

    public d0(boolean z11, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, kv.h0 h0Var, String str, kv.j0 j0Var, kv.j0 j0Var2) {
        this.f42195a = z11;
        this.f42196b = arrayList;
        this.f42197c = arrayList2;
        this.f42198d = arrayList3;
        this.f42199e = h0Var;
        this.f42200f = str;
        this.f42201g = j0Var;
        this.f42202h = j0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f42195a == d0Var.f42195a && this.f42196b.equals(d0Var.f42196b) && this.f42197c.equals(d0Var.f42197c) && this.f42198d.equals(d0Var.f42198d) && kotlin.jvm.internal.m.a(this.f42199e, d0Var.f42199e) && this.f42200f.equals(d0Var.f42200f) && kotlin.jvm.internal.m.a(this.f42201g, d0Var.f42201g) && kotlin.jvm.internal.m.a(this.f42202h, d0Var.f42202h);
    }

    public final int hashCode() {
        int iB = nv.p.b(this.f42198d, nv.p.b(this.f42197c, nv.p.b(this.f42196b, Boolean.hashCode(this.f42195a) * 31, 31), 31), 31);
        kv.h0 h0Var = this.f42199e;
        int iD = defpackage.e.d((iB + (h0Var == null ? 0 : h0Var.hashCode())) * 31, 31, this.f42200f);
        kv.j0 j0Var = this.f42201g;
        int iHashCode = (iD + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        kv.j0 j0Var2 = this.f42202h;
        return iHashCode + (j0Var2 != null ? j0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "Success(isFirstTimeEnter=" + this.f42195a + ", hiraganaLessons=" + this.f42196b + ", katakanaLessons=" + this.f42197c + ", handWritingLessons=" + this.f42198d + ", currentClickLesson=" + this.f42199e + ", currentEnteredLessonKey=" + this.f42200f + ", hiraganaExamLesson=" + this.f42201g + ", katakanaExamLesson=" + this.f42202h + ")";
    }
}
