package r;

import android.content.Context;
import android.view.View;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends q.t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f48544l = 0;
    public final /* synthetic */ androidx.appcompat.widget.c m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.widget.c cVar, Context context, q.l lVar, View view) {
        super(context, lVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = cVar;
        this.f47315f = 8388613;
        n9.q qVar = cVar.Z;
        this.f47317h = qVar;
        q.r rVar = this.f47318i;
        if (rVar != null) {
            rVar.l(qVar);
        }
    }

    @Override // q.t
    public final void c() {
        switch (this.f48544l) {
            case 0:
                androidx.appcompat.widget.c cVar = this.m;
                cVar.W = null;
                cVar.f1068a0 = 0;
                super.c();
                break;
            default:
                androidx.appcompat.widget.c cVar2 = this.m;
                q.l lVar = cVar2.f1070c;
                if (lVar != null) {
                    lVar.c(true);
                }
                cVar2.V = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.widget.c cVar, Context context, q.b0 b0Var, View view) {
        super(context, b0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = cVar;
        if ((b0Var.f47251c0.Z & 32) != 32) {
            View view2 = cVar.L;
            this.f47314e = view2 == null ? (View) cVar.H : view2;
        }
        n9.q qVar = cVar.Z;
        this.f47317h = qVar;
        q.r rVar = this.f47318i;
        if (rVar != null) {
            rVar.l(qVar);
        }
    }
}
