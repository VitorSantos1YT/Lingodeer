package w1;

import java.util.Map;
import l1.c3;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.w1;
import l1.x1;
import pr.a0;
import qp.o2;
import qy.b0;
import rz.w;
import y.i0;
import y.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o2 f54457e = new o2(6, new w(25), new vr.a(4));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f54458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f54459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f54460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s0.a f54461d;

    public c(Map map) {
        this.f54458a = map;
        long[] jArr = r0.f56756a;
        this.f54459b = new i0();
        this.f54461d = new s0.a(this, 19);
    }

    @Override // w1.b
    public final void c(Object obj, t1.d dVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(533563200);
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
            sVar.g0(obj);
            Object objQ = sVar.Q();
            l1.g gVar = m.f39353a;
            if (objQ == gVar) {
                s0.a aVar = this.f54461d;
                if (!((Boolean) aVar.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f54458a.get(obj);
                c3 c3Var = g.f54465a;
                h hVar = new h(new f(map, aVar));
                sVar.o0(hVar);
                objQ = hVar;
            }
            h hVar2 = (h) objQ;
            t.b(new w1[]{g.f54465a.a(hVar2), ea.a.f25454a.a(hVar2)}, dVar, sVar, (i12 & 112) | 8);
            boolean zH = sVar.h(this) | sVar.h(obj) | sVar.h(hVar2);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new a0(this, obj, hVar2, 28);
                sVar.o0(objQ2);
            }
            t.c(b0.f48488a, (fz.c) objQ2, sVar);
            if (sVar.f39457y && sVar.G.f39348i == sVar.f39458z) {
                sVar.f39458z = -1;
                sVar.f39457y = false;
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new qg.d(this, obj, dVar, i11, 4);
        }
    }

    @Override // w1.b
    public final void d(Object obj) {
        if (this.f54459b.k(obj) == null) {
            this.f54458a.remove(obj);
        }
    }
}
