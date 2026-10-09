package o6;

import c6.l;
import kotlin.jvm.internal.n;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n implements fz.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f44719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f44720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f44721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f44722e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44723a;

    static {
        int i11 = 2;
        f44719b = new e(i11, 0);
        f44720c = new e(i11, 1);
        f44721d = new e(i11, 2);
        f44722e = new e(i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, int i12) {
        super(i11);
        this.f44723a = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44723a) {
            case 0:
                ((a) obj).f44713a = (String) obj2;
                break;
            case 1:
                ((a) obj).f44716d = (l) obj2;
                break;
            case 2:
                ((a) obj).f44714b = (g) obj2;
                break;
            default:
                ((a) obj).f44715c = ((Number) obj2).intValue();
                break;
        }
        return b0.f48488a;
    }
}
