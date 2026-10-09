package k9;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.google.api.Service;
import com.lingo.fluent.ui.compose.PdFeedDifficultyActivity;
import com.lingo.fluent.ui.compose.PdFeedStarredActivity;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.polskill.ui.learn.POLSyllableIntroductionActivity;
import com.lingo.lingoskill.speak.ui.SpeakLeadBoardActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingo.syllable.ko.KOSyllableActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.AchievementRecord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.x9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.a2;
import km.b1;
import km.t0;
import kotlin.jvm.internal.v;
import kr.a1;
import kr.k1;
import kr.l1;
import l1.c3;
import l1.g2;
import l1.j2;
import l1.p2;
import l1.q1;
import l1.x1;
import l1.z1;
import mt.e6;
import mt.m6;
import mt.v1;
import mt.y3;
import n0.c0;
import n0.d0;
import n0.y;
import pr.f0;
import qy.b0;
import rt.f8;
import rt.me;
import rt.mf;
import rt.se;
import rt.x0;
import rt.x8;
import rz.e0;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38002c;

    public /* synthetic */ p(int i11, Object obj, Object obj2) {
        this.f38000a = i11;
        this.f38001b = obj;
        this.f38002c = obj2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        String strE0;
        int i11 = this.f38000a;
        l1.g gVar = l1.m.f39353a;
        final int i12 = 2;
        final int i13 = 0;
        final int i14 = 1;
        b0 b0Var = b0.f48488a;
        Object obj3 = this.f38002c;
        Object obj4 = this.f38001b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                android.support.v4.media.session.a.d((w1.b) obj4, (t1.d) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 1:
                ((Integer) obj2).getClass();
                int i15 = PdFeedDifficultyActivity.H;
                ((PdFeedDifficultyActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 2:
                ((Integer) obj2).getClass();
                int i16 = PdFeedStarredActivity.f21657t;
                ((PdFeedStarredActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 3:
                ((Integer) obj2).getClass();
                ((t0) obj4).q((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 4:
                ((Integer) obj2).getClass();
                b1.y((a2) obj4, (fz.a) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 5:
                l1 l1Var = (l1) obj4;
                e0.B(ViewModelKt.getViewModelScope(l1Var), null, null, new k1(l1Var, (a1) obj3, (List) obj2, (vy.d) null), 3);
                return b0Var;
            case 6:
                t1.j jVar = (t1.j) obj4;
                p2 p2Var = (p2) obj3;
                int iIntValue = ((Integer) obj).intValue();
                if (obj2 instanceof l1.j) {
                    jVar.f51998f.c((l1.j) obj2);
                } else if (!(obj2 instanceof j2)) {
                    if (obj2 instanceof g2) {
                        l1.t.I(p2Var, iIntValue, obj2);
                        jVar.e((g2) obj2);
                    } else if (obj2 instanceof x1) {
                        l1.t.I(p2Var, iIntValue, obj2);
                        ((x1) obj2).d();
                    }
                }
                return b0Var;
            case 7:
                ((Integer) obj2).getClass();
                int i17 = Subscription2Activity.K;
                ((Subscription2Activity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 8:
                ((Integer) obj2).getClass();
                int i18 = SwitchLanguageActivity.M;
                ((SwitchLanguageActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 9:
                ((Integer) obj2).getClass();
                lt.b.a((fz.a) obj4, (mf) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 10:
                m0.c cVar = (m0.c) obj4;
                j0.f fVar = (j0.f) obj3;
                v3.c cVar2 = (v3.c) obj;
                v3.a aVar = (v3.a) obj2;
                if (v3.a.h(aVar.f53483a) == Integer.MAX_VALUE) {
                    i0.a.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = v3.a.h(aVar.f53483a);
                int[] iArrZ0 = ry.m.Z0(cVar.a(cVar2, iH, cVar2.n0(fVar.a())));
                int[] iArr = new int[iArrZ0.length];
                fVar.b(cVar2, iH, iArrZ0, v3.m.Ltr, iArr);
                return new ob.c(21, iArrZ0, iArr);
            case 11:
                x0 x0Var = (x0) obj4;
                l1.b1 b1Var = (l1.b1) obj3;
                l1.n nVar = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    sVar.d0(-194964267);
                    for (x8 x8Var : x0Var.f50600b) {
                        List list = (List) b1Var.getValue();
                        boolean zD = sVar.d(x8Var.ordinal());
                        Object objQ = sVar.Q();
                        if (zD || objQ == gVar) {
                            objQ = new z1(6, x8Var, b1Var);
                            sVar.o0(objQ);
                        }
                        mt.g.F(x8Var, list, (fz.a) objQ, sVar, 0);
                    }
                    sVar.p(false);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return b0Var;
            case 12:
                ((Integer) obj2).getClass();
                v1.c((se) obj4, (z1.r) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 13:
                ((Integer) obj2).getClass();
                v1.b((me) obj4, (fz.c) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 14:
                ((Integer) obj2).getClass();
                y3.A((sy.c) obj4, (z1.r) obj3, (l1.n) obj, l1.t.M(49));
                return b0Var;
            case 15:
                x8 x8Var2 = (x8) obj4;
                f8 f8Var = (f8) obj3;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean z11 = f8Var != null && f8Var.f49752k;
                    int i19 = e6.f41391a[x8Var2.ordinal()];
                    if (i19 == 1) {
                        sVar2.d0(732459255);
                        strE0 = ub.a.e0(sVar2, z11 ? R.string.knowledge_note_characters : R.string.characters);
                        sVar2.p(false);
                    } else if (i19 == 2) {
                        sVar2.d0(732466509);
                        strE0 = ub.a.e0(sVar2, z11 ? R.string.knowledge_note_words : R.string.words);
                        sVar2.p(false);
                    } else if (i19 == 3) {
                        sVar2.d0(732473589);
                        strE0 = ub.a.e0(sVar2, z11 ? R.string.knowledge_note_sentences : R.string.sentences);
                        sVar2.p(false);
                    } else {
                        if (i19 != 4) {
                            throw nv.p.x(sVar2, 732457953, false);
                        }
                        sVar2.d0(1232069095);
                        sVar2.p(false);
                        strE0 = BuildConfig.VERSION_NAME;
                    }
                    ua.b(strE0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 16:
                fz.c cVar3 = (fz.c) obj4;
                l1.a1 a1Var = (l1.a1) obj3;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zF = sVar3.f(cVar3) | sVar3.f(a1Var);
                    Object objQ2 = sVar3.Q();
                    if (zF || objQ2 == gVar) {
                        objQ2 = new m6(cVar3, a1Var, 0);
                        sVar3.o0(objQ2);
                    }
                    k7.m((fz.a) objQ2, null, false, null, null, null, mt.g.O0, sVar3, 805306368, 510);
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 17:
                return ((c0) obj3).a(new d0((y) obj4, (w2.q1) obj), ((v3.a) obj2).f53483a);
            case 18:
                ph.k kVar = (ph.k) obj4;
                List newTags = (List) obj;
                List newStatusTags = (List) obj2;
                kotlin.jvm.internal.m.f(newTags, "newTags");
                kotlin.jvm.internal.m.f(newStatusTags, "newStatusTags");
                ((l1.b1) obj3).setValue(Boolean.FALSE);
                ArrayList arrayList = new ArrayList(ry.n.W(newTags, 10));
                Iterator it = newTags.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mh.d) it.next()).a());
                }
                arrayList.toString();
                i1 i1Var = kVar.f46883f;
                i1Var.getClass();
                i1Var.l(null, newTags);
                i1 i1Var2 = kVar.H;
                i1Var2.getClass();
                i1Var2.l(null, newStatusTags);
                return b0Var;
            case 19:
                ((Integer) obj2).getClass();
                int i21 = POLSyllableIntroductionActivity.f21985t;
                ((POLSyllableIntroductionActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 20:
                ((Integer) obj2).getClass();
                nn.c.j((qn.a) obj4, (fz.a) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 21:
                final o0.b bVar = (o0.b) obj4;
                final rz.b0 b0Var2 = (rz.b0) obj3;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean z12 = bVar.k() == 0;
                    c3 c3Var = h1.v1.f31180a;
                    long j11 = ((s1) sVar4.j(c3Var)).f31036s;
                    boolean zH = sVar4.h(b0Var2) | sVar4.f(bVar);
                    Object objQ3 = sVar4.Q();
                    if (zH || objQ3 == gVar) {
                        objQ3 = new fz.a() { // from class: nv.h
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i13) {
                                    case 0:
                                        e0.B(b0Var2, null, null, new k(bVar, null, 0), 3);
                                        break;
                                    case 1:
                                        e0.B(b0Var2, null, null, new k(bVar, null, 1), 3);
                                        break;
                                    default:
                                        e0.B(b0Var2, null, null, new k(bVar, null, 2), 3);
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar4.o0(objQ3);
                    }
                    x9.b(z12, (fz.a) objQ3, null, false, nv.a.f44096f, 0L, j11, sVar4, 24576, 364);
                    boolean z13 = bVar.k() == 1;
                    long j12 = ((s1) sVar4.j(c3Var)).f31036s;
                    boolean zH2 = sVar4.h(b0Var2) | sVar4.f(bVar);
                    Object objQ4 = sVar4.Q();
                    if (zH2 || objQ4 == gVar) {
                        objQ4 = new fz.a() { // from class: nv.h
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i14) {
                                    case 0:
                                        e0.B(b0Var2, null, null, new k(bVar, null, 0), 3);
                                        break;
                                    case 1:
                                        e0.B(b0Var2, null, null, new k(bVar, null, 1), 3);
                                        break;
                                    default:
                                        e0.B(b0Var2, null, null, new k(bVar, null, 2), 3);
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar4.o0(objQ4);
                    }
                    x9.b(z13, (fz.a) objQ4, null, false, nv.a.f44098g, 0L, j12, sVar4, 24576, 364);
                    boolean z14 = bVar.k() == 2;
                    long j13 = ((s1) sVar4.j(c3Var)).f31036s;
                    boolean zH3 = sVar4.h(b0Var2) | sVar4.f(bVar);
                    Object objQ5 = sVar4.Q();
                    if (zH3 || objQ5 == gVar) {
                        objQ5 = new fz.a() { // from class: nv.h
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        e0.B(b0Var2, null, null, new k(bVar, null, 0), 3);
                                        break;
                                    case 1:
                                        e0.B(b0Var2, null, null, new k(bVar, null, 1), 3);
                                        break;
                                    default:
                                        e0.B(b0Var2, null, null, new k(bVar, null, 2), 3);
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar4.o0(objQ5);
                    }
                    x9.b(z14, (fz.a) objQ5, null, false, nv.a.f44099h, 0L, j13, sVar4, 24576, 364);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 22:
                v vVar = (v) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                vVar.f38358a += ((l0.s) obj3).f39187b.a(fFloatValue - vVar.f38358a);
                return b0Var;
            case 23:
                ((Integer) obj2).getClass();
                int i22 = SpeakLeadBoardActivity.H;
                ((SpeakLeadBoardActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Integer) obj2).getClass();
                int i23 = KOSyllableActivity.f22233t;
                ((KOSyllableActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Integer) obj2).getClass();
                f0.k((o0.t) obj4, (t1.d) obj3, (l1.n) obj, l1.t.M(49));
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((Integer) obj2).getClass();
                f0.e((AchievementLanguage) obj4, (qr.a) obj3, (l1.n) obj, l1.t.M(49));
                return b0Var;
            case 27:
                ((Integer) obj2).getClass();
                f0.m((AchievementRecord) obj4, (qr.a) obj3, (l1.n) obj, l1.t.M(49));
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                f0.h((AchievementLeaderBoard) obj4, (qr.a) obj3, (l1.n) obj, l1.t.M(49));
                return b0Var;
            default:
                ((Integer) obj2).getClass();
                f0.a((AchievementLevel) obj4, (qr.a) obj3, (l1.n) obj, l1.t.M(49));
                return b0Var;
        }
    }

    public /* synthetic */ p(Object obj, int i11, int i12, Object obj2) {
        this.f38000a = i12;
        this.f38001b = obj;
        this.f38002c = obj2;
    }
}
