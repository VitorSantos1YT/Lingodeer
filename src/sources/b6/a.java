package b6;

import kotlin.jvm.internal.n;
import l1.b1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3927c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3928a;

    static {
        int i11 = 1;
        f3926b = new a(i11, 0);
        f3927c = new a(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i11, int i12) {
        super(i11);
        this.f3928a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f3928a) {
            case 0:
                return b0.f48488a;
            default:
                return new f((b1) obj);
        }
    }
}
