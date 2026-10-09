package ea;

import com.bumptech.glide.e;
import da.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;
import l1.c3;
import l1.v1;
import qy.c;
import qy.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f25454a;

    static {
        Object objL;
        try {
            ClassLoader classLoader = g.class.getClassLoader();
            m.c(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            m.e(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof v1) {
                        objL = (v1) objInvoke;
                        break;
                    }
                } else if (!(annotations[i11] instanceof c)) {
                    i11++;
                }
                objL = null;
                break;
            }
        } catch (Throwable th2) {
            objL = e.l(th2);
        }
        v1 c3Var = (v1) (objL instanceof n ? null : objL);
        if (c3Var == null) {
            c3Var = new c3(new cr.m(19));
        }
        f25454a = c3Var;
    }
}
