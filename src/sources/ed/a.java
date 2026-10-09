package ed;

import b0.h2;
import java.util.List;
import zc.h;
import zc.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i11, List list) {
        super(list, 3);
        this.f25469c = i11;
    }

    @Override // ed.f
    public final zc.d I() {
        switch (this.f25469c) {
            case 0:
                return new zc.e(0, (List) this.f3561b);
            case 1:
                return new h(0, (List) this.f3561b);
            case 2:
                return new zc.e(1, (List) this.f3561b);
            case 3:
                return new h(1, (List) this.f3561b);
            case 4:
                return new h(2, (List) this.f3561b);
            case 5:
                return new l((List) this.f3561b);
            default:
                return new zc.e(2, (List) this.f3561b);
        }
    }
}
