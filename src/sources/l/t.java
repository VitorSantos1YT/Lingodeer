package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import hj.k1;
import hj.q2;
import hj.y1;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import jp.p0;
import qp.s3;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39064e;

    public /* synthetic */ t(Object obj, int i11) {
        this.f39063d = i11;
        this.f39064e = obj;
    }

    @Override // z4.x0
    public final void b(View view) {
        int i11 = this.f39063d;
        Object obj = this.f39064e;
        switch (i11) {
            case 0:
                androidx.appcompat.app.b bVar = ((r) obj).f39060b;
                bVar.X.setAlpha(1.0f);
                bVar.f801a0.g(null);
                bVar.f801a0 = null;
                break;
            case 1:
                androidx.appcompat.app.b bVar2 = (androidx.appcompat.app.b) obj;
                bVar2.X.setAlpha(1.0f);
                bVar2.f801a0.g(null);
                bVar2.f801a0 = null;
                break;
            case 2:
                androidx.appcompat.app.b bVar3 = (androidx.appcompat.app.b) ((ob.u) obj).f44892c;
                bVar3.X.setVisibility(8);
                PopupWindow popupWindow = bVar3.Y;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (bVar3.X.getParent() instanceof View) {
                    View view2 = (View) bVar3.X.getParent();
                    WeakHashMap weakHashMap = s0.f58893a;
                    z4.h0.c(view2);
                }
                bVar3.X.g();
                bVar3.f801a0.g(null);
                bVar3.f801a0 = null;
                ViewGroup viewGroup = bVar3.f803c0;
                WeakHashMap weakHashMap2 = s0.f58893a;
                z4.h0.c(viewGroup);
                break;
            case 3:
                kotlin.jvm.internal.m.f(view, "view");
                ta.a aVar = ((qp.j) obj).f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((k1) aVar).f32809d.setVisibility(4);
                break;
            case 4:
                kotlin.jvm.internal.m.f(view, "view");
                ta.a aVar2 = ((s3) obj).f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((q2) aVar2).f33139c.setVisibility(4);
                break;
            case 5:
                kotlin.jvm.internal.m.f(view, "view");
                qy.q qVar = fv.b.f28186a;
                rq.i iVar = (rq.i) obj;
                String strA = iVar.f49389n.a(iVar.f49358b.f46983a);
                kotlin.jvm.internal.m.e(strA, "getCharName(...)");
                String strC = fv.b.c(strA, null, null);
                mp.b bVar4 = iVar.f49357a;
                ta.a aVar3 = iVar.f49363g;
                kotlin.jvm.internal.m.c(aVar3);
                ((p0) bVar4).H((ImageView) ((y1) aVar3).f33612b.f32408d, strC);
                int[] iArr = bq.r.f4959a;
                th.j.a(qx.h.m(bq.m.B(strC), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(iVar, 21), rq.a.K), iVar.f49364h);
                break;
            default:
                kotlin.jvm.internal.m.f(view, "view");
                ((View) obj).setEnabled(true);
                break;
        }
    }

    @Override // ve.i, z4.x0
    public void c() {
        int i11 = this.f39063d;
        Object obj = this.f39064e;
        switch (i11) {
            case 0:
                ((r) obj).f39060b.X.setVisibility(0);
                break;
            case 1:
                androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) obj;
                bVar.X.setVisibility(0);
                if (bVar.X.getParent() instanceof View) {
                    View view = (View) bVar.X.getParent();
                    WeakHashMap weakHashMap = s0.f58893a;
                    z4.h0.c(view);
                }
                break;
        }
    }
}
