package u5;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import qa.b0;
import qa.s;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f52782p = new d(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f52783q = new d(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f52784r = new d(3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f52785s = new d(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f52786t = new d(5);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f52787u = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f52788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f52789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f52790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f52791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v10.c f52792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f52794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f52795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f52796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f52797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f52798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f52799l;
    public g m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f52800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f52801o;

    public f(j0.e eVar) {
        this.f52788a = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f52789b = Float.MAX_VALUE;
        this.f52790c = false;
        this.f52793f = false;
        this.f52794g = Float.MAX_VALUE;
        this.f52795h = -3.4028235E38f;
        this.f52796i = 0L;
        this.f52798k = new ArrayList();
        this.f52799l = new ArrayList();
        this.f52791d = null;
        this.f52792e = new e(eVar);
        this.f52797j = 1.0f;
        this.m = null;
        this.f52800n = Float.MAX_VALUE;
        this.f52801o = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.f52771i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new o2(3)));
        }
        return (c) threadLocal.get();
    }

    public final void a(float f5) {
        if (this.f52793f) {
            this.f52800n = f5;
            return;
        }
        if (this.m == null) {
            this.m = new g(f5);
        }
        g gVar = this.m;
        double d5 = f5;
        gVar.f52810i = d5;
        double d11 = (float) d5;
        if (d11 > this.f52794g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d11 < this.f52795h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f52797j * 0.75f);
        gVar.f52805d = dAbs;
        gVar.f52806e = dAbs * 62.5d;
        o2 o2Var = b().f52776e;
        o2Var.getClass();
        if (Thread.currentThread() != ((Looper) o2Var.f48096c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z11 = this.f52793f;
        if (z11 || z11) {
            return;
        }
        this.f52793f = true;
        if (!this.f52790c) {
            this.f52789b = this.f52792e.x(this.f52791d);
        }
        float f11 = this.f52789b;
        if (f11 > this.f52794g || f11 < this.f52795h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        b().a(this);
    }

    public final void c(float f5) {
        ArrayList arrayList;
        this.f52792e.K(this.f52791d, f5);
        int i11 = 0;
        while (true) {
            arrayList = this.f52799l;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) != null) {
                s sVar = (s) arrayList.get(i11);
                float f11 = this.f52789b;
                b0 b0Var = sVar.f47668h;
                long jMax = Math.max(-1L, Math.min(b0Var.f47679b0 + 1, Math.round(f11)));
                b0Var.J(jMax, sVar.f47661a);
                sVar.f47661a = jMax;
            }
            i11++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d() {
        if (this.m.f52803b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        o2 o2Var = b().f52776e;
        o2Var.getClass();
        if (Thread.currentThread() != ((Looper) o2Var.f48096c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f52793f) {
            this.f52801o = true;
        }
    }

    public f(Object obj, v10.c cVar) {
        this.f52788a = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f52789b = Float.MAX_VALUE;
        this.f52790c = false;
        this.f52793f = false;
        this.f52794g = Float.MAX_VALUE;
        this.f52795h = -3.4028235E38f;
        this.f52796i = 0L;
        this.f52798k = new ArrayList();
        this.f52799l = new ArrayList();
        this.f52791d = obj;
        this.f52792e = cVar;
        if (cVar != f52784r && cVar != f52785s && cVar != f52786t) {
            if (cVar == f52787u) {
                this.f52797j = 0.00390625f;
            } else if (cVar != f52782p && cVar != f52783q) {
                this.f52797j = 1.0f;
            } else {
                this.f52797j = 0.002f;
            }
        } else {
            this.f52797j = 0.1f;
        }
        this.m = null;
        this.f52800n = Float.MAX_VALUE;
        this.f52801o = false;
    }
}
