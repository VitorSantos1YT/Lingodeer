package w9;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import mt.c4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f54800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f54801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f54802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f54803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uu.f f54804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uu.f f54805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f54806g;

    public g(s sVar, HashMap map, HashMap map2, String... strArr) {
        this.f54800a = sVar;
        g0 g0Var = new g0(sVar, map, map2, strArr, sVar.f54860k, new c4(1, this, g.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 19));
        this.f54801b = g0Var;
        this.f54802c = new LinkedHashMap();
        this.f54803d = new ReentrantLock();
        this.f54804e = new uu.f(this);
        this.f54805f = new uu.f(this);
        kotlin.jvm.internal.m.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.f54806g = new Object();
        g0Var.f54818k = new s0.u(this, 20);
    }

    public final Object a(xy.i iVar) {
        Object objF;
        s sVar = this.f54800a;
        return ((!sVar.q() || sVar.v()) && (objF = this.f54801b.f(iVar)) == wy.a.COROUTINE_SUSPENDED) ? objF : qy.b0.f48488a;
    }
}
