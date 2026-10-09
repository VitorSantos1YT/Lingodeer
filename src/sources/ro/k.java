package ro;

import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import java.util.ArrayList;
import java.util.List;
import l1.m;
import l1.n;
import l1.s;
import m0.l;
import oz.q;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f49326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ THAISyllableIntroductionActivity f49327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uo.a f49328d;

    public /* synthetic */ k(List list, THAISyllableIntroductionActivity tHAISyllableIntroductionActivity, uo.a aVar, int i11) {
        this.f49325a = i11;
        this.f49326b = list;
        this.f49327c = tHAISyllableIntroductionActivity;
        this.f49328d = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11 = this.f49325a;
        b0 b0Var = b0.f48488a;
        l1.g gVar = m.f39353a;
        List list = this.f49326b;
        uo.a aVar = this.f49328d;
        switch (i11) {
            case 0:
                l lVar = (l) obj;
                int iIntValue = ((Number) obj2).intValue();
                n nVar = (n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i12 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((s) nVar).f(lVar) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i12 |= ((s) nVar).d(iIntValue) ? 32 : 16;
                }
                s sVar = (s) nVar;
                if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
                    String str = (String) list.get(iIntValue);
                    sVar.d0(-153595958);
                    List listW0 = q.W0(str, new String[]{"\n"}, 0, 6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : listW0) {
                        if (((String) obj5).length() > 0) {
                            arrayList.add(obj5);
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    String str3 = (String) arrayList.get(1);
                    String str4 = (String) arrayList.get(2);
                    boolean zH = sVar.h(aVar) | sVar.f(str4);
                    Object objQ = sVar.Q();
                    if (zH || objQ == gVar) {
                        objQ = new j(aVar, str4, 1);
                        sVar.o0(objQ);
                    }
                    int i13 = THAISyllableIntroductionActivity.M;
                    this.f49327c.r(str2, str3, (fz.a) objQ, sVar, 0);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l lVar2 = (l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                n nVar2 = (n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i14 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((s) nVar2).f(lVar2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i14 |= ((s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                s sVar2 = (s) nVar2;
                if (sVar2.T(i14 & 1, (i14 & 147) != 146)) {
                    String str5 = (String) list.get(iIntValue3);
                    sVar2.d0(-1959099253);
                    List listW1 = q.W0(str5, new String[]{"\n"}, 0, 6);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : listW1) {
                        if (((String) obj6).length() > 0) {
                            arrayList2.add(obj6);
                        }
                    }
                    String str6 = (String) arrayList2.get(0);
                    String str7 = (String) arrayList2.get(1);
                    String str8 = (String) arrayList2.get(2);
                    boolean zH2 = sVar2.h(aVar) | sVar2.f(str8);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new j(aVar, str8, 2);
                        sVar2.o0(objQ2);
                    }
                    int i15 = THAISyllableIntroductionActivity.M;
                    this.f49327c.r(str6, str7, (fz.a) objQ2, sVar2, 0);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
            default:
                l lVar3 = (l) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                n nVar3 = (n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i16 = (iIntValue6 & 6) == 0 ? iIntValue6 | (((s) nVar3).f(lVar3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i16 |= ((s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                s sVar3 = (s) nVar3;
                if (sVar3.T(i16 & 1, (i16 & 147) != 146)) {
                    String str9 = (String) list.get(iIntValue5);
                    sVar3.d0(1060260179);
                    List listW2 = q.W0(str9, new String[]{"\n"}, 0, 6);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj7 : listW2) {
                        if (((String) obj7).length() > 0) {
                            arrayList3.add(obj7);
                        }
                    }
                    String str10 = (String) arrayList3.get(0);
                    String str11 = (String) arrayList3.get(1);
                    String str12 = (String) arrayList3.get(2);
                    boolean zH3 = sVar3.h(aVar) | sVar3.f(str12);
                    Object objQ3 = sVar3.Q();
                    if (zH3 || objQ3 == gVar) {
                        objQ3 = new j(aVar, str12, 0);
                        sVar3.o0(objQ3);
                    }
                    int i17 = THAISyllableIntroductionActivity.M;
                    this.f49327c.r(str10, str11, (fz.a) objQ3, sVar3, 0);
                    sVar3.p(false);
                } else {
                    sVar3.W();
                }
                break;
        }
        return b0Var;
    }
}
