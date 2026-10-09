package ax;

import ay.k0;
import fr.p3;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p20.c f3260a = new p20.c(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3261b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f3262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p3 f3263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tw.c f3264e;

    static {
        int i11 = 2;
        f3262c = new k0(i11);
        f3263d = new p3(i11);
        f3264e = new tw.c(i11);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void b(int i11, String str) {
        if (i11 <= 0) {
            throw new IllegalArgumentException(p.k(i11, str, " > 0 required but it was "));
        }
    }
}
