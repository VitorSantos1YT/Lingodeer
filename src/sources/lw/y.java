package lw;

import com.google.common.base.Preconditions;
import fr.a2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    public static List f(Class cls, Iterable iterable, ClassLoader classLoader, o1 o1Var) {
        ?? Load;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object objNewInstance = null;
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th2), th2);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
            Load = !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            if (o1Var.c(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new a2(o1Var, 3)));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public v a() {
        boolean z11;
        List listB = b();
        if (listB != null) {
            z11 = listB.size() == 1;
        }
        Preconditions.q("%s does not have exactly one group", z11, listB);
        return (v) listB.get(0);
    }

    public abstract List b();

    public abstract b c();

    public abstract f d();

    public abstract Object e();

    public abstract q0 g(f fVar);

    public abstract void h(q1 q1Var, c1 c1Var);

    public abstract void i(q1 q1Var);

    public abstract void j(c1 c1Var);

    public abstract void k(Object obj);

    public abstract void m(h1 h1Var);

    public abstract void n();

    public abstract void o();

    public abstract void p(p0 p0Var);

    public abstract void q(List list);

    public void l() {
    }
}
