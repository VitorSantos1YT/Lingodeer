package bp;

import android.content.Context;
import android.content.Intent;
import com.facebook.FacebookException;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.api.Api;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingo.lingoskill.ui.base.FindPasswordActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.LoginCheckLocateAgeActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f4872b;

    public /* synthetic */ w1(LoginActivity loginActivity, int i11) {
        this.f4871a = i11;
        this.f4872b = loginActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        String str;
        Intent intentA;
        ArrayList arrayListH0;
        String strW;
        int i11 = this.f4871a;
        boolean z11 = true;
        String str2 = kHfjNGauVgdF.CvkwYNefbc;
        qy.b0 b0Var = qy.b0.f48488a;
        LoginActivity loginActivity = this.f4872b;
        switch (i11) {
            case 0:
                int i12 = LoginActivity.Q;
                loginActivity.startActivity(new Intent(loginActivity, (Class<?>) FindPasswordActivity.class));
                return b0Var;
            case 1:
                int i13 = loginActivity.K;
                if (i13 == 1) {
                    str = "launch_haveaccount";
                } else if (i13 == 4) {
                    str = "me";
                } else if (i13 == 5) {
                    str = "manage_account";
                } else if (i13 == 6) {
                    str = "weekly_rank";
                } else if (i13 == 2) {
                    str = "save_progress";
                } else if (i13 == 7) {
                    str = "story_speak_publish";
                } else if (i13 == 8) {
                    str = "story_speak_leaderbd_like";
                } else if (i13 == 9) {
                    str = "me_progress_backup";
                } else if (i13 == 10) {
                    str = "bug_report";
                } else if (i13 == 3) {
                    str = "follow";
                } else {
                    str = i13 == 11 ? "web" : BuildConfig.VERSION_NAME;
                }
                loginActivity.m().c("jxz_signin_click_signup", new ar.a(str, 1));
                i.c cVar = loginActivity.P;
                int i14 = loginActivity.K;
                Intent intent = new Intent(loginActivity, (Class<?>) LoginCheckLocateAgeActivity.class);
                intent.putExtra(INTENTS.EXTRA_BOOLEAN, false);
                intent.putExtra(INTENTS.EXTRA_INT, i14);
                cVar.a(intent);
                return b0Var;
            case 2:
                int i15 = LoginActivity.Q;
                String url = ep.a.g(str2, FirebaseRemoteConfig.d().f("end_point"), "/terms-conditions-html");
                String string = loginActivity.getString(R.string.terms_of_use_login);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                kotlin.jvm.internal.m.f(url, "url");
                Intent intent2 = new Intent(loginActivity, (Class<?>) RemoteUrlActivity.class);
                intent2.putExtra(INTENTS.EXTRA_STRING, url);
                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                loginActivity.startActivity(intent2);
                return b0Var;
            case 3:
                int i16 = LoginActivity.Q;
                String url2 = ep.a.g(str2, FirebaseRemoteConfig.d().f("end_point"), "/privacypolicy-html");
                String string2 = loginActivity.getString(R.string.privacy_policy_login);
                kotlin.jvm.internal.m.e(string2, "getString(...)");
                kotlin.jvm.internal.m.f(url2, "url");
                Intent intent3 = new Intent(loginActivity, (Class<?>) RemoteUrlActivity.class);
                intent3.putExtra(INTENTS.EXTRA_STRING, url2);
                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                loginActivity.startActivity(intent3);
                return b0Var;
            case 4:
                int i17 = LoginActivity.Q;
                loginActivity.finish();
                return b0Var;
            case 5:
                bq.g gVar = loginActivity.M;
                if (gVar != null) {
                    GoogleSignInClient googleSignInClient = gVar.f4949c;
                    Intent intent4 = null;
                    if (googleSignInClient != null) {
                        Api.ApiOptions apiOptions = googleSignInClient.f8680e;
                        Context context = googleSignInClient.f8676a;
                        int iD = googleSignInClient.d();
                        int i18 = iD - 1;
                        if (iD == 0) {
                            throw null;
                        }
                        if (i18 == 2) {
                            zbm.f8547a.a("getFallbackSignInIntent()", new Object[0]);
                            intentA = zbm.a(context, (GoogleSignInOptions) apiOptions);
                            intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
                        } else if (i18 != 3) {
                            zbm.f8547a.a("getNoImplementationSignInIntent()", new Object[0]);
                            intentA = zbm.a(context, (GoogleSignInOptions) apiOptions);
                            intentA.setAction("com.google.android.gms.auth.NO_IMPL");
                        } else {
                            intentA = zbm.a(context, (GoogleSignInOptions) apiOptions);
                        }
                        intent4 = intentA;
                    }
                    try {
                        GoogleSignInClient googleSignInClient2 = gVar.f4949c;
                        if (googleSignInClient2 != null) {
                            googleSignInClient2.c();
                        }
                        i.c cVar2 = gVar.f4948b;
                        kotlin.jvm.internal.m.c(intent4);
                        cVar2.a(intent4);
                    } catch (Exception e8) {
                        String string3 = loginActivity.getString(R.string.error);
                        kotlin.jvm.internal.m.e(string3, "getString(...)");
                        ff.h.C(string3);
                        final CrashlyticsCore crashlyticsCore = FirebaseCrashlytics.a().f18213a;
                        Map map = Collections.EMPTY_MAP;
                        crashlyticsCore.f18301o.f18376a.a(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.h

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ Map f18364c = Collections.EMPTY_MAP;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Map map2 = Collections.EMPTY_MAP;
                                CrashlyticsController crashlyticsController = crashlyticsCore.f18294g;
                                Thread threadCurrentThread = Thread.currentThread();
                                crashlyticsController.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = crashlyticsController.f18272n;
                                if (crashlyticsUncaughtExceptionHandler == null || !crashlyticsUncaughtExceptionHandler.f18316e.get()) {
                                    long j11 = jCurrentTimeMillis / 1000;
                                    String strD = crashlyticsController.d();
                                    if (strD == null) {
                                        return;
                                    }
                                    EventMetadata eventMetadata = new EventMetadata(map2, strD, j11);
                                    SessionReportingCoordinator sessionReportingCoordinator = crashlyticsController.m;
                                    sessionReportingCoordinator.getClass();
                                    sessionReportingCoordinator.e(e8, threadCurrentThread, "error", eventMetadata, false);
                                }
                            }
                        });
                        e8.printStackTrace();
                    }
                    break;
                }
                return b0Var;
            case 6:
                int i19 = LoginActivity.Q;
                try {
                    tf.d0 d0VarC = tf.d0.f52154i.c();
                    xq.c cVar3 = loginActivity.L;
                    kotlin.jvm.internal.m.c(cVar3);
                    lf.j jVar = (lf.j) cVar3.f56176d;
                    kotlin.jvm.internal.m.c(jVar);
                    List listL = ns.o.L("public_profile", "email");
                    String string4 = UUID.randomUUID().toString();
                    kotlin.jvm.internal.m.e(string4, "randomUUID().toString()");
                    lz.g gVar2 = new lz.g(43, 128, 1);
                    jz.d dVar = jz.e.f37397a;
                    int iN = hz.b.N(gVar2);
                    Iterable cVar4 = new lz.c('a', 'z');
                    lz.c cVar5 = new lz.c('A', 'Z');
                    if (cVar4 instanceof Collection) {
                        arrayListH0 = ry.m.H0((Collection) cVar4, cVar5);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        ry.m.d0(arrayList, cVar4);
                        ry.m.d0(arrayList, cVar5);
                        arrayListH0 = arrayList;
                    }
                    ArrayList arrayListG0 = ry.m.G0('~', ry.m.G0('_', ry.m.G0('.', ry.m.G0('-', ry.m.H0(arrayListH0, new lz.c('0', '9'))))));
                    ArrayList arrayList2 = new ArrayList(iN);
                    for (int i21 = 0; i21 < iN; i21++) {
                        jz.d dVar2 = jz.e.f37397a;
                        Character ch2 = (Character) ry.m.I0(arrayListG0);
                        ch2.getClass();
                        arrayList2.add(ch2);
                    }
                    String codeVerifier = ry.m.y0(arrayList2, BuildConfig.VERSION_NAME, null, null, null, 62);
                    kotlin.jvm.internal.m.f(codeVerifier, "codeVerifier");
                    if (!(string4.length() == 0 ? false : !(oz.q.H0(string4, ' ', 0, 6) >= 0)) || !ns.o.I(codeVerifier)) {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalArgumentException(MzwEyWCkjXL.ckUHHM);
                    }
                    HashSet hashSet = new HashSet(listL);
                    hashSet.add("openid");
                    Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                    kotlin.jvm.internal.m.e(setUnmodifiableSet, "unmodifiableSet(permissions)");
                    tf.a aVar = tf.a.S256;
                    try {
                        strW = ns.o.w(codeVerifier, aVar);
                    } catch (FacebookException unused) {
                        aVar = tf.a.PLAIN;
                        strW = codeVerifier;
                    }
                    tf.a aVar2 = aVar;
                    tf.s sVar = d0VarC.f52157a;
                    Set setF1 = ry.m.f1(setUnmodifiableSet);
                    tf.e eVar = d0VarC.f52158b;
                    String str3 = d0VarC.f52160d;
                    String strB = re.s.b();
                    String string5 = UUID.randomUUID().toString();
                    kotlin.jvm.internal.m.e(string5, "randomUUID().toString()");
                    tf.t tVar = new tf.t(sVar, setF1, eVar, str3, strB, string5, d0VarC.f52163g, string4, codeVerifier, strW, aVar2);
                    Date date = re.b.N;
                    tVar.f52219f = ns.o.F();
                    tVar.L = d0VarC.f52161e;
                    tVar.M = d0VarC.f52162f;
                    tVar.O = false;
                    tVar.P = d0VarC.f52164h;
                    d0VarC.f(new qp.b(loginActivity, jVar), tVar);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return b0Var;
            case 7:
                int i22 = LoginActivity.Q;
                String url3 = ep.a.g(str2, FirebaseRemoteConfig.d().f("end_point"), "/terms-conditions-html");
                String string6 = loginActivity.getString(R.string.terms_of_use_login);
                kotlin.jvm.internal.m.e(string6, "getString(...)");
                kotlin.jvm.internal.m.f(url3, "url");
                Intent intent5 = new Intent(loginActivity, (Class<?>) RemoteUrlActivity.class);
                intent5.putExtra(INTENTS.EXTRA_STRING, url3);
                intent5.putExtra(INTENTS.EXTRA_STRING_2, string6);
                loginActivity.startActivity(intent5);
                return b0Var;
            default:
                int i23 = LoginActivity.Q;
                String url4 = ep.a.g(str2, FirebaseRemoteConfig.d().f("end_point"), "/privacypolicy-html");
                String string7 = loginActivity.getString(R.string.privacy_policy_login);
                kotlin.jvm.internal.m.e(string7, "getString(...)");
                kotlin.jvm.internal.m.f(url4, "url");
                Intent intent6 = new Intent(loginActivity, (Class<?>) RemoteUrlActivity.class);
                intent6.putExtra(INTENTS.EXTRA_STRING, url4);
                intent6.putExtra(INTENTS.EXTRA_STRING_2, string7);
                loginActivity.startActivity(intent6);
                return b0Var;
        }
    }
}
