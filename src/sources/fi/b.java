package fi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import bq.z;
import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.JPChar;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import hj.e3;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends yq.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ om.b f27297b;

    public /* synthetic */ b(om.b bVar, int i11) {
        this.f27296a = i11;
        this.f27297b = bVar;
    }

    @Override // yq.a
    public final void a(View view) {
        switch (this.f27296a) {
            case 0:
                CardView cardView = (CardView) view;
                d dVar = (d) this.f27297b;
                Context context = dVar.H;
                if (context == null) {
                    m.n("mContext");
                    throw null;
                }
                e3 e3VarC = e3.c(LayoutInflater.from(context), (ViewGroup) view);
                dVar.M = e3VarC;
                RelativeLayout relativeLayout = (RelativeLayout) e3VarC.f32523b;
                m.e(relativeLayout, "getRoot(...)");
                cardView.addView(relativeLayout);
                e3 e3Var = dVar.M;
                m.c(e3Var);
                z.b((HwView) e3Var.f32524c, new com.google.firebase.datastorage.a(dVar, 22));
                e3 e3Var2 = dVar.M;
                m.c(e3Var2);
                z.a((HwView) e3Var2.f32524c, 500L, new a(dVar, 0));
                TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_title);
                m.c(textView);
                ARChar aRChar = dVar.f27301t;
                if (aRChar != null) {
                    textView.setText(aRChar.getZhuyin());
                    return;
                } else {
                    m.n("mChar");
                    throw null;
                }
            default:
                CardView cardView2 = (CardView) view;
                cardView2.removeAllViews();
                om.e eVar = (om.e) this.f27297b;
                Context context2 = eVar.H;
                if (context2 == null) {
                    m.n("mContext");
                    throw null;
                }
                e3 e3VarC2 = e3.c(LayoutInflater.from(context2), (ViewGroup) view);
                eVar.M = e3VarC2;
                RelativeLayout relativeLayout2 = (RelativeLayout) e3VarC2.f32523b;
                m.e(relativeLayout2, "getRoot(...)");
                cardView2.addView(relativeLayout2);
                e3 e3Var3 = eVar.M;
                m.c(e3Var3);
                z.b((HwView) e3Var3.f32524c, new kp.j(eVar, 26));
                e3 e3Var4 = eVar.M;
                m.c(e3Var4);
                z.a((HwView) e3Var4.f32524c, 500L, new om.c(eVar, 0));
                e3 e3Var5 = eVar.M;
                m.c(e3Var5);
                TextView textView2 = (TextView) e3Var5.f32525d;
                JPChar jPChar = eVar.f45607t;
                if (jPChar == null) {
                    m.n("jpChar");
                    throw null;
                }
                textView2.setText(jPChar.getDisplayLuoMa());
                if (eVar.f45606f.isPing) {
                    e3 e3Var6 = eVar.M;
                    m.c(e3Var6);
                    TextView textView3 = (TextView) e3Var6.f32525d;
                    JPChar jPChar2 = eVar.f45607t;
                    if (jPChar2 == null) {
                        m.n("jpChar");
                        throw null;
                    }
                    String pian = jPChar2.getPian();
                    JPChar jPChar3 = eVar.f45607t;
                    if (jPChar3 == null) {
                        m.n("jpChar");
                        throw null;
                    }
                    textView3.setText(pian + "/" + jPChar3.getDisplayLuoMa());
                    return;
                }
                e3 e3Var7 = eVar.M;
                m.c(e3Var7);
                TextView textView4 = (TextView) e3Var7.f32525d;
                JPChar jPChar4 = eVar.f45607t;
                if (jPChar4 == null) {
                    m.n("jpChar");
                    throw null;
                }
                String ping = jPChar4.getPing();
                JPChar jPChar5 = eVar.f45607t;
                if (jPChar5 == null) {
                    m.n("jpChar");
                    throw null;
                }
                textView4.setText(ping + "/" + jPChar5.getDisplayLuoMa());
                return;
        }
    }
}
