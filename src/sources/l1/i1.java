package l1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends x1.z implements Parcelable, x1.n, b1, b3 {
    public static final Parcelable.Creator<i1> CREATOR = new f1(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t2 f39317b;

    public i1(long j11) {
        x1.f fVarJ = x1.l.j();
        t2 t2Var = new t2(fVarJ.g(), j11);
        if (!(fVarJ instanceof x1.a)) {
            t2Var.f55638b = new t2(1, j11);
        }
        this.f39317b = t2Var;
    }

    @Override // l1.b1
    public final fz.c a() {
        return new kp.j(this, 7);
    }

    @Override // x1.y
    public final x1.a0 b() {
        return this.f39317b;
    }

    @Override // x1.y
    public final x1.a0 d(x1.a0 a0Var, x1.a0 a0Var2, x1.a0 a0Var3) {
        if (((t2) a0Var2).f39473c == ((t2) a0Var3).f39473c) {
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
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f39317b = (t2) a0Var;
    }

    @Override // l1.b1
    public final Object i() {
        return Long.valueOf(l());
    }

    public final long l() {
        return ((t2) x1.l.t(this.f39317b, this)).f39473c;
    }

    @Override // l1.b3
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long getValue() {
        return Long.valueOf(l());
    }

    public final void n(long j11) {
        x1.f fVarJ;
        t2 t2Var = (t2) x1.l.h(this.f39317b);
        if (t2Var.f39473c != j11) {
            t2 t2Var2 = this.f39317b;
            synchronized (x1.l.f55691c) {
                fVarJ = x1.l.j();
                ((t2) x1.l.o(t2Var2, this, fVarJ, t2Var)).f39473c = j11;
            }
            x1.l.n(fVarJ, this);
        }
    }

    @Override // l1.b1
    public void setValue(Object obj) {
        n(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((t2) x1.l.h(this.f39317b)).f39473c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(l());
    }
}
