package ak;

import ep.f;
import java.util.List;
import ji.b;
import kotlin.jvm.internal.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {
    public final /* synthetic */ int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(dp.a aVar, b bVar, int i11) {
        super(aVar, bVar);
        this.M = i11;
    }

    @Override // ep.f
    public final int c() {
        switch (this.M) {
            case 0:
                return 0;
            default:
                return 1;
        }
    }

    @Override // ep.f
    public final List d(String parentDir, boolean z11) {
        switch (this.M) {
            case 0:
                m.f(parentDir, "parentDir");
                break;
            default:
                m.f(parentDir, "parentDir");
                break;
        }
        return r.f50854a;
    }

    @Override // ep.f
    public final boolean f() {
        switch (this.M) {
        }
        return false;
    }

    @Override // ep.f
    public final boolean g() {
        switch (this.M) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // ep.f
    public final boolean h() {
        switch (this.M) {
        }
        return true;
    }
}
