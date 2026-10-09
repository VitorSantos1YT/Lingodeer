package nu;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.yalantis.ucrop.view.CropImageView;
import f0.g0;
import l1.k1;
import mt.k6;
import mt.r;
import qy.b0;
import rz.e0;
import s2.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pu.b f44078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f44079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ou.c f44080c;

    public i(pu.b bVar, e eVar, ou.c cVar) {
        this.f44078a = bVar;
        this.f44079b = eVar;
        this.f44080c = cVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, vy.d dVar) {
        pu.b bVar = this.f44078a;
        int i11 = h.f44077a[bVar.c().ordinal()];
        final e eVar = this.f44079b;
        if (i11 == 1) {
            final int i12 = 0;
            Object objF = g0.f(wVar, new fz.c() { // from class: nu.g
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
                @Override // fz.c
                public final Object invoke(Object obj) {
                    f2.b bVar2 = (f2.b) obj;
                    switch (i12) {
                        case 0:
                            long j11 = bVar2.f26570a;
                            e eVar2 = eVar;
                            pu.b bVar3 = eVar2.f44062a;
                            int iB = bVar3.b();
                            g2.k kVar = bVar3.f47163e;
                            if (iB < eVar2.f44063b.f46072e.size()) {
                                k1 k1Var = bVar3.f47180w;
                                Boolean bool = Boolean.TRUE;
                                k1Var.setValue(bool);
                                eVar2.e();
                                bVar3.f47176s.setValue(Long.valueOf(System.currentTimeMillis()));
                                bVar3.f47165g.setValue(bool);
                                if (((Boolean) bVar3.f47172o.getValue()).booleanValue()) {
                                    bVar3.k(false);
                                }
                                kVar.j();
                                kVar.g(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (4294967295L & j11)));
                                bVar3.f47164f.setValue(new f2.b(j11));
                                bVar3.i(bVar3.d() + 1);
                            }
                            break;
                        default:
                            e eVar3 = eVar;
                            e0.B(eVar3.f44064c, null, null, new f3.c(CropImageView.DEFAULT_ASPECT_RATIO, 4, eVar3, null), 3);
                            break;
                    }
                    return b0.f48488a;
                }
            }, new bt.f(eVar, 2), new r(eVar, 7), dVar, 4);
            if (objF == wy.a.COROUTINE_SUSPENDED) {
                return objF;
            }
        } else if (i11 == 2) {
            final int i13 = 1;
            Object objF2 = g0.f(wVar, new fz.c() { // from class: nu.g
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
                @Override // fz.c
                public final Object invoke(Object obj) {
                    f2.b bVar2 = (f2.b) obj;
                    switch (i13) {
                        case 0:
                            long j11 = bVar2.f26570a;
                            e eVar2 = eVar;
                            pu.b bVar3 = eVar2.f44062a;
                            int iB = bVar3.b();
                            g2.k kVar = bVar3.f47163e;
                            if (iB < eVar2.f44063b.f46072e.size()) {
                                k1 k1Var = bVar3.f47180w;
                                Boolean bool = Boolean.TRUE;
                                k1Var.setValue(bool);
                                eVar2.e();
                                bVar3.f47176s.setValue(Long.valueOf(System.currentTimeMillis()));
                                bVar3.f47165g.setValue(bool);
                                if (((Boolean) bVar3.f47172o.getValue()).booleanValue()) {
                                    bVar3.k(false);
                                }
                                kVar.j();
                                kVar.g(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (4294967295L & j11)));
                                bVar3.f47164f.setValue(new f2.b(j11));
                                bVar3.i(bVar3.d() + 1);
                            }
                            break;
                        default:
                            e eVar3 = eVar;
                            e0.B(eVar3.f44064c, null, null, new f3.c(CropImageView.DEFAULT_ASPECT_RATIO, 4, eVar3, null), 3);
                            break;
                    }
                    return b0.f48488a;
                }
            }, new bt.f(eVar, 3), new k6(this.f44080c, bVar, eVar, 4), dVar, 4);
            if (objF2 == wy.a.COROUTINE_SUSPENDED) {
                return objF2;
            }
        }
        return b0.f48488a;
    }
}
