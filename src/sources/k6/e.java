package k6;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.n implements fz.e {
    public static final e H;
    public static final e K;
    public static final e L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f37918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f37919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f37920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f37921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f37922f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f37923t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37924a;

    static {
        int i11 = 2;
        f37918b = new e(i11, 0);
        f37919c = new e(i11, 1);
        f37920d = new e(i11, 2);
        f37921e = new e(i11, 3);
        f37922f = new e(i11, 4);
        f37923t = new e(i11, 5);
        H = new e(i11, 6);
        K = new e(i11, 7);
        L = new e(i11, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, int i12) {
        super(i11);
        this.f37924a = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37924a) {
            case 0:
                ((i) obj).f37928c = (c6.l) obj2;
                break;
            case 1:
                ((i) obj).f37929d = (c) obj2;
                break;
            case 2:
                ((j) obj).f37930c = (c6.l) obj2;
                break;
            case 3:
                ((j) obj).f37932e = ((a) obj2).f37911a;
                break;
            case 4:
                ((j) obj).f37931d = ((b) obj2).f37912a;
                break;
            case 5:
                ((k) obj).f37933c = (c6.l) obj2;
                break;
            case 6:
                ((k) obj).f37935e = ((b) obj2).f37912a;
                break;
            case 7:
                ((k) obj).f37934d = ((a) obj2).f37911a;
                break;
            default:
                ((l) obj).f37936a = (c6.l) obj2;
                break;
        }
        return b0.f48488a;
    }
}
