package oo;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.ui.platform.ComposeView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import com.yalantis.ucrop.view.CropImageView;
import dt.Xk.wuoM;
import hj.e3;
import hj.y4;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import n0.w0;
import op.a;
import op.b;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h<T extends op.b, F extends op.a, G extends PodSentence<T, F>> extends bp.n implements jo.a {
    public View P;
    public lc.d Q;
    public g R;
    public List S;
    public int T;
    public long U;

    public h() {
        super(d.f45642a, "StoryReadingVideoPlay");
        LearnType learnType = LearnType.LEARN;
    }

    public final void A(String progress, boolean z11) {
        kotlin.jvm.internal.m.f(progress, "progress");
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        if (((y4) aVar).f33627g == null) {
            return;
        }
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        e3 e3Var = ((y4) aVar2).f33627g;
        if (e3Var != null) {
            LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
            if (z11) {
                linearLayout.setVisibility(8);
            } else {
                ComposeView composeView = (ComposeView) e3Var.f32524c;
                ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
                linearLayout.setVisibility(0);
            }
        }
        if (z11) {
            if (LingoSkillApplication.f21670t) {
                th.j.a(x().k(ky.e.f38937b).g(px.b.a()).h(new o20.w(this, 2), f.f45648b), this.f36401t);
                return;
            }
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            e3 e3Var2 = ((y4) aVar3).f33627g;
            if (e3Var2 != null) {
                ((LinearLayout) e3Var2.f32525d).setVisibility(8);
            }
            ii.a aVar4 = this.N;
            kotlin.jvm.internal.m.c(aVar4);
            ((bm.a) aVar4).a(this.T);
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.m.f(menu, "menu");
        kotlin.jvm.internal.m.f(inflater, "inflater");
        inflater.inflate(R.menu.menu_speak_sent_type, menu);
    }

    @Override // androidx.fragment.app.k0
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.m.f(item, "item");
        if (item.getItemId() == R.id.item_setting) {
            z();
            View view = this.P;
            kotlin.jvm.internal.m.c(view);
            SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.switch_show_translation);
            kotlin.jvm.internal.m.c(switchCompat);
            bq.z.b(switchCompat, new w0(9, this, switchCompat));
            switchCompat.setChecked(r().showStoryTrans);
            View view2 = this.P;
            if (view2 != null) {
                final TextView textView = (TextView) view2.findViewById(R.id.tv_speed);
                ImageView imageView = (ImageView) view2.findViewById(R.id.iv_remove_speed);
                ImageView imageView2 = (ImageView) view2.findViewById(R.id.iv_plus_speed);
                textView.setText(r().audioSpeed + "%");
                kotlin.jvm.internal.m.c(imageView2);
                final int i11 = 0;
                bq.z.b(imageView2, new fz.c(this) { // from class: oo.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f45634b;

                    {
                        this.f45634b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                h hVar = this.f45634b;
                                if (hVar.r().audioSpeed < 150) {
                                    hVar.r().audioSpeed += 10;
                                    hVar.r().updateEntry("audioSpeed");
                                    textView.setText(hVar.r().audioSpeed + "%");
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                h hVar2 = this.f45634b;
                                if (hVar2.r().audioSpeed > 50) {
                                    hVar2.r().audioSpeed -= 10;
                                    hVar2.r().updateEntry("audioSpeed");
                                    String.valueOf(hVar2.r().audioSpeed);
                                    textView.setText(hVar2.r().audioSpeed + "%");
                                }
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                kotlin.jvm.internal.m.c(imageView);
                final int i12 = 1;
                bq.z.b(imageView, new fz.c(this) { // from class: oo.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f45634b;

                    {
                        this.f45634b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i12) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                h hVar = this.f45634b;
                                if (hVar.r().audioSpeed < 150) {
                                    hVar.r().audioSpeed += 10;
                                    hVar.r().updateEntry("audioSpeed");
                                    textView.setText(hVar.r().audioSpeed + "%");
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                h hVar2 = this.f45634b;
                                if (hVar2.r().audioSpeed > 50) {
                                    hVar2.r().audioSpeed -= 10;
                                    hVar2.r().updateEntry("audioSpeed");
                                    String.valueOf(hVar2.r().audioSpeed);
                                    textView.setText(hVar2.r().audioSpeed + "%");
                                }
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
            }
            lc.d dVar = this.Q;
            if (dVar == null) {
                l.m mVar = this.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                lc.d dVar2 = new lc.d(mVar);
                hz.b.t(dVar2, null, this.P, true, 41);
                lc.d.e(dVar2, Integer.valueOf(R.string.f22251ok), null, null, 6);
                md.a.r(dVar2, new c(this, 0));
                dVar2.show();
                this.Q = dVar2;
            } else {
                dVar.show();
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        g gVar = this.R;
        if (gVar != null) {
            gVar.c();
        }
    }

    @Override // ji.f, ji.e
    public final void q() {
        super.q();
        g gVar = this.R;
        if (gVar != null) {
            gVar.a();
        }
    }

    public abstract ay.g0 x();

    public abstract void y();

    public abstract void z();

    @Override // ji.e
    public final void v(Bundle bundle) {
        String strP;
        String strO;
        String strU;
        String strK;
        this.T = requireArguments().getInt(INTENTS.EXTRA_INT);
        this.U = requireArguments().getLong(INTENTS.EXTRA_LONG);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        String strY = ff.h.y(contextRequireContext, R.string.story);
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(strY, mVar, view);
        y();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        bq.z.b(((y4) aVar).f33624d, new c(this, 1));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        bq.z.b(((y4) aVar2).f33622b, new c(this, 2));
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        bq.z.b(((y4) aVar3).f33623c, new c(this, 3));
        setHasOptionsMenu(true);
        ii.a aVar4 = this.N;
        kotlin.jvm.internal.m.c(aVar4);
        bm.a aVar5 = (bm.a) aVar4;
        int i11 = this.T;
        switch (aVar5.f4463e) {
            case 0:
                qy.q qVar = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 1:
                qy.q qVar2 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 2:
                qy.q qVar3 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 3:
                qy.q qVar4 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 4:
                qy.q qVar5 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 5:
                qy.q qVar6 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 6:
                qy.q qVar7 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 7:
                qy.q qVar8 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            default:
                qy.q qVar9 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
        }
        switch (aVar5.f4463e) {
            case 0:
                qy.q qVar10 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 1:
                qy.q qVar11 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 2:
                qy.q qVar12 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 3:
                qy.q qVar13 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 4:
                qy.q qVar14 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 5:
                qy.q qVar15 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 6:
                qy.q qVar16 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 7:
                qy.q qVar17 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            default:
                qy.q qVar18 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
        }
        fv.a aVar6 = new fv.a(4L, strP, strO);
        switch (aVar5.f4463e) {
            case 0:
                qy.q qVar19 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 1:
                qy.q qVar20 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 2:
                qy.q qVar21 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 3:
                qy.q qVar22 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 4:
                qy.q qVar23 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 5:
                qy.q qVar24 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 6:
                qy.q qVar25 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 7:
                qy.q qVar26 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            default:
                qy.q qVar27 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
        }
        switch (aVar5.f4463e) {
            case 0:
                qy.q qVar28 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 1:
                qy.q qVar29 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 2:
                qy.q qVar30 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 3:
                qy.q qVar31 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 4:
                qy.q qVar32 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 5:
                qy.q qVar33 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 6:
                qy.q qVar34 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 7:
                qy.q qVar35 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            default:
                qy.q qVar36 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
        }
        ArrayList arrayListB = ns.o.b(aVar6, new fv.a(5L, strU, strK));
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayListB.get(i13);
            i13++;
            if (!new File(((fv.a) obj).f28184c).exists()) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            fv.c cVar = new fv.c();
            aVar5.f4460b = cVar;
            cVar.c(arrayList, new mo.b(aVar5, wVar, arrayList, i12), false);
            return;
        }
        ((h) aVar5.f4459a).A(wuoM.injsIi, true);
    }
}
