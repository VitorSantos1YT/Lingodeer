package qf;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import nf.c;
import ns.o;
import re.i0;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f47724a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f47725b;

    public static final void a(Object o5, Throwable th2) {
        m.f(o5, "o");
        if (f47725b) {
            f47724a.add(o5);
            s sVar = s.f49201a;
            if (i0.c()) {
                o.v(th2);
                o00.a.e(th2, c.CrashShield).b();
            }
        }
    }

    public static final boolean b(Object o5) {
        m.f(o5, "o");
        return f47724a.contains(o5);
    }
}
