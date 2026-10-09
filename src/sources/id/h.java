package id;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f34350a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1.p f34351b = b1.p.E("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // id.f0
    public final Object a(jd.d dVar, float f5) {
        dd.b bVar = dd.b.CENTER;
        dVar.b();
        String strQ = null;
        float fI = 0.0f;
        float fI2 = 0.0f;
        float fI3 = 0.0f;
        float fI4 = 0.0f;
        int iP = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zH = true;
        String strQ2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (dVar.f()) {
            switch (dVar.y(f34351b)) {
                case 0:
                    strQ = dVar.q();
                    break;
                case 1:
                    strQ2 = dVar.q();
                    break;
                case 2:
                    fI = (float) dVar.i();
                    break;
                case 3:
                    int iP2 = dVar.p();
                    dd.b bVar2 = dd.b.CENTER;
                    bVar = (iP2 <= bVar2.ordinal() && iP2 >= 0) ? dd.b.values()[iP2] : bVar2;
                    break;
                case 4:
                    iP = dVar.p();
                    break;
                case 5:
                    fI2 = (float) dVar.i();
                    break;
                case 6:
                    fI3 = (float) dVar.i();
                    break;
                case 7:
                    iA = o.a(dVar);
                    break;
                case 8:
                    iA2 = o.a(dVar);
                    break;
                case 9:
                    fI4 = (float) dVar.i();
                    break;
                case 10:
                    zH = dVar.h();
                    break;
                case 11:
                    dVar.a();
                    pointF = new PointF(((float) dVar.i()) * f5, ((float) dVar.i()) * f5);
                    dVar.c();
                    break;
                case 12:
                    dVar.a();
                    pointF2 = new PointF(((float) dVar.i()) * f5, ((float) dVar.i()) * f5);
                    dVar.c();
                    break;
                default:
                    dVar.A();
                    dVar.B();
                    break;
            }
        }
        dVar.d();
        dd.c cVar = new dd.c();
        cVar.f23357a = strQ;
        cVar.f23358b = strQ2;
        cVar.f23359c = fI;
        cVar.f23360d = bVar;
        cVar.f23361e = iP;
        cVar.f23362f = fI2;
        cVar.f23363g = fI3;
        cVar.f23364h = iA;
        cVar.f23365i = iA2;
        cVar.f23366j = fI4;
        cVar.f23367k = zH;
        cVar.f23368l = pointF;
        cVar.m = pointF2;
        return cVar;
    }
}
