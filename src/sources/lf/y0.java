package lf;

import fr.p3;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p3 f40132d = new p3(19);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f40133e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.d0 f40134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StringBuilder f40136c;

    public y0(re.d0 behavior) {
        kotlin.jvm.internal.m.f(behavior, "behavior");
        this.f40134a = behavior;
        v0.k("Request", "tag");
        this.f40135b = "FacebookSDK.".concat("Request");
        this.f40136c = new StringBuilder();
    }

    public final void a(Object value, String key) {
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(value, "value");
        b();
    }

    public final void b() {
        re.s.i(this.f40134a);
    }
}
