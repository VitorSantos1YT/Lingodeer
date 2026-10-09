package fr;

import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.LanStaticsInfo;
import com.lingodeer.data.model.UserInfo;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f27403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, i iVar, vy.d dVar) {
        super(2, dVar);
        this.f27400a = i11;
        this.f27403d = iVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27400a) {
            case 0:
                b bVar = new b(0, this.f27403d, dVar);
                bVar.f27402c = obj;
                return bVar;
            case 1:
                b bVar2 = new b(1, this.f27403d, dVar);
                bVar2.f27402c = obj;
                return bVar2;
            default:
                b bVar3 = new b(2, this.f27403d, dVar);
                bVar3.f27402c = obj;
                return bVar3;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        uz.j jVar = (uz.j) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27400a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((b) create(jVar, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:93:0x02de  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objU;
        vt.a1 a1Var;
        LanStaticsInfo lanStaticsInfo;
        Object objU2;
        Object objU3;
        switch (this.f27400a) {
            case 0:
                i iVar = this.f27403d;
                vt.n0 n0Var = iVar.f27582e;
                uz.j jVar = (uz.j) this.f27402c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27401b;
                int i12 = 1;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objU = obj;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                gp.r rVarN = ((x4) iVar.f27578a).n();
                this.f27402c = jVar;
                this.f27401b = 1;
                objU = uz.x0.u(rVarN, this);
                if (objU == aVar) {
                    return aVar;
                }
                int i13 = 0;
                List listW0 = oz.q.W0(((UserInfo) objU).getSkillMastery(), new String[]{";"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listW0) {
                    if (((String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList.get(i14);
                    i14++;
                    List listW1 = oz.q.W0((String) obj3, new String[]{":"}, 0, 6);
                    arrayList2.add(new vt.a1((String) listW1.get(0), Float.parseFloat((String) listW1.get(i12)), Integer.parseInt((String) listW1.get(2)), Integer.parseInt((String) listW1.get(3))));
                    i12 = 1;
                }
                ArrayList arrayList3 = new ArrayList();
                b4.e eVar = new b4.e(9);
                Integer[] numArrN0 = ry.l.n0(xt.d.f56292a);
                ry.l.f0(eVar, numArrN0);
                ArrayList arrayListC1 = ry.m.c1(ry.l.A(numArrN0));
                arrayListC1.remove(new Integer(((o0) n0Var).f27733a.keyLanguage));
                arrayListC1.add(0, new Integer(((o0) n0Var).f27733a.keyLanguage));
                int size2 = arrayListC1.size();
                int i15 = 0;
                while (true) {
                    Object obj4 = null;
                    if (i15 >= size2) {
                        this.f27402c = null;
                        this.f27401b = 2;
                        if (jVar.emit(arrayList3, this) == aVar) {
                            return aVar;
                        }
                        return qy.b0.f48488a;
                    }
                    Object obj5 = arrayListC1.get(i15);
                    i15++;
                    int iIntValue = ((Number) obj5).intValue();
                    String strK = xt.d.k(iIntValue);
                    int size3 = arrayList2.size();
                    int i16 = i13;
                    while (i16 < size3) {
                        Object obj6 = arrayList2.get(i16);
                        i16++;
                        if (kotlin.jvm.internal.m.a(((vt.a1) obj6).f54175a, strK)) {
                            obj4 = obj6;
                            a1Var = (vt.a1) obj4;
                            if (a1Var != null) {
                                float f5 = a1Var.f54176b;
                                int i17 = a1Var.f54177c;
                                int i18 = a1Var.f54178d;
                                lanStaticsInfo = new LanStaticsInfo(iIntValue, f5, i17, i18, i17 + i18);
                                if (lanStaticsInfo.getProgress() <= CropImageView.DEFAULT_ASPECT_RATIO || lanStaticsInfo.getWordsSentencesCount() > 0 || iIntValue == ((o0) n0Var).f27733a.keyLanguage) {
                                    arrayList3.add(lanStaticsInfo);
                                }
                            }
                            i13 = 0;
                        }
                    }
                    a1Var = (vt.a1) obj4;
                    if (a1Var != null) {
                        float f11 = a1Var.f54176b;
                        int i19 = a1Var.f54177c;
                        int i110 = a1Var.f54178d;
                        lanStaticsInfo = new LanStaticsInfo(iIntValue, f11, i19, i110, i19 + i110);
                        if (lanStaticsInfo.getProgress() <= CropImageView.DEFAULT_ASPECT_RATIO) {
                            arrayList3.add(lanStaticsInfo);
                        } else {
                            arrayList3.add(lanStaticsInfo);
                        }
                    }
                    i13 = 0;
                }
                break;
            case 1:
                uz.j jVar2 = (uz.j) this.f27402c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f27401b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objU2 = obj;
                    } else {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                gp.r rVarN2 = ((x4) this.f27403d.f27578a).n();
                this.f27402c = jVar2;
                this.f27401b = 1;
                objU2 = uz.x0.u(rVarN2, this);
                if (objU2 == aVar2) {
                    return aVar2;
                }
                List listW2 = oz.q.W0(((UserInfo) objU2).getAchievementLanguages(), new String[]{";"}, 0, 6);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj7 : listW2) {
                    if (((String) obj7).length() > 0) {
                        arrayList4.add(obj7);
                    }
                }
                int iW = ry.x.W(ry.n.W(arrayList4, 10));
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                int size4 = arrayList4.size();
                int i22 = 0;
                while (i22 < size4) {
                    Object obj8 = arrayList4.get(i22);
                    i22++;
                    List listW3 = oz.q.W0((String) obj8, new String[]{":"}, 0, 6);
                    linkedHashMap.put((String) listW3.get(0), new Float(Float.parseFloat((String) listW3.get(1))));
                }
                LinkedHashMap linkedHashMapK0 = ry.x.k0(linkedHashMap);
                yy.a<ks.d> aVarB = ks.d.b();
                ArrayList arrayList5 = new ArrayList(ry.n.W(aVarB, 10));
                for (ks.d dVar : aVarB) {
                    float fFloatValue = ((Number) linkedHashMapK0.getOrDefault(dVar.a(), new Float(CropImageView.DEFAULT_ASPECT_RATIO))).floatValue();
                    arrayList5.add(new AchievementLanguage(dVar.a(), dVar, fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO, fFloatValue));
                }
                this.f27402c = null;
                this.f27401b = 2;
                if (jVar2.emit(arrayList5, this) == aVar2) {
                    return aVar2;
                }
                return qy.b0.f48488a;
            default:
                uz.j jVar3 = (uz.j) this.f27402c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f27401b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objU3 = obj;
                    } else {
                        if (i23 != 2) {
                            throw new IllegalStateException(OCBJEWZHh.pVBTidIO);
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                gp.r rVarN3 = ((x4) this.f27403d.f27578a).n();
                this.f27402c = jVar3;
                this.f27401b = 1;
                objU3 = uz.x0.u(rVarN3, this);
                if (objU3 == aVar3) {
                    return aVar3;
                }
                List listS0 = ry.m.S0(ry.m.S0(com.bumptech.glide.e.y(((UserInfo) objU3).getAchievementLeaderboard()), new b4.e(10)), new b4.e(11));
                this.f27402c = null;
                this.f27401b = 2;
                if (jVar3.emit(listS0, this) == aVar3) {
                    return aVar3;
                }
                return qy.b0.f48488a;
        }
    }
}
