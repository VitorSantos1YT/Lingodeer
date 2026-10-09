package z3;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f58749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f58750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f58751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f58752e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58753a;

    static {
        int i11 = 0;
        f58749b = new d(i11, 0);
        f58750c = new d(i11, 1);
        f58751d = new d(i11, 2);
        f58752e = new d(i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11, int i12) {
        super(i11);
        this.f58753a = i12;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f58753a) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
