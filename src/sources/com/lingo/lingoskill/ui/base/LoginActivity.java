package com.lingo.lingoskill.ui.base;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.e1;
import androidx.lifecycle.LifecycleOwnerKt;
import av.f0;
import bp.e2;
import bp.f2;
import bp.r;
import bq.g;
import cf.x;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LawInfo;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fz.e;
import hh.p0;
import i.b;
import j9.c0;
import j9.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l1.b1;
import l1.k1;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import oz.q;
import qy.b0;
import qy.j;
import rz.e0;
import uu.a;
import wu.k;
import wu.l;
import wu.o;
import xg.d;
import xq.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LoginActivity extends d {
    public static final /* synthetic */ int Q = 0;
    public int K;
    public c L;
    public g M;
    public final Object N;
    public final i.c O;
    public final i.c P;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f22042t = com.bumptech.glide.d.u(j.NONE, new f2(this, 1));
    public final k1 H = t.B(Boolean.FALSE);

    public LoginActivity() {
        final int i11 = 0;
        this.N = com.bumptech.glide.d.u(j.SYNCHRONIZED, new f2(this, i11));
        this.O = registerForActivityResult(new e1(4), new b(this) { // from class: bp.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f4855b;

            {
                this.f4855b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [vy.d] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* JADX WARN: Type inference failed for: r2v8 */
            /* JADX WARN: Type inference failed for: r9v2 */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r9v4 */
            @Override // i.b
            public final void f(Object obj) {
                GoogleSignInResult googleSignInResult;
                int i12 = i11;
                ?? r9 = 0;
                r9 = 0;
                r9 = 0;
                LoginActivity loginActivity = this.f4855b;
                int i13 = 1;
                i.a it = (i.a) obj;
                switch (i12) {
                    case 0:
                        int i14 = LoginActivity.Q;
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.g gVar = loginActivity.M;
                        if (gVar != null) {
                            int i15 = it.f33864a;
                            Intent intent = it.f33865b;
                            if (i15 == -1 && intent != null) {
                                Auth.f8352b.getClass();
                                Logger logger = zbm.f8547a;
                                Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
                                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
                                if (googleSignInAccount == null) {
                                    if (status == null) {
                                        status = Status.f8705t;
                                    }
                                    googleSignInResult = new GoogleSignInResult(null, status);
                                } else {
                                    googleSignInResult = new GoogleSignInResult(googleSignInAccount, Status.f8703e);
                                }
                                Status status2 = googleSignInResult.f8509a;
                                status2.getClass();
                                if (!status2.D1()) {
                                    Toast.makeText(gVar.f4947a, ff.h.y(loginActivity, R.string.error), 0).show();
                                    break;
                                } else {
                                    GoogleSignInAccount googleSignInAccount2 = googleSignInResult.f8510b;
                                    if (googleSignInAccount2 != null) {
                                        Uri uri = googleSignInAccount2.f8489e;
                                        String strValueOf = uri != null ? String.valueOf(uri) : BuildConfig.VERSION_NAME;
                                        String str = googleSignInAccount2.f8488d;
                                        if (str != null) {
                                            r9 = str;
                                        } else {
                                            try {
                                                String str2 = googleSignInAccount2.f8487c;
                                                if (str2 != null && oz.q.W0(str2, new String[]{"@"}, 0, 6).toArray(new String[0]).length >= 2) {
                                                    String str3 = ((String[]) oz.q.W0(str2, new String[]{"@"}, 0, 6).toArray(new String[0]))[0];
                                                    kotlin.jvm.internal.m.f(str3, "str");
                                                    char cCharAt = str3.charAt(str3.length() - 1);
                                                    if (cCharAt == '!' || cCharAt == '.' || cCharAt == '?' || cCharAt == 12290 || cCharAt == 65281 || cCharAt == 65311) {
                                                        str3 = str3.substring(0, str3.length() - 1);
                                                        kotlin.jvm.internal.m.e(str3, "substring(...)");
                                                    }
                                                    r9 = str3;
                                                }
                                            } catch (Exception e8) {
                                                e8.printStackTrace();
                                            }
                                        }
                                        String str4 = googleSignInAccount2.f8485a;
                                        String str5 = str4 == null ? BuildConfig.VERSION_NAME : str4;
                                        ?? r11 = r9 == 0 ? BuildConfig.VERSION_NAME : r9;
                                        String str6 = googleSignInAccount2.f8487c;
                                        loginActivity.r(true);
                                        loginActivity.q().c(new wu.y(str5, r11, "gg", str6, strValueOf));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        int i16 = LoginActivity.Q;
                        kotlin.jvm.internal.m.f(it, "it");
                        int i17 = it.f33864a;
                        if (i17 == 3005) {
                            loginActivity.setResult(INTENTS.RESULT_SIGN_UP_SUCCESS);
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(loginActivity), null, null, new e2(loginActivity, r9, i13), 3);
                            loginActivity.finish();
                        } else if (i17 == 3012) {
                            try {
                                loginActivity.r(true);
                                Intent intent2 = it.f33865b;
                                loginActivity.q().c(new wu.z(intent2 != null ? (LawInfo) intent2.getParcelableExtra(INTENTS.EXTRA_OBJECT) : null));
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                        break;
                }
            }
        });
        final int i12 = 1;
        this.P = registerForActivityResult(new e1(4), new b(this) { // from class: bp.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f4855b;

            {
                this.f4855b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [vy.d] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* JADX WARN: Type inference failed for: r2v8 */
            /* JADX WARN: Type inference failed for: r9v2 */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r9v4 */
            @Override // i.b
            public final void f(Object obj) {
                GoogleSignInResult googleSignInResult;
                int i13 = i12;
                ?? r9 = 0;
                r9 = 0;
                r9 = 0;
                LoginActivity loginActivity = this.f4855b;
                int i14 = 1;
                i.a it = (i.a) obj;
                switch (i13) {
                    case 0:
                        int i15 = LoginActivity.Q;
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.g gVar = loginActivity.M;
                        if (gVar != null) {
                            int i16 = it.f33864a;
                            Intent intent = it.f33865b;
                            if (i16 == -1 && intent != null) {
                                Auth.f8352b.getClass();
                                Logger logger = zbm.f8547a;
                                Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
                                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
                                if (googleSignInAccount == null) {
                                    if (status == null) {
                                        status = Status.f8705t;
                                    }
                                    googleSignInResult = new GoogleSignInResult(null, status);
                                } else {
                                    googleSignInResult = new GoogleSignInResult(googleSignInAccount, Status.f8703e);
                                }
                                Status status2 = googleSignInResult.f8509a;
                                status2.getClass();
                                if (!status2.D1()) {
                                    Toast.makeText(gVar.f4947a, ff.h.y(loginActivity, R.string.error), 0).show();
                                    break;
                                } else {
                                    GoogleSignInAccount googleSignInAccount2 = googleSignInResult.f8510b;
                                    if (googleSignInAccount2 != null) {
                                        Uri uri = googleSignInAccount2.f8489e;
                                        String strValueOf = uri != null ? String.valueOf(uri) : BuildConfig.VERSION_NAME;
                                        String str = googleSignInAccount2.f8488d;
                                        if (str != null) {
                                            r9 = str;
                                        } else {
                                            try {
                                                String str2 = googleSignInAccount2.f8487c;
                                                if (str2 != null && oz.q.W0(str2, new String[]{"@"}, 0, 6).toArray(new String[0]).length >= 2) {
                                                    String str3 = ((String[]) oz.q.W0(str2, new String[]{"@"}, 0, 6).toArray(new String[0]))[0];
                                                    kotlin.jvm.internal.m.f(str3, "str");
                                                    char cCharAt = str3.charAt(str3.length() - 1);
                                                    if (cCharAt == '!' || cCharAt == '.' || cCharAt == '?' || cCharAt == 12290 || cCharAt == 65281 || cCharAt == 65311) {
                                                        str3 = str3.substring(0, str3.length() - 1);
                                                        kotlin.jvm.internal.m.e(str3, "substring(...)");
                                                    }
                                                    r9 = str3;
                                                }
                                            } catch (Exception e8) {
                                                e8.printStackTrace();
                                            }
                                        }
                                        String str4 = googleSignInAccount2.f8485a;
                                        String str5 = str4 == null ? BuildConfig.VERSION_NAME : str4;
                                        ?? r11 = r9 == 0 ? BuildConfig.VERSION_NAME : r9;
                                        String str6 = googleSignInAccount2.f8487c;
                                        loginActivity.r(true);
                                        loginActivity.q().c(new wu.y(str5, r11, "gg", str6, strValueOf));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        int i17 = LoginActivity.Q;
                        kotlin.jvm.internal.m.f(it, "it");
                        int i18 = it.f33864a;
                        if (i18 == 3005) {
                            loginActivity.setResult(INTENTS.RESULT_SIGN_UP_SUCCESS);
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(loginActivity), null, null, new e2(loginActivity, r9, i14), 3);
                            loginActivity.finish();
                        } else if (i18 == 3012) {
                            try {
                                loginActivity.r(true);
                                Intent intent2 = it.f33865b;
                                loginActivity.q().c(new wu.z(intent2 != null ? (LawInfo) intent2.getParcelableExtra(INTENTS.EXTRA_OBJECT) : null));
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                        break;
                }
            }
        });
    }

    @Override // xg.d
    public final void j(final Bundle bundle, n nVar, final int i11) {
        s sVar;
        x1 x1VarT;
        e eVar;
        v vVar;
        s sVar2 = (s) nVar;
        sVar2.f0(1693554089);
        int i12 = (sVar2.h(this) ? 32 : 16) | i11;
        if (sVar2.T(i12 & 1, (i12 & 17) != 16)) {
            Object objQ = sVar2.Q();
            l1.g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(Boolean.FALSE);
                sVar2.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            boolean zH = sVar2.h(this);
            Object objQ2 = sVar2.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new f0(3, this, b1Var, null);
                sVar2.o0(objQ2);
            }
            t.f((e) objQ2, b0.f48488a, sVar2);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                p((o) t.o(q().H, sVar2).getValue(), sVar2, i12 & 112);
                Object objQ3 = sVar2.Q();
                if (objQ3 == gVar) {
                    objQ3 = t.B(BuildConfig.VERSION_NAME);
                    sVar2.o0(objQ3);
                }
                b1 b1Var2 = (b1) objQ3;
                Object objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = t.B(BuildConfig.VERSION_NAME);
                    sVar2.o0(objQ4);
                }
                b1 b1Var3 = (b1) objQ4;
                Object objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    objQ5 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ5);
                }
                b1 b1Var4 = (b1) objQ5;
                Object objQ6 = sVar2.Q();
                if (objQ6 == gVar) {
                    objQ6 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ6);
                }
                b1 b1Var5 = (b1) objQ6;
                Object objQ7 = sVar2.Q();
                if (objQ7 == gVar) {
                    objQ7 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ7);
                }
                b1 b1Var6 = (b1) objQ7;
                Resources resources = ((Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b)).getResources();
                if (((Boolean) this.H.getValue()).booleanValue()) {
                    sVar2.d0(-308847038);
                    kotlin.jvm.internal.m.c(resources);
                    a.d(resources, sVar2, 0);
                } else {
                    sVar2.d0(-315026919);
                }
                sVar2.p(false);
                v vVarH = x.H(new c0[0], sVar2);
                boolean zH2 = sVar2.h(resources) | sVar2.h(this) | sVar2.h(vVarH);
                Object objQ8 = sVar2.Q();
                if (zH2 || objQ8 == gVar) {
                    vVar = vVarH;
                    r rVar = new r(resources, this, vVar, b1Var2, b1Var3, b1Var4, b1Var5, b1Var6, 1);
                    sVar2.o0(rVar);
                    objQ8 = rVar;
                } else {
                    vVar = vVarH;
                }
                sVar = sVar2;
                com.bumptech.glide.e.c(vVar, "login", null, null, null, null, null, null, (fz.c) objQ8, sVar, 48);
            } else {
                x1VarT = sVar2.t();
                if (x1VarT == null) {
                    return;
                }
                final int i13 = 0;
                eVar = new e(this, bundle, i11, i13) { // from class: bp.a2

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f4484a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ LoginActivity f4485b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Bundle f4486c;

                    {
                        this.f4484a = i13;
                        this.f4485b = this;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = this.f4484a;
                        qy.b0 b0Var = qy.b0.f48488a;
                        Bundle bundle2 = this.f4486c;
                        LoginActivity loginActivity = this.f4485b;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        int i15 = LoginActivity.Q;
                        switch (i14) {
                            case 0:
                                loginActivity.j(bundle2, nVar2, l1.t.M(1));
                                break;
                            default:
                                loginActivity.j(bundle2, nVar2, l1.t.M(1));
                                break;
                        }
                        return b0Var;
                    }
                };
            }
            x1VarT.f39502d = eVar;
        }
        sVar = sVar2;
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i14 = 1;
            eVar = new e(this, bundle, i11, i14) { // from class: bp.a2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f4484a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LoginActivity f4485b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Bundle f4486c;

                {
                    this.f4484a = i14;
                    this.f4485b = this;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f4484a;
                    qy.b0 b0Var = qy.b0.f48488a;
                    Bundle bundle2 = this.f4486c;
                    LoginActivity loginActivity = this.f4485b;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    int i16 = LoginActivity.Q;
                    switch (i15) {
                        case 0:
                            loginActivity.j(bundle2, nVar2, l1.t.M(1));
                            break;
                        default:
                            loginActivity.j(bundle2, nVar2, l1.t.M(1));
                            break;
                    }
                    return b0Var;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    public final void p(o loginResultUiState, n nVar, int i11) {
        kotlin.jvm.internal.m.f(loginResultUiState, "loginResultUiState");
        s sVar = (s) nVar;
        sVar.f0(1168113814);
        int i12 = (sVar.h(loginResultUiState) ? 4 : 2) | i11 | (sVar.h(this) ? 32 : 16);
        int i13 = 0;
        if (!sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
        } else if (loginResultUiState instanceof k) {
            r(false);
            q().c(wu.x.f55472a);
            wu.d dVar = ((k) loginResultUiState).f55410a;
            if (dVar instanceof wu.c) {
                String str = ((wu.c) dVar).f55379a;
                if (str.length() > 0) {
                    List listW0 = q.W0(str, new String[]{" "}, 0, 6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listW0) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        if (hashSet.add((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    int size2 = arrayList2.size();
                    while (i13 < size2) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        String str2 = (String) obj3;
                        if (kotlin.jvm.internal.m.a(str2, "GG")) {
                            sb2.append("Google/");
                        } else if (kotlin.jvm.internal.m.a(str2, "FB")) {
                            sb2.append("Facebook/");
                        }
                    }
                    sb2.length();
                } else {
                    String string = getString(R.string.unregistered_email);
                    kotlin.jvm.internal.m.e(string, "getString(...)");
                    h.C(string);
                }
            } else if (dVar.equals(wu.a.f55372a)) {
                String string2 = getString(R.string.the_password_is_incorrect);
                kotlin.jvm.internal.m.e(string2, "getString(...)");
                h.C(string2);
            } else {
                if (!dVar.equals(wu.b.f55373a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String string3 = getString(R.string.error);
                kotlin.jvm.internal.m.e(string3, "getString(...)");
                h.C(string3);
            }
        } else if (loginResultUiState.equals(wu.m.f55421a)) {
            r(false);
            int i15 = this.K;
            Intent intent = new Intent(this, (Class<?>) LoginCheckLocateAgeActivity.class);
            intent.putExtra(INTENTS.EXTRA_BOOLEAN, true);
            intent.putExtra(INTENTS.EXTRA_INT, i15);
            this.P.a(intent);
        } else if (loginResultUiState instanceof wu.n) {
            String str3 = ((wu.n) loginResultUiState).f55423a;
            if (this.K == 11) {
                p0.w(26, f10.e.b());
            }
            Intent intent2 = new Intent();
            intent2.putExtra(INTENTS.EXTRA_STRING, str3);
            setResult(INTENTS.RESLUT_LOGIN_SUCCESS, intent2);
            e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e2(this, null, 0), 3);
        } else if (!loginResultUiState.equals(l.f55416a)) {
            throw new NoWhenBranchMatchedException();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.h(this, i11, 6, loginResultUiState);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final wu.v q() {
        return (wu.v) this.f22042t.getValue();
    }

    public final void r(boolean z11) {
        this.H.setValue(Boolean.valueOf(z11));
    }
}
