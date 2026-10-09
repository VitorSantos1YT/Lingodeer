package rt;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f50786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f50787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f50788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f50789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f50790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f50791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f50792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f50793l;

    public z8(int i11, int i12, int i13, boolean z11, boolean z12, boolean z13, int i14, float f5, int i15, int i16, boolean z14, int i17) {
        this.f50782a = i11;
        this.f50783b = i12;
        this.f50784c = i13;
        this.f50785d = z11;
        this.f50786e = z12;
        this.f50787f = z13;
        this.f50788g = i14;
        this.f50789h = f5;
        this.f50790i = i15;
        this.f50791j = i16;
        this.f50792k = z14;
        this.f50793l = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        return this.f50782a == z8Var.f50782a && this.f50783b == z8Var.f50783b && this.f50784c == z8Var.f50784c && this.f50785d == z8Var.f50785d && this.f50786e == z8Var.f50786e && this.f50787f == z8Var.f50787f && this.f50788g == z8Var.f50788g && Float.compare(this.f50789h, z8Var.f50789h) == 0 && this.f50790i == z8Var.f50790i && this.f50791j == z8Var.f50791j && this.f50792k == z8Var.f50792k && this.f50793l == z8Var.f50793l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50793l) + defpackage.e.e(defpackage.e.b(this.f50791j, defpackage.e.b(this.f50790i, defpackage.e.a(defpackage.e.b(this.f50788g, defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.b(this.f50784c, defpackage.e.b(this.f50783b, Integer.hashCode(this.f50782a) * 31, 31), 31), 31, this.f50785d), 31, this.f50786e), 31, this.f50787f), 31), this.f50789h, 31), 31), 31), 31, this.f50792k);
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("CourseSettings(scriptStyle=", this.f50782a, ", scriptStyleInAnswerRaw=", this.f50783b, ", scriptShortcutDisplay=");
        sbK.append(this.f50784c);
        sbK.append(", enableAudioAutoPlay=");
        sbK.append(this.f50785d);
        sbK.append(", soundEffect=");
        ep.a.B(", animation=", ", fontSizeStyle=", sbK, this.f50786e, this.f50787f);
        sbK.append(this.f50788g);
        sbK.append(", pronunciationGuideAlpha=");
        sbK.append(this.f50789h);
        sbK.append(SemtNwfPgIhi.XRkB);
        ep.a.v(this.f50790i, this.f50791j, ", audioSpeed=", ", hideTranslation=", sbK);
        sbK.append(this.f50792k);
        sbK.append(", voiceMode=");
        sbK.append(this.f50793l);
        sbK.append(")");
        return sbK.toString();
    }
}
