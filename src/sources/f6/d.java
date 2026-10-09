package f6;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f26621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f26622c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26623a;

    static {
        int i11 = 1;
        f26621b = new d(i11, 0);
        f26622c = new d(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11, int i12) {
        super(i11);
        this.f26623a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f26623a) {
            case 0:
                break;
        }
        return (d6.f) obj;
    }
}
