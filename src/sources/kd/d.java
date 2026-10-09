package kd;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f38088a = new c();

    public static void a() {
        f38088a.getClass();
        wc.a aVar = wc.d.f54943a;
    }

    public static void b(String str) {
        f38088a.getClass();
        HashSet hashSet = c.f38087a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }

    public static void c(String str, Throwable th2) {
        f38088a.getClass();
        HashSet hashSet = c.f38087a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }
}
