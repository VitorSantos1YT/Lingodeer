package a00;

import a0.b2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwnerKt;
import au.j1;
import au.w0;
import b1.x;
import bp.g1;
import bp.g5;
import bp.h2;
import bp.q1;
import ch.g0;
import ci.a0;
import ci.d0;
import ci.f0;
import ci.i0;
import ci.k0;
import ci.m0;
import ci.n0;
import ci.p0;
import com.google.api.Service;
import com.lingo.course.ui.CourseTestDialogueActivity;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableTableActivity;
import com.lingo.lingoskill.ui.base.BackupDownloadActivity;
import com.lingo.lingoskill.ui.base.FindPasswordActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.LoginCheckLocateAgeActivity;
import com.lingo.lingoskill.ui.base.NewsFeedActivity;
import com.lingo.lingoskill.ui.base.SplashActivity;
import com.lingo.lingoskill.ui.base.TestUiJsonActivity;
import com.lingo.lingoskill.ui.review.BaseLessonUnitReviewActivity;
import com.lingo.main.ui.MainComposeActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.database.model.LoginHistoryEntity;
import com.lingodeer.database.model.UserInfoEntity;
import dl.ExOZ.xItStCyvVEZ;
import g00.t1;
import g2.t0;
import h00.s;
import hj.b1;
import j9.v;
import j9.z;
import java.util.List;
import java.util.regex.Pattern;
import jt.h0;
import jt.l0;
import l1.j0;
import ns.o;
import oz.q;
import qy.b0;
import rt.m5;
import ry.r;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f249b;

    public /* synthetic */ c(e eVar, d dVar) {
        this.f248a = 0;
        this.f249b = eVar;
    }

    public /* synthetic */ c(w0 w0Var, LoginHistoryEntity loginHistoryEntity) {
        this.f248a = 2;
        this.f249b = loginHistoryEntity;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        UserInfoEntity userInfoEntity;
        m5 m5Var;
        List list;
        int i11 = this.f248a;
        int i12 = 3;
        int i13 = 1;
        int i14 = 0;
        vy.d dVar = null;
        b0 b0Var = b0.f48488a;
        Object obj2 = this.f249b;
        switch (i11) {
            case 0:
                ((e) obj2).a(null);
                return b0Var;
            case 1:
                ar.e eVar = (ar.e) obj2;
                com.android.billingclient.api.d client = (com.android.billingclient.api.d) obj;
                kotlin.jvm.internal.m.f(client, "client");
                eVar.f2844c = client;
                eVar.a(client);
                return b0Var;
            case 2:
                LoginHistoryEntity loginHistoryEntity = (LoginHistoryEntity) obj2;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                if (loginHistoryEntity != null) {
                    ja.c statement = _connection.B1("DELETE FROM `login_history` WHERE `uid` = ?");
                    try {
                        kotlin.jvm.internal.m.f(statement, "statement");
                        statement.b0(1, loginHistoryEntity.getUid());
                        statement.r1();
                        hz.b.h(statement, null);
                        com.bumptech.glide.f.y(_connection);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            hz.b.h(statement, th2);
                            throw th3;
                        }
                    }
                }
                return b0Var;
            case 3:
                m5 m5Var2 = ((j1) obj2).f3031c;
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ja.c cVarB1 = _connection2.B1("SELECT * FROM user_info WHERE id =? LIMIT 1");
                try {
                    cVarB1.b0(1, "lingodeer");
                    int iM = com.bumptech.glide.g.m(cVarB1, "id");
                    int iM2 = com.bumptech.glide.g.m(cVarB1, "total_xp");
                    int iM3 = com.bumptech.glide.g.m(cVarB1, "total_time");
                    int iM4 = com.bumptech.glide.g.m(cVarB1, "total_gems");
                    int iM5 = com.bumptech.glide.g.m(cVarB1, xItStCyvVEZ.BlEPqDIENspC);
                    int iM6 = com.bumptech.glide.g.m(cVarB1, "streak_saver");
                    int iM7 = com.bumptech.glide.g.m(cVarB1, "leaderboard_week_xp");
                    int iM8 = com.bumptech.glide.g.m(cVarB1, "leaderboard_emoji_status");
                    int iM9 = com.bumptech.glide.g.m(cVarB1, "leaderboard_learned_time");
                    int iM10 = com.bumptech.glide.g.m(cVarB1, "skill_mastery");
                    int iM11 = com.bumptech.glide.g.m(cVarB1, "achievement_top_student");
                    int iM12 = com.bumptech.glide.g.m(cVarB1, "achievement_xp_expert");
                    int iM13 = com.bumptech.glide.g.m(cVarB1, "achievement_streak_hero");
                    int iM14 = com.bumptech.glide.g.m(cVarB1, "achievement_leaderboard");
                    int iM15 = com.bumptech.glide.g.m(cVarB1, "achievement_languages");
                    int iM16 = com.bumptech.glide.g.m(cVarB1, "all_followings");
                    int iM17 = com.bumptech.glide.g.m(cVarB1, "all_followers");
                    int iM18 = com.bumptech.glide.g.m(cVarB1, "animated_emojis");
                    if (cVarB1.r1()) {
                        String strB0 = cVarB1.B0(iM);
                        int i15 = (int) cVarB1.getLong(iM2);
                        int i16 = (int) cVarB1.getLong(iM3);
                        int i17 = (int) cVarB1.getLong(iM4);
                        int i18 = (int) cVarB1.getLong(iM5);
                        int i19 = (int) cVarB1.getLong(iM6);
                        long j11 = cVarB1.getLong(iM7);
                        int i21 = (int) cVarB1.getLong(iM8);
                        long j12 = cVarB1.getLong(iM9);
                        String strB1 = cVarB1.B0(iM10);
                        String strB2 = cVarB1.B0(iM11);
                        String strB3 = cVarB1.B0(iM12);
                        String strB4 = cVarB1.B0(iM13);
                        String strB5 = cVarB1.B0(iM14);
                        String strB6 = cVarB1.B0(iM15);
                        String strB7 = cVarB1.B0(iM16);
                        m5Var2.getClass();
                        List list2 = r.f50854a;
                        if (strB7 == null || strB7.length() == 0) {
                            m5Var = m5Var2;
                            list = list2;
                        } else {
                            m5Var = m5Var2;
                            s sVar = (s) m5Var.f50058b;
                            sVar.getClass();
                            list = (List) sVar.b(new g00.d(t1.f28468a, 0), strB7);
                        }
                        String strB8 = cVarB1.B0(iM17);
                        m5Var.getClass();
                        if (strB8 != null && strB8.length() != 0) {
                            s sVar2 = (s) m5Var.f50058b;
                            sVar2.getClass();
                            list2 = (List) sVar2.b(new g00.d(t1.f28468a, 0), strB8);
                        }
                        userInfoEntity = new UserInfoEntity(strB0, i15, i16, i17, i18, i19, j11, i21, j12, strB1, strB2, strB3, strB4, strB5, strB6, list, list2, cVarB1.B0(iM18));
                    } else {
                        userInfoEntity = null;
                    }
                    return userInfoEntity;
                } finally {
                    cVarB1.close();
                }
            case 4:
                ((x) obj2).a((o3.g) obj);
                return b0Var;
            case 5:
                String source = (String) obj;
                int i22 = BackupDownloadActivity.K;
                kotlin.jvm.internal.m.f(source, "source");
                int[] iArr = bq.r.f4959a;
                bq.m.C((BackupDownloadActivity) obj2, source);
                return b0Var;
            case 6:
                lc.d it = (lc.d) obj;
                kotlin.jvm.internal.m.f(it, "it");
                bp.g gVar = new bp.g(i14);
                int i23 = qx.d.f48466a;
                new zx.c(gVar).f(ky.e.f38937b).b(px.b.a()).c(new a5.f((bp.l) obj2, i12), bp.h.f4607b);
                return b0Var;
            case 7:
                FindPasswordActivity findPasswordActivity = (FindPasswordActivity) obj2;
                String email = (String) obj;
                int i24 = FindPasswordActivity.K;
                kotlin.jvm.internal.m.f(email, "email");
                if (!((Boolean) findPasswordActivity.H.getValue()).booleanValue() && q.i1(email).toString().length() != 0) {
                    String emailString = q.i1(email).toString();
                    kotlin.jvm.internal.m.f(emailString, "emailString");
                    if (Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$").matcher(emailString).matches()) {
                        int[] iArr2 = bq.r.f4959a;
                        bq.m.E(findPasswordActivity);
                        e0.B(LifecycleOwnerKt.getLifecycleScope(findPasswordActivity), null, null, new q1(findPasswordActivity, email, null), 3);
                    }
                }
                return b0Var;
            case 8:
                LoginCheckLocateAgeActivity loginCheckLocateAgeActivity = (LoginCheckLocateAgeActivity) obj2;
                String age = (String) obj;
                int i25 = LoginCheckLocateAgeActivity.L;
                kotlin.jvm.internal.m.f(age, "age");
                if (!TextUtils.isEmpty(q.i1(age).toString())) {
                    try {
                        Integer numValueOf = Integer.valueOf(q.i1(age).toString());
                        kotlin.jvm.internal.m.e(numValueOf, "valueOf(...)");
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue >= 0 && iIntValue <= 200) {
                            int[] iArr3 = bq.r.f4959a;
                            bq.m.E(loginCheckLocateAgeActivity);
                            e0.B(LifecycleOwnerKt.getLifecycleScope(loginCheckLocateAgeActivity), null, null, new h2(iIntValue, loginCheckLocateAgeActivity, dVar, i14), 3);
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                return b0Var;
            case 9:
                NewsFeedActivity newsFeedActivity = (NewsFeedActivity) obj2;
                View it2 = (View) obj;
                int i26 = NewsFeedActivity.R;
                kotlin.jvm.internal.m.f(it2, "it");
                try {
                    newsFeedActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.me/lingodeer")));
                    break;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                newsFeedActivity.m().c("jxz_contact_via_messenger", new androidx.lifecycle.j(28));
                return b0Var;
            case 10:
                SplashActivity splashActivity = (SplashActivity) obj2;
                if (((Boolean) obj).booleanValue()) {
                    e0.B(LifecycleOwnerKt.getLifecycleScope(splashActivity), null, null, new g5(splashActivity, dVar, i13), 3);
                    e0.B(LifecycleOwnerKt.getLifecycleScope(splashActivity), null, null, new g5(splashActivity, dVar, 2), 3);
                    try {
                        SplashActivity.v(splashActivity, splashActivity.getIntent().getExtras());
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        e11.toString();
                    }
                    break;
                }
                return b0Var;
            case 11:
                TestUiJsonActivity testUiJsonActivity = (TestUiJsonActivity) obj2;
                View it3 = (View) obj;
                int i27 = TestUiJsonActivity.P;
                kotlin.jvm.internal.m.f(it3, "it");
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                String string = ((b1) testUiJsonActivity.j()).f32373c.getText().toString();
                kotlin.jvm.internal.m.f(string, "<set-?>");
                LingoSkillApplication.f21667d = string;
                f10.e.b().f(new np.b(20));
                Toast.makeText(testUiJsonActivity, testUiJsonActivity.getString(R.string.success), 0).show();
                return b0Var;
            case 12:
                z navigate = (z) obj;
                int i28 = MainComposeActivity.U;
                kotlin.jvm.internal.m.f(navigate, "$this$navigate");
                navigate.f36280d = ((v) obj2).f36257b.h().f36251f.f5b;
                navigate.f36282f = false;
                j9.e0 e0Var = new j9.e0();
                int i29 = MainComposeActivity.U;
                e0Var.f36195b = true;
                navigate.f36282f = e0Var.f36194a;
                navigate.f36283g = e0Var.f36195b;
                navigate.f36278b = true;
                navigate.f36279c = true;
                return b0Var;
            case 13:
                j0 DisposableEffect = (j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                return new bt.j1((av.b) obj2, i14);
            case 14:
                ht.l it4 = (ht.l) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                ((h0) obj2).f36959e.setValue(it4);
                return b0Var;
            case 15:
                ht.l it5 = (ht.l) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                ((l0) obj2).f37028f.setValue(it5);
                return b0Var;
            case 16:
                jt.h2 h2Var = (jt.h2) obj2;
                t0 graphicsLayer = (t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                float fIntBitsToFloat = Float.intBitsToFloat((int) (h2Var.f36964c >> 32));
                long j13 = h2Var.f36963b;
                graphicsLayer.q(Float.intBitsToFloat((int) (j13 >> 32)) + fIntBitsToFloat);
                graphicsLayer.r(Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat((int) (h2Var.f36964c & 4294967295L)));
                return b0Var;
            case 17:
                ht.l it6 = (ht.l) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                ((jt.q1) obj2).f37129g.setValue(it6);
                return b0Var;
            case 18:
                e00.a buildSerialDescriptor = (e00.a) obj;
                kotlin.jvm.internal.m.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
                e00.a.a(buildSerialDescriptor, "type", t1.f28469b);
                e00.a.a(buildSerialDescriptor, "value", o.i("kotlinx.serialization.Polymorphic<" + ((kotlin.jvm.internal.e) ((c00.c) obj2).f6403a).g() + '>', e00.k.f24698c, new e00.g[0]));
                return b0Var;
            case 19:
                ch.x xVar = (ch.x) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                int i30 = LoginActivity.Q;
                Context contextRequireContext = xVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                xVar.startActivity(g1.p(contextRequireContext, iIntValue2));
                return b0Var;
            case 20:
                CourseTestDialogueActivity courseTestDialogueActivity = (CourseTestDialogueActivity) obj2;
                int iIntValue3 = ((Integer) obj).intValue();
                int i31 = CourseTestDialogueActivity.L;
                Intent intent = new Intent(courseTestDialogueActivity, (Class<?>) LoginActivity.class);
                intent.putExtra(INTENTS.EXTRA_INT, iIntValue3);
                courseTestDialogueActivity.startActivity(intent);
                return b0Var;
            case 21:
                CourseTestIndexActivity courseTestIndexActivity = (CourseTestIndexActivity) obj2;
                CourseUnit unit = (CourseUnit) obj;
                int i32 = CourseTestIndexActivity.N;
                kotlin.jvm.internal.m.f(unit, "unit");
                long unitId = unit.getUnitId();
                int sortIndex = unit.getSortIndex();
                Intent intent2 = new Intent(courseTestIndexActivity, (Class<?>) BaseLessonUnitReviewActivity.class);
                intent2.putExtra(INTENTS.EXTRA_LONG, unitId);
                intent2.putExtra(INTENTS.EXTRA_INT, sortIndex);
                courseTestIndexActivity.startActivity(intent2);
                courseTestIndexActivity.m().c("jxz_main_click_vocab", new g0(unit, i14));
                return b0Var;
            case 22:
                ci.g gVar2 = (ci.g) obj2;
                View it7 = (View) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                gVar2.startActivity(new Intent(gVar2.requireContext(), (Class<?>) ARSyllableTableActivity.class));
                b7.e0.A(gVar2.t(), "jxz_alphabet_click_chart");
                return b0Var;
            case 23:
                ci.b0 b0Var2 = (ci.b0) obj2;
                View cardView = (View) obj;
                kotlin.jvm.internal.m.f(cardView, "cardView");
                ImageView imageView = b0Var2.Q;
                if (imageView != null) {
                    android.support.v4.media.session.a.H(imageView.getBackground());
                }
                ImageView imageView2 = (ImageView) cardView.findViewById(R.id.iv_audio);
                Object tag = cardView.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.String");
                String str = (String) tag;
                th.e eVar2 = b0Var2.P;
                if (eVar2 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                qy.q qVar = fv.b.f28186a;
                eVar2.h(fv.b.c(str, null, null));
                android.support.v4.media.session.a.K(imageView2.getBackground());
                b0Var2.Q = imageView2;
                th.e eVar3 = b0Var2.P;
                if (eVar3 != null) {
                    eVar3.f52416c = new a0(imageView2, i14);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("player");
                throw null;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                d0 d0Var = (d0) obj2;
                View cardView2 = (View) obj;
                kotlin.jvm.internal.m.f(cardView2, "cardView");
                ImageView imageView3 = d0Var.Q;
                if (imageView3 != null) {
                    android.support.v4.media.session.a.H(imageView3.getBackground());
                }
                ImageView imageView4 = (ImageView) cardView2.findViewById(R.id.iv_audio);
                Object tag2 = cardView2.getTag();
                kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) tag2;
                th.e eVar4 = d0Var.P;
                if (eVar4 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                qy.q qVar2 = fv.b.f28186a;
                eVar4.h(fv.b.c(str2, null, null));
                android.support.v4.media.session.a.K(imageView4.getBackground());
                d0Var.Q = imageView4;
                th.e eVar5 = d0Var.P;
                if (eVar5 != null) {
                    eVar5.f52416c = new dm.a(imageView4, 6);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("player");
                throw null;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                f0 f0Var = (f0) obj2;
                View cardView3 = (View) obj;
                kotlin.jvm.internal.m.f(cardView3, "cardView");
                ImageView imageView5 = f0Var.Q;
                if (imageView5 != null) {
                    android.support.v4.media.session.a.H(imageView5.getBackground());
                }
                ImageView imageView6 = (ImageView) cardView3.findViewById(R.id.iv_audio);
                Object tag3 = cardView3.getTag();
                kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) tag3;
                th.e eVar6 = f0Var.P;
                if (eVar6 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                qy.q qVar3 = fv.b.f28186a;
                eVar6.h(fv.b.c(str3, null, null));
                android.support.v4.media.session.a.K(imageView6.getBackground());
                f0Var.Q = imageView6;
                th.e eVar7 = f0Var.P;
                if (eVar7 != null) {
                    eVar7.f52416c = new b2(imageView6, 5);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("player");
                throw null;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                i0 i0Var = (i0) obj2;
                View cardView4 = (View) obj;
                kotlin.jvm.internal.m.f(cardView4, "cardView");
                ImageView imageView7 = i0Var.Q;
                if (imageView7 != null) {
                    android.support.v4.media.session.a.H(imageView7.getBackground());
                }
                ImageView imageView8 = (ImageView) cardView4.findViewById(R.id.iv_audio);
                Object tag4 = cardView4.getTag();
                kotlin.jvm.internal.m.d(tag4, "null cannot be cast to non-null type kotlin.String");
                String str4 = (String) tag4;
                th.e eVar8 = i0Var.P;
                if (eVar8 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                qy.q qVar4 = fv.b.f28186a;
                eVar8.h(fv.b.c(str4, null, null));
                android.support.v4.media.session.a.K(imageView8.getBackground());
                i0Var.Q = imageView8;
                th.e eVar9 = i0Var.P;
                if (eVar9 != null) {
                    eVar9.f52416c = new ci.h0(imageView8);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("player");
                throw null;
            case 27:
                k0 k0Var = (k0) obj2;
                View cardView5 = (View) obj;
                kotlin.jvm.internal.m.f(cardView5, "cardView");
                ImageView imageView9 = k0Var.Q;
                if (imageView9 != null) {
                    android.support.v4.media.session.a.H(imageView9.getBackground());
                }
                ImageView imageView10 = (ImageView) cardView5.findViewById(R.id.iv_audio);
                Object tag5 = cardView5.getTag();
                kotlin.jvm.internal.m.d(tag5, "null cannot be cast to non-null type kotlin.String");
                String str5 = (String) tag5;
                th.e eVar10 = k0Var.P;
                if (eVar10 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                qy.q qVar5 = fv.b.f28186a;
                eVar10.h(fv.b.c(str5, null, null));
                android.support.v4.media.session.a.K(imageView10.getBackground());
                k0Var.Q = imageView10;
                th.e eVar11 = k0Var.P;
                if (eVar11 != null) {
                    eVar11.f52416c = new hd.d(imageView10, 8);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("player");
                throw null;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                n0 n0Var = (n0) obj2;
                View cardView6 = (View) obj;
                kotlin.jvm.internal.m.f(cardView6, "cardView");
                ImageView imageView11 = n0Var.Q;
                if (imageView11 != null) {
                    android.support.v4.media.session.a.H(imageView11.getBackground());
                }
                ImageView imageView12 = (ImageView) cardView6.findViewById(R.id.iv_audio);
                Object tag6 = cardView6.getTag();
                kotlin.jvm.internal.m.d(tag6, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) tag6;
                th.e eVar12 = n0Var.P;
                if (eVar12 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                qy.q qVar6 = fv.b.f28186a;
                eVar12.h(fv.b.c(str6, null, null));
                android.support.v4.media.session.a.K(imageView12.getBackground());
                n0Var.Q = imageView12;
                th.e eVar13 = n0Var.P;
                if (eVar13 != null) {
                    eVar13.f52416c = new m0(imageView12, 0);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("player");
                throw null;
            default:
                p0 p0Var = (p0) obj2;
                View cardView7 = (View) obj;
                kotlin.jvm.internal.m.f(cardView7, "cardView");
                ImageView imageView13 = p0Var.Q;
                if (imageView13 != null) {
                    android.support.v4.media.session.a.H(imageView13.getBackground());
                }
                ImageView imageView14 = (ImageView) cardView7.findViewById(R.id.iv_audio);
                Object tag7 = cardView7.getTag();
                kotlin.jvm.internal.m.d(tag7, "null cannot be cast to non-null type kotlin.String");
                String str7 = (String) tag7;
                th.e eVar14 = p0Var.P;
                if (eVar14 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                qy.q qVar7 = fv.b.f28186a;
                eVar14.h(fv.b.c(str7, null, null));
                android.support.v4.media.session.a.K(imageView14.getBackground());
                p0Var.Q = imageView14;
                th.e eVar15 = p0Var.P;
                if (eVar15 != null) {
                    eVar15.f52416c = new a0(imageView14, i13);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("player");
                throw null;
        }
    }

    public /* synthetic */ c(Object obj, int i11) {
        this.f248a = i11;
        this.f249b = obj;
    }
}
