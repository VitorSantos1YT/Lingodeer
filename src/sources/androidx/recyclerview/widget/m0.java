package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0 f2534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2538e;

    public m0() {
        d();
    }

    public final void a() {
        this.f2536c = this.f2537d ? this.f2534a.g() : this.f2534a.k();
    }

    public final void b(View view, int i11) {
        if (this.f2537d) {
            this.f2536c = this.f2534a.m() + this.f2534a.b(view);
        } else {
            this.f2536c = this.f2534a.e(view);
        }
        this.f2535b = i11;
    }

    public final void c(View view, int i11) {
        int iM = this.f2534a.m();
        if (iM >= 0) {
            b(view, i11);
            return;
        }
        this.f2535b = i11;
        if (!this.f2537d) {
            int iE = this.f2534a.e(view);
            int iK = iE - this.f2534a.k();
            this.f2536c = iE;
            if (iK > 0) {
                int iG = (this.f2534a.g() - Math.min(0, (this.f2534a.g() - iM) - this.f2534a.b(view))) - (this.f2534a.c(view) + iE);
                if (iG < 0) {
                    this.f2536c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (this.f2534a.g() - iM) - this.f2534a.b(view);
        this.f2536c = this.f2534a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.f2536c - this.f2534a.c(view);
            int iK2 = this.f2534a.k();
            int iMin = iC - (Math.min(this.f2534a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f2536c = Math.min(iG2, -iMin) + this.f2536c;
            }
        }
    }

    public final void d() {
        this.f2535b = -1;
        this.f2536c = Integer.MIN_VALUE;
        this.f2537d = false;
        this.f2538e = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
        sb2.append(this.f2535b);
        sb2.append(", mCoordinate=");
        sb2.append(this.f2536c);
        sb2.append(", mLayoutFromEnd=");
        sb2.append(this.f2537d);
        sb2.append(", mValid=");
        return ep.a.l(sb2, this.f2538e, '}');
    }
}
