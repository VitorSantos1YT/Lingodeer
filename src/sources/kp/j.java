package kp;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import bt.j1;
import com.google.api.Service;
import com.lingo.lingoskill.billing.SubscriptionSuccessActivity;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.speak.ui.SpeakTryActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.learn.adapter.LessonFinishSummaryAdapter;
import com.lingo.lingoskill.vtskill.ui.syllable.adapter.VTSyllableIndexRecyclerAdapter;
import com.lingo.syllable.ko.KOSyllableActivity;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import hj.b5;
import hj.e3;
import hj.p6;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import kv.j0;
import kv.s0;
import l0.l;
import l0.o;
import l0.w;
import l1.a2;
import l1.d2;
import l1.i1;
import l1.k1;
import l1.z;
import lp.k;
import m0.p;
import m0.v;
import m0.x;
import n0.h0;
import o0.t;
import o0.y;
import o3.u;
import oo.d0;
import qy.b0;
import qy.q;
import r.x2;
import rz.e0;
import rz.g1;
import y2.i0;
import y2.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38401b;

    public /* synthetic */ j(int i11, Object obj, Object obj2) {
        this.f38400a = i11;
        this.f38401b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r9v1 */
    @Override // fz.c
    public final Object invoke(Object obj) {
        o oVar;
        p pVar;
        String strConcat;
        StringBuilder sb2;
        int i11;
        int i12 = this.f38400a;
        int i13 = 8;
        int i14 = 10;
        int i15 = 4;
        float fO = CropImageView.DEFAULT_ASPECT_RATIO;
        char c11 = 1;
        o oVar2 = 0;
        p pVar2 = null;
        switch (i12) {
            case 0:
                HwCharacter hwCharacter = (HwCharacter) this.f38401b;
                m.f((View) obj, "it");
                xt.b.a().g();
                q qVar = fv.f.f28191a;
                String pinyin = hwCharacter.getPinyin();
                m.e(pinyin, "getPinyin(...)");
                fv.f.b(pinyin);
                throw null;
            case 1:
                s0 s0Var = (s0) this.f38401b;
                j0 it = (j0) obj;
                m.f(it, "it");
                return Boolean.valueOf(it.f38767h == s0Var);
            case 2:
                l lVar = (l) this.f38401b;
                return lVar.s0(((Integer) obj).intValue(), lVar.f39129e);
            case 3:
                w wVar = (w) this.f38401b;
                float f5 = -((Float) obj).floatValue();
                if ((f5 >= CropImageView.DEFAULT_ASPECT_RATIO || wVar.d()) && (f5 <= CropImageView.DEFAULT_ASPECT_RATIO || wVar.c())) {
                    if (Math.abs(wVar.f39209h) > 0.5f) {
                        i0.a.c("entered drag with non-zero pending scroll");
                    }
                    wVar.f39205d = true;
                    float f11 = wVar.f39209h + f5;
                    wVar.f39209h = f11;
                    if (Math.abs(f11) > 0.5f) {
                        float f12 = wVar.f39209h;
                        int iRound = Math.round(f12);
                        o oVarD = ((o) wVar.f39207f.getValue()).d(iRound, !wVar.f39203b);
                        if (oVarD == null || (oVar = wVar.f39204c) == null) {
                            oVar2 = oVarD;
                        } else {
                            o oVarD2 = oVar.d(iRound, true);
                            if (oVarD2 != null) {
                                wVar.f39204c = oVarD2;
                                oVar2 = oVarD;
                            }
                        }
                        if (oVar2 != 0) {
                            wVar.g(oVar2, wVar.f39203b, true);
                            wVar.f39222v.setValue(b0.f48488a);
                            wVar.i(f12 - wVar.f39209h, oVar2);
                        } else {
                            i0 i0Var = wVar.f39212k;
                            if (i0Var != null) {
                                i0Var.l();
                            }
                            wVar.i(f12 - wVar.f39209h, wVar.h());
                        }
                    }
                    if (Math.abs(wVar.f39209h) > 0.5f) {
                        f5 -= wVar.f39209h;
                        wVar.f39209h = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    fO = f5;
                }
                return Float.valueOf(-fO);
            case 4:
                ((z) this.f38401b).y(obj);
                return b0.f48488a;
            case 5:
                d2 d2Var = (d2) this.f38401b;
                Throwable th2 = (Throwable) obj;
                CancellationException cancellationExceptionA = e0.a("Recomposer effect job completed", th2);
                synchronized (d2Var.f39259d) {
                    try {
                        g1 g1Var = d2Var.f39260e;
                        if (g1Var != null) {
                            d2Var.f39276v.k(a2.ShuttingDown);
                            g1Var.cancel(cancellationExceptionA);
                            d2Var.f39273s = null;
                            g1Var.invokeOnCompletion(new j9.h(13, d2Var, th2));
                        } else {
                            d2Var.f39261f = cancellationExceptionA;
                            d2Var.f39276v.k(a2.ShutDown);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return b0.f48488a;
            case 6:
                ((l1.g1) this.f38401b).m(((Float) obj).floatValue());
                return b0.f48488a;
            case 7:
                ((i1) this.f38401b).n(((Long) obj).longValue());
                return b0.f48488a;
            case 8:
                ((k1) this.f38401b).setValue(obj);
                return b0.f48488a;
            case 9:
                y.j0 j0Var = (y.j0) this.f38401b;
                if (obj instanceof x1.z) {
                    ((x1.z) obj).k(4);
                }
                j0Var.a(obj);
                return b0.f48488a;
            case 10:
                SubscriptionSuccessActivity subscriptionSuccessActivity = (SubscriptionSuccessActivity) this.f38401b;
                int i16 = SubscriptionSuccessActivity.P;
                m.f((View) obj, "it");
                subscriptionSuccessActivity.finish();
                return b0.f48488a;
            case 11:
                x2 x2Var = (x2) this.f38401b;
                m.f((View) obj, "it");
                d0 d0Var = (d0) x2Var.f48712d;
                int i17 = d0Var.T;
                if (i17 > 0) {
                    d0Var.T = i17 - 1;
                }
                d0Var.R = 0;
                ta.a aVar = d0Var.f36400f;
                m.c(aVar);
                ((b5) aVar).f32399e.setVisibility(8);
                return b0.f48488a;
            case 12:
                k kVar = (k) this.f38401b;
                View view = (View) obj;
                m.f(view, "view");
                Object tag = view.getTag();
                m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                Word word = (Word) tag;
                kVar.g(word);
                view.setEnabled(false);
                View viewF = kVar.f(view, word);
                viewF.setVisibility(4);
                viewF.setEnabled(false);
                kVar.f40213j.addView(viewF);
                viewF.postDelayed(new b2.c(i15, viewF, new androidx.lifecycle.compose.a(viewF, view, kVar, 24)), 0L);
                return b0.f48488a;
            case 13:
                return Integer.valueOf(((v) this.f38401b).c(((Integer) obj).intValue()));
            case 14:
                x xVar = (x) this.f38401b;
                float f13 = -((Float) obj).floatValue();
                if ((f13 >= CropImageView.DEFAULT_ASPECT_RATIO || xVar.d()) && (f13 <= CropImageView.DEFAULT_ASPECT_RATIO || xVar.c())) {
                    if (Math.abs(xVar.f40656g) > 0.5f) {
                        i0.a.c("entered drag with non-zero pending scroll");
                    }
                    float f14 = xVar.f40656g + f13;
                    xVar.f40656g = f14;
                    if (Math.abs(f14) > 0.5f) {
                        float f15 = xVar.f40656g;
                        int iQ = hz.b.Q(f15);
                        p pVarD = ((p) xVar.f40654e.getValue()).d(iQ, !xVar.f40651b);
                        if (pVarD == null || (pVar = xVar.f40652c) == null) {
                            pVar2 = pVarD;
                        } else {
                            p pVarD2 = pVar.d(iQ, true);
                            if (pVarD2 != null) {
                                xVar.f40652c = pVarD2;
                                pVar2 = pVarD;
                            }
                        }
                        if (pVar2 != null) {
                            xVar.f(pVar2, xVar.f40651b, true);
                            xVar.f40666r.setValue(b0.f48488a);
                            xVar.h(f15 - xVar.f40656g, pVar2);
                        } else {
                            i0 i0Var2 = xVar.f40659j;
                            if (i0Var2 != null) {
                                i0Var2.l();
                            }
                            xVar.h(f15 - xVar.f40656g, xVar.g());
                        }
                    }
                    if (Math.abs(xVar.f40656g) > 0.5f) {
                        f13 -= xVar.f40656g;
                        xVar.f40656g = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    fO = f13;
                }
                return Float.valueOf(-fO);
            case 15:
                VTSyllableIndexRecyclerAdapter.a((VTSyllableIndexRecyclerAdapter) this.f38401b, (View) obj);
                return b0.f48488a;
            case 16:
                j2.c cVar = (j2.c) this.f38401b;
                k0 drawWithContent = (k0) obj;
                m.f(drawWithContent, "$this$drawWithContent");
                iw.a aVar2 = new iw.a(drawWithContent, c11 == true ? 1 : 0);
                long jD = drawWithContent.f56937a.d();
                cVar.g(drawWithContent, drawWithContent.getLayoutDirection(), (((long) ((int) Float.intBitsToFloat((int) (jD >> 32)))) << 32) | (4294967295L & ((long) ((int) Float.intBitsToFloat((int) (jD & 4294967295L))))), new a0.j(drawWithContent, drawWithContent.f56938b, aVar2, 14));
                vc.a.g(drawWithContent, cVar);
                return b0.f48488a;
            case 17:
                return new j1((n0.x) this.f38401b, i13);
            case 18:
                return new j1((h0) this.f38401b, i14);
            case 19:
                w1.e eVar = (w1.e) this.f38401b;
                return Boolean.valueOf(eVar != null ? eVar.canBeSaved(obj) : true);
            case 20:
                n3.d0 d0Var2 = (n3.d0) obj;
                return ((n3.j) this.f38401b).a(new n3.d0(null, d0Var2.f43145b, d0Var2.f43146c, d0Var2.f43147d, d0Var2.f43148e)).getValue();
            case 21:
                ph.o oVar3 = (ph.o) this.f38401b;
                mh.i lesson = (mh.i) obj;
                m.f(lesson, "lesson");
                e0.B(ViewModelKt.getViewModelScope(oVar3), null, null, new ar.b(lesson.f41135a, oVar3, (vy.d) null, 4), 3);
                return b0.f48488a;
            case 22:
                qn.a aVar3 = (qn.a) this.f38401b;
                String audioName = (String) obj;
                m.f(audioName, "audioName");
                e0.B(ViewModelKt.getViewModelScope(aVar3), null, null, new ns.j(i14, aVar3, oz.x.q0(oz.x.q0(audioName, "[pol-f-zy-", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME), oVar2), 3);
                return b0.f48488a;
            case 23:
                tq.d dVar = (tq.d) this.f38401b;
                pq.a item = (pq.a) obj;
                m.f(item, "item");
                dVar.d(item);
                return b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                y yVar = (y) this.f38401b;
                float fFloatValue = ((Float) obj).floatValue();
                t tVar = yVar.f44464b;
                if (tVar.o() != 0) {
                    fO = fFloatValue / tVar.o();
                }
                tVar.f44449s.m(tVar.j(tVar.k() + hz.b.Q(fO)));
                return b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                o3.g gVar = (o3.g) obj;
                StringBuilder sbN = ep.a.n(((o3.g) this.f38401b) == gVar ? " > " : "   ");
                if (!(gVar instanceof o3.a)) {
                    if (gVar instanceof u) {
                        sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
                        u uVar = (u) gVar;
                        sb2.append(uVar.f44699a.f35700b.length());
                        sb2.append(", newCursorPosition=");
                        i11 = uVar.f44700b;
                    } else if (gVar instanceof o3.t) {
                        strConcat = ((o3.t) gVar).toString();
                    } else if (gVar instanceof o3.e) {
                        strConcat = ((o3.e) gVar).toString();
                    } else if (gVar instanceof o3.f) {
                        strConcat = ((o3.f) gVar).toString();
                    } else if (gVar instanceof o3.v) {
                        strConcat = ((o3.v) gVar).toString();
                    } else if (gVar instanceof o3.h) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (gVar instanceof o3.d) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strG = kotlin.jvm.internal.z.a(gVar.getClass()).g();
                        if (strG == null) {
                            strG = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strG);
                    }
                    sbN.append(strConcat);
                    return sbN.toString();
                }
                sb2 = new StringBuilder("CommitTextCommand(text.length=");
                o3.a aVar4 = (o3.a) gVar;
                sb2.append(aVar4.f44627a.f35700b.length());
                sb2.append(", newCursorPosition=");
                i11 = aVar4.f44628b;
                strConcat = ep.a.j(sb2, i11, ')');
                sbN.append(strConcat);
                return sbN.toString();
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                om.e eVar2 = (om.e) this.f38401b;
                m.f((View) obj, "it");
                e3 e3Var = eVar2.M;
                m.c(e3Var);
                ((HwView) e3Var.f32524c).g();
                e3 e3Var2 = eVar2.M;
                m.c(e3Var2);
                ((HwView) e3Var2.f32524c).f();
                eVar2.h();
                return b0.f48488a;
            case 27:
                om.j jVar = (om.j) this.f38401b;
                ta.a aVar5 = jVar.f45600c;
                m.c(aVar5);
                ((p6) aVar5).f33104e.c();
                ta.a aVar6 = jVar.f45600c;
                m.c(aVar6);
                boolean z11 = ((p6) aVar6).f33104e.f22150c;
                jVar.Q = z11;
                Env env = jVar.f45615f;
                env.wordModel6AudioSwitch = z11;
                env.updateEntry("wordModel6AudioSwitch");
                return b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                oo.y yVar2 = (oo.y) this.f38401b;
                m.f((View) obj, "it");
                l.m mVar = yVar2.f36398d;
                m.c(mVar);
                mVar.finish();
                int i18 = SpeakTryActivity.R;
                l.m mVar2 = yVar2.f36398d;
                m.c(mVar2);
                yVar2.startActivity(ns.o.N(mVar2, yVar2.N, yVar2.O));
                return b0.f48488a;
            default:
                KOSyllableActivity context = (KOSyllableActivity) this.f38401b;
                int iIntValue = ((Integer) obj).intValue();
                int i19 = KOSyllableActivity.f22233t;
                m.f(context, "context");
                Intent intent = new Intent(context, (Class<?>) LoginActivity.class);
                intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                context.startActivity(intent);
                return b0.f48488a;
        }
    }

    public /* synthetic */ j(LessonFinishSummaryAdapter lessonFinishSummaryAdapter, HwCharacter hwCharacter) {
        this.f38400a = 0;
        this.f38401b = hwCharacter;
    }

    public /* synthetic */ j(Object obj, int i11) {
        this.f38400a = i11;
        this.f38401b = obj;
    }
}
