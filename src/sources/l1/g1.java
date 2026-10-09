package l1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends x1.z implements Parcelable, x1.n, b1, b3 {
    public static final Parcelable.Creator<g1> CREATOR = new f1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q2 f39308b;

    public g1(float f5) {
        x1.f fVarJ = x1.l.j();
        q2 q2Var = new q2(fVarJ.g(), f5);
        if (!(fVarJ instanceof x1.a)) {
            q2Var.f55638b = new q2(1, f5);
        }
        this.f39308b = q2Var;
    }

    @Override // l1.b1
    public final fz.c a() {
        return new kp.j(this, 6);
    }

    @Override // x1.y
    public final x1.a0 b() {
        return this.f39308b;
    }

    @Override // x1.y
    public final x1.a0 d(x1.a0 a0Var, x1.a0 a0Var2, x1.a0 a0Var3) {
        if (((q2) a0Var2).f39429c == ((q2) a0Var3).f39429c) {
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
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f39308b = (q2) a0Var;
    }

    @Override // l1.b3
    public Object getValue() {
        return Float.valueOf(l());
    }

    @Override // l1.b1
    public final Object i() {
        return Float.valueOf(l());
    }

    public final float l() {
        return ((q2) x1.l.t(this.f39308b, this)).f39429c;
    }

    public final void m(float f5) {
        x1.f fVarJ;
        q2 q2Var = (q2) x1.l.h(this.f39308b);
        if (q2Var.f39429c == f5) {
            return;
        }
        q2 q2Var2 = this.f39308b;
        synchronized (x1.l.f55691c) {
            fVarJ = x1.l.j();
            ((q2) x1.l.o(q2Var2, this, fVarJ, q2Var)).f39429c = f5;
        }
        x1.l.n(fVarJ, this);
    }

    @Override // l1.b1
    public void setValue(Object obj) {
        m(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((q2) x1.l.h(this.f39308b)).f39429c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeFloat(l());
    }
}
