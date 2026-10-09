package o20;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends b {
    @Override // o20.b
    public final String c(Method method, int i11) {
        Parameter parameter = method.getParameters()[i11];
        if (!parameter.isNamePresent()) {
            return super.c(method, i11);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // o20.b
    public final Object d(Class cls, Object obj, Method method, Object[] objArr) {
        return p.a(cls, obj, method, objArr);
    }

    @Override // o20.b
    public final boolean e(Method method) {
        return method.isDefault();
    }
}
