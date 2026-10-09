package ch;

import android.content.Intent;
import com.lingo.course.ui.CourseTestActivity;
import com.lingo.course.ui.CourseTestDialogueActivity;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingo.lingoskill.ui.learn.BaseAudioLessonIndexActivity;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseTestIndexActivity f7063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CourseLesson f7064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(CourseTestIndexActivity courseTestIndexActivity, CourseLesson courseLesson, vy.d dVar, int i11) {
        super(2, dVar);
        this.f7061a = i11;
        this.f7063c = courseTestIndexActivity;
        this.f7064d = courseLesson;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f7061a) {
            case 0:
                return new k0(this.f7063c, this.f7064d, dVar, 0);
            case 1:
                return new k0(this.f7063c, this.f7064d, dVar, 1);
            case 2:
                return new k0(this.f7063c, this.f7064d, dVar, 2);
            case 3:
                return new k0(this.f7063c, this.f7064d, dVar, 3);
            case 4:
                return new k0(this.f7063c, this.f7064d, dVar, 4);
            case 5:
                return new k0(this.f7063c, this.f7064d, dVar, 5);
            case 6:
                return new k0(this.f7063c, this.f7064d, dVar, 6);
            case 7:
                return new k0(this.f7063c, this.f7064d, dVar, 7);
            case 8:
                return new k0(this.f7063c, this.f7064d, dVar, 8);
            case 9:
                return new k0(this.f7063c, this.f7064d, dVar, 9);
            default:
                return new k0(this.f7063c, this.f7064d, dVar, 10);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f7061a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return ((k0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f7061a;
        qy.b0 b0Var = qy.b0.f48488a;
        final CourseTestIndexActivity courseTestIndexActivity = this.f7063c;
        final int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f7062b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                pt.d dVar = (pt.d) courseTestIndexActivity.H.getValue();
                ur.a aVarM = courseTestIndexActivity.m();
                fz.e eVar = new fz.e() { // from class: ch.j0
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        int i14 = i12;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        CourseLesson courseLesson = (CourseLesson) obj2;
                        switch (i14) {
                            case 0:
                                String str = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity2 = courseTestIndexActivity;
                                i.c cVar = courseTestIndexActivity2.M;
                                int i15 = CourseTestActivity.R;
                                cVar.a(a.d(courseTestIndexActivity2, courseLesson.getLessonId(), courseLesson.getUnitId(), courseLesson.getSortIndex(), courseLesson.getUnitSortIndex(), false, str));
                                break;
                            case 1:
                                String str2 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity3 = courseTestIndexActivity;
                                i.c cVar2 = courseTestIndexActivity3.M;
                                int i16 = CourseTestDialogueActivity.L;
                                cVar2.a(a.e(courseTestIndexActivity3, courseLesson.getLessonId(), courseLesson.getUnitId(), str2));
                                break;
                            case 2:
                                String str3 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity4 = courseTestIndexActivity;
                                i.c cVar3 = courseTestIndexActivity4.M;
                                int i17 = CourseTestActivity.R;
                                cVar3.a(a.d(courseTestIndexActivity4, courseLesson.getLessonId(), courseLesson.getUnitId(), courseLesson.getSortIndex(), courseLesson.getUnitSortIndex(), false, str3));
                                break;
                            case 3:
                                String str4 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity5 = courseTestIndexActivity;
                                i.c cVar4 = courseTestIndexActivity5.M;
                                int i18 = CourseTestActivity.R;
                                cVar4.a(a.d(courseTestIndexActivity5, courseLesson.getLessonId(), courseLesson.getUnitId(), courseLesson.getSortIndex(), courseLesson.getUnitSortIndex(), false, str4));
                                break;
                            case 4:
                                String str5 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity6 = courseTestIndexActivity;
                                i.c cVar5 = courseTestIndexActivity6.M;
                                int i19 = CourseTestActivity.R;
                                cVar5.a(a.d(courseTestIndexActivity6, courseLesson.getLessonId(), courseLesson.getUnitId(), courseLesson.getSortIndex(), courseLesson.getUnitSortIndex(), false, str5));
                                break;
                            case 5:
                                String str6 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity7 = courseTestIndexActivity;
                                i.c cVar6 = courseTestIndexActivity7.M;
                                int i21 = CourseTestActivity.R;
                                cVar6.a(a.d(courseTestIndexActivity7, courseLesson.getLessonId(), courseLesson.getUnitId(), courseLesson.getSortIndex(), courseLesson.getUnitSortIndex(), false, str6));
                                break;
                            case 6:
                                String str7 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity8 = courseTestIndexActivity;
                                i.c cVar7 = courseTestIndexActivity8.M;
                                int i22 = CourseTestActivity.R;
                                cVar7.a(a.d(courseTestIndexActivity8, courseLesson.getLessonId(), courseLesson.getUnitId(), courseLesson.getSortIndex(), courseLesson.getUnitSortIndex(), false, str7));
                                break;
                            case 7:
                                String str8 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity9 = courseTestIndexActivity;
                                i.c cVar8 = courseTestIndexActivity9.M;
                                int i23 = CourseTestActivity.R;
                                cVar8.a(a.d(courseTestIndexActivity9, courseLesson.getLessonId(), courseLesson.getUnitId(), courseLesson.getSortIndex(), courseLesson.getUnitSortIndex(), false, str8));
                                break;
                            case 8:
                                String str9 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity10 = courseTestIndexActivity;
                                i.c cVar9 = courseTestIndexActivity10.M;
                                int i24 = CourseTestActivity.R;
                                cVar9.a(a.d(courseTestIndexActivity10, courseLesson.getLessonId(), courseLesson.getUnitId(), courseLesson.getSortIndex(), courseLesson.getUnitSortIndex(), courseLesson.getLastRegex().length() == 0, str9));
                                break;
                            default:
                                String str10 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity11 = courseTestIndexActivity;
                                i.c cVar10 = courseTestIndexActivity11.M;
                                int i25 = CourseTestDialogueActivity.L;
                                cVar10.a(a.e(courseTestIndexActivity11, courseLesson.getLessonId(), courseLesson.getUnitId(), str10));
                                break;
                        }
                        return b0Var2;
                    }
                };
                this.f7062b = 1;
                return dVar.a(this.f7064d, "COURSE_DIALOG_SPEAKING", aVarM, eVar, this) == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f7062b;
                CourseLesson courseLesson = this.f7064d;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    long unitId = courseLesson.getUnitId();
                    int sortIndex = courseLesson.getSortIndex();
                    this.f7062b = 1;
                    if (CourseTestIndexActivity.p(courseTestIndexActivity, unitId, sortIndex, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                int i15 = BaseAudioLessonIndexActivity.Q;
                String unitName = courseLesson.getUnitName();
                long unitId2 = courseLesson.getUnitId();
                kotlin.jvm.internal.m.f(unitName, OCBJEWZHh.PnGU);
                Intent intent = new Intent(courseTestIndexActivity, (Class<?>) BaseAudioLessonIndexActivity.class);
                intent.putExtra(INTENTS.EXTRA_STRING, unitName);
                intent.putExtra(INTENTS.EXTRA_LONG, unitId2);
                courseTestIndexActivity.startActivity(intent);
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f7062b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                pt.d dVar2 = (pt.d) courseTestIndexActivity.H.getValue();
                ur.a aVarM2 = courseTestIndexActivity.m();
                final int i17 = 0;
                fz.e eVar2 = new fz.e() { // from class: ch.j0
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        int i18 = i17;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        CourseLesson courseLesson2 = (CourseLesson) obj2;
                        switch (i18) {
                            case 0:
                                String str = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity2 = courseTestIndexActivity;
                                i.c cVar = courseTestIndexActivity2.M;
                                int i19 = CourseTestActivity.R;
                                cVar.a(a.d(courseTestIndexActivity2, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str));
                                break;
                            case 1:
                                String str2 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity3 = courseTestIndexActivity;
                                i.c cVar2 = courseTestIndexActivity3.M;
                                int i110 = CourseTestDialogueActivity.L;
                                cVar2.a(a.e(courseTestIndexActivity3, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str2));
                                break;
                            case 2:
                                String str3 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity4 = courseTestIndexActivity;
                                i.c cVar3 = courseTestIndexActivity4.M;
                                int i111 = CourseTestActivity.R;
                                cVar3.a(a.d(courseTestIndexActivity4, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str3));
                                break;
                            case 3:
                                String str4 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity5 = courseTestIndexActivity;
                                i.c cVar4 = courseTestIndexActivity5.M;
                                int i112 = CourseTestActivity.R;
                                cVar4.a(a.d(courseTestIndexActivity5, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str4));
                                break;
                            case 4:
                                String str5 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity6 = courseTestIndexActivity;
                                i.c cVar5 = courseTestIndexActivity6.M;
                                int i113 = CourseTestActivity.R;
                                cVar5.a(a.d(courseTestIndexActivity6, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str5));
                                break;
                            case 5:
                                String str6 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity7 = courseTestIndexActivity;
                                i.c cVar6 = courseTestIndexActivity7.M;
                                int i21 = CourseTestActivity.R;
                                cVar6.a(a.d(courseTestIndexActivity7, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str6));
                                break;
                            case 6:
                                String str7 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity8 = courseTestIndexActivity;
                                i.c cVar7 = courseTestIndexActivity8.M;
                                int i22 = CourseTestActivity.R;
                                cVar7.a(a.d(courseTestIndexActivity8, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str7));
                                break;
                            case 7:
                                String str8 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity9 = courseTestIndexActivity;
                                i.c cVar8 = courseTestIndexActivity9.M;
                                int i23 = CourseTestActivity.R;
                                cVar8.a(a.d(courseTestIndexActivity9, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str8));
                                break;
                            case 8:
                                String str9 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity10 = courseTestIndexActivity;
                                i.c cVar9 = courseTestIndexActivity10.M;
                                int i24 = CourseTestActivity.R;
                                cVar9.a(a.d(courseTestIndexActivity10, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), courseLesson2.getLastRegex().length() == 0, str9));
                                break;
                            default:
                                String str10 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity11 = courseTestIndexActivity;
                                i.c cVar10 = courseTestIndexActivity11.M;
                                int i25 = CourseTestDialogueActivity.L;
                                cVar10.a(a.e(courseTestIndexActivity11, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str10));
                                break;
                        }
                        return b0Var2;
                    }
                };
                this.f7062b = 1;
                return dVar2.a(this.f7064d, "COURSE", aVarM2, eVar2, this) == aVar3 ? aVar3 : b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f7062b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                pt.d dVar3 = (pt.d) courseTestIndexActivity.H.getValue();
                ur.a aVarM3 = courseTestIndexActivity.m();
                final int i19 = 2;
                fz.e eVar3 = new fz.e() { // from class: ch.j0
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        int i110 = i19;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        CourseLesson courseLesson2 = (CourseLesson) obj2;
                        switch (i110) {
                            case 0:
                                String str = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity2 = courseTestIndexActivity;
                                i.c cVar = courseTestIndexActivity2.M;
                                int i111 = CourseTestActivity.R;
                                cVar.a(a.d(courseTestIndexActivity2, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str));
                                break;
                            case 1:
                                String str2 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity3 = courseTestIndexActivity;
                                i.c cVar2 = courseTestIndexActivity3.M;
                                int i112 = CourseTestDialogueActivity.L;
                                cVar2.a(a.e(courseTestIndexActivity3, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str2));
                                break;
                            case 2:
                                String str3 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity4 = courseTestIndexActivity;
                                i.c cVar3 = courseTestIndexActivity4.M;
                                int i113 = CourseTestActivity.R;
                                cVar3.a(a.d(courseTestIndexActivity4, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str3));
                                break;
                            case 3:
                                String str4 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity5 = courseTestIndexActivity;
                                i.c cVar4 = courseTestIndexActivity5.M;
                                int i114 = CourseTestActivity.R;
                                cVar4.a(a.d(courseTestIndexActivity5, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str4));
                                break;
                            case 4:
                                String str5 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity6 = courseTestIndexActivity;
                                i.c cVar5 = courseTestIndexActivity6.M;
                                int i115 = CourseTestActivity.R;
                                cVar5.a(a.d(courseTestIndexActivity6, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str5));
                                break;
                            case 5:
                                String str6 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity7 = courseTestIndexActivity;
                                i.c cVar6 = courseTestIndexActivity7.M;
                                int i21 = CourseTestActivity.R;
                                cVar6.a(a.d(courseTestIndexActivity7, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str6));
                                break;
                            case 6:
                                String str7 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity8 = courseTestIndexActivity;
                                i.c cVar7 = courseTestIndexActivity8.M;
                                int i22 = CourseTestActivity.R;
                                cVar7.a(a.d(courseTestIndexActivity8, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str7));
                                break;
                            case 7:
                                String str8 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity9 = courseTestIndexActivity;
                                i.c cVar8 = courseTestIndexActivity9.M;
                                int i23 = CourseTestActivity.R;
                                cVar8.a(a.d(courseTestIndexActivity9, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str8));
                                break;
                            case 8:
                                String str9 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity10 = courseTestIndexActivity;
                                i.c cVar9 = courseTestIndexActivity10.M;
                                int i24 = CourseTestActivity.R;
                                cVar9.a(a.d(courseTestIndexActivity10, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), courseLesson2.getLastRegex().length() == 0, str9));
                                break;
                            default:
                                String str10 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity11 = courseTestIndexActivity;
                                i.c cVar10 = courseTestIndexActivity11.M;
                                int i25 = CourseTestDialogueActivity.L;
                                cVar10.a(a.e(courseTestIndexActivity11, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str10));
                                break;
                        }
                        return b0Var2;
                    }
                };
                this.f7062b = 1;
                return dVar3.a(this.f7064d, "COURSE_REDO", aVarM3, eVar3, this) == aVar4 ? aVar4 : b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f7062b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                pt.d dVar4 = (pt.d) courseTestIndexActivity.H.getValue();
                ur.a aVarM4 = courseTestIndexActivity.m();
                final int i22 = 3;
                fz.e eVar4 = new fz.e() { // from class: ch.j0
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        int i110 = i22;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        CourseLesson courseLesson2 = (CourseLesson) obj2;
                        switch (i110) {
                            case 0:
                                String str = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity2 = courseTestIndexActivity;
                                i.c cVar = courseTestIndexActivity2.M;
                                int i111 = CourseTestActivity.R;
                                cVar.a(a.d(courseTestIndexActivity2, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str));
                                break;
                            case 1:
                                String str2 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity3 = courseTestIndexActivity;
                                i.c cVar2 = courseTestIndexActivity3.M;
                                int i112 = CourseTestDialogueActivity.L;
                                cVar2.a(a.e(courseTestIndexActivity3, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str2));
                                break;
                            case 2:
                                String str3 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity4 = courseTestIndexActivity;
                                i.c cVar3 = courseTestIndexActivity4.M;
                                int i113 = CourseTestActivity.R;
                                cVar3.a(a.d(courseTestIndexActivity4, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str3));
                                break;
                            case 3:
                                String str4 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity5 = courseTestIndexActivity;
                                i.c cVar4 = courseTestIndexActivity5.M;
                                int i114 = CourseTestActivity.R;
                                cVar4.a(a.d(courseTestIndexActivity5, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str4));
                                break;
                            case 4:
                                String str5 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity6 = courseTestIndexActivity;
                                i.c cVar5 = courseTestIndexActivity6.M;
                                int i115 = CourseTestActivity.R;
                                cVar5.a(a.d(courseTestIndexActivity6, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str5));
                                break;
                            case 5:
                                String str6 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity7 = courseTestIndexActivity;
                                i.c cVar6 = courseTestIndexActivity7.M;
                                int i23 = CourseTestActivity.R;
                                cVar6.a(a.d(courseTestIndexActivity7, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str6));
                                break;
                            case 6:
                                String str7 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity8 = courseTestIndexActivity;
                                i.c cVar7 = courseTestIndexActivity8.M;
                                int i24 = CourseTestActivity.R;
                                cVar7.a(a.d(courseTestIndexActivity8, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str7));
                                break;
                            case 7:
                                String str8 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity9 = courseTestIndexActivity;
                                i.c cVar8 = courseTestIndexActivity9.M;
                                int i25 = CourseTestActivity.R;
                                cVar8.a(a.d(courseTestIndexActivity9, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str8));
                                break;
                            case 8:
                                String str9 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity10 = courseTestIndexActivity;
                                i.c cVar9 = courseTestIndexActivity10.M;
                                int i26 = CourseTestActivity.R;
                                cVar9.a(a.d(courseTestIndexActivity10, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), courseLesson2.getLastRegex().length() == 0, str9));
                                break;
                            default:
                                String str10 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity11 = courseTestIndexActivity;
                                i.c cVar10 = courseTestIndexActivity11.M;
                                int i27 = CourseTestDialogueActivity.L;
                                cVar10.a(a.e(courseTestIndexActivity11, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str10));
                                break;
                        }
                        return b0Var2;
                    }
                };
                this.f7062b = 1;
                return dVar4.a(this.f7064d, "COURSE_PRACTICE_COMPREHENSIVE", aVarM4, eVar4, this) == aVar5 ? aVar5 : b0Var;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f7062b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                pt.d dVar5 = (pt.d) courseTestIndexActivity.H.getValue();
                ur.a aVarM5 = courseTestIndexActivity.m();
                final int i24 = 4;
                fz.e eVar5 = new fz.e() { // from class: ch.j0
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        int i110 = i24;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        CourseLesson courseLesson2 = (CourseLesson) obj2;
                        switch (i110) {
                            case 0:
                                String str = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity2 = courseTestIndexActivity;
                                i.c cVar = courseTestIndexActivity2.M;
                                int i111 = CourseTestActivity.R;
                                cVar.a(a.d(courseTestIndexActivity2, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str));
                                break;
                            case 1:
                                String str2 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity3 = courseTestIndexActivity;
                                i.c cVar2 = courseTestIndexActivity3.M;
                                int i112 = CourseTestDialogueActivity.L;
                                cVar2.a(a.e(courseTestIndexActivity3, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str2));
                                break;
                            case 2:
                                String str3 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity4 = courseTestIndexActivity;
                                i.c cVar3 = courseTestIndexActivity4.M;
                                int i113 = CourseTestActivity.R;
                                cVar3.a(a.d(courseTestIndexActivity4, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str3));
                                break;
                            case 3:
                                String str4 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity5 = courseTestIndexActivity;
                                i.c cVar4 = courseTestIndexActivity5.M;
                                int i114 = CourseTestActivity.R;
                                cVar4.a(a.d(courseTestIndexActivity5, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str4));
                                break;
                            case 4:
                                String str5 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity6 = courseTestIndexActivity;
                                i.c cVar5 = courseTestIndexActivity6.M;
                                int i115 = CourseTestActivity.R;
                                cVar5.a(a.d(courseTestIndexActivity6, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str5));
                                break;
                            case 5:
                                String str6 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity7 = courseTestIndexActivity;
                                i.c cVar6 = courseTestIndexActivity7.M;
                                int i25 = CourseTestActivity.R;
                                cVar6.a(a.d(courseTestIndexActivity7, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str6));
                                break;
                            case 6:
                                String str7 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity8 = courseTestIndexActivity;
                                i.c cVar7 = courseTestIndexActivity8.M;
                                int i26 = CourseTestActivity.R;
                                cVar7.a(a.d(courseTestIndexActivity8, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str7));
                                break;
                            case 7:
                                String str8 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity9 = courseTestIndexActivity;
                                i.c cVar8 = courseTestIndexActivity9.M;
                                int i27 = CourseTestActivity.R;
                                cVar8.a(a.d(courseTestIndexActivity9, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str8));
                                break;
                            case 8:
                                String str9 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity10 = courseTestIndexActivity;
                                i.c cVar9 = courseTestIndexActivity10.M;
                                int i28 = CourseTestActivity.R;
                                cVar9.a(a.d(courseTestIndexActivity10, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), courseLesson2.getLastRegex().length() == 0, str9));
                                break;
                            default:
                                String str10 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity11 = courseTestIndexActivity;
                                i.c cVar10 = courseTestIndexActivity11.M;
                                int i29 = CourseTestDialogueActivity.L;
                                cVar10.a(a.e(courseTestIndexActivity11, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str10));
                                break;
                        }
                        return b0Var2;
                    }
                };
                this.f7062b = 1;
                return dVar5.a(this.f7064d, "COURSE_PRACTICE_LISTENING", aVarM5, eVar5, this) == aVar6 ? aVar6 : b0Var;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f7062b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                pt.d dVar6 = (pt.d) courseTestIndexActivity.H.getValue();
                ur.a aVarM6 = courseTestIndexActivity.m();
                final int i26 = 5;
                fz.e eVar6 = new fz.e() { // from class: ch.j0
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        int i110 = i26;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        CourseLesson courseLesson2 = (CourseLesson) obj2;
                        switch (i110) {
                            case 0:
                                String str = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity2 = courseTestIndexActivity;
                                i.c cVar = courseTestIndexActivity2.M;
                                int i111 = CourseTestActivity.R;
                                cVar.a(a.d(courseTestIndexActivity2, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str));
                                break;
                            case 1:
                                String str2 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity3 = courseTestIndexActivity;
                                i.c cVar2 = courseTestIndexActivity3.M;
                                int i112 = CourseTestDialogueActivity.L;
                                cVar2.a(a.e(courseTestIndexActivity3, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str2));
                                break;
                            case 2:
                                String str3 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity4 = courseTestIndexActivity;
                                i.c cVar3 = courseTestIndexActivity4.M;
                                int i113 = CourseTestActivity.R;
                                cVar3.a(a.d(courseTestIndexActivity4, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str3));
                                break;
                            case 3:
                                String str4 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity5 = courseTestIndexActivity;
                                i.c cVar4 = courseTestIndexActivity5.M;
                                int i114 = CourseTestActivity.R;
                                cVar4.a(a.d(courseTestIndexActivity5, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str4));
                                break;
                            case 4:
                                String str5 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity6 = courseTestIndexActivity;
                                i.c cVar5 = courseTestIndexActivity6.M;
                                int i115 = CourseTestActivity.R;
                                cVar5.a(a.d(courseTestIndexActivity6, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str5));
                                break;
                            case 5:
                                String str6 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity7 = courseTestIndexActivity;
                                i.c cVar6 = courseTestIndexActivity7.M;
                                int i27 = CourseTestActivity.R;
                                cVar6.a(a.d(courseTestIndexActivity7, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str6));
                                break;
                            case 6:
                                String str7 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity8 = courseTestIndexActivity;
                                i.c cVar7 = courseTestIndexActivity8.M;
                                int i28 = CourseTestActivity.R;
                                cVar7.a(a.d(courseTestIndexActivity8, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str7));
                                break;
                            case 7:
                                String str8 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity9 = courseTestIndexActivity;
                                i.c cVar8 = courseTestIndexActivity9.M;
                                int i29 = CourseTestActivity.R;
                                cVar8.a(a.d(courseTestIndexActivity9, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str8));
                                break;
                            case 8:
                                String str9 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity10 = courseTestIndexActivity;
                                i.c cVar9 = courseTestIndexActivity10.M;
                                int i210 = CourseTestActivity.R;
                                cVar9.a(a.d(courseTestIndexActivity10, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), courseLesson2.getLastRegex().length() == 0, str9));
                                break;
                            default:
                                String str10 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity11 = courseTestIndexActivity;
                                i.c cVar10 = courseTestIndexActivity11.M;
                                int i211 = CourseTestDialogueActivity.L;
                                cVar10.a(a.e(courseTestIndexActivity11, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str10));
                                break;
                        }
                        return b0Var2;
                    }
                };
                this.f7062b = 1;
                return dVar6.a(this.f7064d, "COURSE_PRACTICE_SPELLING", aVarM6, eVar6, this) == aVar7 ? aVar7 : b0Var;
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i27 = this.f7062b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                pt.d dVar7 = (pt.d) courseTestIndexActivity.H.getValue();
                ur.a aVarM7 = courseTestIndexActivity.m();
                final int i28 = 6;
                fz.e eVar7 = new fz.e() { // from class: ch.j0
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        int i110 = i28;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        CourseLesson courseLesson2 = (CourseLesson) obj2;
                        switch (i110) {
                            case 0:
                                String str = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity2 = courseTestIndexActivity;
                                i.c cVar = courseTestIndexActivity2.M;
                                int i111 = CourseTestActivity.R;
                                cVar.a(a.d(courseTestIndexActivity2, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str));
                                break;
                            case 1:
                                String str2 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity3 = courseTestIndexActivity;
                                i.c cVar2 = courseTestIndexActivity3.M;
                                int i112 = CourseTestDialogueActivity.L;
                                cVar2.a(a.e(courseTestIndexActivity3, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str2));
                                break;
                            case 2:
                                String str3 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity4 = courseTestIndexActivity;
                                i.c cVar3 = courseTestIndexActivity4.M;
                                int i113 = CourseTestActivity.R;
                                cVar3.a(a.d(courseTestIndexActivity4, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str3));
                                break;
                            case 3:
                                String str4 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity5 = courseTestIndexActivity;
                                i.c cVar4 = courseTestIndexActivity5.M;
                                int i114 = CourseTestActivity.R;
                                cVar4.a(a.d(courseTestIndexActivity5, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str4));
                                break;
                            case 4:
                                String str5 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity6 = courseTestIndexActivity;
                                i.c cVar5 = courseTestIndexActivity6.M;
                                int i115 = CourseTestActivity.R;
                                cVar5.a(a.d(courseTestIndexActivity6, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str5));
                                break;
                            case 5:
                                String str6 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity7 = courseTestIndexActivity;
                                i.c cVar6 = courseTestIndexActivity7.M;
                                int i29 = CourseTestActivity.R;
                                cVar6.a(a.d(courseTestIndexActivity7, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str6));
                                break;
                            case 6:
                                String str7 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity8 = courseTestIndexActivity;
                                i.c cVar7 = courseTestIndexActivity8.M;
                                int i210 = CourseTestActivity.R;
                                cVar7.a(a.d(courseTestIndexActivity8, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str7));
                                break;
                            case 7:
                                String str8 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity9 = courseTestIndexActivity;
                                i.c cVar8 = courseTestIndexActivity9.M;
                                int i211 = CourseTestActivity.R;
                                cVar8.a(a.d(courseTestIndexActivity9, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str8));
                                break;
                            case 8:
                                String str9 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity10 = courseTestIndexActivity;
                                i.c cVar9 = courseTestIndexActivity10.M;
                                int i212 = CourseTestActivity.R;
                                cVar9.a(a.d(courseTestIndexActivity10, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), courseLesson2.getLastRegex().length() == 0, str9));
                                break;
                            default:
                                String str10 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity11 = courseTestIndexActivity;
                                i.c cVar10 = courseTestIndexActivity11.M;
                                int i213 = CourseTestDialogueActivity.L;
                                cVar10.a(a.e(courseTestIndexActivity11, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str10));
                                break;
                        }
                        return b0Var2;
                    }
                };
                this.f7062b = 1;
                return dVar7.a(this.f7064d, "COURSE_PRACTICE_CHARACTER_DRILL", aVarM7, eVar7, this) == aVar8 ? aVar8 : b0Var;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i29 = this.f7062b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                pt.d dVar8 = (pt.d) courseTestIndexActivity.H.getValue();
                ur.a aVarM8 = courseTestIndexActivity.m();
                final int i30 = 7;
                fz.e eVar8 = new fz.e() { // from class: ch.j0
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        int i110 = i30;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        CourseLesson courseLesson2 = (CourseLesson) obj2;
                        switch (i110) {
                            case 0:
                                String str = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity2 = courseTestIndexActivity;
                                i.c cVar = courseTestIndexActivity2.M;
                                int i111 = CourseTestActivity.R;
                                cVar.a(a.d(courseTestIndexActivity2, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str));
                                break;
                            case 1:
                                String str2 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity3 = courseTestIndexActivity;
                                i.c cVar2 = courseTestIndexActivity3.M;
                                int i112 = CourseTestDialogueActivity.L;
                                cVar2.a(a.e(courseTestIndexActivity3, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str2));
                                break;
                            case 2:
                                String str3 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity4 = courseTestIndexActivity;
                                i.c cVar3 = courseTestIndexActivity4.M;
                                int i113 = CourseTestActivity.R;
                                cVar3.a(a.d(courseTestIndexActivity4, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str3));
                                break;
                            case 3:
                                String str4 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity5 = courseTestIndexActivity;
                                i.c cVar4 = courseTestIndexActivity5.M;
                                int i114 = CourseTestActivity.R;
                                cVar4.a(a.d(courseTestIndexActivity5, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str4));
                                break;
                            case 4:
                                String str5 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity6 = courseTestIndexActivity;
                                i.c cVar5 = courseTestIndexActivity6.M;
                                int i115 = CourseTestActivity.R;
                                cVar5.a(a.d(courseTestIndexActivity6, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str5));
                                break;
                            case 5:
                                String str6 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity7 = courseTestIndexActivity;
                                i.c cVar6 = courseTestIndexActivity7.M;
                                int i210 = CourseTestActivity.R;
                                cVar6.a(a.d(courseTestIndexActivity7, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str6));
                                break;
                            case 6:
                                String str7 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity8 = courseTestIndexActivity;
                                i.c cVar7 = courseTestIndexActivity8.M;
                                int i211 = CourseTestActivity.R;
                                cVar7.a(a.d(courseTestIndexActivity8, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str7));
                                break;
                            case 7:
                                String str8 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity9 = courseTestIndexActivity;
                                i.c cVar8 = courseTestIndexActivity9.M;
                                int i212 = CourseTestActivity.R;
                                cVar8.a(a.d(courseTestIndexActivity9, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str8));
                                break;
                            case 8:
                                String str9 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity10 = courseTestIndexActivity;
                                i.c cVar9 = courseTestIndexActivity10.M;
                                int i213 = CourseTestActivity.R;
                                cVar9.a(a.d(courseTestIndexActivity10, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), courseLesson2.getLastRegex().length() == 0, str9));
                                break;
                            default:
                                String str10 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity11 = courseTestIndexActivity;
                                i.c cVar10 = courseTestIndexActivity11.M;
                                int i214 = CourseTestDialogueActivity.L;
                                cVar10.a(a.e(courseTestIndexActivity11, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str10));
                                break;
                        }
                        return b0Var2;
                    }
                };
                this.f7062b = 1;
                return dVar8.a(this.f7064d, "COURSE_PRACTICE_SPEAKING", aVarM8, eVar8, this) == aVar9 ? aVar9 : b0Var;
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i31 = this.f7062b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                pt.d dVar9 = (pt.d) courseTestIndexActivity.H.getValue();
                ur.a aVarM9 = courseTestIndexActivity.m();
                final int i32 = 8;
                fz.e eVar9 = new fz.e() { // from class: ch.j0
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        int i110 = i32;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        CourseLesson courseLesson2 = (CourseLesson) obj2;
                        switch (i110) {
                            case 0:
                                String str = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity2 = courseTestIndexActivity;
                                i.c cVar = courseTestIndexActivity2.M;
                                int i111 = CourseTestActivity.R;
                                cVar.a(a.d(courseTestIndexActivity2, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str));
                                break;
                            case 1:
                                String str2 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity3 = courseTestIndexActivity;
                                i.c cVar2 = courseTestIndexActivity3.M;
                                int i112 = CourseTestDialogueActivity.L;
                                cVar2.a(a.e(courseTestIndexActivity3, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str2));
                                break;
                            case 2:
                                String str3 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity4 = courseTestIndexActivity;
                                i.c cVar3 = courseTestIndexActivity4.M;
                                int i113 = CourseTestActivity.R;
                                cVar3.a(a.d(courseTestIndexActivity4, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str3));
                                break;
                            case 3:
                                String str4 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity5 = courseTestIndexActivity;
                                i.c cVar4 = courseTestIndexActivity5.M;
                                int i114 = CourseTestActivity.R;
                                cVar4.a(a.d(courseTestIndexActivity5, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str4));
                                break;
                            case 4:
                                String str5 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity6 = courseTestIndexActivity;
                                i.c cVar5 = courseTestIndexActivity6.M;
                                int i115 = CourseTestActivity.R;
                                cVar5.a(a.d(courseTestIndexActivity6, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str5));
                                break;
                            case 5:
                                String str6 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity7 = courseTestIndexActivity;
                                i.c cVar6 = courseTestIndexActivity7.M;
                                int i210 = CourseTestActivity.R;
                                cVar6.a(a.d(courseTestIndexActivity7, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str6));
                                break;
                            case 6:
                                String str7 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity8 = courseTestIndexActivity;
                                i.c cVar7 = courseTestIndexActivity8.M;
                                int i211 = CourseTestActivity.R;
                                cVar7.a(a.d(courseTestIndexActivity8, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str7));
                                break;
                            case 7:
                                String str8 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity9 = courseTestIndexActivity;
                                i.c cVar8 = courseTestIndexActivity9.M;
                                int i212 = CourseTestActivity.R;
                                cVar8.a(a.d(courseTestIndexActivity9, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str8));
                                break;
                            case 8:
                                String str9 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity10 = courseTestIndexActivity;
                                i.c cVar9 = courseTestIndexActivity10.M;
                                int i213 = CourseTestActivity.R;
                                cVar9.a(a.d(courseTestIndexActivity10, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), courseLesson2.getLastRegex().length() == 0, str9));
                                break;
                            default:
                                String str10 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity11 = courseTestIndexActivity;
                                i.c cVar10 = courseTestIndexActivity11.M;
                                int i214 = CourseTestDialogueActivity.L;
                                cVar10.a(a.e(courseTestIndexActivity11, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str10));
                                break;
                        }
                        return b0Var2;
                    }
                };
                this.f7062b = 1;
                return dVar9.a(this.f7064d, "COURSE_DIALOG_WARM_UP", aVarM9, eVar9, this) == aVar10 ? aVar10 : b0Var;
            default:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i33 = this.f7062b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                pt.d dVar10 = (pt.d) courseTestIndexActivity.H.getValue();
                ur.a aVarM10 = courseTestIndexActivity.m();
                final int i34 = 9;
                fz.e eVar10 = new fz.e() { // from class: ch.j0
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        int i110 = i34;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        CourseLesson courseLesson2 = (CourseLesson) obj2;
                        switch (i110) {
                            case 0:
                                String str = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity2 = courseTestIndexActivity;
                                i.c cVar = courseTestIndexActivity2.M;
                                int i111 = CourseTestActivity.R;
                                cVar.a(a.d(courseTestIndexActivity2, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str));
                                break;
                            case 1:
                                String str2 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity3 = courseTestIndexActivity;
                                i.c cVar2 = courseTestIndexActivity3.M;
                                int i112 = CourseTestDialogueActivity.L;
                                cVar2.a(a.e(courseTestIndexActivity3, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str2));
                                break;
                            case 2:
                                String str3 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity4 = courseTestIndexActivity;
                                i.c cVar3 = courseTestIndexActivity4.M;
                                int i113 = CourseTestActivity.R;
                                cVar3.a(a.d(courseTestIndexActivity4, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str3));
                                break;
                            case 3:
                                String str4 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity5 = courseTestIndexActivity;
                                i.c cVar4 = courseTestIndexActivity5.M;
                                int i114 = CourseTestActivity.R;
                                cVar4.a(a.d(courseTestIndexActivity5, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str4));
                                break;
                            case 4:
                                String str5 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity6 = courseTestIndexActivity;
                                i.c cVar5 = courseTestIndexActivity6.M;
                                int i115 = CourseTestActivity.R;
                                cVar5.a(a.d(courseTestIndexActivity6, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str5));
                                break;
                            case 5:
                                String str6 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity7 = courseTestIndexActivity;
                                i.c cVar6 = courseTestIndexActivity7.M;
                                int i210 = CourseTestActivity.R;
                                cVar6.a(a.d(courseTestIndexActivity7, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str6));
                                break;
                            case 6:
                                String str7 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity8 = courseTestIndexActivity;
                                i.c cVar7 = courseTestIndexActivity8.M;
                                int i211 = CourseTestActivity.R;
                                cVar7.a(a.d(courseTestIndexActivity8, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str7));
                                break;
                            case 7:
                                String str8 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity9 = courseTestIndexActivity;
                                i.c cVar8 = courseTestIndexActivity9.M;
                                int i212 = CourseTestActivity.R;
                                cVar8.a(a.d(courseTestIndexActivity9, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), false, str8));
                                break;
                            case 8:
                                String str9 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity10 = courseTestIndexActivity;
                                i.c cVar9 = courseTestIndexActivity10.M;
                                int i213 = CourseTestActivity.R;
                                cVar9.a(a.d(courseTestIndexActivity10, courseLesson2.getLessonId(), courseLesson2.getUnitId(), courseLesson2.getSortIndex(), courseLesson2.getUnitSortIndex(), courseLesson2.getLastRegex().length() == 0, str9));
                                break;
                            default:
                                String str10 = (String) obj3;
                                CourseTestIndexActivity courseTestIndexActivity11 = courseTestIndexActivity;
                                i.c cVar10 = courseTestIndexActivity11.M;
                                int i214 = CourseTestDialogueActivity.L;
                                cVar10.a(a.e(courseTestIndexActivity11, courseLesson2.getLessonId(), courseLesson2.getUnitId(), str10));
                                break;
                        }
                        return b0Var2;
                    }
                };
                this.f7062b = 1;
                return dVar10.a(this.f7064d, "COURSE_DIALOG_PRACTICE", aVarM10, eVar10, this) == aVar11 ? aVar11 : b0Var;
        }
    }
}
