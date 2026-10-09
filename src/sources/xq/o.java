package xq;

import hh.p0;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56208c;

    public o(int i11, int i12, int i13) {
        this.f56206a = i11;
        this.f56207b = i12;
        this.f56208c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f56206a == oVar.f56206a && this.f56207b == oVar.f56207b && this.f56208c == oVar.f56208c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56208c) + defpackage.e.b(this.f56207b, Integer.hashCode(this.f56206a) * 31, 31);
    }

    public final String toString() {
        return p0.i(this.f56208c, ")", w4.c.k("DayStreakWidgetVisual(message=", this.f56206a, ", background=", this.f56207b, txBUGYhC.EZMkzICI));
    }
}
