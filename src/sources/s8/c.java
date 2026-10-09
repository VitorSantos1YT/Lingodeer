package s8;

import b0.p2;
import b7.w;
import java.util.Arrays;
import x7.r;
import y6.d0;
import y6.o;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r f51482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p2 f51483o;

    @Override // s8.i
    public final long b(w wVar) {
        byte[] bArr = wVar.f4039a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i11 = (bArr[2] & 255) >> 4;
        if (i11 == 6 || i11 == 7) {
            wVar.J(4);
            wVar.D();
        }
        int iT = x7.a.t(i11, wVar);
        wVar.I(0);
        return iT;
    }

    @Override // s8.i
    public final boolean c(w wVar, long j11, qp.b bVar) {
        byte[] bArr = wVar.f4039a;
        r rVar = this.f51482n;
        if (rVar == null) {
            r rVar2 = new r(bArr, 17);
            this.f51482n = rVar2;
            o oVarA = rVar2.c(Arrays.copyOfRange(bArr, 9, wVar.f4041c), null).a();
            oVarA.f57264l = d0.o("audio/ogg");
            bVar.f47832b = new p(oVarA);
            return true;
        }
        byte b3 = bArr[0];
        if ((b3 & 127) != 3) {
            if (b3 != -1) {
                return true;
            }
            p2 p2Var = this.f51483o;
            if (p2Var != null) {
                p2Var.f3636a = j11;
                bVar.f47833c = p2Var;
            }
            ((p) bVar.f47832b).getClass();
            return false;
        }
        qp.b bVarU = x7.a.u(wVar);
        r rVar3 = new r(rVar.f55916a, rVar.f55917b, rVar.f55918c, rVar.f55919d, rVar.f55920e, rVar.f55922g, rVar.f55923h, rVar.f55925j, bVarU, rVar.f55927l);
        this.f51482n = rVar3;
        p2 p2Var2 = new p2();
        p2Var2.f3638c = rVar3;
        p2Var2.f3639d = bVarU;
        p2Var2.f3636a = -1L;
        p2Var2.f3637b = -1L;
        this.f51483o = p2Var2;
        return true;
    }

    @Override // s8.i
    public final void d(boolean z11) {
        super.d(z11);
        if (z11) {
            this.f51482n = null;
            this.f51483o = null;
        }
    }
}
