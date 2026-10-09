package jp;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import androidx.lifecycle.LifecycleOwnerKt;
import bp.g4;
import bp.w3;
import com.lingo.lingoskill.widget.LollipopFixedWebView;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.r5;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends bp.m {
    public String O;
    public long P;
    public int Q;
    public ob.i R;
    public final i.c S;

    public w0() {
        super(v0.f36547a, "MainCourseUnitTips");
        LearnType learnType = LearnType.LEARN;
        i.c cVarRegisterForActivityResult = registerForActivityResult(new androidx.fragment.app.e1(4), new hh.c(this, 5));
        kotlin.jvm.internal.m.e(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.S = cVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.k0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Drawable drawableNewDrawable;
        kotlin.jvm.internal.m.f(menu, "menu");
        kotlin.jvm.internal.m.f(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_feedback, menu);
        Drawable drawable = requireContext().getDrawable(R.drawable.ic_bugreport);
        kotlin.jvm.internal.m.c(drawable);
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null && (drawableNewDrawable = constantState.newDrawable()) != null) {
            drawable = drawableNewDrawable;
        }
        Drawable drawableMutate = drawable.mutate();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        drawableMutate.setTintList(ColorStateList.valueOf(contextRequireContext.getColor(R.color.primary_black)));
        menu.findItem(R.id.item_feedback).setIcon(drawableMutate);
    }

    @Override // androidx.fragment.app.k0
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.m.f(item, "item");
        if (item.getItemId() != R.id.item_feedback) {
            return true;
        }
        if (this.R == null) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            l.m mVar = this.f36398d;
            kotlin.jvm.internal.m.c(mVar);
            this.R = new ob.i((r5) aVar, mVar, r());
        }
        ob.i iVar = this.R;
        kotlin.jvm.internal.m.c(iVar);
        iVar.o();
        return true;
    }

    @f10.k(threadMode = ThreadMode.MAIN)
    public final void onRefreshEvent(np.b refreshEvent) {
        kotlin.jvm.internal.m.f(refreshEvent, "refreshEvent");
        if (refreshEvent.f43921a == 12) {
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new gp.a(this, null, 14), 3);
        }
    }

    @Override // ji.e
    public final void q() {
        ob.i iVar = this.R;
        if (iVar != null) {
            kotlin.jvm.internal.m.c(iVar);
            iVar.f();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        this.O = requireArguments().getString(INTENTS.EXTRA_STRING);
        this.P = requireArguments().getLong(INTENTS.EXTRA_LONG);
        this.Q = requireArguments().getInt(INTENTS.EXTRA_INT);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((r5) aVar).f33236i.setVisibility(8);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        LollipopFixedWebView lollipopFixedWebView = ((r5) aVar2).f33237j;
        StringBuilder sbQ = hh.p0.q("<html>\n<body>\n", this.O, "</body>\n</html>");
        lollipopFixedWebView.setWebViewClient(new w3(this, 3));
        String string = sbQ.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        lollipopFixedWebView.loadDataWithBaseURL(null, oz.x.q0(oz.x.q0(string, "contenteditable=\"true\"", BuildConfig.VERSION_NAME), "<html>", "<html style=\"user-select: none !important;\">"), "text/html", "utf-8", null);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        WebSettings settings = ((r5) aVar3).f33237j.getSettings();
        kotlin.jvm.internal.m.e(settings, "getSettings(...)");
        if ((getResources().getConfiguration().uiMode & 48) != 16) {
            if (se.k.s("ALGORITHMIC_DARKENING")) {
                va.a.b(settings);
            }
            if (se.k.s("FORCE_DARK")) {
                va.a.c(settings);
            }
        }
        String string2 = getString(R.string.learning_tips);
        kotlin.jvm.internal.m.e(string2, "getString(...)");
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(string2, mVar, view);
        if (r().locateLanguage == 3 && (r().keyLanguage == 0 || r().keyLanguage == 1 || r().keyLanguage == 2)) {
            setHasOptionsMenu(false);
        } else {
            setHasOptionsMenu(true);
        }
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        bq.z.b(((r5) aVar4).f33232e, new hh.x0(settings, 4));
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        bq.z.b(((r5) aVar5).f33233f, new hh.x0(settings, 5));
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new gp.a(this, null, 14), 3);
        setHasOptionsMenu(true);
        yx.d dVarM = new yx.a(new g4(this, 9), 1).M(ky.e.f38937b);
        qx.o oVarA = px.b.a();
        xx.d dVar = new xx.d(h.L, new nf.f(2));
        try {
            dVarM.K(new yx.b(dVar, oVarA));
            th.j.a(dVar, this.f36401t);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    @Override // ji.e
    public final boolean w() {
        return true;
    }
}
