package id;

import android.graphics.Color;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f34342b = new f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f34343c = new f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f34344d = new f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f34345e = new f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f34346f = new f(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f34347t = new f(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34348a;

    public /* synthetic */ f(int i11) {
        this.f34348a = i11;
    }

    @Override // id.f0
    public final Object a(jd.d dVar, float f5) {
        switch (this.f34348a) {
            case 0:
                boolean z11 = dVar.v() == jd.c.BEGIN_ARRAY;
                if (z11) {
                    dVar.a();
                }
                double dI = dVar.i();
                double dI2 = dVar.i();
                double dI3 = dVar.i();
                double dI4 = dVar.v() == jd.c.NUMBER ? dVar.i() : 1.0d;
                if (z11) {
                    dVar.c();
                }
                if (dI <= 1.0d && dI2 <= 1.0d && dI3 <= 1.0d) {
                    dI *= 255.0d;
                    dI2 *= 255.0d;
                    dI3 *= 255.0d;
                    if (dI4 <= 1.0d) {
                        dI4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dI4, (int) dI, (int) dI2, (int) dI3));
            case 1:
                return Float.valueOf(o.d(dVar) * f5);
            case 2:
                return Integer.valueOf(Math.round(o.d(dVar) * f5));
            case 3:
                return o.b(dVar, f5);
            case 4:
                jd.c cVarV = dVar.v();
                if (cVarV == jd.c.BEGIN_ARRAY) {
                    return o.b(dVar, f5);
                }
                if (cVarV == jd.c.BEGIN_OBJECT) {
                    return o.b(dVar, f5);
                }
                if (cVarV != jd.c.NUMBER) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is " + cVarV);
                }
                PointF pointF = new PointF(((float) dVar.i()) * f5, ((float) dVar.i()) * f5);
                while (dVar.f()) {
                    dVar.B();
                }
                return pointF;
            default:
                boolean z12 = dVar.v() == jd.c.BEGIN_ARRAY;
                if (z12) {
                    dVar.a();
                }
                float fI = (float) dVar.i();
                float fI2 = (float) dVar.i();
                while (dVar.f()) {
                    dVar.B();
                }
                if (z12) {
                    dVar.c();
                }
                return new ld.c((fI / 100.0f) * f5, (fI2 / 100.0f) * f5);
        }
    }
}
