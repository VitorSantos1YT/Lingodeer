package br;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelKt;
import bp.g1;
import bp.h2;
import com.lingo.course.ui.CourseACKActivity;
import com.lingo.course.ui.CourseFlashCardIndexActivity;
import com.lingo.course.ui.CourseReviewListActivity;
import com.lingo.course.ui.CourseTestExamActivity;
import com.lingo.fluent.ui.base.PdLearnIndexActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.handwrite.HandWriteGroupActivity;
import com.lingo.lingoskill.ui.review.BaseReviewEmptyActivity;
import com.lingo.main.ui.MainComposeActivity;
import com.lingo.me.MeAccountSettingsActivity;
import com.lingo.me.MeAchievementAllLanguageActivity;
import com.lingo.me.MeAchievementLanguageDetailActivity;
import com.lingo.me.MeAchievementLeaderBoardDetailActivity;
import com.lingo.me.MeAchievementLevelDetailActivity;
import com.lingo.me.MeAchievementRecordDetailActivity;
import com.lingo.me.MeFollowingFollowerActivity;
import com.lingo.me.MeSettingsActivity;
import com.lingo.me.MeSetupDailyGoalActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.AchievementRecord;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.INTENTS;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import tu.m0;
import xu.k0;
import xu.l0;
import xu.n0;
import xu.o0;
import xu.p0;
import xu.q0;
import xu.r0;
import xu.s0;
import xu.t0;
import xu.u0;
import xu.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f5038b;

    public /* synthetic */ h(MainComposeActivity mainComposeActivity, int i11) {
        this.f5037a = i11;
        this.f5038b = mainComposeActivity;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, qy.h] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f5037a;
        qy.b0 b0Var = qy.b0.f48488a;
        MainComposeActivity mainComposeActivity = this.f5038b;
        switch (i11) {
            case 0:
                mh.i lesson = (mh.i) obj;
                kotlin.jvm.internal.m.f(lesson, "lesson");
                int i12 = PdLearnIndexActivity.L;
                long j11 = lesson.f41135a;
                Intent intent = new Intent(mainComposeActivity, (Class<?>) PdLearnIndexActivity.class);
                intent.putExtra(INTENTS.EXTRA_LONG, j11);
                mainComposeActivity.startActivity(intent);
                return b0Var;
            case 1:
                CourseCharacterGroup it = (CourseCharacterGroup) obj;
                kotlin.jvm.internal.m.f(it, "it");
                int i13 = HandWriteGroupActivity.f22048t;
                Intent intent2 = new Intent(mainComposeActivity, (Class<?>) HandWriteGroupActivity.class);
                intent2.putExtra(INTENTS.EXTRA_OBJECT, it);
                mainComposeActivity.startActivity(intent2);
                return b0Var;
            case 2:
                v0 intent3 = (v0) obj;
                kotlin.jvm.internal.m.f(intent3, "intent");
                ar.g gVarQ = mainComposeActivity.q();
                gp.w mainViewModel = mainComposeActivity.r();
                m0 leaderBoardViewModel = (m0) mainComposeActivity.H.getValue();
                Context context = gVarQ.f2852c;
                kotlin.jvm.internal.m.f(mainViewModel, "mainViewModel");
                kotlin.jvm.internal.m.f(leaderBoardViewModel, "leaderBoardViewModel");
                if (intent3.equals(xu.d0.f56383a)) {
                    leaderBoardViewModel.b(new tu.p());
                } else if (intent3.equals(xu.e0.f56387a)) {
                    leaderBoardViewModel.b(tu.o.f52618a);
                } else if (!intent3.equals(xu.f0.f56397a)) {
                    if (intent3 instanceof xu.g0) {
                        int i14 = MeAchievementLevelDetailActivity.H;
                        AchievementLevel achievementLevel = ((xu.g0) intent3).f56402a;
                        kotlin.jvm.internal.m.f(achievementLevel, "achievementLevel");
                        Intent intent4 = new Intent(context, (Class<?>) MeAchievementLevelDetailActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_OBJECT, achievementLevel);
                        context.startActivity(intent4);
                    } else if (intent3 instanceof xu.j0) {
                        int i15 = MeAchievementRecordDetailActivity.H;
                        AchievementRecord achievementRecord = ((xu.j0) intent3).f56413a;
                        kotlin.jvm.internal.m.f(achievementRecord, "achievementRecord");
                        Intent intent5 = new Intent(context, (Class<?>) MeAchievementRecordDetailActivity.class);
                        intent5.putExtra(INTENTS.EXTRA_OBJECT, achievementRecord);
                        context.startActivity(intent5);
                    } else if (intent3 instanceof xu.i0) {
                        int i16 = MeAchievementLeaderBoardDetailActivity.H;
                        AchievementLeaderBoard achievementLeaderBoard = ((xu.i0) intent3).f56412a;
                        kotlin.jvm.internal.m.f(achievementLeaderBoard, "achievementLeaderBoard");
                        Intent intent6 = new Intent(context, (Class<?>) MeAchievementLeaderBoardDetailActivity.class);
                        intent6.putExtra(INTENTS.EXTRA_OBJECT, achievementLeaderBoard);
                        context.startActivity(intent6);
                    } else if (intent3 instanceof xu.h0) {
                        int i17 = MeAchievementLanguageDetailActivity.H;
                        AchievementLanguage achievementLanguage = ((xu.h0) intent3).f56410a;
                        kotlin.jvm.internal.m.f(achievementLanguage, "achievementLanguage");
                        Intent intent7 = new Intent(context, (Class<?>) MeAchievementLanguageDetailActivity.class);
                        intent7.putExtra(INTENTS.EXTRA_OBJECT, achievementLanguage);
                        context.startActivity(intent7);
                    } else if (intent3 instanceof k0) {
                        int i18 = MeAchievementAllLanguageActivity.H;
                        List achievementLanguages = ((k0) intent3).f56417a;
                        kotlin.jvm.internal.m.f(achievementLanguages, "achievementLanguages");
                        Intent intent8 = new Intent(context, (Class<?>) MeAchievementAllLanguageActivity.class);
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        arrayList.addAll(achievementLanguages);
                        intent8.putParcelableArrayListExtra(INTENTS.EXTRA_ARRAY_LIST, arrayList);
                        context.startActivity(intent8);
                    } else if (intent3.equals(l0.f56447a)) {
                        int[] iArr = bq.r.f4959a;
                        bq.m.C(context, "me_tab");
                    } else if (intent3.equals(xu.m0.f56477a)) {
                        context.startActivity(new Intent(context, (Class<?>) MeSetupDailyGoalActivity.class));
                    } else if (!intent3.equals(n0.f56482a)) {
                        if (intent3 instanceof o0) {
                            if (((o0) intent3).f56492a) {
                                context.startActivity(new Intent(context, (Class<?>) MeAccountSettingsActivity.class));
                            } else {
                                int i19 = LoginActivity.Q;
                                context.startActivity(g1.p(context, 4));
                            }
                        } else if (!intent3.equals(r0.f56509a) && !intent3.equals(s0.f56512a)) {
                            if (intent3.equals(t0.f56519a)) {
                                context.startActivity(new Intent(context, (Class<?>) MeSettingsActivity.class));
                            } else if (intent3.equals(q0.f56508a)) {
                                int i21 = MeFollowingFollowerActivity.H;
                                Intent intent9 = new Intent(context, (Class<?>) MeFollowingFollowerActivity.class);
                                intent9.putExtra(INTENTS.EXTRA_INT, 0);
                                context.startActivity(intent9);
                            } else if (intent3.equals(p0.f56501a)) {
                                int i22 = MeFollowingFollowerActivity.H;
                                Intent intent10 = new Intent(context, (Class<?>) MeFollowingFollowerActivity.class);
                                intent10.putExtra(INTENTS.EXTRA_INT, 1);
                                context.startActivity(intent10);
                            } else {
                                if (!(intent3 instanceof u0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                rz.e0.B(ViewModelKt.getViewModelScope(mainViewModel), null, null, new h2(mainViewModel, ((u0) intent3).f56522a, (vy.d) null, 5), 3);
                            }
                        }
                    }
                }
                return b0Var;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ar.g gVarQ2 = mainComposeActivity.q();
                i.c reviewActivityResultLauncher = mainComposeActivity.S;
                Context context2 = gVarQ2.f2852c;
                kotlin.jvm.internal.m.f(reviewActivityResultLauncher, "reviewActivityResultLauncher");
                b7.e0.A(gVarQ2.f2851b, "jxz_review_click_enter_flashcard");
                if (zBooleanValue) {
                    int i23 = CourseFlashCardIndexActivity.f21612t;
                    Intent intent11 = new Intent(context2, (Class<?>) CourseFlashCardIndexActivity.class);
                    intent11.putExtra("extra_start_destination", "index");
                    reviewActivityResultLauncher.a(intent11);
                } else {
                    int i24 = BaseReviewEmptyActivity.H;
                    String string = context2.getString(R.string.flashcards);
                    kotlin.jvm.internal.m.e(string, "getString(...)");
                    context2.startActivity(o00.a.E(context2, string));
                }
                return b0Var;
            case 4:
                mainComposeActivity.q().c(((Integer) obj).intValue(), mainComposeActivity.S, true);
                return b0Var;
            case 5:
                ((Integer) obj).getClass();
                ar.g gVarQ3 = mainComposeActivity.q();
                i.c reviewActivityResultLauncher2 = mainComposeActivity.S;
                gVarQ3.getClass();
                kotlin.jvm.internal.m.f(reviewActivityResultLauncher2, "reviewActivityResultLauncher");
                int i25 = CourseReviewListActivity.L;
                reviewActivityResultLauncher2.a(p20.c.q(gVarQ3.f2852c, 2));
                return b0Var;
            case 6:
                ((Integer) obj).getClass();
                ar.g gVarQ4 = mainComposeActivity.q();
                i.c reviewActivityResultLauncher3 = mainComposeActivity.S;
                gVarQ4.getClass();
                kotlin.jvm.internal.m.f(reviewActivityResultLauncher3, "reviewActivityResultLauncher");
                int i26 = CourseReviewListActivity.L;
                reviewActivityResultLauncher3.a(p20.c.q(gVarQ4.f2852c, 0));
                return b0Var;
            case 7:
                ((Integer) obj).getClass();
                ar.g gVarQ5 = mainComposeActivity.q();
                i.c reviewActivityResultLauncher4 = mainComposeActivity.S;
                gVarQ5.getClass();
                kotlin.jvm.internal.m.f(reviewActivityResultLauncher4, "reviewActivityResultLauncher");
                int i27 = CourseReviewListActivity.L;
                reviewActivityResultLauncher4.a(p20.c.q(gVarQ5.f2852c, 1));
                return b0Var;
            case 8:
                int iIntValue = ((Integer) obj).intValue();
                ar.g gVarQ6 = mainComposeActivity.q();
                i.c reviewActivityResultLauncher5 = mainComposeActivity.S;
                Context context3 = gVarQ6.f2852c;
                kotlin.jvm.internal.m.f(reviewActivityResultLauncher5, "reviewActivityResultLauncher");
                gVarQ6.f2851b.c("jxz_review_start_5minquiz", new androidx.lifecycle.j(5));
                if (iIntValue > 0) {
                    int i28 = CourseTestExamActivity.H;
                    Intent intent12 = new Intent(context3, (Class<?>) CourseTestExamActivity.class);
                    intent12.putExtra(INTENTS.EXTRA_BOOLEAN, false);
                    reviewActivityResultLauncher5.a(intent12);
                } else {
                    int i29 = BaseReviewEmptyActivity.H;
                    String string2 = context3.getString(R.string._5_min_quiz);
                    kotlin.jvm.internal.m.e(string2, "getString(...)");
                    context3.startActivity(o00.a.E(context3, string2));
                }
                return b0Var;
            case 9:
                int iIntValue2 = ((Integer) obj).intValue();
                ar.g gVarQ7 = mainComposeActivity.q();
                i.c reviewActivityResultLauncher6 = mainComposeActivity.S;
                Context context4 = gVarQ7.f2852c;
                kotlin.jvm.internal.m.f(reviewActivityResultLauncher6, "reviewActivityResultLauncher");
                gVarQ7.f2851b.c("jxz_review_start_5minquiz", new androidx.lifecycle.j(6));
                if (iIntValue2 > 0) {
                    int i30 = CourseTestExamActivity.H;
                    Intent intent13 = new Intent(context4, (Class<?>) CourseTestExamActivity.class);
                    intent13.putExtra(INTENTS.EXTRA_BOOLEAN, true);
                    reviewActivityResultLauncher6.a(intent13);
                } else {
                    int i31 = BaseReviewEmptyActivity.H;
                    String string3 = context4.getString(R.string._5_min_quiz);
                    kotlin.jvm.internal.m.e(string3, "getString(...)");
                    context4.startActivity(o00.a.E(context4, string3));
                }
                return b0Var;
            case 10:
                mainComposeActivity.q().b(((Integer) obj).intValue(), mainComposeActivity.S, false);
                return b0Var;
            case 11:
                mainComposeActivity.q().d(((Integer) obj).intValue(), mainComposeActivity.S, false);
                return b0Var;
            case 12:
                mainComposeActivity.q().c(((Integer) obj).intValue(), mainComposeActivity.S, false);
                return b0Var;
            case 13:
                int iIntValue3 = ((Integer) obj).intValue();
                ar.g gVarQ8 = mainComposeActivity.q();
                Context context5 = gVarQ8.f2852c;
                b7.e0.A(gVarQ8.f2851b, "jxz_review_click_grammar");
                if (iIntValue3 > 0) {
                    context5.startActivity(new Intent(context5, (Class<?>) CourseACKActivity.class));
                } else {
                    int i32 = BaseReviewEmptyActivity.H;
                    String string4 = context5.getString(R.string.knowledge_cards);
                    kotlin.jvm.internal.m.e(string4, "getString(...)");
                    context5.startActivity(o00.a.E(context5, string4));
                }
                return b0Var;
            case 14:
                mainComposeActivity.q().b(((Integer) obj).intValue(), mainComposeActivity.S, true);
                return b0Var;
            default:
                mainComposeActivity.q().d(((Integer) obj).intValue(), mainComposeActivity.S, true);
                return b0Var;
        }
    }
}
