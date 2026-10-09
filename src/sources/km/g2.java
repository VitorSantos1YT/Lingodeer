package km;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import com.lingodeer.ui.ShareMedalView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g2 implements fz.c {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38198a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38203f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f38204t;

    public /* synthetic */ g2(LinearLayout linearLayout, j2 j2Var, View view, View view2, RecyclerView recyclerView, NestedScrollView nestedScrollView, int i11, LinearLayout linearLayout2) {
        this.f38200c = linearLayout;
        this.f38202e = j2Var;
        this.f38203f = view;
        this.f38204t = view2;
        this.H = recyclerView;
        this.K = nestedScrollView;
        this.f38199b = i11;
        this.f38201d = linearLayout2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f38198a) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) this.f38200c;
                j2 j2Var = (j2) this.f38202e;
                AtomicBoolean atomicBoolean = j2Var.X;
                View view = (View) this.f38203f;
                View view2 = (View) this.f38204t;
                RecyclerView recyclerView = (RecyclerView) this.H;
                NestedScrollView nestedScrollView = (NestedScrollView) this.K;
                LinearLayout linearLayout2 = (LinearLayout) this.f38201d;
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                Object tag = linearLayout.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                List list = (List) tag;
                Drawable background = linearLayout.getBackground();
                kotlin.jvm.internal.m.d(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                int color = ((ColorDrawable) background).getColor();
                Context contextRequireContext = j2Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                if (color == contextRequireContext.getColor(R.color.white)) {
                    j2Var.A(recyclerView, view, view2);
                    atomicBoolean.set(false);
                    j2Var.Q = 0;
                    j2Var.z(recyclerView, list, nestedScrollView);
                    if (this.f38199b < linearLayout2.getChildCount() - 1) {
                        View childAt = linearLayout.getChildAt(0);
                        kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.ImageView");
                        Context contextRequireContext2 = j2Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cf.x.L((ImageView) childAt, R.drawable.ic_ctrl_pause, ColorStateList.valueOf(contextRequireContext2.getColor(R.color.white)));
                        Context contextRequireContext3 = j2Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        linearLayout.setBackgroundColor(contextRequireContext3.getColor(R.color.colorAccent));
                    } else {
                        TextView textView = (TextView) linearLayout.findViewById(R.id.tv_all);
                        Context contextRequireContext4 = j2Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        textView.setTextColor(contextRequireContext4.getColor(R.color.white));
                        Context contextRequireContext5 = j2Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                        linearLayout.setBackgroundColor(contextRequireContext5.getColor(R.color.colorAccent));
                    }
                } else {
                    xx.f fVar = j2Var.R;
                    if (fVar != null) {
                        ux.b.a(fVar);
                    }
                    a9.i iVar = j2Var.T;
                    kotlin.jvm.internal.m.c(iVar);
                    iVar.y();
                    atomicBoolean.set(true);
                    j2Var.A(recyclerView, view, view2);
                }
                return qy.b0.f48488a;
            default:
                g2.t tVar = (g2.t) this.f38200c;
                List list2 = (List) this.f38201d;
                String str = (String) this.f38202e;
                String str2 = (String) this.f38203f;
                String str3 = (String) this.f38204t;
                rz.b0 b0Var = (rz.b0) this.H;
                fz.e eVar = (fz.e) this.K;
                Context context = (Context) obj;
                kotlin.jvm.internal.m.f(context, "context");
                return new ShareMedalView(context, new t1.d(new b0.e2(tVar, this.f38199b, list2, str, str2, str3), true, -1452848858), new pr.a0(b0Var, context, eVar, 0));
        }
    }

    public /* synthetic */ g2(g2.t tVar, int i11, List list, String str, String str2, String str3, rz.b0 b0Var, fz.e eVar) {
        this.f38200c = tVar;
        this.f38199b = i11;
        this.f38201d = list;
        this.f38202e = str;
        this.f38203f = str2;
        this.f38204t = str3;
        this.H = b0Var;
        this.K = eVar;
    }
}
