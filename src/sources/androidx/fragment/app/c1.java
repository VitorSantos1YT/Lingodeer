package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y.t0 f1631b = new y.t0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1 f1632a;

    public c1(k1 k1Var) {
        this.f1632a = k1Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        y.t0 t0Var = f1631b;
        y.t0 t0Var2 = (y.t0) t0Var.get(classLoader);
        if (t0Var2 == null) {
            t0Var2 = new y.t0(0);
            t0Var.put(classLoader, t0Var2);
        }
        Class cls = (Class) t0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        t0Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e8) {
            throw new Fragment$InstantiationException(ep.a.g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e8);
        } catch (ClassNotFoundException e10) {
            throw new Fragment$InstantiationException(ep.a.g("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public final k0 a(String str) {
        return k0.instantiate(this.f1632a.f1731x.f1841b, str, null);
    }
}
