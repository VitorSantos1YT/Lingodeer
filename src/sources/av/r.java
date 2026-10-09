package av;

import android.view.InputDevice;
import android.view.KeyEvent;
import b0.k2;
import com.stkouyu.SkEgnManager;
import d0.y1;
import d1.z0;
import h1.e8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import mt.b6;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import ot.f2;
import rt.t4;
import s0.o0;
import s0.s0;
import z2.h1;
import z2.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements fz.c, Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3191c;

    public /* synthetic */ r(int i11, Object obj, Object obj2) {
        this.f3189a = i11;
        this.f3190b = obj;
        this.f3191c = obj2;
    }

    @Override // okhttp3.Callback
    public void d(Call call, Response response) {
        ((rz.m) this.f3191c).resumeWith(response);
    }

    @Override // okhttp3.Callback
    public void e(Call call, IOException iOException) {
        if (call.b()) {
            return;
        }
        ((rz.m) this.f3191c).resumeWith(com.bumptech.glide.e.l(iOException));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, qy.h] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean z11;
        long j11;
        switch (this.f3189a) {
            case 0:
                ((AtomicBoolean) this.f3190b).set(true);
                try {
                    ((SkEgnManager) ((y) this.f3191c).f3218c.getValue()).cancel();
                    break;
                } catch (Throwable th2) {
                    com.bumptech.glide.e.l(th2);
                }
                return qy.b0.f48488a;
            case 1:
                return ((k2) this.f3190b).invoke(((List) this.f3191c).get(((Number) obj).intValue()));
            case 2:
                return ((y1) this.f3190b).invoke(((List) this.f3191c).get(((Number) obj).intValue()));
            case 3:
                try {
                    ((Call) this.f3190b).cancel();
                    break;
                } catch (Throwable unused) {
                }
                return qy.b0.f48488a;
            case 4:
                bq.f fVar = (bq.f) this.f3190b;
                Object obj2 = fVar.f4944b;
                rz.m mVar = (rz.m) this.f3191c;
                synchronized (obj2) {
                    ((ArrayList) fVar.f4946d).remove(mVar);
                }
                return qy.b0.f48488a;
            case 5:
                return ((lt.d) this.f3190b).invoke(((List) this.f3191c).get(((Number) obj).intValue()));
            case 6:
                return ((lt.d) this.f3190b).invoke(((List) this.f3191c).get(((Number) obj).intValue()));
            case 7:
                if (!((e8) this.f3190b).c()) {
                    ((fz.a) this.f3191c).invoke();
                }
                return qy.b0.f48488a;
            case 8:
                return ((lt.d) this.f3190b).invoke(((List) this.f3191c).get(((Number) obj).intValue()));
            case 9:
                int iIntValue = ((Number) obj).intValue();
                return ((mt.k) this.f3190b).invoke(Integer.valueOf(iIntValue), ((List) this.f3191c).get(iIntValue));
            case 10:
                int iIntValue2 = ((Number) obj).intValue();
                return ((mt.k) this.f3190b).invoke(Integer.valueOf(iIntValue2), ((List) this.f3191c).get(iIntValue2));
            case 11:
                ((x1.s) this.f3190b).put(((t4) this.f3191c).f50421a, Integer.valueOf((int) (((v3.l) obj).f53498a & 4294967295L)));
                return qy.b0.f48488a;
            case 12:
                int iIntValue3 = ((Number) obj).intValue();
                return ((mt.k) this.f3190b).invoke(Integer.valueOf(iIntValue3), ((List) this.f3191c).get(iIntValue3));
            case 13:
                int iIntValue4 = ((Number) obj).intValue();
                return ((mt.k) this.f3190b).invoke(Integer.valueOf(iIntValue4), ((List) this.f3191c).get(iIntValue4));
            case 14:
                return ((b6) this.f3190b).invoke(((List) this.f3191c).get(((Number) obj).intValue()));
            case 15:
                return ((b6) this.f3190b).invoke(((List) this.f3191c).get(((Number) obj).intValue()));
            case 16:
                return ((f2) this.f3190b).invoke(((ArrayList) this.f3191c).get(((Number) obj).intValue()));
            case 17:
                KeyEvent keyEvent = ((q2.b) obj).f47410a;
                if (((s0) this.f3190b).a() == s0.h0.Selection && keyEvent.getKeyCode() == 4) {
                    z11 = true;
                    if (q2.c.c(keyEvent) == 1) {
                        ((z0) this.f3191c).g(null);
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 18:
                KeyEvent keyEvent2 = ((q2.b) obj).f47410a;
                e2.l lVar = (e2.l) this.f3190b;
                InputDevice device = keyEvent2.getDevice();
                boolean zH = false;
                if (device != null && device.supportsSource(513) && !device.isVirtual() && q2.c.c(keyEvent2) == 2 && keyEvent2.getSource() != 257) {
                    if (o0.m(19, keyEvent2)) {
                        zH = ((e2.p) lVar).h(5, true);
                    } else if (o0.m(20, keyEvent2)) {
                        zH = ((e2.p) lVar).h(6, true);
                    } else if (o0.m(21, keyEvent2)) {
                        zH = ((e2.p) lVar).h(3, true);
                    } else if (o0.m(22, keyEvent2)) {
                        zH = ((e2.p) lVar).h(4, true);
                    } else if (o0.m(23, keyEvent2)) {
                        i2 i2Var = ((s0) this.f3191c).f51168c;
                        if (i2Var != null) {
                            ((h1) i2Var).b();
                        }
                        zH = true;
                    }
                }
                return Boolean.valueOf(zH);
            case 19:
                String it = (String) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((fz.e) this.f3190b).invoke(it, Integer.valueOf(((vs.j) this.f3191c).f54167b));
                return qy.b0.f48488a;
            case 20:
                String it2 = (String) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ((fz.e) this.f3190b).invoke(it2, Integer.valueOf(((vs.k) this.f3191c).f54170c));
                return qy.b0.f48488a;
            default:
                x1.j jVar = (x1.j) obj;
                synchronized (x1.l.f55691c) {
                    j11 = x1.l.f55693e;
                    x1.l.f55693e = ((long) 1) + j11;
                }
                return new x1.b(j11, jVar, (fz.c) this.f3190b, (fz.c) this.f3191c);
        }
    }
}
