package lw;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f40356d = Logger.getLogger(c0.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f40357e = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f40358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f40359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f40360c;

    public c0() {
        new ConcurrentSkipListMap();
        this.f40358a = new ConcurrentSkipListMap();
        this.f40359b = new ConcurrentHashMap();
        this.f40360c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
