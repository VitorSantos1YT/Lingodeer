package n0;

import java.util.Map;
import l1.c3;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements w1.e, w1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.f f43026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1.b f43027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.j0 f43028c;

    public x0(w1.e eVar, Map map, w1.b bVar) {
        kp.j jVar = new kp.j(eVar, 19);
        c3 c3Var = w1.g.f54465a;
        this.f43026a = new w1.f(map, jVar);
        this.f43027b = bVar;
        y.j0 j0Var = y.s0.f56760a;
        this.f43028c = new y.j0();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // w1.e
    public final Map a() {
        y.j0 j0Var = this.f43028c;
        Object[] objArr = j0Var.f56721b;
        long[] jArr = j0Var.f56720a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            this.f43027b.d(objArr[(i11 << 3) + i13]);
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return this.f43026a.a();
    }

    @Override // w1.e
    public final Object b(String str) {
        return this.f43026a.b(str);
    }

    @Override // w1.b
    public final void c(Object obj, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-858296452);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(this) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            this.f43027b.c(obj, dVar, sVar, i12 & 126);
            boolean zH = sVar.h(this) | sVar.h(obj);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new j9.h(29, this, obj);
                sVar.o0(objQ);
            }
            l1.t.c(obj, (fz.c) objQ, sVar);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(this, obj, dVar, i11, 28);
        }
    }

    @Override // w1.e
    public final boolean canBeSaved(Object obj) {
        return this.f43026a.canBeSaved(obj);
    }

    @Override // w1.b
    public final void d(Object obj) {
        this.f43027b.d(obj);
    }

    @Override // w1.e
    public final w1.d e(String str, fz.a aVar) {
        return this.f43026a.e(str, aVar);
    }
}
