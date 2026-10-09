package o20;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f44600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f44602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f44603d;

    public u(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f44600a = cls;
        this.f44601b = obj;
        this.f44602c = method;
        this.f44603d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f44600a.getName(), this.f44602c.getName(), this.f44603d);
    }
}
