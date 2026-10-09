package l1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends x1.z implements Parcelable, x1.n {
    public static final Parcelable.Creator<k1> CREATOR = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2 f39329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u2 f39330c;

    public k1(Object obj, v2 v2Var) {
        this.f39329b = v2Var;
        x1.f fVarJ = x1.l.j();
        u2 u2Var = new u2(fVarJ.g(), obj);
        if (!(fVarJ instanceof x1.a)) {
            u2Var.f55638b = new u2(1, obj);
        }
        this.f39330c = u2Var;
    }

    @Override // l1.b1
    public final fz.c a() {
        return new kp.j(this, 8);
    }

    @Override // x1.y
    public final x1.a0 b() {
        return this.f39330c;
    }

    @Override // x1.y
    public final x1.a0 d(x1.a0 a0Var, x1.a0 a0Var2, x1.a0 a0Var3) {
        if (this.f39329b.a(((u2) a0Var2).f39485c, ((u2) a0Var3).f39485c)) {
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
        return this.f39329b;
    }

    @Override // x1.y
    public final void g(x1.a0 a0Var) {
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f39330c = (u2) a0Var;
    }

    @Override // l1.b3
    public final Object getValue() {
        return ((u2) x1.l.t(this.f39330c, this)).f39485c;
    }

    @Override // l1.b1
    public final Object i() {
        return getValue();
    }

    @Override // l1.b1
    public final void setValue(Object obj) {
        x1.f fVarJ;
        u2 u2Var = (u2) x1.l.h(this.f39330c);
        if (this.f39329b.a(u2Var.f39485c, obj)) {
            return;
        }
        u2 u2Var2 = this.f39330c;
        synchronized (x1.l.f55691c) {
            fVarJ = x1.l.j();
            ((u2) x1.l.o(u2Var2, this, fVarJ, u2Var)).f39485c = obj;
        }
        x1.l.n(fVarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((u2) x1.l.h(this.f39330c)).f39485c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12;
        parcel.writeValue(getValue());
        g gVar = g.f39300d;
        v2 v2Var = this.f39329b;
        if (kotlin.jvm.internal.m.a(v2Var, gVar)) {
            i12 = 0;
        } else if (kotlin.jvm.internal.m.a(v2Var, g.f39303t)) {
            i12 = 1;
        } else {
            if (!kotlin.jvm.internal.m.a(v2Var, g.f39301e)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i12 = 2;
        }
        parcel.writeInt(i12);
    }
}
