package i6;

import c6.k;
import fz.e;
import k6.m;
import k6.t;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f34160c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34161a;

    static {
        int i11 = 2;
        f34159b = new a(i11, 0);
        f34160c = new a(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i11, int i12) {
        super(i11);
        this.f34161a = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34161a) {
            case 0:
                k kVar = (k) obj2;
                return kVar instanceof t ? kVar : obj;
            default:
                k kVar2 = (k) obj2;
                return kVar2 instanceof m ? kVar2 : obj;
        }
    }
}
