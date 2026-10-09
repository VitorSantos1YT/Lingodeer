package c20;

import a9.i;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b20.b f6511e = new b20.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f6512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f6513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f6514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e20.a f6515d;

    public b(i iVar) {
        this.f6512a = iVar;
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        m.e(setNewSetFromMap, "newSetFromMap(...)");
        this.f6513b = setNewSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f6514c = concurrentHashMap;
        b20.b bVar = f6511e;
        e20.a aVar = new e20.a(bVar, "_root_", null, iVar, 8);
        this.f6515d = aVar;
        setNewSetFromMap.add(bVar);
        concurrentHashMap.put("_root_", aVar);
    }
}
