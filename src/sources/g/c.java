package g;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f28291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f28292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f28293d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28294a;

    static {
        int i11 = 0;
        f28291b = new c(i11, 0);
        f28292c = new c(i11, 1);
        f28293d = new c(i11, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12) {
        super(i11);
        this.f28294a = i12;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f28294a) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
