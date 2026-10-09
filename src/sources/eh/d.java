package eh;

import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f25544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f25550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f25551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f25552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f25553l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f25554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f25555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f25556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f25557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f25558r;

    public d(int i11, boolean z11, List knowledgeCardUnits, int i12, int i13, boolean z12, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26) {
        m.f(knowledgeCardUnits, "knowledgeCardUnits");
        this.f25542a = i11;
        this.f25543b = z11;
        this.f25544c = knowledgeCardUnits;
        this.f25545d = i12;
        this.f25546e = i13;
        this.f25547f = z12;
        this.f25548g = i14;
        this.f25549h = i15;
        this.f25550i = i16;
        this.f25551j = i17;
        this.f25552k = i18;
        this.f25553l = i19;
        this.m = i21;
        this.f25554n = i22;
        this.f25555o = i23;
        this.f25556p = i24;
        this.f25557q = i25;
        this.f25558r = i26;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f25542a == dVar.f25542a && this.f25543b == dVar.f25543b && m.a(this.f25544c, dVar.f25544c) && this.f25545d == dVar.f25545d && this.f25546e == dVar.f25546e && this.f25547f == dVar.f25547f && this.f25548g == dVar.f25548g && this.f25549h == dVar.f25549h && this.f25550i == dVar.f25550i && this.f25551j == dVar.f25551j && this.f25552k == dVar.f25552k && this.f25553l == dVar.f25553l && this.m == dVar.m && this.f25554n == dVar.f25554n && this.f25555o == dVar.f25555o && this.f25556p == dVar.f25556p && this.f25557q == dVar.f25557q && this.f25558r == dVar.f25558r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25558r) + defpackage.e.b(this.f25557q, defpackage.e.b(this.f25556p, defpackage.e.b(this.f25555o, defpackage.e.b(this.f25554n, defpackage.e.b(this.m, defpackage.e.b(this.f25553l, defpackage.e.b(this.f25552k, defpackage.e.b(this.f25551j, defpackage.e.b(this.f25550i, defpackage.e.b(this.f25549h, defpackage.e.b(this.f25548g, defpackage.e.e(defpackage.e.b(this.f25546e, defpackage.e.b(this.f25545d, p0.b(defpackage.e.e(defpackage.e.e(Integer.hashCode(this.f25542a) * 31, 31, this.f25543b), 31, false), 31, this.f25544c), 31), 31), 31, this.f25547f), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(keyLanguage=");
        sb2.append(this.f25542a);
        sb2.append(", showKnowledgeCard=");
        sb2.append(this.f25543b);
        sb2.append(", showExtentWord=false, knowledgeCardUnits=");
        sb2.append(this.f25544c);
        sb2.append(", availableReviewCount=");
        sb2.append(this.f25545d);
        sb2.append(", flashCardCount=");
        sb2.append(this.f25546e);
        sb2.append(", canEnterFlashCardIndex=");
        sb2.append(this.f25547f);
        sb2.append(", characterCount=");
        ep.a.v(this.f25548g, this.f25549h, ", wordCount=", ", sentenceCount=", sb2);
        ep.a.v(this.f25550i, this.f25551j, ", knowledgeCardCount=", ", bookmarkCharacterCount=", sb2);
        ep.a.v(this.f25552k, this.f25553l, ", bookmarkWordCount=", ", bookmarkSentenceCount=", sb2);
        ep.a.v(this.m, this.f25554n, ", extentWordCount=", ", bookmarkExtentWordCount=", sb2);
        ep.a.v(this.f25555o, this.f25556p, ", noteCharacterCount=", ", noteWordCount=", sb2);
        sb2.append(this.f25557q);
        sb2.append(", noteSentenceCount=");
        sb2.append(this.f25558r);
        sb2.append(")");
        return sb2.toString();
    }
}
