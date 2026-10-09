package zy;

import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f59642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f59643b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        m.c(methods);
        int length = methods.length;
        int i11 = 0;
        while (true) {
            method = null;
            if (i11 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i11];
            if (m.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                m.e(parameterTypes, "getParameterTypes(...)");
                if (m.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i11++;
        }
        f59642a = method2;
        for (Method method3 : methods) {
            if (m.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        f59643b = method;
    }
}
