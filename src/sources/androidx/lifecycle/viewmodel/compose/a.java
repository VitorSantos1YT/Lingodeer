package androidx.lifecycle.viewmodel.compose;

import ad.y;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.compose.FlowExtKt;
import at.f;
import b0.j0;
import bq.r;
import bt.c6;
import bt.f6;
import bt.p;
import bt.v3;
import ch.o;
import com.google.api.Service;
import com.lingo.course.ui.CourseReviewListActivity;
import com.lingo.course.ui.CourseReviewTestActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.LoginCheckParentInfoActivity;
import com.lingo.lingoskill.ui.base.MainActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingo.lingoskill.ui.base.SignUpActivity;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LawInfo;
import com.lingodeer.data.model.uistate.CompleteOneLessonUiState;
import com.lingodeer.database.model.LanguageHistoryEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.a0;
import fr.j3;
import fz.e;
import h1.ua;
import j3.y0;
import java.util.List;
import java.util.regex.Pattern;
import jt.h2;
import jt.i2;
import l1.b1;
import l1.b3;
import l1.g;
import l1.k1;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import lc.d;
import oz.q;
import oz.x;
import qy.b0;
import rt.r8;
import rz.e0;
import w1.i;
import w1.k;
import ys.p2;
import ys.q2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2098b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f2097a = i11;
        this.f2098b = obj;
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
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i11 = this.f2097a;
        h2 h2VarA = null;
        int i12 = 4;
        g gVar = m.f39353a;
        boolean z11 = false;
        final int i13 = 1;
        b0 b0Var = b0.f48488a;
        Object obj4 = this.f2098b;
        switch (i11) {
            case 0:
                return SavedStateHandleSaverKt.mutableStateSaver$lambda$7$lambda$6((i) obj4, (k) obj, (b1) obj2);
            case 1:
                CourseUnit courseUnit = (CourseUnit) obj4;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ua.b(courseUnit.getUnitName(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(22), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 0, 0, 65534);
                } else {
                    sVar.W();
                }
                return b0Var;
            case 2:
                ((Integer) obj2).getClass();
                ((j0) obj4).a((n) obj, t.M(1));
                return b0Var;
            case 3:
                LanguageHistoryEntity languageHistoryEntity = (LanguageHistoryEntity) obj4;
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(x.q0(ub.a.e0(sVar2, com.lingodeer.R.string.remove_course_message), "%s", languageHistoryEntity.getTitle()), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 4:
                LoginCheckParentInfoActivity loginCheckParentInfoActivity = (LoginCheckParentInfoActivity) obj4;
                String guardianName = (String) obj;
                String guardianEmail = (String) obj2;
                int i14 = LoginCheckParentInfoActivity.L;
                kotlin.jvm.internal.m.f(guardianName, "guardianName");
                kotlin.jvm.internal.m.f(guardianEmail, "guardianEmail");
                if (!TextUtils.isEmpty(q.i1(guardianName).toString()) && !TextUtils.isEmpty(q.i1(guardianEmail).toString())) {
                    String emailString = q.i1(guardianEmail).toString();
                    kotlin.jvm.internal.m.f(emailString, "emailString");
                    if (Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$").matcher(emailString).matches()) {
                        int[] iArr = r.f4959a;
                        bq.m.E(loginCheckParentInfoActivity);
                        LawInfo lawInfo = (LawInfo) loginCheckParentInfoActivity.f22044t.getValue();
                        LawInfo lawInfoCopy$default = lawInfo != null ? LawInfo.copy$default(lawInfo, null, 0, q.i1(guardianName).toString(), q.i1(guardianEmail).toString(), 3, null) : null;
                        if (((Boolean) loginCheckParentInfoActivity.H.getValue()).booleanValue()) {
                            loginCheckParentInfoActivity.setResult(3012, new Intent().putExtra(INTENTS.EXTRA_OBJECT, lawInfoCopy$default));
                            loginCheckParentInfoActivity.finish();
                        } else if (lawInfoCopy$default != null) {
                            i.c cVar = loginCheckParentInfoActivity.K;
                            Intent intent = new Intent(loginCheckParentInfoActivity, (Class<?>) SignUpActivity.class);
                            intent.putExtra(INTENTS.EXTRA_OBJECT, lawInfoCopy$default);
                            cVar.a(intent);
                        }
                    }
                }
                return b0Var;
            case 5:
                MainActivity mainActivity = (MainActivity) obj4;
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i15 = MainActivity.U;
                s sVar3 = (s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mainActivity.u().X, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar3, 0, 7);
                    Object objQ = sVar3.Q();
                    if (objQ == gVar) {
                        obj3 = objQ;
                        rz.b0 b0VarQ = t.q(sVar3);
                        sVar3.o0(b0VarQ);
                        obj3 = b0VarQ;
                    }
                    obj3 = objQ;
                    rz.b0 b0Var2 = (rz.b0) obj3;
                    CompleteOneLessonUiState completeOneLessonUiState = (CompleteOneLessonUiState) b3VarCollectAsStateWithLifecycle.getValue();
                    boolean zF = sVar3.f(b3VarCollectAsStateWithLifecycle) | sVar3.h(b0Var2);
                    Object objQ2 = sVar3.Q();
                    Object obj5 = objQ2;
                    if (zF || objQ2 == gVar) {
                        f fVar = new f(i12, b3VarCollectAsStateWithLifecycle, b0Var2);
                        sVar3.o0(fVar);
                        obj5 = fVar;
                    }
                    xu.b.a(completeOneLessonUiState, (fz.a) obj5, sVar3, 0);
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 6:
                UpdateLessonActivity context = (UpdateLessonActivity) obj4;
                d dialog = (d) obj;
                CharSequence text = (CharSequence) obj2;
                int i16 = UpdateLessonActivity.W;
                kotlin.jvm.internal.m.f(dialog, "dialog");
                kotlin.jvm.internal.m.f(text, "text");
                String url = text.toString();
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(url, "url");
                Intent intent2 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                intent2.putExtra(INTENTS.EXTRA_STRING, url);
                intent2.putExtra(INTENTS.EXTRA_STRING_2, "LingoDeer");
                context.startActivity(intent2);
                return b0Var;
            case 7:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 8:
                CourseCharacter courseCharacter = (CourseCharacter) obj4;
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    a0.r(courseCharacter.getTranslation(), null, 0, 0, sVar4, 0, 14);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 9:
                ((Integer) obj2).getClass();
                ((p) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 10:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 11:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 12:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 13:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 14:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 15:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 16:
                ((Integer) obj2).getClass();
                ((v3) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 17:
                s2.t change = (s2.t) obj;
                f2.b bVar = (f2.b) obj2;
                kotlin.jvm.internal.m.f(change, "change");
                change.a();
                k1 k1Var = ((i2) obj4).f36976a;
                h2 h2Var = (h2) k1Var.getValue();
                if (h2Var != null) {
                    h2 h2Var2 = (h2) k1Var.getValue();
                    float fIntBitsToFloat = CropImageView.DEFAULT_ASPECT_RATIO;
                    float fIntBitsToFloat2 = h2Var2 != null ? Float.intBitsToFloat((int) (bVar.f26570a >> 32)) + Float.intBitsToFloat((int) (h2Var2.f36963b >> 32)) : 0.0f;
                    h2 h2Var3 = (h2) k1Var.getValue();
                    if (h2Var3 != null) {
                        fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.f26570a & 4294967295L)) + Float.intBitsToFloat((int) (h2Var3.f36963b & 4294967295L));
                    }
                    h2VarA = h2.a(h2Var, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0L, 13);
                }
                k1Var.setValue(h2VarA);
                return b0Var;
            case 18:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 19:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 20:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 21:
                ((Integer) obj2).getClass();
                ((c6) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 22:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 23:
                ((Integer) obj2).getClass();
                ((f6) obj4).S((n) obj, t.M(1));
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Integer) obj2).getClass();
                ((f6) obj4).S((n) obj, t.M(1));
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Integer) obj2).getClass();
                ((f6) obj4).S((n) obj, t.M(1));
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((Integer) obj2).getClass();
                ((bt.e) obj4).S((n) obj, t.M(1));
                return b0Var;
            case 27:
                ((Integer) obj2).getClass();
                ((f6) obj4).S((n) obj, t.M(1));
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                CourseReviewListActivity courseReviewListActivity = (CourseReviewListActivity) obj4;
                List reviews = (List) obj;
                r8 practiceModel = (r8) obj2;
                int i17 = CourseReviewListActivity.L;
                kotlin.jvm.internal.m.f(reviews, "reviews");
                kotlin.jvm.internal.m.f(practiceModel, "practiceModel");
                if (!reviews.isEmpty()) {
                    e0.B(LifecycleOwnerKt.getLifecycleScope(courseReviewListActivity), null, null, new y(courseReviewListActivity, reviews, practiceModel, (vy.d) null, 4), 3);
                }
                return b0Var;
            default:
                final CourseReviewTestActivity courseReviewTestActivity = (CourseReviewTestActivity) obj4;
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i18 = CourseReviewTestActivity.M;
                s sVar5 = (s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    q2 q2Var = new q2(-1L, -1L, (CoursePracticeType) courseReviewTestActivity.K.getValue(), BuildConfig.VERSION_NAME, ((Number) courseReviewTestActivity.f21615t.getValue()).intValue(), (List) courseReviewTestActivity.H.getValue(), ry.r.f50854a, (r8) courseReviewTestActivity.L.getValue());
                    boolean zH = sVar5.h(courseReviewTestActivity);
                    Object objQ3 = sVar5.Q();
                    if (zH || objQ3 == gVar) {
                        objQ3 = new o(courseReviewTestActivity, i12);
                        sVar5.o0(objQ3);
                    }
                    fz.a aVar = (fz.a) objQ3;
                    boolean zH2 = sVar5.h(courseReviewTestActivity);
                    Object objQ4 = sVar5.Q();
                    if (zH2 || objQ4 == gVar) {
                        objQ4 = new o(courseReviewTestActivity, 5);
                        sVar5.o0(objQ4);
                    }
                    fz.a aVar2 = (fz.a) objQ4;
                    boolean zH3 = sVar5.h(courseReviewTestActivity);
                    Object objQ5 = sVar5.Q();
                    if (zH3 || objQ5 == gVar) {
                        final int i19 = z11 ? 1 : 0;
                        objQ5 = new fz.c() { // from class: ch.p
                            @Override // fz.c
                            public final Object invoke(Object obj6) {
                                int i21 = i19;
                                qy.b0 b0Var3 = qy.b0.f48488a;
                                CourseReviewTestActivity context2 = courseReviewTestActivity;
                                switch (i21) {
                                    case 0:
                                        int iIntValue6 = ((Integer) obj6).intValue();
                                        int i22 = CourseReviewTestActivity.M;
                                        kotlin.jvm.internal.m.f(context2, "context");
                                        Intent intent3 = new Intent(context2, (Class<?>) LoginActivity.class);
                                        intent3.putExtra(INTENTS.EXTRA_INT, iIntValue6);
                                        context2.startActivity(intent3);
                                        break;
                                    default:
                                        String source = (String) obj6;
                                        int i23 = CourseReviewTestActivity.M;
                                        kotlin.jvm.internal.m.f(source, "source");
                                        int[] iArr2 = bq.r.f4959a;
                                        bq.m.C(context2, source);
                                        break;
                                }
                                return b0Var3;
                            }
                        };
                        sVar5.o0(objQ5);
                    }
                    fz.c cVar2 = (fz.c) objQ5;
                    boolean zH4 = sVar5.h(courseReviewTestActivity);
                    Object objQ6 = sVar5.Q();
                    if (zH4 || objQ6 == gVar) {
                        objQ6 = new fz.c() { // from class: ch.p
                            @Override // fz.c
                            public final Object invoke(Object obj6) {
                                int i21 = i13;
                                qy.b0 b0Var3 = qy.b0.f48488a;
                                CourseReviewTestActivity context2 = courseReviewTestActivity;
                                switch (i21) {
                                    case 0:
                                        int iIntValue6 = ((Integer) obj6).intValue();
                                        int i22 = CourseReviewTestActivity.M;
                                        kotlin.jvm.internal.m.f(context2, "context");
                                        Intent intent3 = new Intent(context2, (Class<?>) LoginActivity.class);
                                        intent3.putExtra(INTENTS.EXTRA_INT, iIntValue6);
                                        context2.startActivity(intent3);
                                        break;
                                    default:
                                        String source = (String) obj6;
                                        int i23 = CourseReviewTestActivity.M;
                                        kotlin.jvm.internal.m.f(source, "source");
                                        int[] iArr2 = bq.r.f4959a;
                                        bq.m.C(context2, source);
                                        break;
                                }
                                return b0Var3;
                            }
                        };
                        sVar5.o0(objQ6);
                    }
                    p2.c(q2Var, null, null, aVar, null, null, aVar2, cVar2, (fz.c) objQ6, sVar5, 8, 54);
                } else {
                    sVar5.W();
                }
                return b0Var;
        }
    }

    public /* synthetic */ a(Object obj, int i11, int i12) {
        this.f2097a = i12;
        this.f2098b = obj;
    }
}
