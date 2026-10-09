package com.lingo.lingoskill.ui.base;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import androidx.fragment.app.e1;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import bp.c3;
import bp.d3;
import bp.e3;
import bp.f3;
import bp.g;
import bp.g2;
import bq.r;
import cf.x;
import com.adjust.sdk.Constants;
import com.bumptech.glide.d;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessaging;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.http.msg.RemoteConfigWorker;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.speak.ui.SpeakIndexActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.tbruyelle.rxpermissions3.RxPermissions;
import com.yalantis.ucrop.view.CropImageView;
import dv.u0;
import f10.e;
import ff.h;
import fr.j3;
import fr.o0;
import gb.p;
import gp.w;
import hh.p0;
import hj.b0;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.b;
import kotlin.jvm.internal.m;
import n4.t;
import nf.f;
import ob.u;
import oi.c;
import oz.q;
import qf.a;
import qx.o;
import qy.j;
import rt.m9;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MainActivity extends b {
    public static final /* synthetic */ int U = 0;
    public c P;
    public final mi.c Q;
    public final Object R;
    public final MutableLiveData S;
    public final Object T;

    public MainActivity() {
        super(BuildConfig.VERSION_NAME, d3.f4537a);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        this.Q = x.h();
        j jVar = j.NONE;
        this.R = d.u(jVar, new f3(this, 1));
        this.S = new MutableLiveData(Boolean.FALSE);
        this.T = d.u(j.SYNCHRONIZED, new f3(this, 0));
        d.u(jVar, new f3(this, 2));
        registerForActivityResult(new e1(4), new c3(this, 0));
        registerForActivityResult(new e1(4), new c3(this, 1));
    }

    @Override // androidx.fragment.app.p0, f.n, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        int i13 = 65535 & i11;
        if (i13 == 100 || i13 == 1007 || i11 == 3007 || i11 == 1004 || i13 == 1004) {
            if (i11 == 1004 || i13 == 1004) {
                p0.w(2, com.google.android.material.datepicker.d.e(3, e.b()));
            } else {
                if (i13 == 100 || i13 == 1007) {
                    p0.w(5, e.b());
                }
                p0.w(3, com.google.android.material.datepicker.d.e(2, com.google.android.material.datepicker.d.e(1, e.b())));
            }
            w wVarU = u();
            androidx.lifecycle.j jVar = new androidx.lifecycle.j(25);
            wVarU.getClass();
            wVarU.d(jVar);
        }
    }

    @Override // f.n, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e3(this, null, 4), 3);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, qy.h] */
    @Override // ji.b, androidx.fragment.app.p0, android.app.Activity
    public final void onResume() {
        MainActivity mainActivity;
        super.onResume();
        try {
            if (this.P == null) {
                mainActivity = this;
                try {
                    mainActivity.P = new c(getLifecycle(), mainActivity, this.Q, n(), (u0) this.T.getValue());
                } catch (Exception e8) {
                    e = e8;
                    e.printStackTrace();
                }
            } else {
                mainActivity = this;
            }
            c cVar = mainActivity.P;
            if (cVar != null) {
                ((mi.c) cVar.f44926b).g();
            }
        } catch (Exception e10) {
            e = e10;
            mainActivity = this;
        }
        u().f();
        MutableLiveData isStartToAudioLesson = mainActivity.S;
        m.f(isStartToAudioLesson, "isStartToAudioLesson");
        if (System.currentTimeMillis() - ((o0) l()).f27733a.lastUpdateRemoteConfigTime >= 3600000) {
            p pVarE = p.E(this);
            m.e(pVarE, "getInstance(context)");
            ob.m mVar = new ob.m(RemoteConfigWorker.class);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(INTENTS.EXTRA_BOOLEAN, Boolean.FALSE);
            fb.j jVar = new fb.j(linkedHashMap);
            j3.V(jVar);
            ((ob.p) mVar.f44827c).f44852e = jVar;
            pVarE.l(mVar.G());
        }
    }

    @Override // f.n, n4.h, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        m.f(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("VIEW_PAGER_POS", ((b0) j()).f32370c.getCurrentItem());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x019d  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x020f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0249  */
    /* JADX WARN: Code duplicated, block: B:67:0x0266  */
    /* JADX WARN: Code duplicated, block: B:68:0x0283  */
    /* JADX WARN: Code duplicated, block: B:75:0x034a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ji.b
    public final void p(Uri uri) {
        uri.toString();
        String string = uri.toString();
        LanguageItem languageItem = null;
        switch (string.hashCode()) {
            case -1748713420:
                if (string.equals("https://lingodeer.com/adbilling")) {
                    return;
                }
                break;
            case -576032064:
                if (string.equals("https://lingodeer.com/tp")) {
                    int iD = th.j.d();
                    if (iD == 40) {
                        int i11 = ((o0) l()).f27733a.locateLanguage;
                        int[] iArr = r.f4959a;
                        languageItem = new LanguageItem(45, i11, bq.m.s(this, th.j.d()));
                    } else if (iD == 51) {
                        int i12 = ((o0) l()).f27733a.locateLanguage;
                        int[] iArr2 = r.f4959a;
                        languageItem = new LanguageItem(52, i12, bq.m.s(this, th.j.d()));
                    } else if (iD == 57) {
                        int i13 = ((o0) l()).f27733a.locateLanguage;
                        int[] iArr3 = r.f4959a;
                        languageItem = new LanguageItem(59, i13, bq.m.s(this, th.j.d()));
                    } else if (iD == 61) {
                        int i14 = ((o0) l()).f27733a.locateLanguage;
                        int[] iArr4 = r.f4959a;
                        languageItem = new LanguageItem(62, i14, bq.m.s(this, th.j.d()));
                    } else if (iD == 63) {
                        int i15 = ((o0) l()).f27733a.locateLanguage;
                        int[] iArr5 = r.f4959a;
                        languageItem = new LanguageItem(64, i15, bq.m.s(this, th.j.d()));
                    } else if (iD == 65) {
                        int i16 = ((o0) l()).f27733a.locateLanguage;
                        int[] iArr6 = r.f4959a;
                        languageItem = new LanguageItem(66, i16, bq.m.s(this, th.j.d()));
                    } else if (iD != 69) {
                        switch (iD) {
                            case 0:
                                int i17 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr7 = r.f4959a;
                                languageItem = new LanguageItem(32, i17, bq.m.s(this, th.j.d()));
                                break;
                            case 1:
                                int i18 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr8 = r.f4959a;
                                languageItem = new LanguageItem(37, i18, bq.m.s(this, th.j.d()));
                                break;
                            case 2:
                                int i19 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr9 = r.f4959a;
                                languageItem = new LanguageItem(38, i19, bq.m.s(this, th.j.d()));
                                break;
                            case 3:
                                int i21 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr10 = r.f4959a;
                                languageItem = new LanguageItem(44, i21, bq.m.s(this, th.j.d()));
                                break;
                            case 4:
                                int i22 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr11 = r.f4959a;
                                languageItem = new LanguageItem(39, i22, bq.m.s(this, th.j.d()));
                                break;
                            case 5:
                                int i23 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr12 = r.f4959a;
                                languageItem = new LanguageItem(36, i23, bq.m.s(this, th.j.d()));
                                break;
                            case 6:
                                int i24 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr13 = r.f4959a;
                                languageItem = new LanguageItem(43, i24, bq.m.s(this, th.j.d()));
                                break;
                            case 7:
                                int i25 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr14 = r.f4959a;
                                languageItem = new LanguageItem(56, i25, bq.m.s(this, th.j.d()));
                                break;
                            case 8:
                                int i26 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr15 = r.f4959a;
                                languageItem = new LanguageItem(46, i26, bq.m.s(this, th.j.d()));
                                break;
                            default:
                                switch (iD) {
                                    case 10:
                                    case 22:
                                        int i27 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr16 = r.f4959a;
                                        languageItem = new LanguageItem(41, i27, bq.m.s(this, th.j.d()));
                                        break;
                                    case 11:
                                        int i110 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr17 = r.f4959a;
                                        languageItem = new LanguageItem(32, i110, bq.m.s(this, th.j.d()));
                                        break;
                                    case 12:
                                        int i111 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr18 = r.f4959a;
                                        languageItem = new LanguageItem(37, i111, bq.m.s(this, th.j.d()));
                                        break;
                                    case 13:
                                        int i112 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr19 = r.f4959a;
                                        languageItem = new LanguageItem(38, i112, bq.m.s(this, th.j.d()));
                                        break;
                                    case 14:
                                        int i28 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr110 = r.f4959a;
                                        languageItem = new LanguageItem(39, i28, bq.m.s(this, th.j.d()));
                                        break;
                                    case 15:
                                        int i29 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr111 = r.f4959a;
                                        languageItem = new LanguageItem(36, i29, bq.m.s(this, th.j.d()));
                                        break;
                                    case 16:
                                        int i210 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr112 = r.f4959a;
                                        languageItem = new LanguageItem(43, i210, bq.m.s(this, th.j.d()));
                                        break;
                                    case 17:
                                        int i211 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr113 = r.f4959a;
                                        languageItem = new LanguageItem(46, i211, bq.m.s(this, th.j.d()));
                                        break;
                                    case 18:
                                        int i30 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr20 = r.f4959a;
                                        languageItem = new LanguageItem(67, i30, bq.m.s(this, th.j.d()));
                                        break;
                                    case 19:
                                        int i31 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr21 = r.f4959a;
                                        languageItem = new LanguageItem(68, i31, bq.m.s(this, th.j.d()));
                                        break;
                                    case 20:
                                        int i113 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr22 = r.f4959a;
                                        languageItem = new LanguageItem(45, i113, bq.m.s(this, th.j.d()));
                                        break;
                                    case 21:
                                        int i32 = ((o0) l()).f27733a.locateLanguage;
                                        int[] iArr23 = r.f4959a;
                                        languageItem = new LanguageItem(60, i32, bq.m.s(this, th.j.d()));
                                        break;
                                }
                                break;
                        }
                    } else {
                        int i33 = ((o0) l()).f27733a.locateLanguage;
                        int[] iArr24 = r.f4959a;
                        languageItem = new LanguageItem(70, i33, bq.m.s(this, th.j.d()));
                    }
                    if (languageItem != null) {
                        Intent intent = new Intent(this, (Class<?>) SwitchLanguageActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, languageItem);
                        intent.putExtra(INTENTS.EXTRA_BOOLEAN, true);
                        intent.putExtra(INTENTS.EXTRA_STRING, BuildConfig.VERSION_NAME);
                        startActivity(intent);
                        return;
                    }
                    return;
                }
                break;
            case 783403191:
                if (string.equals("https://lingodeer.com/billing")) {
                    Intent intent2 = new Intent(this, (Class<?>) Subscription2Activity.class);
                    intent2.putExtra(INTENTS.EXTRA_STRING, Constants.DEEPLINK);
                    startActivity(intent2);
                    return;
                }
                break;
            case 835556448:
                if (string.equals("https://lingodeer.com/fluent")) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    int i34 = x.n().keyLanguage;
                    if (i34 == 0) {
                        int i35 = ((o0) l()).f27733a.locateLanguage;
                        int[] iArr25 = r.f4959a;
                        languageItem = new LanguageItem(35, i35, bq.m.s(this, x.n().keyLanguage));
                    } else if (i34 == 1) {
                        int i36 = ((o0) l()).f27733a.locateLanguage;
                        int[] iArr26 = r.f4959a;
                        languageItem = new LanguageItem(30, i36, bq.m.s(this, x.n().keyLanguage));
                    } else if (i34 != 2) {
                        switch (i34) {
                            case 11:
                                int i37 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr27 = r.f4959a;
                                languageItem = new LanguageItem(35, i37, bq.m.s(this, x.n().keyLanguage));
                                break;
                            case 12:
                                int i38 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr28 = r.f4959a;
                                languageItem = new LanguageItem(30, i38, bq.m.s(this, x.n().keyLanguage));
                                break;
                            case 13:
                                int i39 = ((o0) l()).f27733a.locateLanguage;
                                int[] iArr29 = r.f4959a;
                                languageItem = new LanguageItem(31, i39, bq.m.s(this, x.n().keyLanguage));
                                break;
                        }
                    } else {
                        int i310 = ((o0) l()).f27733a.locateLanguage;
                        int[] iArr210 = r.f4959a;
                        languageItem = new LanguageItem(31, i310, bq.m.s(this, x.n().keyLanguage));
                    }
                    if (languageItem != null) {
                        Intent intent3 = new Intent(this, (Class<?>) SwitchLanguageActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_OBJECT, languageItem);
                        intent3.putExtra(INTENTS.EXTRA_BOOLEAN, true);
                        intent3.putExtra(INTENTS.EXTRA_STRING, BuildConfig.VERSION_NAME);
                        startActivity(intent3);
                        return;
                    }
                    return;
                }
                break;
            case 1289878358:
                if (string.equals("https://lingodeer.com/specialDiscount")) {
                    return;
                }
                break;
            case 1358719280:
                if (string.equals("https://lingodeer.com/xuehua")) {
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    if (x.n().keyLanguage == 0) {
                        Intent intent4 = new Intent(this, (Class<?>) SpeakIndexActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_INT, 46);
                        intent4.putExtra(INTENTS.EXTRA_LONG, 1L);
                        startActivity(intent4);
                        return;
                    }
                    return;
                }
                break;
        }
        s(uri);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        ve.d dVar = ve.d.f53979a;
        int i11 = 0;
        if (!a.b(ve.d.class)) {
            try {
                ve.d.f53984f.set(false);
            } catch (Throwable th2) {
                a.a(ve.d.class, th2);
            }
        }
        int[] iArr = r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (bq.m.r(x.n().keyLanguage).length() == 0) {
            finish();
            return;
        }
        m().c("jxz_enter_app", new m9(26));
        int i12 = 3;
        int i13 = 2;
        if (q.v0("release", "debug", false)) {
            FirebaseMessaging.c().e().addOnCompleteListener(new c3(this, 2));
            Object obj = FirebaseInstallations.m;
            ((FirebaseInstallations) FirebaseApp.e().c(FirebaseInstallationsApi.class)).a().addOnCompleteListener(new c3(this, 3));
        }
        vy.d dVar2 = null;
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e3(this, dVar2, i13), 3);
        int i14 = 5;
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e3(this, dVar2, i14), 3);
        try {
            if (Settings.Global.getFloat(getBaseContext().getContentResolver(), "animator_duration_scale", CropImageView.DEFAULT_ASPECT_RATIO) == CropImageView.DEFAULT_ASPECT_RATIO) {
                try {
                    Class<?> cls = Class.forName("android.animation.ValueAnimator");
                    Class cls2 = Float.TYPE;
                    m.c(cls2);
                    cls.getMethod("setDurationScale", cls2).invoke(null, Float.valueOf(1.0f));
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        int i15 = 1;
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e3(this, dVar2, i15), 3);
        yx.d dVarM = new yx.a(new g(7), i15).M(ky.e.f38937b);
        o oVarA = px.b.a();
        f fVar = new f(2);
        re.q qVar = vx.b.f54316e;
        try {
            dVarM.K(new yx.b(new xx.d(qVar, fVar), oVarA));
            e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g2(i13, i15, dVar2), 3);
            e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e3(this, dVar2, i12), 3);
            h.s(h.u("dp_240"));
            h.l(240.0f);
            if (new t(this).f43230a.areNotificationsEnabled()) {
                e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e3(this, dVar2, i11), 3);
                er.c.h();
            } else if (Build.VERSION.SDK_INT >= 33) {
                a5.j jVar = new a5.j(this, 3);
                RxPermissions rxPermissions = new RxPermissions(this);
                rxPermissions.setLogging(true);
                if (rxPermissions.isGranted("android.permission.POST_NOTIFICATIONS")) {
                    jVar.m();
                } else {
                    rxPermissions.request("android.permission.POST_NOTIFICATIONS").h(new u(16, jVar, this), qVar);
                }
            }
            ((b0) j()).f32369b.setContent(new t1.d(new androidx.lifecycle.viewmodel.compose.a(this, i14), true, 1087616235));
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th4) {
            throw w4.c.d(th4, th4, "Actually not, but can't pass out an exception otherwise...", th4);
        }
    }

    @Override // ji.b
    public final boolean t() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final w u() {
        return (w) this.R.getValue();
    }
}
