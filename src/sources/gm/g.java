package gm;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import b7.e0;
import bq.z;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.JPChar;
import com.lingo.lingoskill.object.JPCharPart;
import com.lingo.lingoskill.object.JPCharPartDao;
import com.lingo.lingoskill.object.KOChar;
import com.lingo.lingoskill.object.KOCharDao;
import com.lingo.lingoskill.object.KOCharPart;
import com.lingo.lingoskill.object.KOCharPartDao;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.lingo.lingoskill.object.KOCharZhuyinDao;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import cr.n;
import hj.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jp.p0;
import kotlin.jvm.internal.m;
import qy.b0;
import qy.l;
import qy.q;
import se.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends qp.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f29294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HwCharacter f29295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f29296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f29297l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f29298n;

    public g(mp.b bVar, long j11, boolean z11) {
        super(bVar, j11);
        this.f29294i = z11;
        this.f29296k = new ArrayList();
        this.f29297l = new ArrayList();
        this.m = true;
        this.f29298n = BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final boolean a() {
        return true;
    }

    @Override // hi.a
    public final String b() {
        return this.f29298n;
    }

    @Override // hi.a
    public final String c() {
        String str = "2;" + this.f47882b + ";2";
        m.e(str, "toString(...)");
        return str;
    }

    @Override // qp.d, hi.a
    public final void f() {
        super.f();
        ta.a aVar = this.f47886f;
        m.c(aVar);
        ((t1) aVar).f33322f.a();
    }

    @Override // hi.a
    public final List g() {
        return new ArrayList();
    }

    @Override // qp.d, hi.a
    public final String h() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final int i() {
        return 2;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        try {
            if (!this.f29294i) {
                if (dm.c.f23488f == null) {
                    synchronized (dm.c.class) {
                        if (dm.c.f23488f == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication);
                            dm.c.f23488f = new dm.c(lingoSkillApplication);
                        }
                    }
                }
                dm.c cVar = dm.c.f23488f;
                m.c(cVar);
                Object objLoad = cVar.f().load(Long.valueOf(this.f47882b));
                m.e(objLoad, "load(...)");
                HwCharacter hwCharacter = (HwCharacter) objLoad;
                this.f29295j = hwCharacter;
                l lVarA = bq.i.a(hwCharacter);
                this.f29296k.addAll((Collection) lVarA.f48495a);
                this.f29297l.addAll((Collection) lVarA.f48496b);
                return;
            }
            if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(this.f47884d.keyLanguage))) {
                se.i.x();
                JPChar jPChar = (JPChar) ij.d.i().load(Long.valueOf(this.f47882b));
                HwCharacter hwCharacter2 = new HwCharacter();
                hwCharacter2.setCharId(jPChar.getCharId());
                hwCharacter2.setCharacter(jPChar.getCharacter());
                hwCharacter2.setPinyin(jPChar.getDisplayLuoMa());
                hwCharacter2.setCharPath(jPChar.getCharPath());
                hwCharacter2.setTranENG(BuildConfig.VERSION_NAME);
                this.f29295j = hwCharacter2;
                se.i.x();
                k10.g gVarQueryBuilder = ij.d.j().queryBuilder();
                gVarQueryBuilder.e(" ASC", JPCharPartDao.Properties.PartIndex);
                gVarQueryBuilder.f(JPCharPartDao.Properties.CharId.b(Long.valueOf(jPChar.getCharId())), new k10.h[0]);
                List<JPCharPart> listD = gVarQueryBuilder.d();
                m.e(listD, "list(...)");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (JPCharPart jPCharPart : listD) {
                    String partDirection = jPCharPart.getPartDirection();
                    m.e(partDirection, "getPartDirection(...)");
                    arrayList.add(partDirection);
                    String partPath = jPCharPart.getPartPath();
                    m.e(partPath, "getPartPath(...)");
                    arrayList2.add(partPath);
                }
                this.f29296k.clear();
                this.f29296k.addAll(arrayList);
                this.f29297l.clear();
                this.f29297l.addAll(arrayList2);
                return;
            }
            k10.g gVarQueryBuilder2 = p.V().f55179b.queryBuilder();
            gVarQueryBuilder2.f(KOCharDao.Properties.CharId.b(Long.valueOf(this.f47882b)), new k10.h[0]);
            List listD2 = gVarQueryBuilder2.d();
            m.e(listD2, "list(...)");
            KOChar kOChar = (KOChar) ry.m.q0(listD2);
            k10.g gVarQueryBuilder3 = p.V().f55181d.queryBuilder();
            gVarQueryBuilder3.f(KOCharZhuyinDao.Properties.Character.b(kOChar.getCharacter()), new k10.h[0]);
            List listD3 = gVarQueryBuilder3.d();
            m.e(listD3, "list(...)");
            KOCharZhuyin kOCharZhuyin = (KOCharZhuyin) ry.m.q0(listD3);
            HwCharacter hwCharacter3 = new HwCharacter();
            hwCharacter3.setCharId(kOChar.getCharId());
            hwCharacter3.setCharacter(kOCharZhuyin.getCharacter());
            hwCharacter3.setPinyin(kOCharZhuyin.getZhuyin());
            hwCharacter3.setCharPath(kOChar.getCharPath());
            hwCharacter3.setTranENG(BuildConfig.VERSION_NAME);
            this.f29295j = hwCharacter3;
            k10.g gVarQueryBuilder4 = p.V().f55180c.queryBuilder();
            gVarQueryBuilder4.e(" ASC", KOCharPartDao.Properties.PartIndex);
            gVarQueryBuilder4.f(KOCharPartDao.Properties.CharId.b(Long.valueOf(kOChar.getCharId())), new k10.h[0]);
            List<KOCharPart> listD4 = gVarQueryBuilder4.d();
            m.e(listD4, "list(...)");
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (KOCharPart kOCharPart : listD4) {
                String partDirection2 = kOCharPart.getPartDirection();
                m.e(partDirection2, "getPartDirection(...)");
                arrayList3.add(partDirection2);
                String partPath2 = kOCharPart.getPartPath();
                m.e(partPath2, "getPartPath(...)");
                arrayList4.add(partPath2);
            }
            this.f29296k.clear();
            this.f29296k.addAll(arrayList3);
            this.f29297l.clear();
            this.f29297l.addAll(arrayList4);
        } catch (Exception unused) {
            throw new NoSuchElemException();
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return c.f29284a;
    }

    @Override // qp.d
    public final void p() {
        String translation;
        mp.b bVar = this.f47881a;
        p0 p0Var = (p0) bVar;
        p0Var.O(1);
        ta.a aVar = this.f47886f;
        m.c(aVar);
        ((t1) aVar).f33322f.setTimeGap(100);
        ta.a aVar2 = this.f47886f;
        m.c(aVar2);
        TextView textView = ((t1) aVar2).f33320d;
        HwCharacter hwCharacter = this.f29295j;
        vy.d dVar = null;
        if (hwCharacter == null) {
            m.n("mCurChar");
            throw null;
        }
        textView.setText(hwCharacter.getPinyin());
        try {
            HwCharacter hwCharacter2 = this.f29295j;
            if (hwCharacter2 == null) {
                m.n("mCurChar");
                throw null;
            }
            translation = hwCharacter2.getTranslation();
            m.c(translation);
            ta.a aVar3 = this.f47886f;
            m.c(aVar3);
            ((t1) aVar3).f33319c.setText(translation);
            ta.a aVar4 = this.f47886f;
            m.c(aVar4);
            z.a(((t1) aVar4).f33322f, 500L, new n(this, 28));
            if (!this.f29294i) {
                ta.a aVar5 = this.f47886f;
                m.c(aVar5);
                ((t1) aVar5).f33318b.setVisibility(0);
            }
            String strK = xt.d.k(this.f47884d.keyLanguage);
            HwCharacter hwCharacter3 = this.f29295j;
            if (hwCharacter3 == null) {
                m.n("mCurChar");
                throw null;
            }
            String strK2 = e0.k(hwCharacter3.getCharId(), strK, "_kanji_");
            ta.a aVar6 = this.f47886f;
            m.c(aVar6);
            z.b(((t1) aVar6).f33318b, new com.google.accompanist.permissions.a(18, this, strK2));
            p0 p0Var2 = (p0) bVar;
            p0Var2.getClass();
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(p0Var2), null, null, new e(this, strK2, dVar, 1), 3);
            p0Var.getClass();
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(p0Var), yz.e.f58387a, null, new b0.f(this, dVar, 24), 2);
            ta.a aVar7 = this.f47886f;
            m.c(aVar7);
            final int i11 = 0;
            z.b(((t1) aVar7).f33321e, new fz.c(this) { // from class: gm.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f29281b;

                {
                    this.f29281b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i11) {
                        case 0:
                            m.f(it, "it");
                            g gVar = this.f29281b;
                            gVar.s();
                            if (gVar.f47884d.handWriteLanguage != -1) {
                                ((ji.e) gVar.f47881a).t().c("jxz_cr_learn_btm_button_click", new fk.a(16));
                            }
                            break;
                        case 1:
                            m.f(it, "it");
                            g gVar2 = this.f29281b;
                            gVar2.t();
                            if (gVar2.f47884d.handWriteLanguage != -1) {
                                ((ji.e) gVar2.f47881a).t().c("jxz_cr_learn_btm_button_click", new fk.a(17));
                            }
                            break;
                        default:
                            m.f(it, "it");
                            g gVar3 = this.f29281b;
                            gVar3.u();
                            if (gVar3.f47884d.handWriteLanguage != -1) {
                                ((ji.e) gVar3.f47881a).t().c("jxz_cr_learn_btm_button_click", new fk.a(18));
                            }
                            break;
                    }
                    return b0.f48488a;
                }
            });
            ta.a aVar8 = this.f47886f;
            m.c(aVar8);
            final int i12 = 1;
            z.b(((t1) aVar8).f33323g, new fz.c(this) { // from class: gm.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f29281b;

                {
                    this.f29281b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i12) {
                        case 0:
                            m.f(it, "it");
                            g gVar = this.f29281b;
                            gVar.s();
                            if (gVar.f47884d.handWriteLanguage != -1) {
                                ((ji.e) gVar.f47881a).t().c("jxz_cr_learn_btm_button_click", new fk.a(16));
                            }
                            break;
                        case 1:
                            m.f(it, "it");
                            g gVar2 = this.f29281b;
                            gVar2.t();
                            if (gVar2.f47884d.handWriteLanguage != -1) {
                                ((ji.e) gVar2.f47881a).t().c("jxz_cr_learn_btm_button_click", new fk.a(17));
                            }
                            break;
                        default:
                            m.f(it, "it");
                            g gVar3 = this.f29281b;
                            gVar3.u();
                            if (gVar3.f47884d.handWriteLanguage != -1) {
                                ((ji.e) gVar3.f47881a).t().c("jxz_cr_learn_btm_button_click", new fk.a(18));
                            }
                            break;
                    }
                    return b0.f48488a;
                }
            });
            ta.a aVar9 = this.f47886f;
            m.c(aVar9);
            final int i13 = 2;
            z.b(((t1) aVar9).f33324h, new fz.c(this) { // from class: gm.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f29281b;

                {
                    this.f29281b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i13) {
                        case 0:
                            m.f(it, "it");
                            g gVar = this.f29281b;
                            gVar.s();
                            if (gVar.f47884d.handWriteLanguage != -1) {
                                ((ji.e) gVar.f47881a).t().c("jxz_cr_learn_btm_button_click", new fk.a(16));
                            }
                            break;
                        case 1:
                            m.f(it, "it");
                            g gVar2 = this.f29281b;
                            gVar2.t();
                            if (gVar2.f47884d.handWriteLanguage != -1) {
                                ((ji.e) gVar2.f47881a).t().c("jxz_cr_learn_btm_button_click", new fk.a(17));
                            }
                            break;
                        default:
                            m.f(it, "it");
                            g gVar3 = this.f29281b;
                            gVar3.u();
                            if (gVar3.f47884d.handWriteLanguage != -1) {
                                ((ji.e) gVar3.f47881a).t().c("jxz_cr_learn_btm_button_click", new fk.a(18));
                            }
                            break;
                    }
                    return b0.f48488a;
                }
            });
        } catch (Exception unused) {
            translation = BuildConfig.VERSION_NAME;
        }
    }

    public final void r() {
        if (this.f47884d.isAudioModel) {
            q qVar = fv.b.f28186a;
            HwCharacter hwCharacter = this.f29295j;
            if (hwCharacter == null) {
                m.n("mCurChar");
                throw null;
            }
            String pinyin = hwCharacter.getPinyin();
            m.e(pinyin, "getPinyin(...)");
            ((p0) this.f47881a).I(fv.b.c(pinyin, null, null));
        }
    }

    public final void s() {
        r();
        ta.a aVar = this.f47886f;
        m.c(aVar);
        ((t1) aVar).f33322f.f();
        ta.a aVar2 = this.f47886f;
        m.c(aVar2);
        ((t1) aVar2).f33321e.setBackgroundResource(R.drawable.strokes_order_replay_onclick);
        ta.a aVar3 = this.f47886f;
        m.c(aVar3);
        ((t1) aVar3).f33321e.setClickable(false);
        ta.a aVar4 = this.f47886f;
        m.c(aVar4);
        ((t1) aVar4).f33323g.setBackgroundResource(R.drawable.strokes_order_write_noclick);
        ta.a aVar5 = this.f47886f;
        m.c(aVar5);
        ((t1) aVar5).f33324h.setBackgroundResource(R.drawable.strokes_order_write_style2_noclick);
        ta.a aVar6 = this.f47886f;
        m.c(aVar6);
        ((t1) aVar6).f33322f.setBgHanziVisibility(true);
        ta.a aVar7 = this.f47886f;
        m.c(aVar7);
        ((t1) aVar7).f33322f.setShowBijiWhenWriting(false);
    }

    public final void t() {
        r();
        ta.a aVar = this.f47886f;
        m.c(aVar);
        ((t1) aVar).f33322f.c();
        ta.a aVar2 = this.f47886f;
        m.c(aVar2);
        ((t1) aVar2).f33323g.setBackgroundResource(R.drawable.strokes_order_write_onclick);
        ta.a aVar3 = this.f47886f;
        m.c(aVar3);
        ((t1) aVar3).f33324h.setBackgroundResource(R.drawable.strokes_order_write_style2_noclick);
        ta.a aVar4 = this.f47886f;
        m.c(aVar4);
        ((t1) aVar4).f33321e.setBackgroundResource(R.drawable.strokes_order_replay_noclick);
        ta.a aVar5 = this.f47886f;
        m.c(aVar5);
        ((t1) aVar5).f33322f.setBgHanziVisibility(true);
        ta.a aVar6 = this.f47886f;
        m.c(aVar6);
        ((t1) aVar6).f33322f.setShowBijiWhenWriting(false);
        this.m = true;
        ta.a aVar7 = this.f47886f;
        m.c(aVar7);
        ((t1) aVar7).f33321e.setClickable(true);
    }

    public final void u() {
        r();
        ta.a aVar = this.f47886f;
        m.c(aVar);
        ((t1) aVar).f33322f.d();
        ta.a aVar2 = this.f47886f;
        m.c(aVar2);
        ((t1) aVar2).f33324h.setBackgroundResource(R.drawable.strokes_order_write_style2_onclick);
        ta.a aVar3 = this.f47886f;
        m.c(aVar3);
        ((t1) aVar3).f33323g.setBackgroundResource(R.drawable.strokes_order_write_noclick);
        ta.a aVar4 = this.f47886f;
        m.c(aVar4);
        ((t1) aVar4).f33321e.setBackgroundResource(R.drawable.strokes_order_replay_noclick);
        ta.a aVar5 = this.f47886f;
        m.c(aVar5);
        ((t1) aVar5).f33322f.setBgHanziVisibility(false);
        ta.a aVar6 = this.f47886f;
        m.c(aVar6);
        ((t1) aVar6).f33322f.setShowBijiWhenWriting2(false);
        this.m = false;
        ta.a aVar7 = this.f47886f;
        m.c(aVar7);
        ((t1) aVar7).f33321e.setClickable(true);
    }

    @Override // hi.a
    public final void k() {
    }
}
