package ys;

import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseLessonFinishStatus;
import com.lingodeer.data.model.CourseLessonPracticeType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x1 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58321a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f58322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f58323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f58324d;

    public /* synthetic */ x1(fz.e eVar, l1.b1 b1Var, l1.b1 b1Var2) {
        this.f58322b = eVar;
        this.f58323c = b1Var;
        this.f58324d = b1Var2;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f58321a) {
            case 0:
                j0.v AppModalBottomSheet = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppModalBottomSheet, "$this$AppModalBottomSheet");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    final l1.b1 b1Var = this.f58323c;
                    final CourseLesson courseLesson = (CourseLesson) b1Var.getValue();
                    if (courseLesson == null) {
                        sVar.d0(-1067359512);
                        sVar.p(false);
                    } else {
                        sVar.d0(-1067359511);
                        boolean canAccess = courseLesson.getCanAccess();
                        boolean canReview = courseLesson.getCanReview();
                        CourseLessonFinishStatus finishStatus = courseLesson.getFinishStatus();
                        boolean showPracticeSpeaking = courseLesson.getShowPracticeSpeaking();
                        boolean showPracticeComprehensive = courseLesson.getShowPracticeComprehensive();
                        boolean showCharacterDrill = courseLesson.getShowCharacterDrill();
                        final fz.e eVar = this.f58322b;
                        boolean zF = sVar.f(eVar);
                        Object objQ = sVar.Q();
                        final l1.b1 b1Var2 = this.f58324d;
                        l1.g gVar = l1.m.f39353a;
                        if (zF || objQ == gVar) {
                            final int i11 = 2;
                            objQ = new fz.a() { // from class: ys.y1
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            b1Var2.setValue(Boolean.FALSE);
                                            CourseLesson courseLesson2 = (CourseLesson) b1Var.getValue();
                                            if (courseLesson2 != null) {
                                                eVar.invoke(courseLesson2, CourseLessonPracticeType.CourseLessonDialogueSpeaking);
                                            }
                                            break;
                                        case 1:
                                            b1Var2.setValue(Boolean.FALSE);
                                            CourseLesson courseLesson3 = (CourseLesson) b1Var.getValue();
                                            if (courseLesson3 != null) {
                                                eVar.invoke(courseLesson3, CourseLessonPracticeType.CourseLessonDialogueSpeakingRolePlay);
                                            }
                                            break;
                                        default:
                                            b1Var2.setValue(Boolean.FALSE);
                                            CourseLesson courseLesson4 = (CourseLesson) b1Var.getValue();
                                            if (courseLesson4 != null) {
                                                eVar.invoke(courseLesson4, CourseLessonPracticeType.CourseLessonRedo);
                                            }
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar.o0(objQ);
                        }
                        fz.a aVar = (fz.a) objQ;
                        boolean zF2 = sVar.f(eVar) | sVar.h(courseLesson);
                        Object objQ2 = sVar.Q();
                        if (zF2 || objQ2 == gVar) {
                            final int i12 = 2;
                            objQ2 = new fz.a() { // from class: ys.w1
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewCharacterDrill);
                                            break;
                                        case 1:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewSpeaking);
                                            break;
                                        case 2:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReview);
                                            break;
                                        case 3:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewListening);
                                            break;
                                        default:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewSpelling);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar.o0(objQ2);
                        }
                        fz.a aVar2 = (fz.a) objQ2;
                        boolean zF3 = sVar.f(eVar) | sVar.h(courseLesson);
                        Object objQ3 = sVar.Q();
                        if (zF3 || objQ3 == gVar) {
                            final int i13 = 3;
                            objQ3 = new fz.a() { // from class: ys.w1
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewCharacterDrill);
                                            break;
                                        case 1:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewSpeaking);
                                            break;
                                        case 2:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReview);
                                            break;
                                        case 3:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewListening);
                                            break;
                                        default:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewSpelling);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar.o0(objQ3);
                        }
                        fz.a aVar3 = (fz.a) objQ3;
                        boolean zF4 = sVar.f(eVar) | sVar.h(courseLesson);
                        Object objQ4 = sVar.Q();
                        if (zF4 || objQ4 == gVar) {
                            final int i14 = 4;
                            objQ4 = new fz.a() { // from class: ys.w1
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i14) {
                                        case 0:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewCharacterDrill);
                                            break;
                                        case 1:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewSpeaking);
                                            break;
                                        case 2:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReview);
                                            break;
                                        case 3:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewListening);
                                            break;
                                        default:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewSpelling);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar.o0(objQ4);
                        }
                        fz.a aVar4 = (fz.a) objQ4;
                        boolean zF5 = sVar.f(eVar) | sVar.h(courseLesson);
                        Object objQ5 = sVar.Q();
                        if (zF5 || objQ5 == gVar) {
                            final int i15 = 0;
                            objQ5 = new fz.a() { // from class: ys.w1
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewCharacterDrill);
                                            break;
                                        case 1:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewSpeaking);
                                            break;
                                        case 2:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReview);
                                            break;
                                        case 3:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewListening);
                                            break;
                                        default:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewSpelling);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar.o0(objQ5);
                        }
                        fz.a aVar5 = (fz.a) objQ5;
                        boolean zF6 = sVar.f(eVar) | sVar.h(courseLesson);
                        Object objQ6 = sVar.Q();
                        if (zF6 || objQ6 == gVar) {
                            final int i16 = 1;
                            objQ6 = new fz.a() { // from class: ys.w1
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewCharacterDrill);
                                            break;
                                        case 1:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewSpeaking);
                                            break;
                                        case 2:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReview);
                                            break;
                                        case 3:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewListening);
                                            break;
                                        default:
                                            b1Var2.setValue(Boolean.FALSE);
                                            eVar.invoke(courseLesson, CourseLessonPracticeType.CourseLessonReviewSpelling);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar.o0(objQ6);
                        }
                        a.g(finishStatus, showPracticeSpeaking, showPracticeComprehensive, showCharacterDrill, canAccess, canReview, aVar, aVar2, aVar3, aVar4, aVar5, (fz.a) objQ6, sVar, 0);
                        sVar.p(false);
                    }
                } else {
                    sVar.W();
                }
                break;
            default:
                j0.v AppModalBottomSheet2 = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppModalBottomSheet2, "$this$AppModalBottomSheet");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    final fz.e eVar2 = this.f58322b;
                    boolean zF7 = sVar2.f(eVar2);
                    Object objQ7 = sVar2.Q();
                    final l1.b1 b1Var3 = this.f58323c;
                    final l1.b1 b1Var4 = this.f58324d;
                    l1.g gVar2 = l1.m.f39353a;
                    if (zF7 || objQ7 == gVar2) {
                        final int i17 = 0;
                        objQ7 = new fz.a() { // from class: ys.y1
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        b1Var3.setValue(Boolean.FALSE);
                                        CourseLesson courseLesson2 = (CourseLesson) b1Var4.getValue();
                                        if (courseLesson2 != null) {
                                            eVar2.invoke(courseLesson2, CourseLessonPracticeType.CourseLessonDialogueSpeaking);
                                        }
                                        break;
                                    case 1:
                                        b1Var3.setValue(Boolean.FALSE);
                                        CourseLesson courseLesson3 = (CourseLesson) b1Var4.getValue();
                                        if (courseLesson3 != null) {
                                            eVar2.invoke(courseLesson3, CourseLessonPracticeType.CourseLessonDialogueSpeakingRolePlay);
                                        }
                                        break;
                                    default:
                                        b1Var3.setValue(Boolean.FALSE);
                                        CourseLesson courseLesson4 = (CourseLesson) b1Var4.getValue();
                                        if (courseLesson4 != null) {
                                            eVar2.invoke(courseLesson4, CourseLessonPracticeType.CourseLessonRedo);
                                        }
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    fz.a aVar6 = (fz.a) objQ7;
                    boolean zF8 = sVar2.f(eVar2);
                    Object objQ8 = sVar2.Q();
                    if (zF8 || objQ8 == gVar2) {
                        final int i18 = 1;
                        objQ8 = new fz.a() { // from class: ys.y1
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        b1Var3.setValue(Boolean.FALSE);
                                        CourseLesson courseLesson2 = (CourseLesson) b1Var4.getValue();
                                        if (courseLesson2 != null) {
                                            eVar2.invoke(courseLesson2, CourseLessonPracticeType.CourseLessonDialogueSpeaking);
                                        }
                                        break;
                                    case 1:
                                        b1Var3.setValue(Boolean.FALSE);
                                        CourseLesson courseLesson3 = (CourseLesson) b1Var4.getValue();
                                        if (courseLesson3 != null) {
                                            eVar2.invoke(courseLesson3, CourseLessonPracticeType.CourseLessonDialogueSpeakingRolePlay);
                                        }
                                        break;
                                    default:
                                        b1Var3.setValue(Boolean.FALSE);
                                        CourseLesson courseLesson4 = (CourseLesson) b1Var4.getValue();
                                        if (courseLesson4 != null) {
                                            eVar2.invoke(courseLesson4, CourseLessonPracticeType.CourseLessonRedo);
                                        }
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar2.o0(objQ8);
                    }
                    a.c(aVar6, (fz.a) objQ8, sVar2, 0);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ x1(l1.b1 b1Var, fz.e eVar, l1.b1 b1Var2) {
        this.f58323c = b1Var;
        this.f58322b = eVar;
        this.f58324d = b1Var2;
    }
}
