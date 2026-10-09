package f;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f26146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f26147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f26148d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26149a;

    static {
        int i11 = 1;
        f26146b = new g0(i11, 0);
        f26147c = new g0(i11, 1);
        f26148d = new g0(i11, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i11, int i12) {
        super(i11);
        this.f26149a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f26149a) {
            case 0:
                Resources resources = (Resources) obj;
                kotlin.jvm.internal.m.f(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                kotlin.jvm.internal.m.f((Resources) obj, "<anonymous parameter 0>");
                return Boolean.TRUE;
            default:
                kotlin.jvm.internal.m.f((Resources) obj, "<anonymous parameter 0>");
                return Boolean.FALSE;
        }
    }
}
