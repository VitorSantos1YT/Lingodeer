package ht;

import b7.e0;
import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f33754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f33756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f33757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f33758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f33759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f33760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f33761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f33762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f33763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f33764l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f33765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f33766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f33767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f33768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f33769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f33770s;

    public o(int i11, long j11, int i12, long j12, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, r wordSpellType) {
        kotlin.jvm.internal.m.f(wordSpellType, "wordSpellType");
        this.f33753a = i11;
        this.f33754b = j11;
        this.f33755c = i12;
        this.f33756d = j12;
        this.f33757e = z11;
        this.f33758f = z12;
        this.f33759g = z13;
        this.f33760h = z14;
        this.f33761i = z15;
        this.f33762j = z16;
        this.f33763k = z17;
        this.f33764l = z18;
        this.m = z19;
        this.f33765n = z20;
        this.f33766o = z21;
        this.f33767p = z22;
        this.f33768q = z23;
        this.f33769r = z24;
        this.f33770s = wordSpellType;
    }

    public static o a(o oVar, int i11, long j11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, r rVar, int i12) {
        int i13 = oVar.f33753a;
        long j12 = oVar.f33754b;
        int i14 = (i12 & 4) != 0 ? oVar.f33755c : i11;
        long j13 = (i12 & 8) != 0 ? oVar.f33756d : j11;
        boolean z21 = (i12 & 16) != 0 ? oVar.f33757e : z11;
        boolean z22 = oVar.f33758f;
        int i15 = i14;
        long j14 = j13;
        boolean z23 = z21;
        boolean z24 = oVar.f33759g;
        boolean z25 = oVar.f33760h;
        boolean z26 = (i12 & 256) != 0 ? oVar.f33761i : z12;
        boolean z27 = (i12 & 512) != 0 ? oVar.f33762j : z13;
        boolean z28 = (i12 & 1024) != 0 ? oVar.f33763k : z14;
        boolean z29 = (i12 & 2048) != 0 ? oVar.f33764l : true;
        boolean z30 = (i12 & 4096) != 0 ? oVar.m : z15;
        boolean z31 = (i12 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? oVar.f33765n : z16;
        boolean z32 = z30;
        boolean z33 = (i12 & 16384) != 0 ? oVar.f33766o : z17;
        boolean z34 = (i12 & 32768) != 0 ? oVar.f33767p : z18;
        boolean z35 = (i12 & 65536) != 0 ? oVar.f33768q : z19;
        boolean z36 = (i12 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? oVar.f33769r : z20;
        r wordSpellType = (i12 & 262144) != 0 ? oVar.f33770s : rVar;
        oVar.getClass();
        kotlin.jvm.internal.m.f(wordSpellType, "wordSpellType");
        return new o(i13, j12, i15, j14, z23, z22, z24, z25, z26, z27, z28, z29, z32, z31, z33, z34, z35, z36, wordSpellType);
    }

    public final r b() {
        return this.f33770s;
    }

    public final boolean c() {
        return this.f33762j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f33753a == oVar.f33753a && this.f33754b == oVar.f33754b && this.f33755c == oVar.f33755c && this.f33756d == oVar.f33756d && this.f33757e == oVar.f33757e && this.f33758f == oVar.f33758f && this.f33759g == oVar.f33759g && this.f33760h == oVar.f33760h && this.f33761i == oVar.f33761i && this.f33762j == oVar.f33762j && this.f33763k == oVar.f33763k && this.f33764l == oVar.f33764l && this.m == oVar.m && this.f33765n == oVar.f33765n && this.f33766o == oVar.f33766o && this.f33767p == oVar.f33767p && this.f33768q == oVar.f33768q && this.f33769r == oVar.f33769r && this.f33770s == oVar.f33770s;
    }

    public final int hashCode() {
        return this.f33770s.hashCode() + defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.f(this.f33756d, defpackage.e.b(this.f33755c, defpackage.e.f(this.f33754b, Integer.hashCode(this.f33753a) * 31, 31), 31), 31), 31, this.f33757e), 31, this.f33758f), 31, this.f33759g), 31, this.f33760h), 31, this.f33761i), 31, this.f33762j), 31, this.f33763k), 31, this.f33764l), 31, this.m), 31, this.f33765n), 31, this.f33766o), 31, this.f33767p), 31, this.f33768q), 31, this.f33769r);
    }

    public final String toString() {
        StringBuilder sbO = e0.o(this.f33753a, "CourseTestParams(elemType=", ", elemId=", this.f33754b);
        sbO.append(", modelType=");
        sbO.append(this.f33755c);
        sbO.append(", instanceId=");
        sbO.append(this.f33756d);
        sbO.append(", isTestOut=");
        sbO.append(this.f33757e);
        e0.z(", isPhrase=", ", isSyllable=", sbO, this.f33758f, this.f33759g);
        e0.z(", isTone=", ", isWordMathModel=", sbO, this.f33760h, this.f33761i);
        e0.z(", isVideoModel=", ", isSpecialSpellModel=", sbO, this.f33762j, this.f33763k);
        e0.z(", isRepeatWrong=", ", isRecordToReview=", sbO, this.f33764l, this.m);
        e0.z(", canUseLearningTools=", ", optionShowAudio=", sbO, this.f33765n, this.f33766o);
        e0.z(", showSkipSpeaking=", ", showSkipListening=", sbO, this.f33767p, this.f33768q);
        sbO.append(", showChallengeLabel=");
        sbO.append(this.f33769r);
        sbO.append(", wordSpellType=");
        sbO.append(this.f33770s);
        sbO.append(")");
        return sbO.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(long j11, int i11, int i12) {
        r rVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = i11 == 3;
        boolean z12 = i11 == 2;
        boolean z13 = i11 == 4;
        if (i12 == 9) {
            rVar = r.M9;
        } else if (i12 != 10) {
            rVar = r.M5;
        } else {
            rVar = r.M10;
        }
        this(i11, j11, i12, jCurrentTimeMillis, false, z11, z12, z13, false, false, false, false, true, true, false, false, false, false, rVar);
    }
}
