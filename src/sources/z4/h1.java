package z4;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends l1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f58841e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f58842f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f58843g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f58844h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f58845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r4.d f58846d;

    public h1() {
        this.f58845c = i();
    }

    private static WindowInsets i() {
        if (!f58842f) {
            try {
                f58841e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f58842f = true;
        }
        Field field = f58841e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f58844h) {
            try {
                f58843g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f58844h = true;
        }
        Constructor constructor = f58843g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // z4.l1
    public v1 b() {
        a();
        v1 v1VarH = v1.h(null, this.f58845c);
        r4.d[] dVarArr = this.f58862b;
        s1 s1Var = v1VarH.f58905a;
        s1Var.r(dVarArr);
        s1Var.u(this.f58846d);
        return v1VarH;
    }

    @Override // z4.l1
    public void e(r4.d dVar) {
        this.f58846d = dVar;
    }

    @Override // z4.l1
    public void g(r4.d dVar) {
        WindowInsets windowInsets = this.f58845c;
        if (windowInsets != null) {
            this.f58845c = windowInsets.replaceSystemWindowInsets(dVar.f48793a, dVar.f48794b, dVar.f48795c, dVar.f48796d);
        }
    }

    public h1(v1 v1Var) {
        super(v1Var);
        this.f58845c = v1Var.g();
    }
}
