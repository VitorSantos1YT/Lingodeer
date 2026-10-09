package w7;

import b7.f0;
import b7.w;
import java.nio.ByteBuffer;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f7.e {
    public final e7.d U;
    public final w V;
    public a W;
    public long X;

    public b() {
        super(6);
        this.U = new e7.d(1);
        this.V = new w();
    }

    @Override // f7.e
    public final int B(p pVar) {
        return "application/x-camera-motion".equals(pVar.f57291n) ? f7.e.a(4, 0, 0, 0) : f7.e.a(0, 0, 0, 0);
    }

    @Override // f7.e, f7.a1
    public final void f(int i11, Object obj) {
        if (i11 == 8) {
            this.W = (a) obj;
        }
    }

    @Override // f7.e
    public final String k() {
        return "CameraMotionRenderer";
    }

    @Override // f7.e
    public final boolean m() {
        return l();
    }

    @Override // f7.e
    public final boolean o() {
        return true;
    }

    @Override // f7.e
    public final void p() {
        a aVar = this.W;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // f7.e
    public final void r(long j11, boolean z11) {
        this.X = Long.MIN_VALUE;
        a aVar = this.W;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // f7.e
    public final void y(long j11, long j12) {
        float[] fArr;
        while (!l() && this.X < 100000 + j11) {
            e7.d dVar = this.U;
            dVar.n();
            ob.e eVar = this.f26701c;
            eVar.f();
            if (x(eVar, dVar, 0) != -4 || dVar.e(4)) {
                return;
            }
            long j13 = dVar.f25117t;
            this.X = j13;
            boolean z11 = j13 < this.N;
            if (this.W != null && !z11) {
                dVar.r();
                ByteBuffer byteBuffer = dVar.f25115e;
                String str = f0.f3975a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    w wVar = this.V;
                    wVar.G(bArrArray, iLimit);
                    wVar.I(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr2[i11] = Float.intBitsToFloat(wVar.l());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.W.a(this.X - this.M, fArr);
                }
            }
        }
    }
}
