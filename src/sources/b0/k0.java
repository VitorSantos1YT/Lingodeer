package b0;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import bt.g8;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingodeer.data.model.CourseACK;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseLessonPracticeType;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import fr.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import mt.h4;
import rt.e3;
import rt.ob;
import rt.u5;
import rt.z2;
import rt.z5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3583e;

    public /* synthetic */ k0(Number number, h0 h0Var, Number number2, g0 g0Var) {
        this.f3579a = 0;
        this.f3580b = number;
        this.f3582d = h0Var;
        this.f3581c = number2;
        this.f3583e = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Iterable, java.lang.Object] */
    @Override // fz.a
    public final Object invoke() throws Throwable {
        String strY0;
        int i11 = 0;
        int i12 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.f3579a) {
            case 0:
                Number number = (Number) this.f3580b;
                h0 h0Var = (h0) this.f3582d;
                Number number2 = (Number) this.f3581c;
                g0 g0Var = (g0) this.f3583e;
                if (!number.equals(h0Var.f3550a) || !number2.equals(h0Var.f3551b)) {
                    h0Var.f3550a = number;
                    h0Var.f3551b = number2;
                    h0Var.f3554e = new r1(g0Var, h0Var.f3552c, number, number2, null);
                    h0Var.K.f3570b.setValue(Boolean.TRUE);
                    h0Var.f3555f = false;
                    h0Var.f3556t = true;
                }
                return qy.b0.f48488a;
            case 1:
                rz.e0.B((rz.b0) this.f3580b, null, null, new a0.e0((jt.u) this.f3581c, (fz.c) this.f3582d, (l1.b1) this.f3583e, (vy.d) null, 7), 3);
                break;
            case 2:
                rz.e0.B((rz.b0) this.f3580b, null, null, new a0.e0((jt.h0) this.f3581c, (fz.c) this.f3582d, (l1.b1) this.f3583e, (vy.d) null, 8), 3);
                break;
            case 3:
                rz.e0.B((rz.b0) this.f3580b, null, null, new a0.e0((jt.k0) this.f3581c, (fz.c) this.f3582d, (l1.b1) this.f3583e, (vy.d) null, 9), 3);
                break;
            case 4:
                rz.e0.B((rz.b0) this.f3580b, null, null, new a0.e0((jt.l0) this.f3581c, (fz.c) this.f3582d, (l1.b1) this.f3583e, (vy.d) null, 10), 3);
                break;
            case 5:
                rz.e0.B((rz.b0) this.f3580b, null, null, new a0.e0((jt.s0) this.f3581c, (fz.c) this.f3582d, (fz.a) this.f3583e, (vy.d) null, 11), 3);
                break;
            case 6:
                rz.e0.B((rz.b0) this.f3580b, null, null, new a0.e0((jt.q1) this.f3581c, (fz.c) this.f3582d, (l1.b1) this.f3583e, (vy.d) null, 13), 3);
                break;
            case 7:
                jt.a2 a2Var = (jt.a2) this.f3580b;
                CourseWord courseWord = (CourseWord) this.f3581c;
                ot.a2 a2Var2 = (ot.a2) this.f3582d;
                fz.f fVar = (fz.f) this.f3583e;
                if (courseWord.isMatched()) {
                    fz.c cVar = a2Var.f36883l;
                    String string = courseWord.getAudioUri().toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    cVar.invoke(string);
                    l1.b1 b1Var = a2Var.f36873b;
                    Iterable<CourseWord> iterable = (Iterable) b1Var.getValue();
                    ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
                    for (CourseWord courseWordCopy$default : iterable) {
                        if (courseWordCopy$default.getWordId() == courseWord.getWordId()) {
                            courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, true, null, null, null, null, null, null, 0, -1073741825, 63, null);
                        }
                        arrayList.add(courseWordCopy$default);
                    }
                    b1Var.setValue(arrayList);
                    l1.b1 b1Var2 = a2Var.f36874c;
                    Iterable<CourseWord> iterable2 = (Iterable) b1Var2.getValue();
                    ArrayList arrayList2 = new ArrayList(ry.n.W(iterable2, 10));
                    for (CourseWord courseWordCopy$default2 : iterable2) {
                        if (courseWordCopy$default2.getWordId() == courseWord.getWordId()) {
                            courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, true, null, null, null, null, null, null, 0, -1073741825, 63, null);
                        }
                        arrayList2.add(courseWordCopy$default2);
                    }
                    b1Var2.setValue(arrayList2);
                    rz.e0.B(a2Var.f36882k, null, null, new jt.w1(a2Var, courseWord, objArr == true ? 1 : 0, i12), 3);
                } else if (!((Boolean) a2Var.f36881j.getValue()).booleanValue()) {
                    a2Var.f36880i.setValue(courseWord);
                }
                if (a2Var2 == ot.a2.AudioAudio) {
                    fVar.invoke(b7.e0.l(courseWord, "toString(...)"), Long.valueOf(courseWord.getWordId()), g8.Right);
                }
                return qy.b0.f48488a;
            case 8:
                CourseLesson courseLesson = (CourseLesson) this.f3580b;
                CourseLessonPracticeType courseLessonPracticeType = (CourseLessonPracticeType) this.f3581c;
                l1.b1 b1Var3 = (l1.b1) this.f3582d;
                l1.b1 b1Var4 = (l1.b1) this.f3583e;
                int i13 = CourseTestIndexActivity.N;
                b1Var3.setValue(new ob(courseLesson, courseLessonPracticeType));
                b1Var4.setValue(Boolean.TRUE);
                break;
            case 9:
                z5 z5Var = (z5) this.f3580b;
                ns.z zVar = (ns.z) this.f3581c;
                l1.b1 b1Var5 = (l1.b1) this.f3582d;
                l1.b1 b1Var6 = (l1.b1) this.f3583e;
                b1Var5.setValue(Boolean.FALSE);
                b1Var6.setValue(null);
                z5Var.f50769t = null;
                uz.i1 i1Var = z5Var.f50766d;
                u5 u5Var = new u5();
                i1Var.getClass();
                i1Var.l(null, u5Var);
                z5Var.c(zVar);
                break;
            case 10:
                ur.a aVar = (ur.a) this.f3580b;
                ys.v vVar = (ys.v) this.f3581c;
                ns.z zVar2 = (ns.z) this.f3582d;
                l1.b1 b1Var7 = (l1.b1) this.f3583e;
                aVar.c("jxz_main_emm_feedback_dislike", new dt.m0(vVar, zVar2, i11));
                b1Var7.setValue(Boolean.TRUE);
                break;
            case 11:
                mu.l lVar = (mu.l) this.f3580b;
                l1.b1 b1Var8 = (l1.b1) this.f3581c;
                fz.a aVar2 = (fz.a) this.f3582d;
                l1.b1 b1Var9 = (l1.b1) this.f3583e;
                if (((mu.k) lVar).f42144a < 200) {
                    b1Var8.setValue(Boolean.TRUE);
                } else {
                    aVar2.invoke();
                    b1Var9.setValue(Boolean.FALSE);
                }
                return qy.b0.f48488a;
            case 12:
                rz.e0.B((rz.b0) this.f3580b, null, null, new kr.w((j2.c) this.f3581c, (Context) this.f3582d, (CourseACK) this.f3583e, (vy.d) null, 9), 3);
                break;
            case 13:
                rt.x0 x0Var = (rt.x0) this.f3580b;
                fz.c cVar2 = (fz.c) this.f3581c;
                l1.b1 b1Var10 = (l1.b1) this.f3582d;
                l1.b1 b1Var11 = (l1.b1) this.f3583e;
                b1Var10.setValue(Boolean.FALSE);
                if (((List) b1Var11.getValue()).size() == x0Var.f50599a.size()) {
                    strY0 = "-1";
                } else {
                    List list = (List) b1Var11.getValue();
                    ArrayList arrayList3 = new ArrayList(ry.n.W(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Long.valueOf(((rt.m2) it.next()).f50050a));
                    }
                    strY0 = ry.m.y0(arrayList3, ";", null, null, new lt.d(17), 30);
                }
                cVar2.invoke(strY0);
                break;
            case 14:
                rt.q2 q2Var = (rt.q2) this.f3580b;
                fz.c cVar3 = (fz.c) this.f3581c;
                fz.a aVar3 = (fz.a) this.f3582d;
                ((l1.b1) this.f3583e).setValue(Boolean.FALSE);
                if (q2Var.f50267e > 1) {
                    cVar3.invoke(q2Var.f50272j);
                } else {
                    aVar3.invoke();
                }
                return qy.b0.f48488a;
            case 15:
                rz.b0 b0Var = (rz.b0) this.f3580b;
                l1.b1 b1Var12 = (l1.b1) this.f3581c;
                e3 e3Var = (e3) this.f3582d;
                fz.a aVar4 = (fz.a) this.f3583e;
                if (!((Boolean) b1Var12.getValue()).booleanValue()) {
                    b1Var12.setValue(Boolean.TRUE);
                    rz.e0.B(b0Var, null, null, new h4(e3Var, aVar4, objArr2 == true ? 1 : 0, i12), 3);
                }
                return qy.b0.f48488a;
            case 16:
                fz.f fVar2 = (fz.f) this.f3580b;
                l1.a1 a1Var = (l1.a1) this.f3581c;
                l1.b1 b1Var13 = (l1.b1) this.f3582d;
                l1.a1 a1Var2 = (l1.a1) this.f3583e;
                Object objValueOf = Integer.valueOf(((l1.h1) a1Var).l());
                Boolean bool = (Boolean) b1Var13.getValue();
                bool.booleanValue();
                fVar2.invoke(objValueOf, bool, Integer.valueOf(((l1.h1) a1Var2).l()));
                break;
            case 17:
                pb.o oVar = (pb.o) this.f3580b;
                UUID uuid = (UUID) this.f3581c;
                fb.o oVar2 = (fb.o) this.f3582d;
                Context context = (Context) this.f3583e;
                String string2 = uuid.toString();
                ob.p pVarN = oVar.f46754c.n(string2);
                if (pVarN == null || pVarN.f44849b.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                gb.d dVar = oVar.f46753b;
                synchronized (dVar.f28927k) {
                    try {
                        fb.l.b().getClass();
                        gb.a0 a0Var = (gb.a0) dVar.f28923g.remove(string2);
                        if (a0Var != null) {
                            if (dVar.f28917a == null) {
                                PowerManager.WakeLock wakeLockA = pb.l.a(dVar.f28918b, "ProcessorForegroundLck");
                                dVar.f28917a = wakeLockA;
                                wakeLockA.acquire();
                            }
                            dVar.f28922f.put(string2, a0Var);
                            Intent intentB = nb.a.b(dVar.f28918b, j3.s(a0Var.f28894a), oVar2);
                            Context context2 = dVar.f28918b;
                            if (Build.VERSION.SDK_INT >= 26) {
                                o4.a.c(context2, intentB);
                            } else {
                                context2.startService(intentB);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                ob.j jVarS = j3.s(pVarN);
                int i14 = nb.a.L;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_NOTIFY");
                intent.putExtra("KEY_NOTIFICATION_ID", oVar2.f27102a);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oVar2.f27103b);
                intent.putExtra("KEY_NOTIFICATION", oVar2.f27104c);
                intent.putExtra("KEY_WORKSPEC_ID", jVarS.f44817a);
                intent.putExtra("KEY_GENERATION", jVarS.f44818b);
                context.startService(intent);
                return null;
            case 18:
                String str = (String) this.f3580b;
                LeaderBoardUser leaderBoardUser = (LeaderBoardUser) this.f3581c;
                fz.c cVar4 = (fz.c) this.f3582d;
                fz.c cVar5 = (fz.c) this.f3583e;
                if (kotlin.jvm.internal.m.a(str, leaderBoardUser.getUid())) {
                    cVar4.invoke(leaderBoardUser);
                } else {
                    cVar5.invoke(leaderBoardUser);
                }
                return qy.b0.f48488a;
            case 19:
                l1.b1 b1Var14 = (l1.b1) this.f3580b;
                l1.b1 b1Var15 = (l1.b1) this.f3581c;
                l1.b1 b1Var16 = (l1.b1) this.f3582d;
                mu.x xVar = (mu.x) this.f3583e;
                mu.l lVar2 = (mu.l) b1Var15.getValue();
                kotlin.jvm.internal.m.d(lVar2, "null cannot be cast to non-null type com.lingodeer.gem.viewmodels.GemUiState.Success");
                if (((mu.k) lVar2).f42144a < 100) {
                    b1Var14.setValue(Boolean.TRUE);
                } else {
                    tu.h hVar = (tu.h) b1Var16.getValue();
                    kotlin.jvm.internal.m.d(hVar, "null cannot be cast to non-null type com.lingodeer.leaderboard.viewmodels.LeaderBoardEmojiStatusUiStatus.Success");
                    tu.k kVar = ((tu.g) hVar).f52568c;
                    Integer numValueOf = kVar != null ? Integer.valueOf(kVar.f52594a) : null;
                    if (numValueOf != null) {
                        xVar.a(new mu.d(String.valueOf(numValueOf.intValue())));
                    }
                }
                return qy.b0.f48488a;
            case 20:
                zr.v vVar2 = (zr.v) this.f3580b;
                ?? r9 = this.f3581c;
                fz.c cVar6 = (fz.c) this.f3582d;
                l1.b1 b1Var17 = (l1.b1) this.f3583e;
                zr.u uVar = (zr.u) vVar2;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : r9) {
                    if (((Set) b1Var17.getValue()).contains((String) obj)) {
                        arrayList4.add(obj);
                    }
                }
                String strY1 = ry.m.y0(arrayList4, ";", null, null, null, 62);
                CourseCharacterGroup courseCharacterGroup = uVar.f59326b;
                long groupId = courseCharacterGroup.getGroupId();
                int groupIndex = courseCharacterGroup.getGroupIndex();
                String groupName = courseCharacterGroup.getGroupName();
                String str2 = oz.q.K0(groupName) ? "搜索结果" : groupName;
                String tGroupName = courseCharacterGroup.getTGroupName();
                cVar6.invoke(new CourseCharacterGroup(groupId, groupIndex, strY1, str2, strY1, oz.q.K0(tGroupName) ? "搜索结果" : tGroupName));
                break;
            case 21:
                fz.c cVar7 = (fz.c) this.f3580b;
                z2.i2 i2Var = (z2.i2) this.f3581c;
                l1.b1 b1Var18 = (l1.b1) this.f3582d;
                l1.b1 b1Var19 = (l1.b1) this.f3583e;
                cVar7.invoke((String) b1Var18.getValue());
                if (i2Var != null) {
                    ((z2.h1) i2Var).a();
                }
                b1Var19.setValue(Boolean.FALSE);
                break;
            case 22:
                fz.c cVar8 = (fz.c) this.f3580b;
                String str3 = (String) this.f3581c;
                fz.c cVar9 = (fz.c) this.f3582d;
                String[] strArr = (String[]) this.f3583e;
                cVar8.invoke(str3);
                cVar9.invoke(Integer.valueOf(ry.l.Z(strArr, str3)));
                break;
            default:
                rz.e0.B((rz.b0) this.f3580b, null, null, new z2((Context) this.f3581c, (String) this.f3582d, (String) this.f3583e, null), 3);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f3579a = i11;
        this.f3580b = obj;
        this.f3581c = obj2;
        this.f3582d = obj3;
        this.f3583e = obj4;
    }
}
