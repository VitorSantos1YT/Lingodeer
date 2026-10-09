package androidx.lifecycle.compose;

import androidx.lifecycle.LifecycleOwner;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;
import l1.c3;
import l1.v1;
import qy.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LocalLifecycleOwnerKt {
    private static final v1 LocalLifecycleOwner;

    static {
        Object objL;
        try {
            ClassLoader classLoader = LifecycleOwner.class.getClassLoader();
            m.c(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof v1) {
                        objL = (v1) objInvoke;
                        break;
                    }
                } else if (!(annotations[i11] instanceof qy.c)) {
                    i11++;
                }
                objL = null;
                break;
            }
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        v1 c3Var = (v1) (objL instanceof n ? null : objL);
        if (c3Var == null) {
            c3Var = new c3(new androidx.lifecycle.j(1));
        }
        LocalLifecycleOwner = c3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleOwner LocalLifecycleOwner$lambda$3$lambda$2() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }

    public static final v1 getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }
}
