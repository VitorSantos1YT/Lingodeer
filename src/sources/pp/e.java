package pp;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import b7.e0;
import bp.g4;
import bq.r;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.LanCustomInfo;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.ReviewNewDao;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import hj.x3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import jp.p0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.w;
import n9.q;
import ns.o;
import nv.p;
import p7.f0;
import rt.m9;
import ry.l;
import th.j;
import ve.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements mp.a {
    public int K;
    public final fv.c M;
    public int N;
    public int Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f46976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46977b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f46979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Env f46980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public lp.a f46981f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public hi.a f46982t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46978c = getClass().getSimpleName();
    public int H = -1;
    public HashMap L = new HashMap();
    public final ArrayList O = new ArrayList();
    public List P = new ArrayList();
    public final q R = new q(29, false);
    public boolean S = true;
    public long T = -1;

    public e(p0 p0Var, boolean z11) {
        this.f46976a = p0Var;
        this.f46977b = z11;
        p0Var.N = this;
        this.f46979d = p0Var.C();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        this.f46980e = x.n();
        this.M = new fv.c();
    }

    public static final void a(e eVar, List list) {
        j.a(new ay.x(new g4(list, 12)).k(ky.e.f38937b).g(px.b.a()).h(new lp.b(eVar, 13), vx.b.f54316e), eVar.R);
    }

    @Override // ii.a
    public final void A() {
        hi.a aVar = this.f46982t;
        if (aVar != null) {
            aVar.f();
        }
        B();
        this.R.f();
    }

    public final void B() {
        fv.c cVar = this.M;
        if (cVar != null) {
            Iterator it = this.O.iterator();
            m.e(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                m.e(next, "next(...)");
                cVar.a(((Number) next).intValue());
            }
        }
    }

    @Override // mp.a
    public final boolean b() {
        return this.H >= k().f40178b.size() - 1;
    }

    public final void c() {
        List listK;
        hi.a aVar = this.f46982t;
        if (aVar != null) {
            String strC = aVar.c();
            int i11 = 0;
            if (oz.q.W0(strC, new String[]{";"}, 0, 6).size() != 3 || strC.equals("0;0;6")) {
                return;
            }
            Matcher matcherW = p.w(0, ";", "compile(...)", strC);
            if (matcherW.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iC = 0;
                do {
                    iC = p.c(matcherW, strC, iC, arrayList);
                } while (matcherW.find());
                p.B(iC, strC, arrayList);
                listK = arrayList;
            } else {
                listK = o.K(strC.toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listK) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
            qi.a aVar2 = new qi.a();
            Integer numValueOf = Integer.valueOf(strArr[0]);
            m.e(numValueOf, "valueOf(...)");
            aVar2.f47798a = numValueOf.intValue();
            aVar2.f47799b = Integer.valueOf(strArr[1]).intValue();
            Integer numValueOf2 = Integer.valueOf(strArr[2]);
            m.e(numValueOf2, "valueOf(...)");
            aVar2.f47800c = numValueOf2.intValue();
            if (this.P.contains(strC)) {
                for (Object obj2 : this.P) {
                    m.e(obj2, "next(...)");
                    if (((String) obj2).equals(strC)) {
                        i11++;
                    }
                }
                if (i11 > 3) {
                    return;
                }
            }
            int i12 = this.H + 2;
            hi.a aVarL = k().l(aVar2);
            if (aVarL != null) {
                if (i12 > k().f40178b.size() - 1) {
                    k().f40177a.add(aVar2);
                    k().f40178b.add(aVarL);
                } else {
                    k().f40177a.add(i12, aVar2);
                    k().f40178b.add(i12, aVarL);
                }
                this.P.add(strC);
                this.f46976a.E(k().f40178b.size());
            }
        }
    }

    public abstract boolean d(qi.a aVar);

    @Override // mp.a
    public final void e(Bundle bundle) {
        int i11 = this.H;
        if (i11 >= 0) {
            bundle.putInt(INTENTS.EXTRA_INDEX, i11);
            bundle.putInt(INTENTS.EXTRA_WRONG_COUNT, this.Q);
            List list = this.P;
            m.d(list, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable(INTENTS.EXTRA_MODEL_STR, (Serializable) list);
            bundle.putSerializable(INTENTS.EXTRA_KNOW_POINT, this.L);
            List list2 = k().f40177a;
            m.d(list2, "null cannot be cast to non-null type java.util.ArrayList<out android.os.Parcelable>");
            bundle.putParcelableArrayList(INTENTS.EXTRA_TEST_MODEL, (ArrayList) list2);
        }
    }

    public final void f(List ilgModels) {
        m.f(ilgModels, "ilgModels");
        j.a(new ay.x(new b(this, 0)).k(ky.e.f38937b).g(px.b.a()).h(new ob.e(27, this, ilgModels), vx.b.f54316e), this.R);
    }

    public boolean g() {
        return this.S;
    }

    public abstract ArrayList h();

    @Override // mp.a
    public final int i() {
        return k().f40178b.size();
    }

    @Override // mp.a
    public final void l() {
        List listK;
        hi.a aVar = this.f46982t;
        if (aVar != null) {
            String strC = aVar.c();
            if (oz.q.W0(strC, new String[]{";"}, 0, 6).size() == 3) {
                Matcher matcherW = p.w(0, ";", "compile(...)", strC);
                if (matcherW.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iC = 0;
                    do {
                        iC = p.c(matcherW, strC, iC, arrayList);
                    } while (matcherW.find());
                    p.B(iC, strC, arrayList);
                    listK = arrayList;
                } else {
                    listK = o.K(strC.toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listK) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                if ("1".equals(strArr[0]) && l.D(new String[]{"13", "31"}, strArr[2])) {
                    p0 p0Var = this.f46976a;
                    RelativeLayout relativeLayout = (RelativeLayout) p0Var.B().findViewById(R.id.rl_body);
                    if (relativeLayout != null) {
                        LayoutTransition layoutTransition = new LayoutTransition();
                        layoutTransition.setAnimator(2, null);
                        layoutTransition.setAnimator(3, null);
                        layoutTransition.setDuration(0L);
                        relativeLayout.setLayoutTransition(layoutTransition);
                        this.H--;
                        i.B(p0Var.B());
                        t(relativeLayout);
                    }
                }
            }
        }
    }

    @Override // mp.a
    public final int m() {
        return this.Q;
    }

    @Override // mp.a
    public final int n() {
        return this.H;
    }

    @Override // mp.a
    public final void p(Bundle bundle) {
        yx.d dVarM = new yx.a(new a(this, bundle), 0).M(ky.e.f38937b);
        qx.o oVarA = px.b.a();
        xx.d dVar = new xx.d(d.f46975a, new a(bundle, this));
        try {
            dVarM.K(new yx.b(dVar, oVarA));
            j.a(dVar, this.R);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    @Override // mp.a
    public final void q() {
        hi.a aVar = this.f46982t;
        if (aVar != null) {
            boolean zA = aVar.a();
            p0 p0Var = this.f46976a;
            if (!zA) {
                boolean zD = l.D(new String[]{"classic", "classic_redo"}, p0Var.f36534j0);
                Env env = this.f46980e;
                if (zD) {
                    if (env.isTestRepeatWeakItems) {
                        c();
                    }
                } else if (env.isLessonTestRepeat) {
                    c();
                }
            }
            if (zA) {
                int i11 = this.K + 1;
                this.K = i11;
                if (i11 >= 3) {
                    if (i11 != 0) {
                        ta.a aVar2 = p0Var.f36400f;
                        m.c(aVar2);
                        ((TextView) ((x3) aVar2).f33575h.f32799h).setVisibility(0);
                        ta.a aVar3 = p0Var.f36400f;
                        m.c(aVar3);
                        TextView textView = (TextView) ((x3) aVar3).f33575h.f32799h;
                        String string = p0Var.getString(R.string.combo_s);
                        m.e(string, "getString(...)");
                        textView.setText(String.format(string, Arrays.copyOf(new Object[]{String.valueOf(i11)}, 1)));
                    } else {
                        p0Var.getClass();
                    }
                }
            } else {
                this.Q++;
                this.K = 0;
            }
            if (!this.f46977b) {
                w(zA);
            }
            p0Var.N(zA, aVar);
            p0Var.S(this.H + 1);
        }
    }

    public abstract void r(Bundle bundle);

    @Override // mp.a
    public final HashMap s() {
        return this.L;
    }

    @Override // ii.a
    public final void start() {
    }

    @Override // mp.a
    public final void t(RelativeLayout relativeLayout) {
        hi.a aVarL;
        int i11;
        this.H++;
        hi.a aVar = this.f46982t;
        if (aVar != null) {
            aVar.f();
        }
        this.f46982t = null;
        boolean z11 = this.f46977b;
        p0 p0Var = this.f46976a;
        if (!z11 ? this.H < k().f40178b.size() : !(this.H >= k().f40178b.size() || this.Q >= 4)) {
            this.f46982t = null;
            p0Var.g(true);
            return;
        }
        if (!g() && (i11 = this.H + 1) < k().f40177a.size()) {
            qi.a aVar2 = (qi.a) k().f40177a.get(i11);
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (x.n().keyLanguage != 57 && aVar2.f47798a == 1 && l.D(new Integer[]{13, 31}, Integer.valueOf(aVar2.f47800c))) {
                qi.a aVar3 = new qi.a();
                aVar3.f47798a = -1;
                aVar3.f47799b = 0L;
                aVar3.f47800c = 1;
                int i12 = this.H + 1;
                hi.a aVarL2 = k().l(aVar3);
                if (aVarL2 != null) {
                    if (i12 > k().f40178b.size() - 1) {
                        k().f40177a.add(aVar3);
                        k().f40178b.add(aVarL2);
                    } else {
                        k().f40177a.add(i12, aVar3);
                        k().f40178b.add(i12, aVarL2);
                    }
                    this.P.add("-1;0;1");
                    p0Var.E(k().f40178b.size());
                }
                y();
            }
        }
        qi.a aVar4 = (qi.a) k().f40177a.get(this.H);
        Iterator it = k().f40177a.iterator();
        while (it.hasNext()) {
            ((qi.a) it.next()).toString();
        }
        if (aVar4.f47798a == 1 && l.D(new Integer[]{13, 31}, Integer.valueOf(aVar4.f47800c)) && (aVarL = k().l(aVar4)) != null) {
            k().f40178b.add(this.H, aVarL);
            k().f40178b.remove(this.H + 1);
        }
        p0Var.t().c("jxz_do_model_count", new m9(26));
        qi.a aVar5 = (qi.a) k().f40177a.get(this.H);
        if (d(aVar5)) {
            x(aVar5);
            List list = aVar5.f47802e;
            if (list == null || list.size() <= 0) {
                p0Var.X();
                return;
            }
            if (this.H > 0 && aVar5.f47802e.size() > 1) {
                aVar5.f47802e.remove(Integer.valueOf(((qi.a) k().f40177a.get(this.H - 1)).f47800c));
            }
            List list2 = aVar5.f47802e;
            Object obj = list2.get(j3.M(list2.size()));
            m.e(obj, "get(...)");
            aVar5.f47800c = ((Number) obj).intValue();
            this.f46982t = k().l(aVar5);
        } else {
            this.f46982t = (hi.a) k().f40178b.get(this.H);
        }
        hi.a aVar6 = this.f46982t;
        if (aVar6 != null) {
            aVar6.d(relativeLayout);
        }
    }

    @Override // mp.a
    public final hi.a u() {
        return this.f46982t;
    }

    @Override // mp.a
    public final void v() {
        try {
            hi.a aVar = this.f46982t;
            if (aVar != null) {
                aVar.k();
            }
            hi.a aVar2 = this.f46982t;
            if (aVar2 != null) {
                aVar2.e();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void w(boolean z11) {
        List listK;
        List listK2;
        hi.a aVar = this.f46982t;
        if (aVar != null) {
            String strC = aVar.c();
            w wVar = new w();
            int i11 = -1;
            wVar.f38359a = -1;
            if (oz.q.W0(strC, new String[]{";"}, 0, 6).size() == 3) {
                Matcher matcherW = p.w(0, ";", "compile(...)", strC);
                if (matcherW.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iC = 0;
                    do {
                        iC = p.c(matcherW, strC, iC, arrayList);
                    } while (matcherW.find());
                    p.B(iC, strC, arrayList);
                    listK = arrayList;
                } else {
                    listK = o.K(strC.toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listK) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                Integer numValueOf = Integer.valueOf(((String[]) arrayList2.toArray(new String[0]))[2]);
                m.e(numValueOf, "valueOf(...)");
                int iIntValue = numValueOf.intValue();
                Matcher matcherW2 = p.w(0, ";", "compile(...)", strC);
                if (matcherW2.find()) {
                    ArrayList arrayList3 = new ArrayList(10);
                    int iC2 = 0;
                    do {
                        iC2 = p.c(matcherW2, strC, iC2, arrayList3);
                    } while (matcherW2.find());
                    p.B(iC2, strC, arrayList3);
                    listK2 = arrayList3;
                } else {
                    listK2 = o.K(strC.toString());
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : listK2) {
                    if (((String) obj2).length() > 0) {
                        arrayList4.add(obj2);
                    }
                }
                Integer numValueOf2 = Integer.valueOf(((String[]) arrayList4.toArray(new String[0]))[0]);
                m.e(numValueOf2, "valueOf(...)");
                wVar.f38359a = numValueOf2.intValue();
                i11 = iIntValue;
            }
            int[] iArr = r.f4959a;
            long j11 = this.T;
            if (ij.i.f34434b == null) {
                synchronized (ij.i.class) {
                    if (ij.i.f34434b == null) {
                        ij.i.f34434b = new ij.i();
                    }
                }
            }
            ij.i iVar = ij.i.f34434b;
            m.c(iVar);
            k10.g gVarQueryBuilder = iVar.f34435a.f34448h.queryBuilder();
            org.greenrobot.greendao.d dVar = ReviewNewDao.Properties.CwsId;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            gVarQueryBuilder.f(dVar.e(xt.d.p(x.n().keyLanguage).concat("%")), ReviewNewDao.Properties.Unit.b(Long.valueOf((int) j11)));
            List listD = gVarQueryBuilder.d();
            ArrayList arrayListR = e0.r("list(...)", listD);
            for (Object obj3 : listD) {
                String cwsId = ((ReviewNew) obj3).getCwsId();
                m.e(cwsId, "getCwsId(...)");
                Object obj4 = oz.q.W0(cwsId, new String[]{"_"}, 0, 6).get(0);
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (m.a(obj4, oz.x.q0(xt.d.p(x.n().keyLanguage), "_", BuildConfig.VERSION_NAME))) {
                    arrayListR.add(obj3);
                }
            }
            if (ry.m.c1(arrayListR).isEmpty() && !com.bumptech.glide.e.r().equals("-1")) {
                String value = com.bumptech.glide.e.r() + ";" + j11;
                m.f(value, "value");
                LanCustomInfo lanCustomInfoA = ub.a.Z().a();
                lanCustomInfoA.setFlashCardFocusUnit(value);
                ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoA);
            }
            int i12 = wVar.f38359a;
            if (i12 == 0 && i11 == 6) {
                return;
            }
            if (i12 == 3 && i11 == 14) {
                return;
            }
            if (i12 == 2 && i11 == 2 && aVar.l() == 0) {
                return;
            }
            if (ij.i.f34434b == null) {
                synchronized (ij.i.class) {
                    if (ij.i.f34434b == null) {
                        ij.i.f34434b = new ij.i();
                    }
                }
            }
            m.c(ij.i.f34434b);
            yx.d dVarM = new yx.a(new f0(ij.i.a(aVar.l(), aVar.i(), this.f46980e.keyLanguage), this, wVar, z11, aVar), 0).M(ky.e.f38937b);
            qx.o oVarA = px.b.a();
            xx.d dVar2 = new xx.d(vx.b.f54316e, new hh.c(this, 17));
            try {
                dVarM.K(new yx.b(dVar2, oVarA));
                j.a(dVar2, this.R);
            } catch (NullPointerException e8) {
                throw e8;
            } catch (Throwable th2) {
                throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
            }
        }
    }

    public abstract void x(qi.a aVar);

    public void y() {
        this.S = true;
    }

    @Override // mp.a
    public final void z(boolean z11) {
        List listK;
        List listK2;
        List listK3;
        this.f46976a.S(this.H + 1);
        hi.a aVar = this.f46982t;
        if (aVar != null) {
            String strC = aVar.c();
            if (oz.q.W0(strC, new String[]{";"}, 0, 6).size() == 3) {
                Matcher matcherW = p.w(0, ";", "compile(...)", strC);
                if (matcherW.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iC = 0;
                    do {
                        iC = p.c(matcherW, strC, iC, arrayList);
                    } while (matcherW.find());
                    p.B(iC, strC, arrayList);
                    listK = arrayList;
                } else {
                    listK = o.K(strC.toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listK) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                Integer numValueOf = Integer.valueOf(((String[]) arrayList2.toArray(new String[0]))[2]);
                Matcher matcherW2 = p.w(0, ";", "compile(...)", strC);
                if (matcherW2.find()) {
                    ArrayList arrayList3 = new ArrayList(10);
                    int iC2 = 0;
                    do {
                        iC2 = p.c(matcherW2, strC, iC2, arrayList3);
                    } while (matcherW2.find());
                    p.B(iC2, strC, arrayList3);
                    listK2 = arrayList3;
                } else {
                    listK2 = o.K(strC.toString());
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : listK2) {
                    if (((String) obj2).length() > 0) {
                        arrayList4.add(obj2);
                    }
                }
                Integer numValueOf2 = Integer.valueOf(((String[]) arrayList4.toArray(new String[0]))[0]);
                Matcher matcherW3 = p.w(0, ";", "compile(...)", strC);
                if (matcherW3.find()) {
                    ArrayList arrayList5 = new ArrayList(10);
                    int iC3 = 0;
                    do {
                        iC3 = p.c(matcherW3, strC, iC3, arrayList5);
                    } while (matcherW3.find());
                    p.B(iC3, strC, arrayList5);
                    listK3 = arrayList5;
                } else {
                    listK3 = o.K(strC.toString());
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : listK3) {
                    if (((String) obj3).length() > 0) {
                        arrayList6.add(obj3);
                    }
                }
                Integer numValueOf3 = Integer.valueOf(((String[]) arrayList6.toArray(new String[0]))[1]);
                if (numValueOf2 != null && numValueOf2.intValue() == 0 && numValueOf != null && numValueOf.intValue() == 6) {
                    return;
                }
                if (numValueOf2 != null && numValueOf2.intValue() == 3 && numValueOf != null && numValueOf.intValue() == 14) {
                    return;
                }
                if (numValueOf2 != null && numValueOf2.intValue() == 2 && numValueOf != null && numValueOf.intValue() == 2 && aVar.l() == 0) {
                    return;
                }
                if (numValueOf2 != null && numValueOf2.intValue() == 0 && numValueOf3 != null && numValueOf3.intValue() == 0) {
                    if (numValueOf != null && numValueOf.intValue() == 6) {
                        return;
                    }
                    if (numValueOf != null && numValueOf.intValue() == 13) {
                        return;
                    }
                }
                if (z11) {
                    w(false);
                } else {
                    w(true);
                }
            }
        }
    }

    public final lp.a k() {
        lp.a aVar = this.f46981f;
        if (aVar != null) {
            return aVar;
        }
        m.n(IMCc.VaCIFHrXMKbUYtM);
        throw null;
    }
}
