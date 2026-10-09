package se;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f51616a;

    public w(HashMap proxyEvents) {
        kotlin.jvm.internal.m.f(proxyEvents, "proxyEvents");
        this.f51616a = proxyEvents;
    }

    private final Object readResolve() {
        return new x(this.f51616a);
    }
}
