package s2;

import android.view.MotionEvent;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f51339a = new a(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f51340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f51341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final StackTraceElement[] f51342d;

    static {
        new a(1007);
        f51340b = new a(1008);
        f51341c = new a(1002);
        f51342d = new StackTraceElement[0];
    }

    public static final boolean a(t tVar) {
        return !tVar.f51350h && tVar.f51346d;
    }

    public static final boolean b(t tVar) {
        return (tVar.b() || !tVar.f51350h || tVar.f51346d) ? false : true;
    }

    public static final boolean c(t tVar) {
        return tVar.f51350h && !tVar.f51346d;
    }

    public static final boolean d(long j11, long j12) {
        return j11 == j12;
    }

    public static final boolean e(t tVar, long j11, long j12) {
        int i11 = tVar.f51351i == 1 ? 1 : 0;
        long j13 = tVar.f51345c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        float f5 = i11;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j12 >> 32)) * f5;
        float f11 = ((int) (j11 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j12 & 4294967295L)) * f5;
        return (fIntBitsToFloat > f11) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j11 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static z1.r f(z1.r rVar, a aVar) {
        return rVar.i(new n(aVar));
    }

    public static final long g(t tVar, boolean z11) {
        long jG = f2.b.g(tVar.f51345c, tVar.f51349g);
        if (z11 || !tVar.b()) {
            return jG;
        }
        return 0L;
    }

    public static final void h(l lVar, long j11, fz.c cVar, boolean z11) {
        ie.o oVar = lVar.f51329b;
        MotionEvent motionEvent = oVar != null ? (MotionEvent) ((o2) oVar.f34407d).f48096c : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z11) {
            motionEvent.setAction(3);
        }
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i11), -Float.intBitsToFloat(i12));
        cVar.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12));
        motionEvent.setAction(action);
    }

    public static String i(long j11) {
        return "PointerId(value=" + j11 + ')';
    }
}
