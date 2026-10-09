package y2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements v3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f56976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f56977b = 9223372034707292159L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f56978c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f56979d;

    public n0(q0 q0Var) {
        this.f56979d = q0Var;
    }

    @Override // v3.c
    public final float Z() {
        return this.f56979d.Z();
    }

    public final void a(w2.p pVar, float f5) {
        q0 q0Var = this.f56979d;
        b7.c cVar = q0Var.O;
        if (cVar == null) {
            cVar = new b7.c();
            q0Var.O = cVar;
        }
        int iZ = ry.l.Z((w2.p[]) cVar.f3959b, pVar);
        if (iZ >= 0) {
            float[] fArr = (float[]) cVar.f3960c;
            if (fArr[iZ] != f5) {
                fArr[iZ] = f5;
                ((byte[]) cVar.f3961d)[iZ] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) cVar.f3961d;
                if (bArr[iZ] == 2) {
                    bArr[iZ] = 0;
                    return;
                }
                return;
            }
        }
        int i11 = cVar.f3958a;
        w2.p[] pVarArr = (w2.p[]) cVar.f3959b;
        if (i11 == pVarArr.length) {
            int i12 = i11 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(pVarArr, i12);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            cVar.f3959b = (w2.p[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) cVar.f3960c, i12);
            kotlin.jvm.internal.m.e(fArrCopyOf, "copyOf(...)");
            cVar.f3960c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) cVar.f3961d, i12);
            kotlin.jvm.internal.m.e(bArrCopyOf, "copyOf(...)");
            cVar.f3961d = bArrCopyOf;
        }
        ((w2.p[]) cVar.f3959b)[i11] = pVar;
        ((byte[]) cVar.f3961d)[i11] = 3;
        ((float[]) cVar.f3960c)[i11] = f5;
        cVar.f3958a++;
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f56979d.getDensity();
    }
}
