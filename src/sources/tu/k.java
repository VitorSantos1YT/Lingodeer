package tu;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f52596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f52598e;

    public k(int i11, int i12, int i13, boolean z11, boolean z12) {
        this.f52594a = i11;
        this.f52595b = i12;
        this.f52596c = z11;
        this.f52597d = i13;
        this.f52598e = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f52594a == kVar.f52594a && this.f52595b == kVar.f52595b && this.f52596c == kVar.f52596c && this.f52597d == kVar.f52597d && this.f52598e == kVar.f52598e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52598e) + defpackage.e.b(this.f52597d, defpackage.e.e(defpackage.e.b(this.f52595b, Integer.hashCode(this.f52594a) * 31, 31), 31, this.f52596c), 31);
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("LeaderBoardEmojiStatusWithResource(id=", this.f52594a, ", drawableRes=", this.f52595b, ", needPay=");
        sbK.append(this.f52596c);
        sbK.append(", riveRes=");
        sbK.append(this.f52597d);
        sbK.append(", isSelected=");
        return p0.p(sbK, this.f52598e, ")");
    }
}
