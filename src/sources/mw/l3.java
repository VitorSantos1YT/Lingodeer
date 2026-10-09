package mw;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l3 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42523a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nw.x f42524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f42525c;

    public l3(m3 m3Var) {
        this.f42525c = m3Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i11) {
        nw.x xVar = this.f42524b;
        if (xVar == null || xVar.f44280b <= 0) {
            write(new byte[]{(byte) i11}, 0, 1);
            return;
        }
        xVar.f44279a.J((byte) i11);
        xVar.f44280b--;
        xVar.f44281c++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) {
        ay.k0 k0Var = this.f42525c.f42542g;
        nw.x xVar = this.f42524b;
        ArrayList arrayList = this.f42523a;
        if (xVar == null) {
            k0Var.getClass();
            nw.x xVarM = ay.k0.m(i12);
            this.f42524b = xVarM;
            arrayList.add(xVarM);
        }
        while (i12 > 0) {
            int iMin = Math.min(i12, this.f42524b.f44280b);
            if (iMin == 0) {
                int iMax = Math.max(i12, this.f42524b.f44281c * 2);
                k0Var.getClass();
                nw.x xVarM2 = ay.k0.m(iMax);
                this.f42524b = xVarM2;
                arrayList.add(xVarM2);
            } else {
                this.f42524b.a(bArr, i11, iMin);
                i11 += iMin;
                i12 -= iMin;
            }
        }
    }
}
