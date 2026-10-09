package mt;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.google.api.Service;
import com.lingo.lingoskill.idnskill.ui.learn.IDNSyllableIntroductionActivity;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.ui.review.BaseReviewEmptyActivity;
import com.lingo.lingoskill.ui.review.ReviewTestActivity;
import com.lingo.syllable.ko.KOSyllableActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.ReviewStatus;
import com.lingodeer.data.model.uistate.MasteryUiState;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import rt.ac;
import rt.je;
import rt.ke;
import rt.me;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41816b;

    public /* synthetic */ r(Object obj, int i11) {
        this.f41815a = i11;
        this.f41816b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0282  */
    /* JADX WARN: Code duplicated, block: B:118:0x0296 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x029d  */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x029d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        k2.b bVarY;
        Object objH0;
        int i11;
        int i12 = this.f41815a;
        z1.o oVar = z1.o.f58481a;
        l1.g gVar = l1.m.f39353a;
        rz.g1 g1Var = null;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.f41816b;
        switch (i12) {
            case 0:
                rt.e0 e0Var = (rt.e0) obj3;
                String folderId = (String) obj;
                String name = (String) obj2;
                kotlin.jvm.internal.m.f(folderId, "folderId");
                kotlin.jvm.internal.m.f(name, "name");
                rz.e0.B(ViewModelKt.getViewModelScope(e0Var), null, null, new rt.h(1, e0Var, name, folderId, (vy.d) null), 3);
                return b0Var;
            case 1:
                je jeVar = (je) obj3;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ua.b(ub.a.e0(sVar, jeVar.b()), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                } else {
                    sVar.W();
                }
                return b0Var;
            case 2:
                ke keVar = (ke) obj3;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar2, keVar.a()), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 3:
                me meVar = (me) obj3;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar3, meVar.b()), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 4:
                rt.b5 b5Var = (rt.b5) obj3;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int i13 = b5Var.f49514g;
                    List list = b5Var.f49513f;
                    int i14 = i13 + 1;
                    int size = list.size();
                    if (i14 > size) {
                        i14 = size;
                    }
                    ua.b(i14 + "/" + list.size(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 131070);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 5:
                l1.b3 b3Var = (l1.b3) obj3;
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    if (((ph.p) b3Var.getValue()).f46905c) {
                        sVar5.d0(23322048);
                        bVarY = se.k.y(R.drawable.ic_pd_word_tag_fav, sVar5, 0);
                        sVar5.p(false);
                    } else {
                        sVar5.d0(23421341);
                        bVarY = se.k.y(R.drawable.ic_pd_word_tag_un_fav, sVar5, 0);
                        sVar5.p(false);
                    }
                    d0.n.c(bVarY, null, j0.e2.n(oVar, 24), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                } else {
                    sVar5.W();
                }
                return b0Var;
            case 6:
                qn.a aVar = (qn.a) obj3;
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zH = sVar6.h(aVar);
                    Object objQ = sVar6.Q();
                    if (zH || objQ == gVar) {
                        objQ = new kp.j(aVar, 22);
                        sVar6.o0(objQ);
                    }
                    nn.c.i((fz.c) objQ, sVar6, 0);
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 7:
                nu.e eVar = (nu.e) obj3;
                s2.t change = (s2.t) obj;
                kotlin.jvm.internal.m.f(change, "change");
                long j11 = change.f51345c;
                pu.b bVar = eVar.f44062a;
                int iB = bVar.b();
                l1.k1 k1Var = bVar.f47164f;
                if (iB < eVar.f44063b.f46072e.size() && ((Boolean) bVar.f47165g.getValue()).booleanValue()) {
                    float f5 = 2;
                    bVar.f47163e.i(Float.intBitsToFloat((int) (((f2.b) k1Var.getValue()).f26570a >> 32)), Float.intBitsToFloat((int) (((f2.b) k1Var.getValue()).f26570a & 4294967295L)), (Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (((f2.b) k1Var.getValue()).f26570a >> 32))) / f5, (Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (((f2.b) k1Var.getValue()).f26570a & 4294967295L))) / f5);
                    k1Var.setValue(new f2.b(j11));
                }
                return b0Var;
            case 8:
                ht.o courseTestParams = (ht.o) obj;
                long jLongValue = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                ((sv.o) obj3).t(new ac(jLongValue, -1L, false));
                return b0Var;
            case 9:
                oo.k0 k0Var = (oo.k0) obj3;
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(k0Var);
                yz.f fVar = rz.o0.f50940a;
                rz.e0.B(lifecycleScope, wz.m.f55536a, null, new ad.y(25, (Object) k0Var, obj2, (vy.d) (false ? 1 : 0)), 2);
                return b0Var;
            case 10:
                KOSyllableActivity context = (KOSyllableActivity) obj3;
                List<ReviewStatus> reviews = (List) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i15 = KOSyllableActivity.f22233t;
                kotlin.jvm.internal.m.f(reviews, "reviews");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(ry.n.W(reviews, 10));
                for (ReviewStatus reviewStatus : reviews) {
                    ReviewNew reviewNew = new ReviewNew();
                    reviewNew.setCwsId(reviewStatus.getId());
                    reviewNew.setElemType(Integer.valueOf(reviewStatus.getElemType()));
                    reviewNew.getCwsId();
                    reviewNew.getId();
                    arrayList.add(reviewNew);
                }
                kotlin.jvm.internal.m.f(context, "context");
                Intent intent = new Intent(context, (Class<?>) ReviewTestActivity.class);
                intent.putExtra(INTENTS.EXTRA_INT, 4);
                intent.putExtra(INTENTS.EXTRA_INT_2, iIntValue7);
                intent.putParcelableArrayListExtra(INTENTS.EXTRA_ARRAY_LIST, arrayList);
                context.startActivity(intent);
                return b0Var;
            case 11:
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                kotlin.jvm.internal.m.f(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iJ0 = oz.q.J0(DelimitedRangesSequence, (char[]) obj3, iIntValue8, false);
                if (iJ0 < 0) {
                    return null;
                }
                return new qy.l(Integer.valueOf(iJ0), 1);
            case 12:
                qv.h hVar = (qv.h) obj3;
                l1.n nVar7 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ua.b(oz.x.q0(ub.a.e0(sVar7, R.string.group_s), "%s", String.valueOf(((qv.g) hVar).f48436a.getLessonId() + 1)), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 0, 0, 131070);
                } else {
                    sVar7.W();
                }
                return b0Var;
            case 13:
                ((Integer) obj2).getClass();
                s0.o0.k((d1.z0) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 14:
                ((s0.a1) obj3).e(((f2.b) obj2).f26570a);
                return b0Var;
            case 15:
                ((Integer) obj2).getClass();
                ((s0.q1) obj3).a((l1.n) obj, l1.t.M(1));
                return b0Var;
            case 16:
                IDNSyllableIntroductionActivity iDNSyllableIntroductionActivity = (IDNSyllableIntroductionActivity) obj3;
                l1.n nVar8 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i16 = IDNSyllableIntroductionActivity.P;
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zH2 = sVar8.h(iDNSyllableIntroductionActivity);
                    Object objQ2 = sVar8.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new s0.u(iDNSyllableIntroductionActivity, 8);
                        sVar8.o0(objQ2);
                    }
                    iu.k.j((fz.a) objQ2, sVar8, 0);
                } else {
                    sVar8.W();
                }
                return b0Var;
            case 17:
                BaseReviewEmptyActivity baseReviewEmptyActivity = (BaseReviewEmptyActivity) obj3;
                l1.n nVar9 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i17 = BaseReviewEmptyActivity.H;
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ua.b((String) baseReviewEmptyActivity.f22064t.getValue(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 0, 0, 131070);
                } else {
                    sVar9.W();
                }
                return b0Var;
            case 18:
                vs.d dVar = (vs.d) obj3;
                String url = (String) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                kotlin.jvm.internal.m.f(url, "url");
                av.n nVar10 = dVar.f54150b;
                Uri uri = Uri.parse(url);
                kotlin.jvm.internal.m.e(uri, "parse(...)");
                nVar10.j(uri);
                uz.i1 i1Var = dVar.f54152d;
                i1Var.getClass();
                i1Var.l(null, num);
                return b0Var;
            case 19:
                int iIntValue12 = ((Integer) obj).intValue();
                vy.g gVar2 = (vy.g) obj2;
                vy.h key = gVar2.getKey();
                vy.g gVar3 = ((vz.o) obj3).f54355b.get(key);
                if (key == rz.z.f50978b) {
                    rz.g1 g1Var2 = (rz.g1) gVar3;
                    rz.g1 parent = (rz.g1) gVar2;
                    while (parent != null) {
                        if (parent != g1Var2 && (parent instanceof wz.q)) {
                            rz.p pVar = (rz.p) rz.q1.f50946b.get((wz.q) parent);
                            parent = pVar != null ? pVar.getParent() : null;
                        } else {
                            g1Var = parent;
                            if (g1Var == g1Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + g1Var + ", expected child of " + g1Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (g1Var2 != null) {
                                iIntValue12++;
                            }
                        }
                    }
                    if (g1Var == g1Var2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + g1Var + ", expected child of " + g1Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (g1Var2 != null) {
                        iIntValue12++;
                    }
                } else if (gVar2 != gVar3) {
                    iIntValue12 = Integer.MIN_VALUE;
                } else {
                    iIntValue12++;
                }
                return Integer.valueOf(iIntValue12);
            case 20:
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : ((Map) ((wg.s) obj3).invoke((w1.k) obj, obj2)).entrySet()) {
                    arrayList2.add(entry.getKey());
                    arrayList2.add(entry.getValue());
                }
                return arrayList2;
            case 21:
                x1.u uVar = (x1.u) obj3;
                Set set = (Set) obj;
                AtomicReference atomicReference = uVar.f55725b;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        objH0 = set;
                    } else if (obj4 instanceof Set) {
                        objH0 = ns.o.L(obj4, set);
                    } else {
                        if (!(obj4 instanceof List)) {
                            l1.u.b("Unexpected notification");
                            throw new KotlinNothingValueException();
                        }
                        objH0 = ry.m.H0((Collection) obj4, ns.o.K(set));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj4, objH0)) {
                            if (uVar.c()) {
                                uVar.f55724a.invoke(new s0.u(uVar, 29));
                            }
                            return b0Var;
                        }
                    } while (atomicReference.get() == obj4);
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                xq.a.a((xq.k) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 23:
                String oldPassword = (String) obj;
                String newPassword = (String) obj2;
                kotlin.jvm.internal.m.f(oldPassword, "oldPassword");
                kotlin.jvm.internal.m.f(newPassword, "newPassword");
                ((zu.q) obj3).a(new zu.b(oldPassword, newPassword), new ju.d(25), new ju.d(25));
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                zu.m mVar = (zu.m) obj3;
                l1.n nVar11 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar11;
                if (sVar10.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    if (((zu.l) mVar).f59485i) {
                        sVar10.d0(858426501);
                        i11 = R.drawable.ic_pro_active;
                    } else {
                        sVar10.d0(858428065);
                        i11 = R.drawable.ic_pro_grey;
                    }
                    k2.b bVarY2 = se.k.y(i11, sVar10, 0);
                    sVar10.p(false);
                    d0.n.c(bVarY2, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar10, 48, 124);
                } else {
                    sVar10.W();
                }
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Integer) obj2).getClass();
                xu.c0.b((MasteryUiState) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.a1 a1Var = (l1.a1) obj3;
                l1.n nVar12 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar12;
                if (sVar11.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar11, 0);
                    int iHashCode = Long.hashCode(sVar11.T);
                    l1.q1 q1VarL = sVar11.l();
                    z1.r rVarC = z1.a.c(sVar11, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar11.h0();
                    if (sVar11.S) {
                        sVar11.k(iVar);
                    } else {
                        sVar11.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar11);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar11);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar11.S || !kotlin.jvm.internal.m.a(sVar11.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar11, iHashCode, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar11);
                    l1.h1 h1Var = (l1.h1) a1Var;
                    boolean z11 = h1Var.l() == 20;
                    Object objQ3 = sVar11.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new gr.j(a1Var, 9);
                        sVar11.o0(objQ3);
                    }
                    xu.a2.a(390, (fz.a) objQ3, "20 XP", sVar11, z11);
                    boolean z12 = h1Var.l() == 40;
                    Object objQ4 = sVar11.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new gr.j(a1Var, 10);
                        sVar11.o0(objQ4);
                    }
                    xu.a2.a(390, (fz.a) objQ4, "40 XP", sVar11, z12);
                    boolean z13 = h1Var.l() == 60;
                    Object objQ5 = sVar11.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new gr.j(a1Var, 11);
                        sVar11.o0(objQ5);
                    }
                    xu.a2.a(390, (fz.a) objQ5, "60 XP", sVar11, z13);
                    boolean z14 = h1Var.l() == 100;
                    Object objQ6 = sVar11.Q();
                    if (objQ6 == gVar) {
                        objQ6 = new gr.j(a1Var, 12);
                        sVar11.o0(objQ6);
                    }
                    xu.a2.a(390, (fz.a) objQ6, "100 XP", sVar11, z14);
                    sVar11.p(true);
                } else {
                    sVar11.W();
                }
                return b0Var;
            default:
                b0.h2 h2Var = (b0.h2) obj3;
                l1.n nVar13 = (l1.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar13;
                if (sVar12.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    h2Var.S(sVar12, 0);
                } else {
                    sVar12.W();
                }
                return b0Var;
        }
    }

    public /* synthetic */ r(Object obj, int i11, int i12) {
        this.f41815a = i12;
        this.f41816b = obj;
    }
}
