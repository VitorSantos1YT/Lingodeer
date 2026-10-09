package mt;

import aj.uZCn.evRpcb;
import android.view.View;
import com.lingodeer.data.model.ReviewVisibilityMode;
import com.lingodeer.data.model.SRSStatus;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rt.u8;
import rt.y8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x4 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f42061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42062c;

    public /* synthetic */ x4(Object obj, boolean z11, int i11) {
        this.f42060a = i11;
        this.f42062c = obj;
        this.f42061b = z11;
    }

    public /* synthetic */ x4(boolean z11, ReviewVisibilityMode reviewVisibilityMode) {
        this.f42060a = 1;
        this.f42061b = z11;
        this.f42062c = reviewVisibilityMode;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f42060a) {
            case 0:
                View view = (View) this.f42062c;
                l1.j0 DisposableEffect = (l1.j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                boolean keepScreenOn = view.getKeepScreenOn();
                view.setKeepScreenOn(keepScreenOn || this.f42061b);
                return new dt.c4(view, keepScreenOn);
            case 1:
                ReviewVisibilityMode reviewVisibilityMode = (ReviewVisibilityMode) this.f42062c;
                SRSStatus it = (SRSStatus) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return Boolean.valueOf((it.isExcludedFromReview() == this.f42061b && it.getReviewVisibilityMode() == reviewVisibilityMode) ? false : true);
            default:
                y8 unit = (y8) this.f42062c;
                u8 current = (u8) obj;
                kotlin.jvm.internal.m.f(current, "current");
                Map map = current.f50487a;
                kotlin.jvm.internal.m.f(unit, "unit");
                List<rt.k6> list = unit.f50700j;
                int iW = ry.x.W(ry.n.W(list, 10));
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                for (rt.k6 k6Var : list) {
                    linkedHashMap.put(k6Var.f49972c.getId(), Long.valueOf(k6Var.f49972c.getElemId()));
                }
                if (this.f42061b) {
                    return new u8(ry.x.c0(map, linkedHashMap));
                }
                Set keys = linkedHashMap.keySet();
                String str = evRpcb.NHa;
                kotlin.jvm.internal.m.f(map, str);
                kotlin.jvm.internal.m.f(keys, "keys");
                LinkedHashMap linkedHashMapK0 = ry.x.k0(map);
                Set setKeySet = linkedHashMapK0.keySet();
                kotlin.jvm.internal.m.f(setKeySet, str);
                setKeySet.removeAll(keys instanceof Collection ? keys : ry.m.a1(keys));
                return new u8(ry.x.b0(linkedHashMapK0));
        }
    }
}
