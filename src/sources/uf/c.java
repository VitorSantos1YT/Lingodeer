package uf;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.k0;
import b1.p;
import com.facebook.FacebookException;
import com.facebook.login.widget.LoginButton;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.m;
import lp.j;
import ns.o;
import oz.q;
import re.f0;
import re.i0;
import re.k;
import tf.b0;
import tf.d0;
import tf.h0;
import tf.s;
import tf.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoginButton f52955a;

    public c(LoginButton loginButton) {
        this.f52955a = loginButton;
    }

    public d0 a() {
        h0 targetApp;
        LoginButton loginButton = this.f52955a;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            d0 d0VarC = d0.f52154i.c();
            tf.e defaultAudience = loginButton.getDefaultAudience();
            m.f(defaultAudience, "defaultAudience");
            d0VarC.f52158b = defaultAudience;
            s loginBehavior = loginButton.getLoginBehavior();
            m.f(loginBehavior, "loginBehavior");
            d0VarC.f52157a = loginBehavior;
            if (qf.a.b(this)) {
                targetApp = null;
            } else {
                try {
                    targetApp = h0.FACEBOOK;
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                    targetApp = null;
                }
            }
            m.f(targetApp, "targetApp");
            d0VarC.f52163g = targetApp;
            String authType = loginButton.getAuthType();
            m.f(authType, "authType");
            d0VarC.f52160d = authType;
            qf.a.b(this);
            d0VarC.f52164h = loginButton.getShouldSkipAccountDeduplication();
            d0VarC.f52161e = loginButton.getMessengerPageId();
            d0VarC.f52162f = loginButton.getResetMessengerState();
            return d0VarC;
        } catch (Throwable th3) {
            qf.a.a(this, th3);
            return null;
        }
    }

    public final void b() {
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        String strW;
        ArrayList arrayList2;
        String strW2;
        ArrayList arrayList3;
        String strW3;
        c cVar = this;
        LoginButton loginButton = cVar.f52955a;
        if (qf.a.b(cVar)) {
            return;
        }
        try {
            d0 d0VarA = cVar.a();
            i.h hVar = loginButton.f7724c0;
            if (hVar == null) {
                if (loginButton.getFragment() != null) {
                    k0 fragment = loginButton.getFragment();
                    if (fragment != null) {
                        List list = loginButton.getProperties().f52949b;
                        String loggerID = loginButton.getLoggerID();
                        d0VarA.getClass();
                        p pVar = new p(fragment);
                        String string = UUID.randomUUID().toString();
                        m.e(string, "randomUUID().toString()");
                        lz.g gVar = new lz.g(43, 128, 1);
                        jz.d dVar = jz.e.f37397a;
                        int iN = hz.b.N(gVar);
                        Iterable cVar2 = new lz.c('a', 'z');
                        lz.c cVar3 = new lz.c('A', 'Z');
                        if (cVar2 instanceof Collection) {
                            arrayList3 = ry.m.H0((Collection) cVar2, cVar3);
                        } else {
                            arrayList3 = new ArrayList();
                            ry.m.d0(arrayList3, cVar2);
                            ry.m.d0(arrayList3, cVar3);
                        }
                        ArrayList arrayListG0 = ry.m.G0('~', ry.m.G0('_', ry.m.G0('.', ry.m.G0('-', ry.m.H0(arrayList3, new lz.c('0', '9'))))));
                        ArrayList arrayList4 = new ArrayList(iN);
                        for (int i11 = 0; i11 < iN; i11++) {
                            jz.d dVar2 = jz.e.f37397a;
                            Character ch2 = (Character) ry.m.I0(arrayListG0);
                            ch2.getClass();
                            arrayList4.add(ch2);
                        }
                        String codeVerifier = ry.m.y0(arrayList4, BuildConfig.VERSION_NAME, null, null, null, 62);
                        m.f(codeVerifier, "codeVerifier");
                        if (!((string.length() == 0 ? false : !(q.H0(string, ' ', 0, 6) >= 0)) && o.I(codeVerifier))) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        HashSet hashSet = list != null ? new HashSet(list) : new HashSet();
                        hashSet.add("openid");
                        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                        m.e(setUnmodifiableSet, "unmodifiableSet(permissions)");
                        tf.a aVar = tf.a.S256;
                        try {
                            strW3 = o.w(codeVerifier, aVar);
                        } catch (FacebookException unused) {
                            aVar = tf.a.PLAIN;
                            strW3 = codeVerifier;
                        }
                        tf.a aVar2 = aVar;
                        s sVar = d0VarA.f52157a;
                        Set setF1 = ry.m.f1(setUnmodifiableSet);
                        tf.e eVar = d0VarA.f52158b;
                        String str = d0VarA.f52160d;
                        String strB = re.s.b();
                        String string2 = UUID.randomUUID().toString();
                        m.e(string2, "randomUUID().toString()");
                        t tVar = new t(sVar, setF1, eVar, str, strB, string2, d0VarA.f52163g, string, codeVerifier, strW3, aVar2);
                        Date date = re.b.N;
                        tVar.f52219f = o.F();
                        tVar.L = d0VarA.f52161e;
                        tVar.M = d0VarA.f52162f;
                        tVar.O = false;
                        tVar.P = d0VarA.f52164h;
                        if (loggerID != null) {
                            tVar.f52218e = loggerID;
                        }
                        d0VarA.f(new qh.d(pVar), tVar);
                        return;
                    }
                    return;
                }
                if (loginButton.getNativeFragment() != null) {
                    Fragment nativeFragment = loginButton.getNativeFragment();
                    if (nativeFragment != null) {
                        List list2 = loginButton.getProperties().f52949b;
                        String loggerID2 = loginButton.getLoggerID();
                        d0VarA.getClass();
                        p pVar2 = new p(nativeFragment);
                        String string3 = UUID.randomUUID().toString();
                        m.e(string3, "randomUUID().toString()");
                        lz.g gVar2 = new lz.g(43, 128, 1);
                        jz.d dVar3 = jz.e.f37397a;
                        int iN2 = hz.b.N(gVar2);
                        Iterable cVar4 = new lz.c('a', 'z');
                        lz.c cVar5 = new lz.c('A', 'Z');
                        if (cVar4 instanceof Collection) {
                            arrayList2 = ry.m.H0((Collection) cVar4, cVar5);
                        } else {
                            arrayList2 = new ArrayList();
                            ry.m.d0(arrayList2, cVar4);
                            ry.m.d0(arrayList2, cVar5);
                        }
                        ArrayList arrayListG1 = ry.m.G0('~', ry.m.G0('_', ry.m.G0('.', ry.m.G0('-', ry.m.H0(arrayList2, new lz.c('0', '9'))))));
                        ArrayList arrayList5 = new ArrayList(iN2);
                        for (int i12 = 0; i12 < iN2; i12++) {
                            jz.d dVar4 = jz.e.f37397a;
                            Character ch3 = (Character) ry.m.I0(arrayListG1);
                            ch3.getClass();
                            arrayList5.add(ch3);
                        }
                        String codeVerifier2 = ry.m.y0(arrayList5, BuildConfig.VERSION_NAME, null, null, null, 62);
                        m.f(codeVerifier2, "codeVerifier");
                        if (!((string3.length() == 0 ? false : !(q.H0(string3, ' ', 0, 6) >= 0)) && o.I(codeVerifier2))) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        HashSet hashSet2 = list2 != null ? new HashSet(list2) : new HashSet();
                        hashSet2.add("openid");
                        Set setUnmodifiableSet2 = Collections.unmodifiableSet(hashSet2);
                        m.e(setUnmodifiableSet2, "unmodifiableSet(permissions)");
                        tf.a aVar3 = tf.a.S256;
                        try {
                            strW2 = o.w(codeVerifier2, aVar3);
                        } catch (FacebookException unused2) {
                            aVar3 = tf.a.PLAIN;
                            strW2 = codeVerifier2;
                        }
                        tf.a aVar4 = aVar3;
                        s sVar2 = d0VarA.f52157a;
                        Set setF2 = ry.m.f1(setUnmodifiableSet2);
                        tf.e eVar2 = d0VarA.f52158b;
                        String str2 = d0VarA.f52160d;
                        String strB2 = re.s.b();
                        String string4 = UUID.randomUUID().toString();
                        m.e(string4, "randomUUID().toString()");
                        t tVar2 = new t(sVar2, setF2, eVar2, str2, strB2, string4, d0VarA.f52163g, string3, codeVerifier2, strW2, aVar4);
                        Date date2 = re.b.N;
                        tVar2.f52219f = o.F();
                        tVar2.L = d0VarA.f52161e;
                        tVar2.M = d0VarA.f52162f;
                        tVar2.O = false;
                        tVar2.P = d0VarA.f52164h;
                        if (loggerID2 != null) {
                            tVar2.f52218e = loggerID2;
                        }
                        d0VarA.f(new qh.d(pVar2), tVar2);
                        return;
                    }
                    return;
                }
                Activity activity = loginButton.getActivity();
                List list3 = loginButton.getProperties().f52949b;
                String loggerID3 = loginButton.getLoggerID();
                d0VarA.getClass();
                m.f(activity, "activity");
                String string5 = UUID.randomUUID().toString();
                m.e(string5, "randomUUID().toString()");
                lz.g gVar3 = new lz.g(43, 128, 1);
                jz.d dVar5 = jz.e.f37397a;
                int iN3 = hz.b.N(gVar3);
                Iterable cVar6 = new lz.c('a', 'z');
                lz.c cVar7 = new lz.c('A', 'Z');
                if (cVar6 instanceof Collection) {
                    arrayList = ry.m.H0((Collection) cVar6, cVar7);
                } else {
                    arrayList = new ArrayList();
                    ry.m.d0(arrayList, cVar6);
                    ry.m.d0(arrayList, cVar7);
                }
                ArrayList arrayListG2 = ry.m.G0('~', ry.m.G0('_', ry.m.G0('.', ry.m.G0('-', ry.m.H0(arrayList, new lz.c('0', '9'))))));
                ArrayList arrayList6 = new ArrayList(iN3);
                for (int i13 = 0; i13 < iN3; i13++) {
                    jz.d dVar6 = jz.e.f37397a;
                    Character ch4 = (Character) ry.m.I0(arrayListG2);
                    ch4.getClass();
                    arrayList6.add(ch4);
                }
                String codeVerifier3 = ry.m.y0(arrayList6, BuildConfig.VERSION_NAME, null, null, null, 62);
                m.f(codeVerifier3, "codeVerifier");
                if (string5.length() == 0) {
                    z11 = true;
                    z12 = false;
                } else {
                    z11 = true;
                    z12 = !(q.H0(string5, ' ', 0, 6) >= 0);
                }
                if (!z12 || !o.I(codeVerifier3)) {
                    z11 = false;
                }
                if (!z11) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                HashSet hashSet3 = list3 != null ? new HashSet(list3) : new HashSet();
                hashSet3.add("openid");
                Set setUnmodifiableSet3 = Collections.unmodifiableSet(hashSet3);
                m.e(setUnmodifiableSet3, "unmodifiableSet(permissions)");
                tf.a aVar5 = tf.a.S256;
                try {
                    strW = o.w(codeVerifier3, aVar5);
                } catch (FacebookException unused3) {
                    aVar5 = tf.a.PLAIN;
                    strW = codeVerifier3;
                }
                tf.a aVar6 = aVar5;
                s sVar3 = d0VarA.f52157a;
                Set setF3 = ry.m.f1(setUnmodifiableSet3);
                tf.e eVar3 = d0VarA.f52158b;
                String str3 = d0VarA.f52160d;
                String strB3 = re.s.b();
                String string6 = UUID.randomUUID().toString();
                m.e(string6, "randomUUID().toString()");
                t tVar3 = new t(sVar3, setF3, eVar3, str3, strB3, string6, d0VarA.f52163g, string5, codeVerifier3, strW, aVar6);
                Date date3 = re.b.N;
                tVar3.f52219f = o.F();
                tVar3.L = d0VarA.f52161e;
                tVar3.M = d0VarA.f52162f;
                tVar3.O = false;
                tVar3.P = d0VarA.f52164h;
                if (loggerID3 != null) {
                    tVar3.f52218e = loggerID3;
                }
                d0VarA.f(new j(activity, 29), tVar3);
                return;
                th = th;
                cVar = this;
                qf.a.a(cVar, th);
                return;
            }
            try {
                b0 b0Var = (b0) hVar.f33878d;
                re.m callbackManager = loginButton.getCallbackManager();
                if (callbackManager == null) {
                    callbackManager = new lf.j();
                }
                b0Var.f52143a = callbackManager;
                hVar.a(loginButton.getProperties().f52949b);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            cVar = this;
        }
    }

    public final void c(Context context) {
        String string;
        LoginButton loginButton = this.f52955a;
        if (qf.a.b(this)) {
            return;
        }
        try {
            d0 d0VarA = a();
            if (!loginButton.L) {
                d0VarA.c();
                return;
            }
            String string2 = loginButton.getResources().getString(R.string.com_facebook_loginview_log_out_action);
            m.e(string2, "resources.getString(R.st…loginview_log_out_action)");
            String string3 = loginButton.getResources().getString(R.string.com_facebook_loginview_cancel_action);
            m.e(string3, "resources.getString(R.st…_loginview_cancel_action)");
            f0 f0Var = (f0) k.f49183f.n().f49187c;
            int i11 = 1;
            if ((f0Var != null ? f0Var.f49152e : null) != null) {
                String string4 = loginButton.getResources().getString(R.string.com_facebook_loginview_logged_in_as);
                m.e(string4, "resources.getString(R.st…k_loginview_logged_in_as)");
                string = String.format(string4, Arrays.copyOf(new Object[]{f0Var.f49152e}, 1));
            } else {
                string = loginButton.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
                m.e(string, "{\n          resources.ge…using_facebook)\n        }");
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new tf.h(d0VarA, i11)).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
            builder.create().show();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v11) {
        LoginButton loginButton = this.f52955a;
        if (qf.a.b(this)) {
            return;
        }
        try {
            m.f(v11, "v");
            int i11 = LoginButton.f7721d0;
            if (!qf.a.b(loginButton)) {
                try {
                    View.OnClickListener onClickListener = loginButton.f7710c;
                    if (onClickListener != null) {
                        onClickListener.onClick(v11);
                    }
                } catch (Throwable th2) {
                    qf.a.a(loginButton, th2);
                }
            }
            Date date = re.b.N;
            re.b bVarX = o.x();
            boolean zF = o.F();
            if (zF) {
                Context context = loginButton.getContext();
                m.e(context, "context");
                c(context);
            } else {
                b();
            }
            se.m mVar = new se.m(loginButton.getContext(), (String) null);
            Bundle bundle = new Bundle();
            bundle.putInt("logging_in", bVarX != null ? 0 : 1);
            bundle.putInt("access_token_expired", zF ? 1 : 0);
            re.s sVar = re.s.f49201a;
            if (i0.c()) {
                mVar.g("fb_login_view_usage", bundle);
            }
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }
}
