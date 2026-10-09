package rq;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49350b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49351c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49352d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f49353e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f49354f = new a(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f49355t = new a(5);
    public static final a H = new a(6);
    public static final a K = new a(7);

    public /* synthetic */ a(int i11) {
        this.f49356a = i11;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f49356a) {
            case 0:
                Throwable obj2 = (Throwable) obj;
                m.f(obj2, "obj");
                obj2.printStackTrace();
                break;
            case 1:
                Throwable obj3 = (Throwable) obj;
                m.f(obj3, "obj");
                obj3.printStackTrace();
                break;
            case 2:
                Throwable obj4 = (Throwable) obj;
                m.f(obj4, "obj");
                obj4.printStackTrace();
                break;
            case 3:
                Throwable p4 = (Throwable) obj;
                m.f(p4, "p0");
                p4.printStackTrace();
                break;
            case 4:
                Throwable p11 = (Throwable) obj;
                m.f(p11, "p0");
                p11.printStackTrace();
                break;
            case 5:
                Throwable p12 = (Throwable) obj;
                m.f(p12, "p0");
                p12.printStackTrace();
                break;
            case 6:
                Throwable p13 = (Throwable) obj;
                m.f(p13, "p0");
                p13.printStackTrace();
                break;
            default:
                Throwable obj5 = (Throwable) obj;
                m.f(obj5, "obj");
                obj5.printStackTrace();
                break;
        }
    }
}
