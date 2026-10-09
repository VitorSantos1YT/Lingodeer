package ci;

import androidx.fragment.app.k1;
import androidx.fragment.app.q1;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends q1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ji.e[] f7136h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(ji.e[] eVarArr, k1 k1Var, int i11) {
        super(k1Var);
        this.f7135g = i11;
        this.f7136h = eVarArr;
    }

    @Override // androidx.fragment.app.q1, ua.a
    public final void a(ViewPager viewPager, int i11, Object object) {
        switch (this.f7135g) {
            case 0:
                kotlin.jvm.internal.m.f(object, "object");
                super.a(viewPager, i11, object);
                break;
            default:
                kotlin.jvm.internal.m.f(object, "object");
                super.a(viewPager, i11, object);
                break;
        }
    }

    @Override // ua.a
    public final int c() {
        switch (this.f7135g) {
            case 0:
                return this.f7136h.length;
            default:
                return ((bp.m[]) this.f7136h).length;
        }
    }

    @Override // androidx.fragment.app.q1
    public final androidx.fragment.app.k0 j(int i11) {
        switch (this.f7135g) {
            case 0:
                return this.f7136h[i11];
            default:
                return ((bp.m[]) this.f7136h)[i11];
        }
    }
}
