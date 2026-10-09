package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2598e;

    public boolean a() {
        int i11;
        int i12;
        int i13;
        int i14 = this.f2594a;
        int i15 = 2;
        if ((i14 & 7) != 0) {
            int i16 = this.f2597d;
            int i17 = this.f2595b;
            if (i16 > i17) {
                i13 = 1;
            } else {
                i13 = i16 == i17 ? 2 : 4;
            }
            if ((i13 & i14) == 0) {
                return false;
            }
        }
        if ((i14 & 112) != 0) {
            int i18 = this.f2597d;
            int i19 = this.f2596c;
            if (i18 > i19) {
                i12 = 1;
            } else {
                i12 = i18 == i19 ? 2 : 4;
            }
            if (((i12 << 4) & i14) == 0) {
                return false;
            }
        }
        if ((i14 & 1792) != 0) {
            int i21 = this.f2598e;
            int i22 = this.f2595b;
            if (i21 > i22) {
                i11 = 1;
            } else {
                i11 = i21 == i22 ? 2 : 4;
            }
            if (((i11 << 8) & i14) == 0) {
                return false;
            }
        }
        if ((i14 & 28672) != 0) {
            int i23 = this.f2598e;
            int i24 = this.f2596c;
            if (i23 > i24) {
                i15 = 1;
            } else if (i23 != i24) {
                i15 = 4;
            }
            if ((i14 & (i15 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
