package rt;

import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.CourseUnitFinishStatus;
import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.StoryLessonType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class vb extends xy.i implements fz.f {
    public /* synthetic */ List H;
    public final /* synthetic */ vt.k0 K;
    public final /* synthetic */ vt.n0 L;
    public final /* synthetic */ CourseUnit M;
    public final /* synthetic */ vt.j0 N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f50546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CourseUnitFinishStatus f50547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f50548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ee f50549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f50551f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ boolean f50552t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(vt.k0 k0Var, vt.n0 n0Var, CourseUnit courseUnit, vt.j0 j0Var, vy.d dVar) {
        super(3, dVar);
        this.K = k0Var;
        this.L = n0Var;
        this.M = courseUnit;
        this.N = j0Var;
    }

    public static final boolean e(vt.n0 n0Var, int i11) {
        if (((fr.o0) n0Var).f27733a.keyLanguage == 51) {
            if (i11 > 3) {
                return false;
            }
        } else if (i11 != 1) {
            return false;
        }
        return true;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        CourseUnit courseUnit = this.M;
        vt.j0 j0Var = this.N;
        vb vbVar = new vb(this.K, this.L, courseUnit, j0Var, (vy.d) obj3);
        vbVar.f50552t = zBooleanValue;
        vbVar.H = (List) obj2;
        return vbVar.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:29:0x010e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0125  */
    /* JADX WARN: Code duplicated, block: B:34:0x0135  */
    /* JADX WARN: Code duplicated, block: B:36:0x013a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0154  */
    /* JADX WARN: Code duplicated, block: B:41:0x0159  */
    /* JADX WARN: Code duplicated, block: B:45:0x0193  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01af  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x020d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0212  */
    /* JADX WARN: Code duplicated, block: B:71:0x0215  */
    /* JADX WARN: Code duplicated, block: B:73:0x021d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List, vy.d] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [rt.uf] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [ry.r] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objU;
        int curEnterLessonIndex;
        List list;
        vt.n0 n0Var;
        Object objM;
        List list2;
        CourseUnitFinishStatus courseUnitFinishStatus;
        List list3;
        List list4;
        CourseUnitFinishStatus courseUnitFinishStatus2;
        Object objM2;
        List list5;
        ?? r15;
        ee eeVar;
        Object objU2;
        ee eeVar2;
        CourseUnitFinishStatus courseUnitFinishStatus3;
        int i11;
        ?? r16;
        String str;
        ?? arrayList;
        ?? ufVar;
        boolean z11;
        boolean z12;
        LessonState lessonState;
        LessonState lessonState2;
        boolean z13;
        boolean z14;
        boolean z15 = this.f50552t;
        List list6 = this.H;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f50551f;
        vt.n0 n0Var2 = this.L;
        boolean z16 = true;
        CourseUnit courseUnit = this.M;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            gp.r rVarH = ((bh.a1) this.K).h(((fr.o0) n0Var2).f27733a.keyLanguage, courseUnit.getUnitId());
            this.H = null;
            this.f50546a = list6;
            this.f50552t = z15;
            this.f50551f = 1;
            objU = uz.x0.u(rVarH, this);
            if (objU != aVar) {
            }
            return aVar;
        }
        if (i12 == 1) {
            list6 = this.f50546a;
            com.bumptech.glide.e.F(obj);
            objU = obj;
        } else {
            if (i12 == 2) {
                int i13 = this.f50550e;
                courseUnitFinishStatus = this.f50547b;
                list2 = this.f50546a;
                com.bumptech.glide.e.F(obj);
                curEnterLessonIndex = i13;
                list = null;
                n0Var = n0Var2;
                objM = obj;
                list3 = (List) objM;
                yz.f fVar = rz.o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                list4 = list;
                CourseUnitFinishStatus courseUnitFinishStatus4 = courseUnitFinishStatus;
                bt.n nVar = new bt.n(list2, courseUnitFinishStatus4, z15, n0Var, (vy.d) null);
                courseUnitFinishStatus2 = courseUnitFinishStatus4;
                z15 = z15;
                this.H = list4;
                this.f50546a = list4;
                this.f50547b = courseUnitFinishStatus2;
                this.f50548c = list3;
                this.f50552t = z15;
                this.f50550e = curEnterLessonIndex;
                this.f50551f = 3;
                objM2 = rz.e0.M(eVar, nVar, this);
                if (objM2 != aVar) {
                    list5 = list3;
                    r15 = list4;
                    eeVar = (ee) objM2;
                    gp.r rVar = new gp.r(new bp.t3((rs.f) this.N, courseUnit.getSortIndex(), (vy.d) r15, 15));
                    this.H = r15;
                    this.f50546a = r15;
                    this.f50547b = courseUnitFinishStatus2;
                    this.f50548c = list5;
                    this.f50549d = eeVar;
                    this.f50552t = z15;
                    this.f50550e = curEnterLessonIndex;
                    this.f50551f = 4;
                    objU2 = uz.x0.u(rVar, this);
                    if (objU2 != aVar) {
                        eeVar2 = eeVar;
                        courseUnitFinishStatus3 = courseUnitFinishStatus2;
                        i11 = curEnterLessonIndex;
                        r16 = r15;
                    }
                }
                return aVar;
            }
            if (i12 == 3) {
                int i14 = this.f50550e;
                List list7 = this.f50548c;
                CourseUnitFinishStatus courseUnitFinishStatus5 = this.f50547b;
                com.bumptech.glide.e.F(obj);
                list5 = list7;
                courseUnitFinishStatus2 = courseUnitFinishStatus5;
                curEnterLessonIndex = i14;
                r15 = 0;
                objM2 = obj;
                n0Var = n0Var2;
                eeVar = (ee) objM2;
                gp.r rVar2 = new gp.r(new bp.t3((rs.f) this.N, courseUnit.getSortIndex(), (vy.d) r15, 15));
                this.H = r15;
                this.f50546a = r15;
                this.f50547b = courseUnitFinishStatus2;
                this.f50548c = list5;
                this.f50549d = eeVar;
                this.f50552t = z15;
                this.f50550e = curEnterLessonIndex;
                this.f50551f = 4;
                objU2 = uz.x0.u(rVar2, this);
                if (objU2 != aVar) {
                    eeVar2 = eeVar;
                    courseUnitFinishStatus3 = courseUnitFinishStatus2;
                    i11 = curEnterLessonIndex;
                    r16 = r15;
                }
                return aVar;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f50550e;
            ee eeVar3 = this.f50549d;
            list5 = this.f50548c;
            courseUnitFinishStatus3 = this.f50547b;
            com.bumptech.glide.e.F(obj);
            eeVar2 = eeVar3;
            r16 = 0;
            n0Var = n0Var2;
            objU2 = obj;
        }
        List list8 = list5;
        str = (String) objU2;
        if (xt.d.i(((fr.o0) n0Var).f27733a.keyLanguage)) {
            int sortIndex = courseUnit.getSortIndex();
            long unitId = courseUnit.getUnitId();
            StoryLessonType storyLessonType = StoryLessonType.TypeStoryReading;
            if (courseUnitFinishStatus3.getStoryReading()) {
                lessonState = LessonState.StateRedo;
            } else {
                lessonState = LessonState.StateOpen;
            }
            sf sfVar = new sf(sortIndex, unitId, lessonState, storyLessonType, str);
            int sortIndex2 = courseUnit.getSortIndex();
            long unitId2 = courseUnit.getUnitId();
            StoryLessonType storyLessonType2 = StoryLessonType.TypeStoryListening;
            if (courseUnitFinishStatus3.getStorySpeaking()) {
                lessonState2 = LessonState.StateRedo;
            } else {
                lessonState2 = LessonState.StateOpen;
            }
            List<sf> listL = ns.o.L(sfVar, new sf(sortIndex2, unitId2, lessonState2, storyLessonType2, str), new sf(courseUnit.getSortIndex(), courseUnit.getUnitId(), LessonState.StateOpen, StoryLessonType.TypeStoryLeaderBoard, str));
            arrayList = new ArrayList(ry.n.W(listL, 10));
            for (sf sfVar2 : listL) {
                if (!z15 || e(n0Var, sfVar2.f50390a)) {
                    z13 = z16;
                } else {
                    z13 = false;
                }
                if (i11 == ff.h.i(sfVar2)) {
                    z14 = z16;
                } else {
                    z14 = false;
                }
                int i15 = sfVar2.f50390a;
                long j11 = sfVar2.f50391b;
                LessonState lessonState3 = sfVar2.f50392c;
                StoryLessonType lessonType = sfVar2.f50393d;
                String userDisplayCount = sfVar2.f50395f;
                kotlin.jvm.internal.m.f(lessonState3, "lessonState");
                kotlin.jvm.internal.m.f(lessonType, "lessonType");
                kotlin.jvm.internal.m.f(userDisplayCount, "userDisplayCount");
                arrayList.add(new sf(i15, j11, lessonState3, lessonType, z13, userDisplayCount, z14));
                z16 = true;
            }
        } else {
            arrayList = ry.r.f50854a;
        }
        ?? r21 = arrayList;
        if (courseUnit.getDescription().length() > 0) {
            int sortIndex3 = courseUnit.getSortIndex();
            long unitId3 = courseUnit.getUnitId();
            if (!z15 || e(n0Var, courseUnit.getSortIndex())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 == -2) {
                z12 = true;
            } else {
                z12 = false;
            }
            ufVar = new uf(sortIndex3, unitId3, z11, z12);
        } else {
            ufVar = r16;
        }
        return new f4(this.M, list8, ufVar, eeVar2, r21, courseUnitFinishStatus3.getTipsReading(), ff.h.r(courseUnit.getActiveTopBannerRes()));
        CourseUnitFinishStatus courseUnitFinishStatus6 = (CourseUnitFinishStatus) objU;
        curEnterLessonIndex = courseUnitFinishStatus6.getCurEnterLessonIndex();
        yz.f fVar2 = rz.o0.f50940a;
        yz.e eVar2 = yz.e.f58387a;
        List list9 = list6;
        bt.t5 t5Var = new bt.t5(list9, z15, n0Var2, (vy.d) null, 7);
        list = null;
        n0Var = n0Var2;
        this.H = null;
        this.f50546a = list9;
        this.f50547b = courseUnitFinishStatus6;
        this.f50552t = z15;
        this.f50550e = curEnterLessonIndex;
        this.f50551f = 2;
        objM = rz.e0.M(eVar2, t5Var, this);
        if (objM != aVar) {
            list2 = list9;
            courseUnitFinishStatus = courseUnitFinishStatus6;
            list3 = (List) objM;
            yz.f fVar3 = rz.o0.f50940a;
            yz.e eVar3 = yz.e.f58387a;
            list4 = list;
            CourseUnitFinishStatus courseUnitFinishStatus7 = courseUnitFinishStatus;
            bt.n nVar2 = new bt.n(list2, courseUnitFinishStatus7, z15, n0Var, (vy.d) null);
            courseUnitFinishStatus2 = courseUnitFinishStatus7;
            z15 = z15;
            this.H = list4;
            this.f50546a = list4;
            this.f50547b = courseUnitFinishStatus2;
            this.f50548c = list3;
            this.f50552t = z15;
            this.f50550e = curEnterLessonIndex;
            this.f50551f = 3;
            objM2 = rz.e0.M(eVar3, nVar2, this);
            if (objM2 != aVar) {
                list5 = list3;
                r15 = list4;
                eeVar = (ee) objM2;
                gp.r rVar3 = new gp.r(new bp.t3((rs.f) this.N, courseUnit.getSortIndex(), (vy.d) r15, 15));
                this.H = r15;
                this.f50546a = r15;
                this.f50547b = courseUnitFinishStatus2;
                this.f50548c = list5;
                this.f50549d = eeVar;
                this.f50552t = z15;
                this.f50550e = curEnterLessonIndex;
                this.f50551f = 4;
                objU2 = uz.x0.u(rVar3, this);
                if (objU2 != aVar) {
                    eeVar2 = eeVar;
                    courseUnitFinishStatus3 = courseUnitFinishStatus2;
                    i11 = curEnterLessonIndex;
                    r16 = r15;
                    List list10 = list5;
                    str = (String) objU2;
                    if (xt.d.i(((fr.o0) n0Var).f27733a.keyLanguage)) {
                        int sortIndex4 = courseUnit.getSortIndex();
                        long unitId4 = courseUnit.getUnitId();
                        StoryLessonType storyLessonType3 = StoryLessonType.TypeStoryReading;
                        if (courseUnitFinishStatus3.getStoryReading()) {
                            lessonState = LessonState.StateRedo;
                        } else {
                            lessonState = LessonState.StateOpen;
                        }
                        sf sfVar3 = new sf(sortIndex4, unitId4, lessonState, storyLessonType3, str);
                        int sortIndex5 = courseUnit.getSortIndex();
                        long unitId5 = courseUnit.getUnitId();
                        StoryLessonType storyLessonType4 = StoryLessonType.TypeStoryListening;
                        if (courseUnitFinishStatus3.getStorySpeaking()) {
                            lessonState2 = LessonState.StateRedo;
                        } else {
                            lessonState2 = LessonState.StateOpen;
                        }
                        List<sf> listL2 = ns.o.L(sfVar3, new sf(sortIndex5, unitId5, lessonState2, storyLessonType4, str), new sf(courseUnit.getSortIndex(), courseUnit.getUnitId(), LessonState.StateOpen, StoryLessonType.TypeStoryLeaderBoard, str));
                        arrayList = new ArrayList(ry.n.W(listL2, 10));
                        while (r2.hasNext()) {
                            if (z15) {
                                z13 = z16;
                            } else {
                                z13 = z16;
                            }
                            if (i11 == ff.h.i(sfVar2)) {
                                z14 = z16;
                            } else {
                                z14 = false;
                            }
                            int i16 = sfVar2.f50390a;
                            long j12 = sfVar2.f50391b;
                            LessonState lessonState4 = sfVar2.f50392c;
                            StoryLessonType lessonType2 = sfVar2.f50393d;
                            String userDisplayCount2 = sfVar2.f50395f;
                            kotlin.jvm.internal.m.f(lessonState4, "lessonState");
                            kotlin.jvm.internal.m.f(lessonType2, "lessonType");
                            kotlin.jvm.internal.m.f(userDisplayCount2, "userDisplayCount");
                            arrayList.add(new sf(i16, j12, lessonState4, lessonType2, z13, userDisplayCount2, z14));
                            z16 = true;
                        }
                    } else {
                        arrayList = ry.r.f50854a;
                    }
                    ?? r22 = arrayList;
                    if (courseUnit.getDescription().length() > 0) {
                        int sortIndex6 = courseUnit.getSortIndex();
                        long unitId6 = courseUnit.getUnitId();
                        if (z15) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (i11 == -2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ufVar = new uf(sortIndex6, unitId6, z11, z12);
                    } else {
                        ufVar = r16;
                    }
                    return new f4(this.M, list10, ufVar, eeVar2, r22, courseUnitFinishStatus3.getTipsReading(), ff.h.r(courseUnit.getActiveTopBannerRes()));
                }
            }
        }
        return aVar;
    }
}
