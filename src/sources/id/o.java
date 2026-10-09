package id;

import android.graphics.Color;
import android.graphics.PointF;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1.p f34368a = b1.p.E("x", "y");

    public static int a(jd.d dVar) {
        dVar.a();
        int i11 = (int) (dVar.i() * 255.0d);
        int i12 = (int) (dVar.i() * 255.0d);
        int i13 = (int) (dVar.i() * 255.0d);
        while (dVar.f()) {
            dVar.B();
        }
        dVar.c();
        return Color.argb(255, i11, i12, i13);
    }

    public static PointF b(jd.d dVar, float f5) {
        int i11 = n.f34367a[dVar.v().ordinal()];
        if (i11 == 1) {
            float fI = (float) dVar.i();
            float fI2 = (float) dVar.i();
            while (dVar.f()) {
                dVar.B();
            }
            return new PointF(fI * f5, fI2 * f5);
        }
        if (i11 == 2) {
            dVar.a();
            float fI3 = (float) dVar.i();
            float fI4 = (float) dVar.i();
            while (dVar.v() != jd.c.END_ARRAY) {
                dVar.B();
            }
            dVar.c();
            return new PointF(fI3 * f5, fI4 * f5);
        }
        if (i11 != 3) {
            throw new IllegalArgumentException("Unknown point starts with " + dVar.v());
        }
        dVar.b();
        float fD = CropImageView.DEFAULT_ASPECT_RATIO;
        float fD2 = 0.0f;
        while (dVar.f()) {
            int iY = dVar.y(f34368a);
            if (iY == 0) {
                fD = d(dVar);
            } else if (iY != 1) {
                dVar.A();
                dVar.B();
            } else {
                fD2 = d(dVar);
            }
        }
        dVar.d();
        return new PointF(fD * f5, fD2 * f5);
    }

    public static ArrayList c(jd.d dVar, float f5) {
        ArrayList arrayList = new ArrayList();
        dVar.a();
        while (dVar.v() == jd.c.BEGIN_ARRAY) {
            dVar.a();
            arrayList.add(b(dVar, f5));
            dVar.c();
        }
        dVar.c();
        return arrayList;
    }

    public static float d(jd.d dVar) {
        jd.c cVarV = dVar.v();
        int i11 = n.f34367a[cVarV.ordinal()];
        if (i11 == 1) {
            return (float) dVar.i();
        }
        if (i11 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + cVarV);
        }
        dVar.a();
        float fI = (float) dVar.i();
        while (dVar.f()) {
            dVar.B();
        }
        dVar.c();
        return fI;
    }
}
