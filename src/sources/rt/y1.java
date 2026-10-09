package rt;

import androidx.lifecycle.ViewModel;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.SRSStatusScheduleKt;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f50670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f50671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f50672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewModel f50673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(ViewModel viewModel, vy.d dVar, int i11) {
        super(4, dVar);
        this.f50669a = i11;
        this.f50673e = viewModel;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f50669a) {
            case 0:
                y1 y1Var = new y1((a2) this.f50673e, (vy.d) obj4, 0);
                y1Var.f50670b = (r1) obj;
                y1Var.f50671c = (Set) obj2;
                y1Var.f50672d = (Set) obj3;
                return y1Var.invokeSuspend(qy.b0.f48488a);
            default:
                y1 y1Var2 = new y1((zu.i1) this.f50673e, (vy.d) obj4, 1);
                y1Var2.f50670b = (zu.q0) obj;
                y1Var2.f50671c = (zu.m1) obj2;
                y1Var2.f50672d = (tt.b) obj3;
                return y1Var2.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        boolean z12;
        int iBetween;
        Object obj2;
        int i11 = this.f50669a;
        ViewModel viewModel = this.f50673e;
        boolean z13 = true;
        switch (i11) {
            case 0:
                a2 a2Var = (a2) viewModel;
                r1 r1Var = (r1) this.f50670b;
                Set set = (Set) this.f50671c;
                Set set2 = (Set) this.f50672d;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                String string = oz.q.i1(r1Var.f50327e).toString();
                List<c1> list = r1Var.f50323a;
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                for (c1 c1Var : list) {
                    SRSStatus sRSStatus = c1Var.f49553a;
                    String id2 = sRSStatus.getId();
                    boolean z14 = z13;
                    ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                    kotlin.jvm.internal.m.e(zoneIdSystemDefault, "systemDefault(...)");
                    LocalDate localDateNow = LocalDate.now(zoneIdSystemDefault);
                    kotlin.jvm.internal.m.e(localDateNow, "now(...)");
                    LocalDate localDateScheduledDate = SRSStatusScheduleKt.scheduledDate(sRSStatus, zoneIdSystemDefault);
                    if (localDateScheduledDate == null || (iBetween = (int) ChronoUnit.DAYS.between(localDateNow, localDateScheduledDate)) < 0) {
                        iBetween = 0;
                    }
                    arrayList.add(new oe(id2, c1Var, iBetween, SRSStatusScheduleKt.isNewCard(sRSStatus)));
                    z13 = z14;
                }
                boolean z15 = z13;
                List listS0 = ry.m.S0(arrayList, new fr.a2(new fr.a2(new fr.a2(new fr.a2(new gu.g(20), 6), 7), 8), 9));
                ke keVarG = a2Var.g(r1Var.f50325c);
                sy.c cVarC = a2Var.c();
                int iW = ry.x.W(ry.n.W(cVarC, 10));
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                ListIterator listIterator = cVarC.listIterator(0);
                while (true) {
                    sy.a aVar2 = (sy.a) listIterator;
                    if (!aVar2.hasNext()) {
                        Set set3 = set;
                        Set set4 = set2;
                        te teVar = (te) linkedHashMap.get(keVarG);
                        if (teVar == null) {
                            ry.r rVar = ry.r.f50854a;
                            z11 = z15;
                            z12 = false;
                            teVar = new te(rVar, rVar, z11, false);
                        } else {
                            z11 = z15;
                            z12 = false;
                        }
                        List list2 = teVar.f50457a;
                        Set setA0 = nz.n.a0(nz.n.W(nz.n.R(ry.m.g0(list2), new q1(a2Var, keVarG, 3)), new ro.e(15)));
                        Set setV0 = ry.m.v0(set3, setA0);
                        List list3 = teVar.f50458b;
                        ArrayList arrayList2 = new ArrayList(ry.n.W(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            b7.e0.x(((ue) it.next()).f50510a, arrayList2);
                        }
                        return new s1(r1Var.f50324b, keVarG, r1Var.f50326d, r1Var.f50327e, r1Var.f50328f, linkedHashMap, list2, list3, setV0, ry.m.v0(set4, ry.m.f1(arrayList2)), setA0.size(), (setA0.isEmpty() || setV0.size() != setA0.size()) ? z12 : z11, teVar.f50459c, teVar.f50460d, list.isEmpty());
                    }
                    Object next = aVar2.next();
                    List listZ = nz.n.Z(nz.n.R(ry.m.g0(listS0), new pr.a0((ke) next, string, r1Var, 14)));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj3 : listZ) {
                        Set set5 = set;
                        Set set6 = set2;
                        Long l9 = new Long(((oe) obj3).f50221b.f49553a.getUnitId());
                        Object arrayList3 = linkedHashMap2.get(l9);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap2.put(l9, arrayList3);
                        }
                        ((List) arrayList3).add(obj3);
                        set = set5;
                        set2 = set6;
                    }
                    Set set7 = set;
                    Set set8 = set2;
                    ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        long jLongValue = ((Number) entry.getKey()).longValue();
                        List list4 = (List) entry.getValue();
                        c1 c1Var2 = ((oe) ry.m.q0(list4)).f50221b;
                        arrayList4.add(new ue(jLongValue, c1Var2.f49554b, c1Var2.f49555c, list4));
                    }
                    linkedHashMap.put(next, new te(listZ, ry.m.S0(arrayList4, new fr.a2(new gu.g(21), 10)), (oz.q.K0(string) || !listZ.isEmpty()) ? z15 : false, !listZ.isEmpty()));
                    set = set7;
                    set2 = set8;
                }
                break;
            default:
                zu.i1 i1Var = (zu.i1) viewModel;
                ArrayList arrayList5 = i1Var.f59444d;
                zu.q0 p0Var = (zu.q0) this.f50670b;
                zu.m1 l1Var = (zu.m1) this.f50671c;
                tt.b bVar = (tt.b) this.f50672d;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (bVar != null) {
                    if (bVar.f52535c) {
                        obj2 = null;
                    } else {
                        bVar.f52535c = true;
                        obj2 = bVar.f52533a;
                    }
                    LeaderBoardUser leaderBoardUser = (LeaderBoardUser) obj2;
                    if (leaderBoardUser != null) {
                        int size = arrayList5.size();
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            if (i13 < size) {
                                Object obj4 = arrayList5.get(i13);
                                i13++;
                                if (!kotlin.jvm.internal.m.a(((LeaderBoardUser) obj4).getUid(), leaderBoardUser.getUid())) {
                                    i12++;
                                }
                            } else {
                                i12 = -1;
                            }
                        }
                        Integer numValueOf = i12 != -1 ? Integer.valueOf(i12) : null;
                        if (numValueOf != null) {
                        }
                        arrayList5.add(leaderBoardUser);
                    }
                }
                if (p0Var instanceof zu.p0) {
                    p0Var = new zu.p0(zu.i1.a(i1Var, ((zu.p0) p0Var).f59522a, arrayList5));
                }
                if (l1Var instanceof zu.l1) {
                    l1Var = new zu.l1(zu.i1.a(i1Var, ((zu.l1) l1Var).f59489a, arrayList5));
                }
                return new zu.f1(p0Var, l1Var);
        }
    }
}
