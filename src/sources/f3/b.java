package f3;

import kotlin.jvm.internal.n;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f26593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f26594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f26595d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26596a;

    static {
        int i11 = 1;
        f26593b = new b(i11, 0);
        f26594c = new b(i11, 1);
        f26595d = new b(i11, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, int i12) {
        super(i11);
        this.f26596a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f26596a) {
            case 0:
                ((Number) obj).longValue();
                return b0.f48488a;
            case 1:
                return Integer.valueOf(((j) obj).f26617b);
            default:
                return Integer.valueOf(((j) obj).f26618c.b());
        }
    }
}
