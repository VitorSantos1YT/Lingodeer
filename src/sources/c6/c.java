package c6;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f6607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f6608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f6609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f6610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f6611f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f6612t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6613a;

    static {
        int i11 = 2;
        f6607b = new c(i11, 0);
        f6608c = new c(i11, 1);
        f6609d = new c(i11, 2);
        f6610e = new c(i11, 3);
        f6611f = new c(i11, 4);
        f6612t = new c(i11, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12) {
        super(i11);
        this.f6613a = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6613a) {
            case 0:
                String str = (String) obj;
                k kVar = (k) obj2;
                if (str.length() == 0) {
                    return kVar.toString();
                }
                return str + ", " + kVar;
            case 1:
                ((h) obj).f6627b = (a) obj2;
                return b0.f48488a;
            case 2:
                ((h) obj).f6626a = (l) obj2;
                return b0.f48488a;
            case 3:
                ((h) obj).f6628c = ((k6.h) obj2).f37927a;
                return b0.f48488a;
            case 4:
                h hVar = (h) obj;
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                hVar.getClass();
                return b0.f48488a;
            default:
                k kVar2 = (k) obj2;
                return kVar2 instanceof l6.b ? kVar2 : obj;
        }
    }
}
