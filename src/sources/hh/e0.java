package hh;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.fluent.ui.base.PdFinishActivity;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.j4;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f32224b;

    public /* synthetic */ e0(j0 j0Var, int i11) {
        this.f32223a = i11;
        this.f32224b = j0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f32223a;
        int i12 = 3;
        EditText editText = null;
        Object[] objArr = 0;
        qy.b0 b0Var = qy.b0.f48488a;
        j0 j0Var = this.f32224b;
        switch (i11) {
            case 0:
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                j0Var.B();
                break;
            case 1:
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ta.a aVar = j0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((j4) aVar).f32769f.removeAllViews();
                Iterator it3 = j0Var.P.iterator();
                kotlin.jvm.internal.m.e(it3, "iterator(...)");
                while (it3.hasNext()) {
                    Object next = it3.next();
                    kotlin.jvm.internal.m.e(next, "next(...)");
                    View view = (View) next;
                    View view2 = (View) j0Var.T.get(view);
                    if (view2 != null) {
                        EditText editText2 = (EditText) view.findViewById(R.id.edt_text);
                        editText2.clearFocus();
                        editText2.setEnabled(false);
                        Object tag = view2.getTag();
                        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
                        String strQ0 = oz.x.q0(editText2.getText().toString(), " ", BuildConfig.VERSION_NAME);
                        String dictationWord = ((PdWord) tag).getDictationWord();
                        kotlin.jvm.internal.m.e(dictationWord, "getDictationWord(...)");
                        if (strQ0.equals(oz.x.q0(dictationWord, " ", BuildConfig.VERSION_NAME))) {
                            Context contextRequireContext = j0Var.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                            editText2.setBackgroundTintList(ColorStateList.valueOf(contextRequireContext.getColor(R.color.color_43CC93)));
                            Context contextRequireContext2 = j0Var.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                            editText2.setTextColor(contextRequireContext2.getColor(R.color.color_43CC93));
                        } else {
                            view2.setVisibility(0);
                            Context contextRequireContext3 = j0Var.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                            editText2.setBackgroundTintList(ColorStateList.valueOf(contextRequireContext3.getColor(R.color.color_FF6666)));
                            Context contextRequireContext4 = j0Var.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                            editText2.setTextColor(contextRequireContext4.getColor(R.color.color_FF6666));
                        }
                    }
                }
                th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new hd.b(j0Var, 18), vx.b.f54316e), j0Var.f36401t);
                ta.a aVar2 = j0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ((j4) aVar2).f32767d.setVisibility(8);
                ta.a aVar3 = j0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((j4) aVar3).f32768e.setVisibility(0);
                ta.a aVar4 = j0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                bq.z.b(((j4) aVar4).f32765b, new e0(j0Var, 2));
                ta.a aVar5 = j0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                bq.z.b(((j4) aVar5).f32766c, new e0(j0Var, i12));
                break;
            case 2:
                View it4 = (View) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                l.m mVar = j0Var.f36398d;
                if (mVar != null) {
                    mVar.finish();
                }
                int i13 = PdFinishActivity.H;
                Context contextRequireContext5 = j0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                j0Var.startActivity(md.a.q(contextRequireContext5, "FLUENT_WRITING"));
                break;
            case 3:
                View it5 = (View) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                j0Var.t().c("jxz_fl_write_redo", new m9(26));
                j0Var.y();
                break;
            case 4:
                View it6 = (View) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(j0Var), null, null, new gp.a(j0Var, objArr == true ? 1 : 0, 9), 3);
                break;
            case 5:
                lc.d it7 = (lc.d) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                l.m mVar2 = j0Var.f36398d;
                if (mVar2 != null) {
                    mVar2.finish();
                }
                b7.e0.A(j0Var.t(), "jxz_fl_write_quit");
                break;
            default:
                View it8 = (View) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                Iterator it9 = j0Var.P.iterator();
                kotlin.jvm.internal.m.e(it9, "iterator(...)");
                while (it9.hasNext()) {
                    Object next2 = it9.next();
                    kotlin.jvm.internal.m.e(next2, "next(...)");
                    EditText editText3 = (EditText) ((View) next2).findViewById(R.id.edt_text);
                    editText3.setShowSoftInputOnFocus(!editText3.getShowSoftInputOnFocus());
                    if (editText3.hasFocus()) {
                        editText3.requestFocusFromTouch();
                        editText = editText3;
                    }
                }
                if (editText != null) {
                    if (!editText.getShowSoftInputOnFocus()) {
                        ve.i.B(editText);
                    } else {
                        ve.i.J(editText);
                        b7.e0.A(j0Var.t(), "jxz_fl_write_open_keybd");
                    }
                }
                break;
        }
        return b0Var;
    }
}
