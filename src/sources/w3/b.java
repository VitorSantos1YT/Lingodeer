package w3;

import com.yalantis.ucrop.view.CropImageView;
import v3.i;
import y.s;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f54619a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile u0 f54620b = new u0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f54621c;

    static {
        Object[] objArr = new Object[0];
        f54621c = objArr;
        synchronized (objArr) {
            f54620b.g((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f54620b.g((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f54620b.g((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f54620b.g((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f54620b.g((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f54620b.f(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f5) {
        float f11;
        a cVar;
        float[] fArr = f54619a;
        if (f5 < 1.03f) {
            return null;
        }
        int i11 = (int) (f5 * 100.0f);
        a aVar = (a) f54620b.d(i11);
        if (aVar != null) {
            return aVar;
        }
        u0 u0Var = f54620b;
        if (u0Var.f56770a) {
            s.a(u0Var);
        }
        int iA = z.a.a(u0Var.f56773d, i11, u0Var.f56771b);
        if (iA >= 0) {
            return (a) f54620b.i(iA);
        }
        int i12 = -(iA + 1);
        int i13 = i12 - 1;
        if (i12 >= f54620b.h()) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f5});
            b(f5, cVar2);
            return cVar2;
        }
        if (i13 < 0) {
            cVar = new c(fArr, fArr);
            f11 = 1.0f;
        } else {
            f11 = f54620b.f(i13) / 100.0f;
            cVar = (a) f54620b.i(i13);
        }
        float f12 = f54620b.f(i12) / 100.0f;
        float fMax = (Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(1.0f, f11 == f12 ? 0.0f : (f5 - f11) / (f12 - f11))) * 1.0f) + CropImageView.DEFAULT_ASPECT_RATIO;
        a aVar2 = (a) f54620b.i(i12);
        float[] fArr2 = new float[9];
        for (int i14 = 0; i14 < 9; i14++) {
            float f13 = fArr[i14];
            float fB = cVar.b(f13);
            fArr2[i14] = ((aVar2.b(f13) - fB) * fMax) + fB;
        }
        c cVar3 = new c(fArr, fArr2);
        b(f5, cVar3);
        return cVar3;
    }

    public static void b(float f5, c cVar) {
        synchronized (f54621c) {
            u0 u0VarClone = f54620b.clone();
            u0VarClone.g((int) (f5 * 100.0f), cVar);
            f54620b = u0VarClone;
        }
    }
}
