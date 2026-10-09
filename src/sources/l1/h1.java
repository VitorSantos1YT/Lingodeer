package l1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends x1.z implements Parcelable, a1, x1.n {
    public static final Parcelable.Creator<h1> CREATOR = new f1(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s2 f39313b;

    public h1(int i11) {
        x1.f fVarJ = x1.l.j();
        s2 s2Var = new s2(fVarJ.g(), i11);
        if (!(fVarJ instanceof x1.a)) {
            s2Var.f55638b = new s2(1, i11);
        }
        this.f39313b = s2Var;
    }

    @Override // l1.b1
    public final fz.c a() {
        return new r2(this, 0);
    }

    @Override // x1.y
    public final x1.a0 b() {
        return this.f39313b;
    }

    @Override // x1.y
    public final x1.a0 d(x1.a0 a0Var, x1.a0 a0Var2, x1.a0 a0Var3) {
        if (((s2) a0Var2).f39461c == ((s2) a0Var3).f39461c) {
            return a0Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // x1.n
    public final v2 e() {
        return g.f39303t;
    }

    @Override // x1.y
    public final void g(x1.a0 a0Var) {
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f39313b = (s2) a0Var;
    }

    @Override // l1.b1
    public final Object i() {
        return Integer.valueOf(l());
    }

    public final int l() {
        return ((s2) x1.l.t(this.f39313b, this)).f39461c;
    }

    public final void m(int i11) {
        x1.f fVarJ;
        s2 s2Var = (s2) x1.l.h(this.f39313b);
        if (s2Var.f39461c != i11) {
            s2 s2Var2 = this.f39313b;
            synchronized (x1.l.f55691c) {
                fVarJ = x1.l.j();
                ((s2) x1.l.o(s2Var2, this, fVarJ, s2Var)).f39461c = i11;
            }
            x1.l.n(fVarJ, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((s2) x1.l.h(this.f39313b)).f39461c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(l());
    }
}
