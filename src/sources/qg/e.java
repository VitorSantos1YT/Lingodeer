package qg;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import androidx.lifecycle.ViewModelKt;
import app.rive.runtime.kotlin.RiveAnimationView;
import b0.o1;
import com.android.billingclient.api.c0;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseLessonFinishStatus;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.UserInfo;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.o0;
import ht.q;
import hu.r;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jr.i0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.b3;
import l1.s1;
import l1.u1;
import mv.f0;
import nv.x;
import qy.l;
import qy.o;
import rt.cb;
import rt.db;
import rt.mf;
import rt.rf;
import ry.n;
import rz.b0;
import rz.d0;
import rz.e0;
import s0.a1;
import s2.w;
import tu.j;
import uz.i1;
import vt.n0;
import w00.f;
import w00.k;
import x1.p;
import xy.i;
import ys.q1;
import ys.r1;
import ys.t1;
import z00.g;
import zu.i2;
import zu.k2;
import zu.s2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f47735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f47737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f47734a = i11;
        this.f47736c = obj;
        this.f47737d = obj2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f47734a) {
            case 0:
                e eVar = new e(0, (c) this.f47736c, (String) this.f47737d, dVar);
                eVar.f47735b = obj;
                return eVar;
            case 1:
                return new e((j) this.f47735b, (fz.a) this.f47736c, (b1) this.f47737d, dVar, 1);
            case 2:
                return new e((List) this.f47735b, (fz.c) this.f47736c, (fv.c) this.f47737d, dVar, 2);
            case 3:
                e eVar2 = new e(3, (ArrayList) this.f47736c, (mf) this.f47737d, dVar);
                eVar2.f47735b = obj;
                return eVar2;
            case 4:
                e eVar3 = new e(4, (w) this.f47736c, (a1) this.f47737d, dVar);
                eVar3.f47735b = obj;
                return eVar3;
            case 5:
                return new e((b1) this.f47735b, (q) this.f47736c, (b1) this.f47737d, dVar, 5);
            case 6:
                return new e((zu.a) this.f47735b, (fz.a) this.f47736c, (b1) this.f47737d, dVar, 6);
            case 7:
                return new e((b3) this.f47735b, (Context) this.f47736c, (i2) this.f47737d, dVar, 7);
            case 8:
                return new e((sr.e) this.f47735b, (CoursePracticeType) this.f47736c, (b1) this.f47737d, dVar, 8);
            case 9:
                e eVar4 = new e(9, (p) this.f47736c, (CourseLesson) this.f47737d, dVar);
                eVar4.f47735b = obj;
                return eVar4;
            default:
                e eVar5 = new e(10, (s2) this.f47736c, (b0) this.f47737d, dVar);
                eVar5.f47735b = obj;
                return eVar5;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f47734a) {
            case 0:
                e eVar = (e) create((s1) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                eVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                e eVar2 = (e) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                eVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                e eVar3 = (e) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                eVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                e eVar4 = (e) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var4 = qy.b0.f48488a;
                eVar4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                return ((e) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                e eVar5 = (e) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var5 = qy.b0.f48488a;
                eVar5.invokeSuspend(b0Var5);
                return b0Var5;
            case 6:
                e eVar6 = (e) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var6 = qy.b0.f48488a;
                eVar6.invokeSuspend(b0Var6);
                return b0Var6;
            case 7:
                e eVar7 = (e) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var7 = qy.b0.f48488a;
                eVar7.invokeSuspend(b0Var7);
                return b0Var7;
            case 8:
                e eVar8 = (e) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var8 = qy.b0.f48488a;
                eVar8.invokeSuspend(b0Var8);
                return b0Var8;
            case 9:
                e eVar9 = (e) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var9 = qy.b0.f48488a;
                eVar9.invokeSuspend(b0Var9);
                return b0Var9;
            default:
                e eVar10 = (e) create((l) obj, (vy.d) obj2);
                qy.b0 b0Var10 = qy.b0.f48488a;
                eVar10.invokeSuspend(b0Var10);
                return b0Var10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0101 A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:8:0x0048, B:9:0x0060, B:11:0x0066, B:13:0x0074, B:16:0x007b, B:18:0x008b, B:19:0x00d5, B:21:0x00de, B:25:0x00fd, B:27:0x0101, B:29:0x0108), top: B:151:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0107  */
    /* JADX WARN: Code duplicated, block: B:34:0x0118  */
    /* JADX WARN: Code duplicated, block: B:35:0x011f  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objL;
        int iIntValue;
        Object obj2;
        vt.a1 a1Var;
        int i11;
        int i12 = this.f47734a;
        int i13 = 28;
        int i14 = 0;
        Object obj3 = this.f47737d;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj4 = this.f47736c;
        switch (i12) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                s1 s1Var = (s1) this.f47735b;
                c cVar = (c) obj4;
                String text = (String) obj3;
                cVar.getClass();
                m.f(text, "text");
                a10.c cVar2 = cVar.f47728a;
                cVar2.getClass();
                f fVar = new f(cVar2.f281a, (a10.b) cVar2.f288h, cVar2.f282b, cVar2.f283c, cVar2.f284d, cVar2.f285e, cVar2.f287g);
                int i15 = 0;
                while (true) {
                    int length = text.length();
                    int i16 = i15;
                    while (true) {
                        if (i16 < length) {
                            char cCharAt = text.charAt(i16);
                            if (cCharAt != '\n' && cCharAt != '\r') {
                                i16++;
                            }
                        } else {
                            i16 = -1;
                        }
                    }
                    if (i16 == -1) {
                        if (!text.isEmpty() && (i15 == 0 || i15 < text.length())) {
                            fVar.h(i15, text.substring(i15));
                        }
                        fVar.e(fVar.f54400s.size());
                        a9.i iVar = new a9.i(fVar.f54394l, fVar.m, fVar.f54395n, fVar.f54396o, fVar.f54399r);
                        fVar.f54393k.getClass();
                        k kVar = new k(iVar);
                        ArrayList arrayList = fVar.f54401t;
                        int size = arrayList.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj5 = arrayList.get(i17);
                            i17++;
                            ((c10.a) obj5).i(kVar);
                        }
                        g gVar = (g) fVar.f54398q.f54377b;
                        ArrayList arrayList2 = cVar2.f286f;
                        int size2 = arrayList2.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj6 = arrayList2.get(i18);
                            i18++;
                            r00.a aVar2 = (r00.a) obj6;
                            aVar2.getClass();
                            new c0(aVar2).i(gVar);
                        }
                        sg.q qVarO = ub.a.O(gVar, null, null);
                        if (qVarO == null) {
                            throw new IllegalArgumentException("Could not convert the generated Commonmark Node into an ASTNode!");
                        }
                        ((u1) s1Var).setValue(qVarO);
                        return b0Var;
                    }
                    fVar.h(i15, text.substring(i15, i16));
                    i15 = i16 + 1;
                    if (i15 < text.length() && text.charAt(i16) == '\r' && text.charAt(i15) == '\n') {
                        i15 = i16 + 2;
                    }
                }
                break;
            case 1:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((Boolean) ((b1) obj3).getValue()).booleanValue()) {
                    ((j) this.f47735b).a(tu.b.f52543a);
                    ((fz.a) obj4).invoke();
                }
                return b0Var;
            case 2:
                fz.c cVar3 = (fz.c) obj4;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                List list = (List) this.f47735b;
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : list) {
                    if (hashSet.add(((fv.a) obj7).f28184c)) {
                        arrayList3.add(obj7);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayList3.size();
                int i19 = 0;
                while (i19 < size3) {
                    Object obj8 = arrayList3.get(i19);
                    i19++;
                    if (!new File(((fv.a) obj8).f28184c).exists()) {
                        arrayList4.add(obj8);
                    }
                }
                List listA1 = ry.m.a1(arrayList4);
                cVar3.invoke(new db(CropImageView.DEFAULT_ASPECT_RATIO));
                if (listA1.isEmpty()) {
                    cVar3.invoke(cb.f49585a);
                } else {
                    Handler handler = rf.f50349a;
                    rf.a((fv.c) obj3, listA1, new o1(cVar3, 29), new x(cVar3, 28));
                }
                return b0Var;
            case 3:
                b0 b0Var2 = (b0) this.f47735b;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                ArrayList arrayList5 = (ArrayList) obj4;
                mf mfVar = (mf) obj3;
                int size4 = arrayList5.size();
                while (i14 < size4) {
                    Object obj9 = arrayList5.get(i14);
                    i14++;
                    e0.B(b0Var2, null, null, new i0(mfVar, (ps.b) obj9, wVar, arrayList5, null, 26), 3);
                }
                return b0Var;
            case 4:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b0 b0Var3 = (b0) this.f47735b;
                d0 d0Var = d0.UNDISPATCHED;
                w wVar2 = (w) obj4;
                a1 a1Var2 = (a1) obj3;
                vy.d dVar = null;
                e0.B(b0Var3, null, d0Var, new s0.e0(wVar2, a1Var2, dVar, 1), 1);
                return e0.B(b0Var3, null, d0Var, new s0.e0(wVar2, a1Var2, dVar, 2), 1);
            case 5:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                RiveAnimationView riveAnimationView = (RiveAnimationView) ((b1) this.f47735b).getValue();
                if (riveAnimationView != null) {
                    q qVar = (q) obj4;
                    b1 b1Var = (b1) obj3;
                    if (qVar == q.CORRECT && !((Boolean) b1Var.getValue()).booleanValue()) {
                        riveAnimationView.fireState("InLesson", "Correct");
                        b1Var.setValue(Boolean.TRUE);
                    } else if (qVar == q.WRONG && !((Boolean) b1Var.getValue()).booleanValue()) {
                        riveAnimationView.fireState("InLesson", "Incorrect");
                        b1Var.setValue(Boolean.TRUE);
                    }
                }
                return b0Var;
            case 6:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                int i21 = xu.k.f56416a[((zu.a) this.f47735b).ordinal()];
                if (i21 != 1 && i21 != 2) {
                    if (i21 == 3) {
                        ((fz.a) obj4).invoke();
                    } else {
                        if (i21 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((b1) obj3).setValue(Boolean.TRUE);
                    }
                }
                return b0Var;
            case 7:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Integer num = (Integer) ((b3) this.f47735b).getValue();
                if (num != null) {
                    Toast.makeText((Context) obj4, num.intValue(), 0).show();
                    ((i2) obj3).H.k(null);
                }
                return b0Var;
            case 8:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((r) ((b1) obj3).getValue()) instanceof hu.q) {
                    sr.e eVar = (sr.e) this.f47735b;
                    CoursePracticeType practiceType = (CoursePracticeType) obj4;
                    m.f(practiceType, "practiceType");
                    vy.d dVar2 = null;
                    e0.B(ViewModelKt.getViewModelScope(eVar), null, null, new sr.d(0, eVar, practiceType, dVar2), 3);
                    e0.B(ViewModelKt.getViewModelScope(eVar), null, null, new f0(eVar, dVar2, i13), 3);
                }
                return b0Var;
            case 9:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                p pVar = (p) obj4;
                pVar.clear();
                CourseLesson courseLesson = (CourseLesson) obj3;
                CourseLessonFinishStatus finishStatus = courseLesson.getFinishStatus();
                if (finishStatus != null) {
                    pVar.add(new r1(finishStatus.getPracticeListening()));
                    if (courseLesson.getShowPracticeSpeaking()) {
                        pVar.add(new t1(finishStatus.getPracticeSpeaking()));
                    }
                    pVar.add(new ys.u1(finishStatus.getPracticeSpelling()));
                    if (courseLesson.getShowPracticeComprehensive()) {
                        pVar.add(new q1(finishStatus.getPracticeComprehensive()));
                    }
                } else {
                    pVar.add(new r1(false));
                    if (courseLesson.getShowPracticeSpeaking()) {
                        pVar.add(new t1(false));
                    }
                    pVar.add(new ys.u1(false));
                    if (courseLesson.getShowPracticeComprehensive()) {
                        pVar.add(new q1(false));
                    }
                }
                if (pVar.size() == 3) {
                    pVar.add(ys.s1.f58249b);
                }
                return b0Var;
            default:
                l lVar = (l) this.f47735b;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                boolean zBooleanValue = ((Boolean) lVar.f48496b).booleanValue();
                UserInfo userInfo = (UserInfo) lVar.f48495a;
                s2 s2Var = (s2) obj4;
                n0 n0Var = s2Var.f59559e;
                String strQ = ((o0) n0Var).q();
                String str = ((o0) n0Var).f27733a.userPicName;
                if (str == null) {
                    str = BuildConfig.VERSION_NAME;
                }
                String str2 = str;
                boolean zIsUnloginUser = ((o0) n0Var).f27733a.isUnloginUser();
                try {
                    int i22 = 6;
                    List listW0 = oz.q.W0(userInfo.getSkillMastery(), new String[]{";"}, 0, 6);
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj10 : listW0) {
                        if (((String) obj10).length() > 0) {
                            arrayList6.add(obj10);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(n.W(arrayList6, 10));
                    int size5 = arrayList6.size();
                    int i23 = 0;
                    while (i23 < size5) {
                        Object obj11 = arrayList6.get(i23);
                        i23++;
                        List listW1 = oz.q.W0((String) obj11, new String[]{":"}, i14, i22);
                        String str3 = (String) listW1.get(i14);
                        String str4 = (String) listW1.get(1);
                        String str5 = (String) listW1.get(2);
                        String str6 = (String) listW1.get(3);
                        arrayList7.add(new vt.a1(str3, Float.parseFloat(str4), Integer.parseInt(str5), Integer.parseInt(str6)));
                        n0Var = n0Var;
                        i22 = 6;
                        i14 = 0;
                    }
                    n0 n0Var2 = n0Var;
                    int size6 = arrayList7.size();
                    int i24 = 0;
                    do {
                        if (i24 < size6) {
                            obj2 = arrayList7.get(i24);
                            i24++;
                        } else {
                            obj2 = null;
                        }
                        a1Var = (vt.a1) obj2;
                        if (a1Var != null) {
                            i11 = a1Var.f54177c + a1Var.f54178d;
                        } else {
                            i11 = 0;
                        }
                        objL = new Integer(i11);
                        if (o.a(objL) == null) {
                            iIntValue = ((Number) objL).intValue();
                        } else {
                            iIntValue = 0;
                        }
                        i1 i1Var = s2Var.H;
                        k2 k2Var = new k2(!zIsUnloginUser, strQ, str2, userInfo.getTotalXP(), userInfo.getTodayXP(), userInfo.getWeeklyXP(), iIntValue, userInfo.getAllFollowings().size(), userInfo.getAllFollowers().size(), userInfo.getTotalGems(), zBooleanValue);
                        i1Var.getClass();
                        i1Var.l(null, k2Var);
                        return b0Var;
                    } while (!m.a(((vt.a1) obj2).f54175a, xt.d.k(((o0) n0Var2).f27733a.keyLanguage)));
                    a1Var = (vt.a1) obj2;
                    if (a1Var != null) {
                        i11 = a1Var.f54177c + a1Var.f54178d;
                    } else {
                        i11 = 0;
                    }
                    objL = new Integer(i11);
                    break;
                } catch (Throwable th2) {
                    objL = com.bumptech.glide.e.l(th2);
                }
                if (o.a(objL) == null) {
                    iIntValue = ((Number) objL).intValue();
                } else {
                    iIntValue = 0;
                }
                i1 i1Var2 = s2Var.H;
                k2 k2Var2 = new k2(!zIsUnloginUser, strQ, str2, userInfo.getTotalXP(), userInfo.getTodayXP(), userInfo.getWeeklyXP(), iIntValue, userInfo.getAllFollowings().size(), userInfo.getAllFollowers().size(), userInfo.getTotalGems(), zBooleanValue);
                i1Var2.getClass();
                i1Var2.l(null, k2Var2);
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f47734a = i11;
        this.f47735b = obj;
        this.f47736c = obj2;
        this.f47737d = obj3;
    }
}
