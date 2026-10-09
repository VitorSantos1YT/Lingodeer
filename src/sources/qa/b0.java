package qa;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends v {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f47597k0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public v[] f47600n0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ArrayList f47595i0 = new ArrayList();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f47596j0 = true;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f47598l0 = false;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f47599m0 = 0;

    @Override // qa.v
    public final void C(View view) {
        super.C(view);
        int size = this.f47595i0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((v) this.f47595i0.get(i11)).C(view);
        }
    }

    @Override // qa.v
    public final void D() {
        this.f47679b0 = 0L;
        int i11 = 0;
        a0 a0Var = new a0(this, i11);
        while (i11 < this.f47595i0.size()) {
            v vVar = (v) this.f47595i0.get(i11);
            vVar.a(a0Var);
            vVar.D();
            long j11 = vVar.f47679b0;
            if (this.f47596j0) {
                this.f47679b0 = Math.max(this.f47679b0, j11);
            } else {
                long j12 = this.f47679b0;
                vVar.f47683d0 = j12;
                this.f47679b0 = j12 + j11;
            }
            i11++;
        }
    }

    @Override // qa.v
    public final v E(t tVar) {
        super.E(tVar);
        return this;
    }

    @Override // qa.v
    public final void F(View view) {
        for (int i11 = 0; i11 < this.f47595i0.size(); i11++) {
            ((v) this.f47595i0.get(i11)).F(view);
        }
        this.f47685f.remove(view);
    }

    @Override // qa.v
    public final void G(View view) {
        super.G(view);
        v[] vVarArr = this.f47600n0;
        this.f47600n0 = null;
        if (vVarArr == null) {
            vVarArr = new v[this.f47595i0.size()];
        }
        v[] vVarArr2 = (v[]) this.f47595i0.toArray(vVarArr);
        int size = this.f47595i0.size();
        for (int i11 = 0; i11 < size; i11++) {
            vVarArr2[i11].G(view);
        }
        Arrays.fill(vVarArr2, (Object) null);
        this.f47600n0 = vVarArr2;
    }

    @Override // qa.v
    public final void I() {
        if (this.f47595i0.isEmpty()) {
            Q();
            o();
            return;
        }
        a0 a0Var = new a0();
        a0Var.f47593b = this;
        ArrayList arrayList = this.f47595i0;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((v) obj).a(a0Var);
        }
        this.f47597k0 = this.f47595i0.size();
        if (this.f47596j0) {
            ArrayList arrayList2 = this.f47595i0;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((v) obj2).I();
            }
            return;
        }
        for (int i13 = 1; i13 < this.f47595i0.size(); i13++) {
            ((v) this.f47595i0.get(i13 - 1)).a(new a0((v) this.f47595i0.get(i13), 2));
        }
        v vVar = (v) this.f47595i0.get(0);
        if (vVar != null) {
            vVar.I();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // qa.v
    public final void J(long j11, long j12) {
        long j13;
        long j14 = this.f47679b0;
        long j15 = 0;
        if (this.M != null) {
            if (j11 < 0 && j12 < 0) {
                return;
            }
            if (j11 > j14 && j12 > j14) {
                return;
            }
        }
        boolean z11 = j11 < j12;
        if ((j11 >= 0 && j12 < 0) || (j11 <= j14 && j12 > j14)) {
            this.V = false;
            B(this, u.f47669x, z11);
        }
        if (!this.f47596j0) {
            int size = 1;
            while (true) {
                if (size >= this.f47595i0.size()) {
                    size = this.f47595i0.size();
                    break;
                } else if (((v) this.f47595i0.get(size)).f47683d0 > j12) {
                    break;
                } else {
                    size++;
                }
            }
            int i11 = size - 1;
            if (j11 >= j12) {
                while (true) {
                    if (i11 < this.f47595i0.size()) {
                        v vVar = (v) this.f47595i0.get(i11);
                        long j16 = vVar.f47683d0;
                        j13 = j15;
                        long j17 = j11 - j16;
                        if (j17 < j13) {
                            break;
                        }
                        vVar.J(j17, j12 - j16);
                        i11++;
                        j15 = j13;
                    }
                }
            } else {
                j13 = 0;
                while (i11 >= 0) {
                    v vVar2 = (v) this.f47595i0.get(i11);
                    long j18 = vVar2.f47683d0;
                    long j19 = j11 - j18;
                    vVar2.J(j19, j12 - j18);
                    if (j19 >= 0) {
                        break;
                    } else {
                        i11--;
                    }
                }
            }
            if (this.M != null) {
                if ((j11 > j14 || j12 > j14) && (j11 >= 0 || j12 < j13)) {
                    return;
                }
                if (j11 > j14) {
                    this.V = true;
                }
                B(this, u.f47670y, z11);
            }
        }
        for (int i12 = 0; i12 < this.f47595i0.size(); i12++) {
            ((v) this.f47595i0.get(i12)).J(j11, j12);
        }
        j13 = j15;
        if (this.M != null) {
            if (j11 > j14) {
                return;
            } else {
                return;
            }
            if (j11 > j14) {
                this.V = true;
            }
            B(this, u.f47670y, z11);
        }
    }

    @Override // qa.v
    public final void L(o00.a aVar) {
        this.Z = aVar;
        this.f47599m0 |= 8;
        int size = this.f47595i0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((v) this.f47595i0.get(i11)).L(aVar);
        }
    }

    @Override // qa.v
    public final void N(ns.o oVar) {
        super.N(oVar);
        this.f47599m0 |= 4;
        if (this.f47595i0 != null) {
            for (int i11 = 0; i11 < this.f47595i0.size(); i11++) {
                ((v) this.f47595i0.get(i11)).N(oVar);
            }
        }
    }

    @Override // qa.v
    public final void O() {
        this.f47599m0 |= 2;
        int size = this.f47595i0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((v) this.f47595i0.get(i11)).O();
        }
    }

    @Override // qa.v
    public final void P(long j11) {
        this.f47678b = j11;
    }

    @Override // qa.v
    public final String R(String str) {
        String strR = super.R(str);
        for (int i11 = 0; i11 < this.f47595i0.size(); i11++) {
            StringBuilder sbR = defpackage.e.r(strR, "\n");
            sbR.append(((v) this.f47595i0.get(i11)).R(str + "  "));
            strR = sbR.toString();
        }
        return strR;
    }

    public final void S(v vVar) {
        this.f47595i0.add(vVar);
        vVar.M = this;
        long j11 = this.f47680c;
        if (j11 >= 0) {
            vVar.K(j11);
        }
        if ((this.f47599m0 & 1) != 0) {
            vVar.M(this.f47682d);
        }
        if ((this.f47599m0 & 2) != 0) {
            vVar.O();
        }
        if ((this.f47599m0 & 4) != 0) {
            vVar.N(this.f47677a0);
        }
        if ((this.f47599m0 & 8) != 0) {
            vVar.L(this.Z);
        }
    }

    public final v T(int i11) {
        if (i11 < 0 || i11 >= this.f47595i0.size()) {
            return null;
        }
        return (v) this.f47595i0.get(i11);
    }

    @Override // qa.v
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void K(long j11) {
        ArrayList arrayList;
        this.f47680c = j11;
        if (j11 < 0 || (arrayList = this.f47595i0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((v) this.f47595i0.get(i11)).K(j11);
        }
    }

    @Override // qa.v
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void M(TimeInterpolator timeInterpolator) {
        this.f47599m0 |= 1;
        ArrayList arrayList = this.f47595i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((v) this.f47595i0.get(i11)).M(timeInterpolator);
            }
        }
        this.f47682d = timeInterpolator;
    }

    public final void W(int i11) {
        if (i11 == 0) {
            this.f47596j0 = true;
        } else {
            if (i11 != 1) {
                throw new AndroidRuntimeException(nv.p.j(i11, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f47596j0 = false;
        }
    }

    @Override // qa.v
    public final void c(View view) {
        for (int i11 = 0; i11 < this.f47595i0.size(); i11++) {
            ((v) this.f47595i0.get(i11)).c(view);
        }
        this.f47685f.add(view);
    }

    @Override // qa.v
    public final void cancel() {
        super.cancel();
        v[] vVarArr = this.f47600n0;
        this.f47600n0 = null;
        if (vVarArr == null) {
            vVarArr = new v[this.f47595i0.size()];
        }
        v[] vVarArr2 = (v[]) this.f47595i0.toArray(vVarArr);
        int size = this.f47595i0.size();
        for (int i11 = 0; i11 < size; i11++) {
            vVarArr2[i11].cancel();
        }
        Arrays.fill(vVarArr2, (Object) null);
        this.f47600n0 = vVarArr2;
    }

    @Override // qa.v
    public final void f(d0 d0Var) {
        if (z(d0Var.f47605b)) {
            ArrayList arrayList = this.f47595i0;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                v vVar = (v) obj;
                if (vVar.z(d0Var.f47605b)) {
                    vVar.f(d0Var);
                    d0Var.f47606c.add(vVar);
                }
            }
        }
    }

    @Override // qa.v
    public final void h(d0 d0Var) {
        int size = this.f47595i0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((v) this.f47595i0.get(i11)).h(d0Var);
        }
    }

    @Override // qa.v
    public final void i(d0 d0Var) {
        if (z(d0Var.f47605b)) {
            ArrayList arrayList = this.f47595i0;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                v vVar = (v) obj;
                if (vVar.z(d0Var.f47605b)) {
                    vVar.i(d0Var);
                    d0Var.f47606c.add(vVar);
                }
            }
        }
    }

    @Override // qa.v
    /* JADX INFO: renamed from: l */
    public final v clone() {
        b0 b0Var = (b0) super.clone();
        b0Var.f47595i0 = new ArrayList();
        int size = this.f47595i0.size();
        for (int i11 = 0; i11 < size; i11++) {
            v vVarClone = ((v) this.f47595i0.get(i11)).clone();
            b0Var.f47595i0.add(vVarClone);
            vVarClone.M = b0Var;
        }
        return b0Var;
    }

    @Override // qa.v
    public final void n(ViewGroup viewGroup, dm.c cVar, dm.c cVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j11 = this.f47678b;
        int size = this.f47595i0.size();
        for (int i11 = 0; i11 < size; i11++) {
            v vVar = (v) this.f47595i0.get(i11);
            if (j11 > 0 && (this.f47596j0 || i11 == 0)) {
                long j12 = vVar.f47678b;
                if (j12 > 0) {
                    vVar.P(j12 + j11);
                } else {
                    vVar.P(j11);
                }
            }
            vVar.n(viewGroup, cVar, cVar2, arrayList, arrayList2);
        }
    }

    @Override // qa.v
    public final v p(View view) {
        throw null;
    }

    @Override // qa.v
    public final void q() {
        for (int i11 = 0; i11 < this.f47595i0.size(); i11++) {
            ((v) this.f47595i0.get(i11)).q();
        }
        super.q();
    }

    @Override // qa.v
    public final boolean w() {
        for (int i11 = 0; i11 < this.f47595i0.size(); i11++) {
            if (((v) this.f47595i0.get(i11)).w()) {
                return true;
            }
        }
        return false;
    }

    @Override // qa.v
    public final boolean x() {
        int size = this.f47595i0.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!((v) this.f47595i0.get(i11)).x()) {
                return false;
            }
        }
        return true;
    }
}
