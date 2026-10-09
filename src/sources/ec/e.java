package ec;

import androidx.recyclerview.widget.p2;
import com.android.billingclient.api.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends p2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ob.e f25464h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i11, ob.e eVar) {
        super(i11);
        this.f25464h = eVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public final void f(Object obj, Object obj2, Object obj3) {
        d dVar = (d) obj2;
        ((c0) this.f25464h.f44804b).g((a) obj, dVar.f25461a, dVar.f25462b, dVar.f25463c);
    }

    @Override // androidx.recyclerview.widget.p2
    public final int t(Object obj, Object obj2) {
        return ((d) obj2).f25463c;
    }
}
