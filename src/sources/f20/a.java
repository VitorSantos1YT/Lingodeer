package f20;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import mz.c;
import qx.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f26585a = new ConcurrentHashMap();

    public static final String a(c cVar) {
        m.f(cVar, "<this>");
        ConcurrentHashMap concurrentHashMap = f26585a;
        String str = (String) concurrentHashMap.get(cVar);
        if (str != null) {
            return str;
        }
        String name = b.p(cVar).getName();
        concurrentHashMap.put(cVar, name);
        return name;
    }
}
