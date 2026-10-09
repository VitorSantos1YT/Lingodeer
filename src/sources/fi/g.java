package fi;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements tx.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f27305b = new g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f27306c = new g(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f27307d = new g(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f27308e = new g(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27309a;

    public /* synthetic */ g(int i11) {
        this.f27309a = i11;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f27309a) {
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
                Throwable p4 = (Throwable) obj;
                m.f(p4, "p0");
                p4.printStackTrace();
                break;
            default:
                Throwable obj4 = (Throwable) obj;
                m.f(obj4, "obj");
                obj4.printStackTrace();
                break;
        }
    }
}
