package bp;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.fluent.ui.base.PdVocabularyActivity;
import com.lingo.lingoskill.object.AreaAndAge;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.base.LoginCheckLocateAgeActivity;
import com.lingo.lingoskill.ui.base.LoginCheckParentInfoActivity;
import com.lingo.lingoskill.ui.base.SignUpActivity;
import com.lingo.me.MeSetupDailyGoalActivity;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LawInfo;
import com.lingodeer.data.model.LearnProgress;
import com.lingodeer.data.model.UnitState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import kotlinx.serialization.json.internal.JsonDecodingException;
import rt.qd;
import rt.tf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f4619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(int i11, int i12, fr.o0 o0Var, vy.d dVar) {
        super(2, dVar);
        this.f4617a = 3;
        this.f4620d = o0Var;
        this.f4618b = i11;
        this.f4619c = i12;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4617a) {
            case 0:
                return new h2(this.f4619c, (LoginCheckLocateAgeActivity) this.f4620d, dVar, 0);
            case 1:
                return new h2((MeSetupDailyGoalActivity) this.f4620d, this.f4619c, dVar, 1);
            case 2:
                return new h2((fr.i) this.f4620d, this.f4619c, dVar, 2);
            case 3:
                return new h2(this.f4618b, this.f4619c, (fr.o0) this.f4620d, dVar);
            case 4:
                h2 h2Var = new h2((fr.v1) this.f4620d, dVar);
                h2Var.f4619c = ((Number) obj).intValue();
                return h2Var;
            case 5:
                return new h2((gp.w) this.f4620d, this.f4619c, dVar, 5);
            case 6:
                return new h2((PdVocabularyActivity) this.f4620d, this.f4619c, dVar, 6);
            case 7:
                return new h2(this.f4619c, (km.j1) this.f4620d, dVar, 7);
            case 8:
                return new h2((n0.v0) this.f4620d, this.f4619c, dVar, 8);
            case 9:
                return new h2((nu.e) this.f4620d, this.f4619c, dVar, 9);
            case 10:
                return new h2(this.f4619c, (qh.m) this.f4620d, dVar, 10);
            case 11:
                return new h2((qd) this.f4620d, this.f4619c, dVar, 11);
            case 12:
                return new h2((tf) this.f4620d, this.f4619c, dVar, 12);
            case 13:
                return new h2(this.f4619c, (l1.g1) this.f4620d, dVar, 13);
            default:
                return new h2(this.f4619c, (l1.b1) this.f4620d, dVar, 14);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f4617a) {
            case 0:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                h2 h2Var = (h2) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                h2Var.invokeSuspend(b0Var);
                return b0Var;
            case 4:
                return ((h2) create(Integer.valueOf(((Number) obj).intValue()), (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(int i11, Object obj, vy.d dVar, int i12) {
        super(2, dVar);
        this.f4617a = i12;
        this.f4619c = i11;
        this.f4620d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [wy.a] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM;
        Object objU;
        LearnProgress learnProgress;
        BufferedReader bufferedReader;
        Throwable th2;
        String strB;
        int i11;
        String strB2;
        String strB3;
        Object objM2;
        int i12 = this.f4617a;
        int i13 = 6;
        int i14 = 2;
        int i15 = 0;
        Throwable th3 = null;
        qy.b0 b0Var = qy.b0.f48488a;
        int i16 = 1;
        Object obj2 = this.f4620d;
        switch (i12) {
            case 0:
                LoginCheckLocateAgeActivity loginCheckLocateAgeActivity = (LoginCheckLocateAgeActivity) obj2;
                i.c cVar = loginCheckLocateAgeActivity.K;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f4618b;
                try {
                    if (i17 == 0) {
                        com.bumptech.glide.e.F(obj);
                        yz.f fVar = rz.o0.f50940a;
                        yz.e eVar = yz.e.f58387a;
                        g2 g2Var = new g2(i14, 0, null);
                        this.f4618b = 1;
                        objM = rz.e0.M(eVar, g2Var, this);
                        if (objM == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i17 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        objM = obj;
                    }
                    AreaAndAge areaAndAge = (AreaAndAge) objM;
                    if (this.f4619c < areaAndAge.getAge()) {
                        LawInfo lawInfo = LawInfo.copy$default(new LawInfo(), areaAndAge.getArea(), this.f4619c, null, null, 12, null);
                        int i18 = LoginCheckParentInfoActivity.L;
                        boolean z11 = loginCheckLocateAgeActivity.f22043t;
                        kotlin.jvm.internal.m.f(lawInfo, "lawInfo");
                        Intent intent = new Intent(loginCheckLocateAgeActivity, (Class<?>) LoginCheckParentInfoActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, lawInfo);
                        intent.putExtra(INTENTS.EXTRA_BOOLEAN, z11);
                        cVar.a(intent);
                        return b0Var;
                    }
                    if (loginCheckLocateAgeActivity.f22043t) {
                        loginCheckLocateAgeActivity.setResult(3012);
                        loginCheckLocateAgeActivity.finish();
                        return b0Var;
                    }
                    int i19 = SignUpActivity.L;
                    int i21 = loginCheckLocateAgeActivity.H;
                    Intent intent2 = new Intent(loginCheckLocateAgeActivity, (Class<?>) SignUpActivity.class);
                    intent2.putExtra(INTENTS.EXTRA_INT, i21);
                    cVar.a(intent2);
                    return b0Var;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return b0Var;
                }
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f4618b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.n0 n0VarL = ((MeSetupDailyGoalActivity) obj2).l();
                int i23 = this.f4619c;
                this.f4618b = 1;
                fr.o0 o0Var = (fr.o0) n0VarL;
                o0Var.getClass();
                yz.f fVar2 = rz.o0.f50940a;
                Object objM3 = rz.e0.M(yz.e.f58387a, new fr.f0(i23, i13, o0Var, null == true ? 1 : 0), this);
                if (objM3 != aVar2) {
                    objM3 = b0Var;
                }
                return objM3 == aVar2 ? aVar2 : b0Var;
            case 2:
                int i24 = this.f4619c;
                fr.i iVar = (fr.i) obj2;
                Object arrayList = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f4618b;
                try {
                    if (i25 == 0) {
                        com.bumptech.glide.e.F(obj);
                        gp.r rVarE = ((bh.a1) iVar.f27580c).e(i24, true);
                        this.f4618b = 1;
                        objU = uz.x0.u(rVarE, this);
                        if (objU != arrayList) {
                        }
                        return arrayList;
                    }
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU = obj;
                    h00.e eVarF = h00.n.f(xt.c.f56291a.d(ob.f.I(bufferedReader)));
                    bufferedReader.close();
                    ArrayList arrayList2 = new ArrayList(ry.n.W(eVarF, 10));
                    for (h00.m mVar : eVarF.f29919a) {
                        h00.m mVar2 = (h00.m) h00.n.g(mVar).get("lessonList");
                        if (mVar2 == null || (strB = h00.n.h(mVar2).b()) == null) {
                            strB = BuildConfig.VERSION_NAME;
                        }
                        h00.m mVar3 = (h00.m) h00.n.g(mVar).get("unitId");
                        long jI = mVar3 != null ? h00.n.i(h00.n.h(mVar3)) : 0L;
                        h00.m mVar4 = (h00.m) h00.n.g(mVar).get("unitName");
                        String str = (mVar4 == null || (strB3 = h00.n.h(mVar4).b()) == null) ? BuildConfig.VERSION_NAME : strB3;
                        h00.m mVar5 = (h00.m) h00.n.g(mVar).get("lessonList");
                        String str2 = (mVar5 == null || (strB2 = h00.n.h(mVar5).b()) == null) ? BuildConfig.VERSION_NAME : strB2;
                        h00.m mVar6 = (h00.m) h00.n.g(mVar).get("sortIndex");
                        if (mVar6 != null) {
                            h00.d0 d0VarH = h00.n.h(mVar6);
                            try {
                                long j11 = h00.n.j(d0VarH);
                                if (-2147483648L > j11 || j11 > 2147483647L) {
                                    throw new NumberFormatException(d0VarH.b() + " is not an Int");
                                }
                                i11 = (int) j11;
                            } catch (JsonDecodingException e10) {
                                throw new NumberFormatException(e10.getMessage());
                            }
                        } else {
                            i11 = 0;
                        }
                        h00.m mVar7 = (h00.m) h00.n.g(mVar).get("levelId");
                        arrayList2.add(CourseUnit.m213copypls4pCs$default(new CourseUnit(jI, str, BuildConfig.VERSION_NAME, str2, i11, mVar7 != null ? h00.n.i(h00.n.h(mVar7)) : 0L, false, null, false, false, false, false, 0L, 0L, null, null, null, null, null, null, null, 0, 0, 0, 16777152, null), 0L, null, null, null, 0, 0L, false, null, false, false, false, false, 0L, 0L, null, null, null, null, null, null, null, 0, ry.l.D(new Integer[]{47, 48, 53, 54}, Integer.valueOf(i24)) ? ks.b.n(strB).size() - 1 : ks.b.n(strB).size(), 0, 12582911, null));
                    }
                    xt.h hVarA = xt.e.a(learnProgress.getMain());
                    xt.g gVarA = xt.f.a(learnProgress.getMainTT());
                    HashMap map = new HashMap();
                    int size = arrayList2.size();
                    int i26 = 0;
                    while (i26 < size) {
                        Object obj3 = arrayList2.get(i26);
                        i26++;
                        CourseUnit courseUnit = (CourseUnit) obj3;
                        ArrayList arrayListN = ks.b.n(courseUnit.getLessonList());
                        if (courseUnit.getLevelId() < hVarA.f56296a) {
                            int size2 = arrayListN.size();
                            int i27 = 0;
                            while (i27 < size2) {
                                Object obj4 = arrayListN.get(i27);
                                i27++;
                                map.put(new Long(((Number) obj4).longValue()), new Integer(i16));
                                th3 = th3;
                            }
                            th2 = th3;
                        } else {
                            th2 = th3;
                            if (courseUnit.getLevelId() == hVarA.f56296a && courseUnit.getSortIndex() < hVarA.f56297b) {
                                int size3 = arrayListN.size();
                                int i28 = 0;
                                while (i28 < size3) {
                                    Object obj5 = arrayListN.get(i28);
                                    i28++;
                                    map.put(new Long(((Number) obj5).longValue()), new Integer(i16));
                                }
                            } else if (courseUnit.getLevelId() == hVarA.f56296a && courseUnit.getSortIndex() == hVarA.f56297b) {
                                int size4 = arrayListN.size();
                                int i29 = 0;
                                int i30 = 0;
                                while (i30 < size4) {
                                    Object obj6 = arrayListN.get(i30);
                                    i30++;
                                    int i31 = i29 + 1;
                                    if (i29 < 0) {
                                        ns.o.V();
                                        throw th2;
                                    }
                                    int i32 = size;
                                    long jLongValue = ((Number) obj6).longValue();
                                    int i33 = hVarA.f56298c;
                                    if (i31 < i33) {
                                        map.put(new Long(jLongValue), new Integer(i16));
                                    } else if (i31 == i33) {
                                        map.put(new Long(jLongValue), new Integer(0));
                                    }
                                    size = i32;
                                    i29 = i31;
                                }
                            }
                        }
                        int i34 = size;
                        Integer num = (Integer) gVarA.f56294a.get(new Long(courseUnit.getUnitId()));
                        if (num != null) {
                            int size5 = arrayListN.size();
                            int i35 = 0;
                            int i36 = 0;
                            while (i36 < size5) {
                                Object obj7 = arrayListN.get(i36);
                                i36++;
                                int i37 = i35 + 1;
                                if (i35 < 0) {
                                    ns.o.V();
                                    throw th2;
                                }
                                ArrayList arrayList3 = arrayList2;
                                long jLongValue2 = ((Number) obj7).longValue();
                                if (i37 < num.intValue()) {
                                    map.put(new Long(jLongValue2), new Integer(1));
                                } else if (i37 == num.intValue() && map.get(new Long(jLongValue2)) == null) {
                                    map.put(new Long(jLongValue2), new Integer(0));
                                }
                                i35 = i37;
                                arrayList2 = arrayList3;
                            }
                        }
                        size = i34;
                        arrayList2 = arrayList2;
                        th3 = th2;
                        i16 = 1;
                    }
                    Throwable th4 = th3;
                    ArrayList arrayListC = wt.m.c(arrayList2, map);
                    ArrayList arrayList4 = new ArrayList(ry.n.W(arrayListC, 10));
                    int size6 = arrayListC.size();
                    int i38 = 0;
                    int i39 = 0;
                    while (i39 < size6) {
                        Object obj8 = arrayListC.get(i39);
                        i39++;
                        int i40 = i38 + 1;
                        if (i38 < 0) {
                            ns.o.V();
                            throw th4;
                        }
                        CourseUnit courseUnit2 = (CourseUnit) obj8;
                        arrayList4.add(CourseUnit.m213copypls4pCs$default(courseUnit2, 0L, null, null, null, 0, 0L, false, null, false, oz.x.s0(courseUnit2.getUnitName(), xTCJ.ntVNUvNnLAWeY, false), false, false, 0L, 0L, null, null, null, (i38 == 0 && courseUnit2.getUnitState() == UnitState.StateLocked) ? UnitState.StateOpen : courseUnit2.getUnitState(), null, null, null, 0, 0, 0, 16645631, null));
                        i38 = i40;
                    }
                    arrayList = new ArrayList();
                    int size7 = arrayList4.size();
                    int i41 = 0;
                    while (i41 < size7) {
                        Object obj9 = arrayList4.get(i41);
                        i41++;
                        if (!((CourseUnit) obj9).isTestOut()) {
                            arrayList.add(obj9);
                        }
                    }
                    return arrayList;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        ns.o.m(bufferedReader, th5);
                        throw th6;
                    }
                }
                learnProgress = (LearnProgress) objU;
                InputStream inputStreamOpen = iVar.f27585h.getAssets().open("unit_info/".concat(xt.d.k(i24)));
                kotlin.jvm.internal.m.e(inputStreamOpen, "open(...)");
                Charset charsetForName = Charset.forName(Constants.ENCODING);
                kotlin.jvm.internal.m.e(charsetForName, "forName(...)");
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, charsetForName), OSSConstants.DEFAULT_BUFFER_SIZE);
                break;
            case 3:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                fr.o0 o0Var2 = (fr.o0) obj2;
                Env env = o0Var2.f27733a;
                env.listenAlongResourceMode = ob.f.e(ry.x.d0(ob.f.d(env.listenAlongResourceMode), new qy.l(String.valueOf(this.f4618b), String.valueOf(this.f4619c))));
                o0Var2.f27733a.updateEntry("listenAlongResourceMode");
                return b0Var;
            case 4:
                int i42 = this.f4619c;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i43 = this.f4618b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.n0 n0Var = ((fr.v1) obj2).f27910a;
                this.f4619c = i42;
                this.f4618b = 1;
                return ((fr.o0) n0Var).E(i42, this) == aVar4 ? aVar4 : b0Var;
            case 5:
                gp.w wVar = (gp.w) obj2;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i44 = this.f4618b;
                if (i44 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.n0 n0Var2 = wVar.f29527d;
                    int i45 = this.f4619c;
                    this.f4618b = 1;
                    fr.o0 o0Var3 = (fr.o0) n0Var2;
                    o0Var3.getClass();
                    yz.f fVar3 = rz.o0.f50940a;
                    Object objM4 = rz.e0.M(yz.e.f58387a, new fr.f0(i45, i13, o0Var3, null == true ? 1 : 0), this);
                    if (objM4 != aVar5) {
                        objM4 = b0Var;
                    }
                    if (objM4 != aVar5) {
                    }
                    return aVar5;
                }
                if (i44 != 1) {
                    if (i44 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.c cVar2 = wVar.f29525b;
                this.f4618b = 2;
                ((vt.d) cVar2).n(this);
                if (b0Var != aVar5) {
                    return b0Var;
                }
                return aVar5;
            case 6:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i46 = this.f4618b;
                if (i46 != 0) {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.n0 n0VarL2 = ((PdVocabularyActivity) obj2).l();
                int i47 = this.f4619c;
                this.f4618b = 1;
                fr.o0 o0Var4 = (fr.o0) n0VarL2;
                o0Var4.getClass();
                yz.f fVar4 = rz.o0.f50940a;
                Object objM5 = rz.e0.M(yz.e.f58387a, new fr.f0(i47, 19, o0Var4, null == true ? 1 : 0), this);
                if (objM5 != aVar6) {
                    objM5 = b0Var;
                }
                return objM5 == aVar6 ? aVar6 : b0Var;
            case 7:
                int i48 = this.f4619c;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i49 = this.f4618b;
                if (i49 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar5 = rz.o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    km.n0 n0Var3 = new km.n0(i48, i15, null == true ? 1 : 0);
                    this.f4618b = 1;
                    objM2 = rz.e0.M(eVar2, n0Var3, this);
                    if (objM2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objM2 = obj;
                }
                Word word = (Word) objM2;
                if (word == null) {
                    return b0Var;
                }
                km.j1 j1Var = (km.j1) obj2;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(j1Var.getContext());
                ta.a aVar8 = j1Var.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                View viewInflate = layoutInflaterFrom.inflate(R.layout.item_syllable_jp_word_info, (ViewGroup) ((hj.j5) aVar8).f32781b, false);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_word);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_luoma);
                ((TextView) viewInflate.findViewById(R.id.tv_trans)).setText(word.getTranslations());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) (word.getWord() + "( " + word.getZhuyin() + " )"));
                int length = spannableStringBuilder.length();
                for (int i50 = 0; i50 < length; i50++) {
                    if (kotlin.jvm.internal.m.a(String.valueOf(spannableStringBuilder.charAt(i50)), "ん")) {
                        Context contextRequireContext = j1Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext.getColor(R.color.colorAccent)), i50, i50 + 1, 33);
                    }
                }
                textView.setText(spannableStringBuilder);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) word.getLuoma());
                int length2 = spannableStringBuilder2.length();
                for (int i51 = 0; i51 < length2; i51++) {
                    if (i51 != 0 && kotlin.jvm.internal.m.a(String.valueOf(spannableStringBuilder2.charAt(i51)), "n")) {
                        Context contextRequireContext2 = j1Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext2.getColor(R.color.colorAccent)), i51, i51 + 1, 33);
                    }
                }
                textView2.setText(spannableStringBuilder2);
                bq.z.b(viewInflate, new km.m0(j1Var, i48, 0));
                ta.a aVar9 = j1Var.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                ((hj.j5) aVar9).f32781b.addView(viewInflate);
                return b0Var;
            case 8:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i52 = this.f4618b;
                if (i52 != 0) {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                n0.r0 r0Var = ((n0.v0) obj2).R;
                int i53 = this.f4619c;
                this.f4618b = 1;
                return r0Var.f(i53, this) == aVar10 ? aVar10 : b0Var;
            case 9:
                int i54 = this.f4619c;
                nu.e eVar3 = (nu.e) obj2;
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i55 = this.f4618b;
                if (i55 == 0) {
                    com.bumptech.glide.e.F(obj);
                    b0.d dVar = (b0.d) eVar3.f44062a.I.get(i54);
                    Float f5 = new Float(1.05f);
                    b0.i2 i2VarR = b0.e.r(100, 0, null, 6);
                    this.f4618b = 1;
                    if (b0.d.c(dVar, f5, i2VarR, null, this, 12) != aVar11) {
                    }
                    return aVar11;
                }
                if (i55 != 1) {
                    if (i55 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                b0.d dVar2 = (b0.d) eVar3.f44062a.I.get(i54);
                Float f11 = new Float(1.0f);
                b0.i2 i2VarR2 = b0.e.r(100, 0, null, 6);
                this.f4618b = 2;
                if (b0.d.c(dVar2, f11, i2VarR2, null, this, 12) != aVar11) {
                    return b0Var;
                }
                return aVar11;
            case 10:
                qh.m mVar8 = (qh.m) obj2;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i56 = this.f4618b;
                if (i56 != 0) {
                    if (i56 != 1 && i56 != 2 && i56 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                int i57 = this.f4619c;
                if (i57 == R.id.rdb_20) {
                    vt.n0 n0VarS = mVar8.s();
                    this.f4618b = 1;
                    if (((fr.o0) n0VarS).I(20, this) != aVar12) {
                        return b0Var;
                    }
                } else if (i57 == R.id.rdb_30) {
                    vt.n0 n0VarS2 = mVar8.s();
                    this.f4618b = 2;
                    if (((fr.o0) n0VarS2).I(30, this) != aVar12) {
                        return b0Var;
                    }
                } else {
                    if (i57 != R.id.rdb_50) {
                        return b0Var;
                    }
                    vt.n0 n0VarS3 = mVar8.s();
                    this.f4618b = 3;
                    if (((fr.o0) n0VarS3).I(50, this) != aVar12) {
                        return b0Var;
                    }
                }
                return aVar12;
            case 11:
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i58 = this.f4618b;
                if (i58 != 0) {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.n0 n0Var4 = ((qd) obj2).f50309b;
                int i59 = this.f4619c;
                this.f4618b = 1;
                return ((fr.o0) n0Var4).e0(i59, this) == aVar13 ? aVar13 : b0Var;
            case 12:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i60 = this.f4618b;
                if (i60 != 0) {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                wt.o0 o0Var5 = ((tf) obj2).f50461a;
                int i61 = this.f4619c;
                this.f4618b = 1;
                return o0Var5.d(i61, this) == aVar14 ? aVar14 : b0Var;
            case 13:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                int i62 = this.f4618b;
                if (i62 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (this.f4619c <= 0) {
                        return b0Var;
                    }
                    this.f4618b = 1;
                    if (rz.e0.m(300L, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i62 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                ((l1.g1) obj2).m(1.0f);
                return b0Var;
            default:
                l1.b1 b1Var = (l1.b1) obj2;
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                int i63 = this.f4618b;
                if (i63 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (this.f4619c <= 0) {
                        return b0Var;
                    }
                    b1Var.setValue(Boolean.TRUE);
                    this.f4618b = 1;
                    if (rz.e0.m(1000L, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i63 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(fr.v1 v1Var, vy.d dVar) {
        super(2, dVar);
        this.f4617a = 4;
        this.f4620d = v1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Object obj, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f4617a = i12;
        this.f4620d = obj;
        this.f4619c = i11;
    }
}
