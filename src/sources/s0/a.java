package s0;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import b0.h2;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinLearnActivity;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonIndexRecyclerAdapter;
import com.lingo.lingoskill.ptskill.ui.syllable.PTNewSyllableIntroductionActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.review.FlashCardFinishActivity;
import com.lingo.lingoskill.vtskill.ui.syllable.ui.VTSyllableActivity;
import com.lingo.lingoskill.vtskill.ui.syllable.ui.VTSyllableStudyActivity;
import com.lingo.lingoskill.vtskill.ui.syllable.ui.VTSyllableTestActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.INTENTS;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.core.error.DefinitionOverrideException;
import y2.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50988b;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f50987a = i11;
        this.f50988b = obj;
    }

    public /* synthetic */ a(Object obj, int i11) {
        this.f50987a = i11;
        this.f50988b = obj;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws DefinitionOverrideException {
        vy.d dVar = null;
        int i11 = 2;
        int i12 = 0;
        switch (this.f50987a) {
            case 0:
                ((g3.b0) obj).b(d1.g0.f22913c, new d1.f0(g0.Cursor, ((d1.l) this.f50988b).a(), d1.e0.Middle, true));
                return qy.b0.f48488a;
            case 1:
                m1 m1Var = (m1) this.f50988b;
                float fFloatValue = ((Float) obj).floatValue();
                l1.g1 g1Var = m1Var.f51099a;
                float fL = g1Var.l() + fFloatValue;
                l1.g1 g1Var2 = m1Var.f51100b;
                if (fL > g1Var2.l()) {
                    fFloatValue = g1Var2.l() - g1Var.l();
                } else if (fL < CropImageView.DEFAULT_ASPECT_RATIO) {
                    fFloatValue = -g1Var.l();
                }
                g1Var.m(g1Var.l() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 2:
                sm.c cVar = (sm.c) this.f50988b;
                int iIntValue = ((Integer) obj).intValue();
                int i13 = LoginActivity.Q;
                Context contextRequireContext = cVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                cVar.startActivity(bp.g1.p(contextRequireContext, iIntValue));
                return qy.b0.f48488a;
            case 3:
                sq.d dVar2 = (sq.d) this.f50988b;
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                l.m mVar = dVar2.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                mVar.finish();
                int i14 = VTSyllableTestActivity.P;
                l.m mVar2 = dVar2.f36398d;
                pq.b bVar = dVar2.Q;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("mLesson");
                    throw null;
                }
                Intent intent = new Intent(mVar2, (Class<?>) VTSyllableTestActivity.class);
                intent.putExtra(INTENTS.EXTRA_OBJECT, bVar);
                dVar2.startActivity(intent);
                return qy.b0.f48488a;
            case 4:
                sq.g gVar = (sq.g) this.f50988b;
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                gVar.startActivity(new Intent(gVar.f36398d, (Class<?>) VTSyllableActivity.class));
                b7.e0.A(gVar.t(), "jxz_alphabet_click_chart");
                return qy.b0.f48488a;
            case 5:
                sq.l lVar = (sq.l) this.f50988b;
                View it3 = (View) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                int i15 = VTSyllableStudyActivity.R;
                l.m mVar3 = lVar.f36398d;
                kotlin.jvm.internal.m.c(mVar3);
                Context contextRequireContext2 = lVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                pq.b bVar2 = new pq.b(1, String.format(ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1)), "Initials “b/p/c/d/r/gi”＋Finals starting with “a/ă/ â”", "a,ai,ao,ay,ây,an,ăn,ân,am,ăm,âm", "b,p,c,d,r,gi", "ba, ca, dai, pai, cao, dao, bay, ran, giam, căn, pân, dăn, pâm, rây, giây");
                Intent intent2 = new Intent(mVar3, (Class<?>) VTSyllableStudyActivity.class);
                intent2.putExtra(INTENTS.EXTRA_OBJECT, bVar2);
                lVar.startActivity(intent2);
                return qy.b0.f48488a;
            case 6:
                sq.t tVar = (sq.t) this.f50988b;
                View it4 = (View) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                l.m mVar4 = tVar.f36398d;
                kotlin.jvm.internal.m.c(mVar4);
                mVar4.finish();
                int i16 = VTSyllableTestActivity.P;
                l.m mVar5 = tVar.f36398d;
                pq.b bVar3 = tVar.O;
                if (bVar3 == null) {
                    kotlin.jvm.internal.m.n("mLesson");
                    throw null;
                }
                Intent intent3 = new Intent(mVar5, (Class<?>) VTSyllableTestActivity.class);
                intent3.putExtra(INTENTS.EXTRA_OBJECT, bVar3);
                tVar.startActivity(intent3);
                return qy.b0.f48488a;
            case 7:
                th.a aVar = (th.a) this.f50988b;
                View view = (View) obj;
                kotlin.jvm.internal.m.f(view, "view");
                aVar.getClass();
                return qy.b0.f48488a;
            case 8:
                FlashCardFinishActivity flashCardFinishActivity = (FlashCardFinishActivity) this.f50988b;
                int iIntValue2 = ((Integer) obj).intValue();
                int i17 = FlashCardFinishActivity.K;
                Intent intent4 = new Intent(flashCardFinishActivity, (Class<?>) LoginActivity.class);
                intent4.putExtra(INTENTS.EXTRA_INT, iIntValue2);
                flashCardFinishActivity.startActivity(intent4);
                return qy.b0.f48488a;
            case 9:
                tp.x xVar = (tp.x) this.f50988b;
                View it5 = (View) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                hh.i iVar = xVar.U;
                if (iVar != null) {
                    iVar.a();
                }
                return qy.b0.f48488a;
            case 10:
                tp.b0 b0Var = (tp.b0) this.f50988b;
                int iIntValue3 = ((Integer) obj).intValue();
                int i18 = LoginActivity.Q;
                Context contextRequireContext3 = b0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                b0Var.startActivity(bp.g1.p(contextRequireContext3, iIntValue3));
                return qy.b0.f48488a;
            case 11:
                ui.q qVar = (ui.q) this.f50988b;
                View it6 = (View) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                l.m mVar6 = qVar.f36398d;
                kotlin.jvm.internal.m.c(mVar6);
                mVar6.finish();
                int i19 = PinyinLearnActivity.R;
                l.m mVar7 = qVar.f36398d;
                kotlin.jvm.internal.m.c(mVar7);
                xi.c cVar2 = qVar.O;
                kotlin.jvm.internal.m.c(cVar2);
                qVar.startActivity(cf.x.A(mVar7, cVar2, 0));
                return qy.b0.f48488a;
            case 12:
                ui.b0 b0Var2 = (ui.b0) this.f50988b;
                View it7 = (View) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                l.m mVar8 = b0Var2.f36398d;
                kotlin.jvm.internal.m.c(mVar8);
                mVar8.finish();
                int i21 = PinyinLearnActivity.R;
                l.m mVar9 = b0Var2.f36398d;
                kotlin.jvm.internal.m.c(mVar9);
                xi.c cVar3 = b0Var2.O;
                kotlin.jvm.internal.m.c(cVar3);
                b0Var2.startActivity(cf.x.A(mVar9, cVar3, 0));
                return qy.b0.f48488a;
            case 13:
                ui.h0 h0Var = (ui.h0) this.f50988b;
                View it8 = (View) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                l.m mVar10 = h0Var.f36398d;
                kotlin.jvm.internal.m.c(mVar10);
                mVar10.finish();
                return qy.b0.f48488a;
            case 14:
                kotlin.jvm.internal.x xVar2 = (kotlin.jvm.internal.x) this.f50988b;
                w2.x it9 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                xVar2.f38360a = it9.P(0L);
                return qy.b0.f48488a;
            case 15:
                LingoSkillApplication lingoSkillApplication = (LingoSkillApplication) this.f50988b;
                r10.a startKoin = (r10.a) obj;
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.f(startKoin, "$this$startKoin");
                w10.a level = w10.a.INFO;
                kotlin.jvm.internal.m.f(level, "level");
                a9.i iVar2 = startKoin.f48741a;
                p10.b bVar4 = new p10.b(level, i12);
                iVar2.getClass();
                iVar2.f517a = bVar4;
                if (level.compareTo(level) <= 0) {
                    h2 h2Var = (h2) iVar2.f517a;
                    h2Var.getClass();
                    h2Var.h0(level, "[init] declare Android Context");
                }
                fu.h hVar = new fu.h(lingoSkillApplication, i11);
                x10.a aVar2 = new x10.a();
                hVar.invoke(aVar2);
                iVar2.u(ns.o.K(aVar2), true);
                List listK0 = ry.l.k0(new x10.a[]{ah.i.f716a, bu.a.f6277a, wr.b.f55196a, ah.i.f719d, ah.i.f717b, st.b.f51780a, ah.i.f720e, ev.a.f25936a, ah.i.f722g, ah.i.f721f, ov.a.f46090a, jv.a.f37380a, yu.b.f58359a, os.c.f45733a, vu.a.f54303a, as.a.f2853a, ah.i.f718c});
                boolean z11 = startKoin.f48742b;
                if (((w10.a) ((h2) iVar2.f517a).f3561b).compareTo(level) <= 0) {
                    long jA = pz.j.a();
                    iVar2.u(listK0, z11);
                    long jA2 = pz.k.a(jA);
                    int size = ((ConcurrentHashMap) ((ob.m) iVar2.f520d).f44827c).size();
                    h2 h2Var2 = (h2) iVar2.f517a;
                    StringBuilder sbI = w4.c.i(size, "Started ", " definitions in ");
                    int i22 = pz.a.f47220d;
                    sbI.append(pz.a.j(jA2, pz.c.MICROSECONDS) / 1000.0d);
                    sbI.append(" ms");
                    h2Var2.W(level, sbI.toString());
                } else {
                    iVar2.u(listK0, z11);
                }
                return qy.b0.f48488a;
            case 16:
                PinyinLessonIndexRecyclerAdapter.a((PinyinLessonIndexRecyclerAdapter) this.f50988b, (View) obj);
                return qy.b0.f48488a;
            case 17:
                zr.i iVar3 = (zr.i) this.f50988b;
                CourseCharacter it10 = (CourseCharacter) obj;
                kotlin.jvm.internal.m.f(it10, "it");
                iVar3.a(new zr.d(it10));
                return qy.b0.f48488a;
            case 18:
                wg.m mVar11 = (wg.m) this.f50988b;
                List list = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list.size() % 2 != 0) {
                    throw new IllegalStateException("non-zero remainder");
                }
                while (i12 < list.size()) {
                    Object obj2 = list.get(i12);
                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj2, list.get(i12 + 1));
                    i12 += 2;
                }
                return mVar11.invoke(linkedHashMap);
            case 19:
                w1.e eVar = ((w1.c) this.f50988b).f54460c;
                return Boolean.valueOf(eVar != null ? eVar.canBeSaved(obj) : true);
            case 20:
                ob.r rVar = (ob.r) this.f50988b;
                ja.a it11 = (ja.a) obj;
                kotlin.jvm.internal.m.f(it11, "it");
                return rVar.call();
            case 21:
                w9.p pVar = (w9.p) this.f50988b;
                ka.a db2 = (ka.a) obj;
                kotlin.jvm.internal.m.f(db2, "db");
                pVar.f54831g = db2;
                return qy.b0.f48488a;
            case 22:
                w9.s sVar = (w9.s) this.f50988b;
                w9.b bVar5 = (w9.b) obj;
                kotlin.jvm.internal.m.f(bVar5, scqhIrGXy.kpXLuUg);
                return sVar.i(bVar5);
            case 23:
                k2.b bVar6 = (k2.b) this.f50988b;
                wb.g gVar2 = (wb.g) obj;
                if (gVar2 instanceof wb.e) {
                    return bVar6 != null ? new wb.e(bVar6) : (wb.e) gVar2;
                }
                return gVar2 instanceof wb.d ? (wb.d) gVar2 : gVar2;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Drawable drawable = (Drawable) this.f50988b;
                i2.d dVar3 = (i2.d) obj;
                g2.v vVarX = dVar3.j0().x();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (dVar3.d() >> 32)), (int) Float.intBitsToFloat((int) (dVar3.d() & 4294967295L)));
                drawable.draw(g2.d.a(vVarX));
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                x1.u uVar = (x1.u) this.f50988b;
                synchronized (uVar.f55730g) {
                    x1.t tVar2 = uVar.f55732i;
                    kotlin.jvm.internal.m.c(tVar2);
                    Object obj3 = tVar2.f55713b;
                    kotlin.jvm.internal.m.c(obj3);
                    int i23 = tVar2.f55715d;
                    y.d0 d0Var = tVar2.f55714c;
                    if (d0Var == null) {
                        d0Var = new y.d0();
                        tVar2.f55714c = d0Var;
                        tVar2.f55717f.m(obj3, d0Var);
                    }
                    tVar2.b(obj, i23, obj3, d0Var);
                }
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                yn.a aVar3 = (yn.a) this.f50988b;
                String it12 = (String) obj;
                int i24 = PTNewSyllableIntroductionActivity.f21986t;
                kotlin.jvm.internal.m.f(it12, "it");
                String audioName = new sj.a(2).a(it12);
                kotlin.jvm.internal.m.f(audioName, "audioName");
                rz.e0.B(ViewModelKt.getViewModelScope(aVar3), null, null, new y0.j(3, audioName, aVar3, dVar), 3);
                return qy.b0.f48488a;
            case 27:
                y0.c cVar4 = (y0.c) this.f50988b;
                cVar4.S.invoke((u0.a) obj, y2.f.i(cVar4, AndroidCompositionLocals_androidKt.f1200b));
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((fz.c) obj).invoke((u0.a) this.f50988b);
                return qy.b0.f48488a;
            default:
                a aVar4 = (a) this.f50988b;
                g2 g2Var = (g2) obj;
                if (!(g2Var instanceof y0.a)) {
                    throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                }
                aVar4.invoke(((y0.a) g2Var).Q);
                return Boolean.TRUE;
        }
    }
}
