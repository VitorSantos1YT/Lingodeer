package bq;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.b1;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4990c;

    public /* synthetic */ x(int i11, Object obj, Object obj2) {
        this.f4988a = i11;
        this.f4989b = obj;
        this.f4990c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v11) {
        f fVar;
        int i11;
        fz.f fVar2;
        switch (this.f4988a) {
            case 0:
                w wVar = (w) this.f4990c;
                b7.c cVar = (b7.c) this.f4989b;
                kotlin.jvm.internal.m.f(v11, "v");
                if (System.currentTimeMillis() >= 500 && (fVar = (f) cVar.f3962e) != null) {
                    boolean z11 = fVar.f4943a;
                    if (wVar != null) {
                        wVar.k(v11, z11);
                    }
                    if (z11) {
                        ImageView imageView = (ImageView) cVar.f3960c;
                        kotlin.jvm.internal.m.c(imageView);
                        ViewParent parent = imageView.getParent();
                        kotlin.jvm.internal.m.d(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
                        ((FrameLayout) parent).setBackgroundResource(R.drawable.bg_lesson_index_start_btn_enable);
                        f fVar3 = (f) cVar.f3962e;
                        kotlin.jvm.internal.m.c(fVar3);
                        fVar3.t();
                    } else {
                        ImageView imageView2 = (ImageView) cVar.f3960c;
                        kotlin.jvm.internal.m.c(imageView2);
                        ViewParent parent2 = imageView2.getParent();
                        kotlin.jvm.internal.m.d(parent2, "null cannot be cast to non-null type android.widget.FrameLayout");
                        ((FrameLayout) parent2).setBackgroundResource(R.drawable.point_yellow);
                        f fVar4 = (f) cVar.f3962e;
                        kotlin.jvm.internal.m.c(fVar4);
                        fVar4.r((String) cVar.f3961d);
                        cVar.f3958a = 0;
                        cVar.h();
                    }
                    if (wVar != null) {
                        wVar.m(v11, z11);
                    }
                }
                break;
            default:
                lc.d dialog = ((DialogActionButtonLayout) this.f4989b).getDialog();
                lc.h hVar = (lc.h) this.f4990c;
                dialog.getClass();
                int i12 = lc.b.f39875a[hVar.ordinal()];
                if (i12 == 1) {
                    md.a.n(dialog.L, dialog);
                    DialogRecyclerView recyclerView = dialog.f39884t.getContentLayout().getRecyclerView();
                    b1 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
                    rc.d dVar = (rc.d) (adapter instanceof rc.d ? adapter : null);
                    if (dVar != null && (i11 = dVar.f49078a) > -1 && (fVar2 = dVar.f49083f) != null) {
                    }
                } else if (i12 == 2) {
                    md.a.n(dialog.M, dialog);
                } else if (i12 == 3) {
                    md.a.n(dialog.N, dialog);
                }
                if (dialog.f39879b) {
                    dialog.dismiss();
                }
                break;
        }
    }
}
