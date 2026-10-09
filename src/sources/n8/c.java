package n8;

import b7.b0;
import b7.v;
import b7.w;
import fr.p3;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lf.x0;
import y6.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends android.support.v4.media.session.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f43468a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f43469b = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f43470c;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // android.support.v4.media.session.a
    public final c0 k(g8.a aVar, ByteBuffer byteBuffer) {
        y6.b0 eVar;
        long j11;
        long j12;
        w wVar = this.f43468a;
        v vVar = this.f43469b;
        b0 b0Var = this.f43470c;
        if (b0Var != null) {
            long j13 = aVar.L;
            synchronized (b0Var) {
                j12 = b0Var.f3955b;
            }
            if (j13 != j12) {
                b0 b0Var2 = new b0(aVar.f25117t);
                this.f43470c = b0Var2;
                b0Var2.a(aVar.f25117t - aVar.L);
            }
        } else {
            b0 b0Var3 = new b0(aVar.f25117t);
            this.f43470c = b0Var3;
            b0Var3.a(aVar.f25117t - aVar.L);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        wVar.G(bArrArray, iLimit);
        vVar.p(bArrArray, iLimit);
        vVar.t(39);
        long jI = (((long) vVar.i(1)) << 32) | ((long) vVar.i(32));
        vVar.t(20);
        int i11 = vVar.i(12);
        int i12 = vVar.i(8);
        wVar.J(14);
        if (i12 == 0) {
            eVar = new e();
        } else if (i12 == 255) {
            long jY = wVar.y();
            int i13 = i11 - 4;
            wVar.h(new byte[i13], 0, i13);
            eVar = new a(jY, 0, jI);
        } else if (i12 == 4) {
            int iW = wVar.w();
            ArrayList arrayList = new ArrayList(iW);
            for (int i14 = 0; i14 < iW; i14++) {
                wVar.y();
                boolean z11 = (wVar.w() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z11) {
                    int iW2 = wVar.w();
                    boolean z12 = (iW2 & 64) != 0;
                    boolean z13 = (iW2 & 32) != 0;
                    if (z12) {
                        wVar.y();
                    }
                    if (!z12) {
                        int iW3 = wVar.w();
                        ArrayList arrayList3 = new ArrayList(iW3);
                        for (int i15 = 0; i15 < iW3; i15++) {
                            wVar.w();
                            wVar.y();
                            arrayList3.add(new p20.c(23));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z13) {
                        wVar.w();
                        wVar.y();
                    }
                    wVar.C();
                    wVar.w();
                    wVar.w();
                }
                arrayList.add(new x0(arrayList2));
            }
            eVar = new f(arrayList);
        } else if (i12 == 5) {
            b0 b0Var4 = this.f43470c;
            wVar.y();
            boolean z14 = (wVar.w() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z14) {
                j11 = -9223372036854775807L;
            } else {
                int iW4 = wVar.w();
                boolean z15 = (iW4 & 64) != 0;
                boolean z16 = (iW4 & 32) != 0;
                boolean z17 = (iW4 & 16) != 0;
                long jD = (!z15 || z17) ? -9223372036854775807L : a.d(jI, wVar);
                if (!z15) {
                    int iW5 = wVar.w();
                    ArrayList arrayList4 = new ArrayList(iW5);
                    for (int i16 = 0; i16 < iW5; i16++) {
                        wVar.w();
                        b0Var4.b(!z17 ? a.d(jI, wVar) : -9223372036854775807L);
                        arrayList4.add(new p3(23));
                    }
                    list = arrayList4;
                }
                if (z16) {
                    wVar.w();
                    wVar.y();
                }
                wVar.C();
                wVar.w();
                wVar.w();
                j11 = jD;
            }
            eVar = new d(j11, b0Var4.b(j11), list);
        } else if (i12 != 6) {
            eVar = null;
        } else {
            b0 b0Var5 = this.f43470c;
            long jD2 = a.d(jI, wVar);
            eVar = new a(jD2, 1, b0Var5.b(jD2));
        }
        return eVar == null ? new c0(new y6.b0[0]) : new c0(eVar);
    }
}
