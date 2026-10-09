package s8;

import b7.w;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import y6.c0;
import y6.d0;
import y6.o;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f51499o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f51500p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f51501n;

    public static boolean e(w wVar, byte[] bArr) {
        if (wVar.a() < bArr.length) {
            return false;
        }
        int i11 = wVar.f4040b;
        byte[] bArr2 = new byte[bArr.length];
        wVar.h(bArr2, 0, bArr.length);
        wVar.I(i11);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // s8.i
    public final long b(w wVar) {
        byte[] bArr = wVar.f4039a;
        return (((long) this.f51510i) * x7.a.k(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // s8.i
    public final boolean c(w wVar, long j11, qp.b bVar) {
        if (e(wVar, f51499o)) {
            byte[] bArrCopyOf = Arrays.copyOf(wVar.f4039a, wVar.f4041c);
            int i11 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = x7.a.a(bArrCopyOf);
            if (((p) bVar.f47832b) == null) {
                o oVar = new o();
                oVar.f57264l = d0.o("audio/ogg");
                oVar.m = d0.o("audio/opus");
                oVar.E = i11;
                oVar.F = 48000;
                oVar.f57267p = arrayListA;
                bVar.f47832b = new p(oVar);
                return true;
            }
        } else {
            if (!e(wVar, f51500p)) {
                b7.a.k((p) bVar.f47832b);
                return false;
            }
            b7.a.k((p) bVar.f47832b);
            if (!this.f51501n) {
                this.f51501n = true;
                wVar.J(8);
                c0 c0VarR = x7.a.r(ImmutableList.o((String[]) x7.a.v(wVar, false, false).f50058b));
                if (c0VarR != null) {
                    o oVarA = ((p) bVar.f47832b).a();
                    oVarA.f57263k = c0VarR.b(((p) bVar.f47832b).f57290l);
                    bVar.f47832b = new p(oVarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // s8.i
    public final void d(boolean z11) {
        super.d(z11);
        if (z11) {
            this.f51501n = false;
        }
    }
}
