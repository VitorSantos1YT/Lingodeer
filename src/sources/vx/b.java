package vx;

import nv.p;
import re.e0;
import re.g0;
import re.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f54314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f54315d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f54312a = new q(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ax.a f54313b = new ax.a(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f54316e = new q(10);

    static {
        int i11 = 8;
        f54314c = new e0(i11);
        f54315d = new g0(i11);
    }

    public static void a(int i11, String str) {
        if (i11 <= 0) {
            throw new IllegalArgumentException(p.k(i11, str, " > 0 required but it was "));
        }
    }
}
