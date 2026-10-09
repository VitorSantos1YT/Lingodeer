package ar;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import bq.r;
import com.adjust.sdk.Constants;
import com.android.billingclient.api.j;
import com.android.billingclient.api.j0;
import com.android.billingclient.api.x;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.speak.ui.SpeakIndexActivity;
import com.lingo.lingoskill.ui.base.RemoteWhyLearnActivity;
import com.lingo.main.ui.MainComposeActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.tbruyelle.rxpermissions3.RxPermissions;
import fb.g0;
import fr.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Callable;
import jp.j1;
import kotlin.jvm.internal.m;
import n4.t;
import ob.u;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import oz.q;
import rt.m9;
import ry.l;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainComposeActivity f2842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oi.c f2843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.android.billingclient.api.d f2844c;

    public e(MainComposeActivity mainComposeActivity) {
        this.f2842a = mainComposeActivity;
    }

    public final void a(final com.android.billingclient.api.d dVar) {
        if (FirebaseRemoteConfig.d().b("show_gp_billing_iam")) {
            HashSet hashSet = new HashSet();
            hashSet.add(2);
            ArrayList<Integer> arrayList = new ArrayList<>(Collections.unmodifiableList(new ArrayList(hashSet)));
            a10.b bVar = new a10.b(16);
            if (!dVar.p()) {
                int i11 = zzc.f12272a;
                j jVar = j0.f7522a;
                return;
            }
            if (!dVar.f7485o) {
                int i12 = zzc.f12272a;
                j jVar2 = j0.f7522a;
                return;
            }
            final MainComposeActivity mainComposeActivity = this.f2842a;
            View viewFindViewById = mainComposeActivity.findViewById(R.id.content);
            IBinder windowToken = viewFindViewById.getWindowToken();
            Rect rect = new Rect();
            viewFindViewById.getGlobalVisibleRect(rect);
            final Bundle bundle = new Bundle();
            bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
            bundle.putInt("KEY_DIMEN_LEFT", rect.left);
            bundle.putInt("KEY_DIMEN_TOP", rect.top);
            bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
            bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
            bundle.putString("playBillingLibraryVersion", dVar.f7474c);
            String str = dVar.f7475d;
            if (str != null) {
                bundle.putString("playBillingLibraryWrapperVersion", str);
            }
            bundle.putIntegerArrayList("KEY_CATEGORY_IDS", arrayList);
            Handler handler = dVar.f7476e;
            final x xVar = new x(dVar, handler, bVar);
            com.android.billingclient.api.d.h(new Callable() { // from class: com.android.billingclient.api.v
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzam zzamVar;
                    d dVar2 = dVar;
                    Bundle bundle2 = bundle;
                    Activity activity = mainComposeActivity;
                    x xVar2 = xVar;
                    dVar2.getClass();
                    try {
                        synchronized (dVar2.f7472a) {
                            zzamVar = dVar2.f7480i;
                        }
                        if (zzamVar == null) {
                            dVar2.i(-1, zzie.SERVICE_RESET_TO_NULL, null);
                            return null;
                        }
                        zzamVar.k0(dVar2.f7478g.getPackageName(), bundle2, new z(new WeakReference(activity), xVar2));
                        return null;
                    } catch (DeadObjectException e8) {
                        dVar2.i(-1, zzie.SERVICE_CALL_EXCEPTION, e8);
                        return null;
                    } catch (Exception e10) {
                        dVar2.i(6, zzie.SERVICE_CALL_EXCEPTION, e10);
                        return null;
                    }
                }
            }, 5000L, null, handler, dVar.g());
            j jVar3 = j0.f7522a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0127  */
    /* JADX WARN: Code duplicated, block: B:37:0x0145  */
    /* JADX WARN: Code duplicated, block: B:38:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x0248  */
    /* JADX WARN: Code duplicated, block: B:71:0x0280  */
    /* JADX WARN: Code duplicated, block: B:72:0x029d  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x0311  */
    /* JADX WARN: Code duplicated, block: B:77:0x032e  */
    /* JADX WARN: Code duplicated, block: B:84:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0425  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    public final void b() {
        LanguageItem languageItem;
        LanguageItem languageItem2;
        LanguageItem languageItem3;
        LanguageItem languageItem4;
        LanguageItem languageItem5;
        LanguageItem languageItem6;
        MainComposeActivity mainComposeActivity = this.f2842a;
        mainComposeActivity.m().c("jxz_enter_app", new m9(26));
        LanguageItem languageItem7 = 0;
        LanguageItem languageItem8 = null;
        int i11 = 3;
        e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new c(this, languageItem7, i11), 3);
        if (((o0) mainComposeActivity.l()).z()) {
            FirebaseMessaging.c().e().addOnCompleteListener(new a10.b(17));
            Object obj = FirebaseInstallations.m;
            ((FirebaseInstallations) FirebaseApp.e().c(FirebaseInstallationsApi.class)).a().addOnCompleteListener(new a10.b(18));
        }
        e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new c(this, languageItem7, 1), 3);
        String stringExtra = mainComposeActivity.getIntent().getStringExtra("source");
        int i12 = 2;
        if (m.a(stringExtra, er.e.DISCOUNT_LAST_1H.c())) {
            mainComposeActivity.m().c("jxz_click_notification", new androidx.lifecycle.j(i11));
            e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new c(this, languageItem7, i12), 3);
        } else if (stringExtra != null && !q.K0(stringExtra)) {
            mainComposeActivity.m().c("jxz_click_notification", new a(stringExtra, 0));
        }
        String stringExtra2 = mainComposeActivity.getIntent().getStringExtra(Constants.DEEPLINK);
        if (stringExtra2 != null) {
            Uri uri = Uri.parse(stringExtra2);
            Objects.toString(uri);
            String string = uri.toString();
            switch (string.hashCode()) {
                case -1748713420:
                    if (!string.equals("https://lingodeer.com/adbilling")) {
                        mainComposeActivity.o(uri);
                    }
                    break;
                case -576032064:
                    if (!string.equals("https://lingodeer.com/tp")) {
                        mainComposeActivity.o(uri);
                    } else {
                        int iD = th.j.d();
                        if (iD == 40) {
                            int i13 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                            int[] iArr = r.f4959a;
                            languageItem7 = new LanguageItem(45, i13, bq.m.s(mainComposeActivity, th.j.d()));
                        } else if (iD == 51) {
                            int i14 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                            int[] iArr2 = r.f4959a;
                            languageItem = new LanguageItem(52, i14, bq.m.s(mainComposeActivity, th.j.d()));
                        } else if (iD == 57) {
                            int i15 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                            int[] iArr3 = r.f4959a;
                            languageItem2 = new LanguageItem(59, i15, bq.m.s(mainComposeActivity, th.j.d()));
                        } else if (iD == 61) {
                            int i16 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                            int[] iArr4 = r.f4959a;
                            languageItem3 = new LanguageItem(62, i16, bq.m.s(mainComposeActivity, th.j.d()));
                        } else if (iD == 63) {
                            int i17 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                            int[] iArr5 = r.f4959a;
                            languageItem4 = new LanguageItem(64, i17, bq.m.s(mainComposeActivity, th.j.d()));
                        } else if (iD == 65) {
                            int i18 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                            int[] iArr6 = r.f4959a;
                            languageItem5 = new LanguageItem(66, i18, bq.m.s(mainComposeActivity, th.j.d()));
                        } else if (iD != 69) {
                            switch (iD) {
                                case 0:
                                    int i19 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr7 = r.f4959a;
                                    languageItem7 = new LanguageItem(32, i19, bq.m.s(mainComposeActivity, th.j.d()));
                                    break;
                                case 1:
                                    int i21 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr8 = r.f4959a;
                                    languageItem7 = new LanguageItem(37, i21, bq.m.s(mainComposeActivity, th.j.d()));
                                    break;
                                case 2:
                                    int i22 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr9 = r.f4959a;
                                    languageItem7 = new LanguageItem(38, i22, bq.m.s(mainComposeActivity, th.j.d()));
                                    break;
                                case 3:
                                    int i23 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr10 = r.f4959a;
                                    languageItem7 = new LanguageItem(44, i23, bq.m.s(mainComposeActivity, th.j.d()));
                                    break;
                                case 4:
                                    int i24 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr11 = r.f4959a;
                                    languageItem7 = new LanguageItem(39, i24, bq.m.s(mainComposeActivity, th.j.d()));
                                    break;
                                case 5:
                                    int i25 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr12 = r.f4959a;
                                    languageItem7 = new LanguageItem(36, i25, bq.m.s(mainComposeActivity, th.j.d()));
                                    break;
                                case 6:
                                    int i26 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr13 = r.f4959a;
                                    languageItem7 = new LanguageItem(43, i26, bq.m.s(mainComposeActivity, th.j.d()));
                                    break;
                                case 7:
                                    int i27 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr14 = r.f4959a;
                                    languageItem7 = new LanguageItem(56, i27, bq.m.s(mainComposeActivity, th.j.d()));
                                    break;
                                case 8:
                                    int i28 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr15 = r.f4959a;
                                    languageItem7 = new LanguageItem(46, i28, bq.m.s(mainComposeActivity, th.j.d()));
                                    break;
                                default:
                                    switch (iD) {
                                        case 10:
                                        case 22:
                                            int i29 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr16 = r.f4959a;
                                            languageItem7 = new LanguageItem(41, i29, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                        case 11:
                                            int i110 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr17 = r.f4959a;
                                            languageItem7 = new LanguageItem(32, i110, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                        case 12:
                                            int i210 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr18 = r.f4959a;
                                            languageItem7 = new LanguageItem(37, i210, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                        case 13:
                                            int i211 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr19 = r.f4959a;
                                            languageItem7 = new LanguageItem(38, i211, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                        case 14:
                                            int i212 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr110 = r.f4959a;
                                            languageItem7 = new LanguageItem(39, i212, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                        case 15:
                                            int i213 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr111 = r.f4959a;
                                            languageItem7 = new LanguageItem(36, i213, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                        case 16:
                                            int i214 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr112 = r.f4959a;
                                            languageItem7 = new LanguageItem(43, i214, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                        case 17:
                                            int i215 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr113 = r.f4959a;
                                            languageItem7 = new LanguageItem(46, i215, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                        case 18:
                                            int i30 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr20 = r.f4959a;
                                            languageItem7 = new LanguageItem(67, i30, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                        case 19:
                                            int i31 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr21 = r.f4959a;
                                            languageItem7 = new LanguageItem(68, i31, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                        case 20:
                                            int i111 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr22 = r.f4959a;
                                            languageItem7 = new LanguageItem(45, i111, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                        case 21:
                                            int i32 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                            int[] iArr23 = r.f4959a;
                                            languageItem7 = new LanguageItem(60, i32, bq.m.s(mainComposeActivity, th.j.d()));
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            int i33 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                            int[] iArr24 = r.f4959a;
                            languageItem6 = new LanguageItem(70, i33, bq.m.s(mainComposeActivity, th.j.d()));
                        }
                        if (languageItem7 != 0) {
                            languageItem7 = languageItem;
                            languageItem7 = languageItem2;
                            languageItem7 = languageItem3;
                            languageItem7 = languageItem4;
                            languageItem7 = languageItem5;
                            languageItem7 = languageItem6;
                            int i34 = SwitchLanguageActivity.M;
                            mainComposeActivity.startActivity(tw.c.p(mainComposeActivity, languageItem7, (8 & 4) != 0, OYAvlbfUyD.xZnwOYMncSkzgRT));
                        }
                    }
                    break;
                case 783403191:
                    if (!string.equals("https://lingodeer.com/billing")) {
                        mainComposeActivity.o(uri);
                    } else {
                        int i35 = Subscription2Activity.K;
                        mainComposeActivity.startActivity(g0.u(mainComposeActivity, Constants.DEEPLINK));
                    }
                    break;
                case 835556448:
                    if (!string.equals("https://lingodeer.com/fluent")) {
                        mainComposeActivity.o(uri);
                    } else {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        int i36 = cf.x.n().keyLanguage;
                        if (i36 == 0) {
                            int i37 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                            int[] iArr25 = r.f4959a;
                            languageItem8 = new LanguageItem(35, i37, bq.m.s(mainComposeActivity, cf.x.n().keyLanguage));
                        } else if (i36 == 1) {
                            int i38 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                            int[] iArr26 = r.f4959a;
                            languageItem8 = new LanguageItem(30, i38, bq.m.s(mainComposeActivity, cf.x.n().keyLanguage));
                        } else if (i36 != 2) {
                            switch (i36) {
                                case 11:
                                    int i39 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr27 = r.f4959a;
                                    languageItem8 = new LanguageItem(35, i39, bq.m.s(mainComposeActivity, cf.x.n().keyLanguage));
                                    break;
                                case 12:
                                    int i310 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr28 = r.f4959a;
                                    languageItem8 = new LanguageItem(30, i310, bq.m.s(mainComposeActivity, cf.x.n().keyLanguage));
                                    break;
                                case 13:
                                    int i40 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                                    int[] iArr29 = r.f4959a;
                                    languageItem8 = new LanguageItem(31, i40, bq.m.s(mainComposeActivity, cf.x.n().keyLanguage));
                                    break;
                            }
                        } else {
                            int i41 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                            int[] iArr210 = r.f4959a;
                            languageItem8 = new LanguageItem(31, i41, bq.m.s(mainComposeActivity, cf.x.n().keyLanguage));
                        }
                        if (languageItem8 != null) {
                            int i42 = SwitchLanguageActivity.M;
                            mainComposeActivity.startActivity(tw.c.p(mainComposeActivity, languageItem8, (8 & 4) != 0, OYAvlbfUyD.xZnwOYMncSkzgRT));
                        }
                    }
                    break;
                case 1289878358:
                    if (!string.equals("https://lingodeer.com/specialDiscount")) {
                        mainComposeActivity.o(uri);
                    }
                    break;
                case 1358719280:
                    if (!string.equals("https://lingodeer.com/xuehua")) {
                        mainComposeActivity.o(uri);
                    } else {
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (cf.x.n().keyLanguage == 0) {
                            int i43 = SpeakIndexActivity.R;
                            Intent intent = new Intent(mainComposeActivity, (Class<?>) SpeakIndexActivity.class);
                            intent.putExtra(INTENTS.EXTRA_INT, 46);
                            intent.putExtra(INTENTS.EXTRA_LONG, 1L);
                            mainComposeActivity.startActivity(intent);
                        }
                    }
                    break;
                default:
                    mainComposeActivity.o(uri);
                    break;
            }
        } else {
            String stringExtra3 = mainComposeActivity.getIntent().getStringExtra("url");
            if (stringExtra3 != null && stringExtra3.length() > 0) {
                if (l.D(new String[]{"https://blog.lingodeer.com/is-lingodeer-premium-worth-it/", "https://blog.lingodeer.com/why-lingodeer-premium-osusume-jp/"}, stringExtra3)) {
                    mainComposeActivity.m().c("jxz_click_notification", new androidx.lifecycle.j(4));
                }
                if (m.a(mainComposeActivity.getIntent().getStringExtra("oib"), "true")) {
                    try {
                        mainComposeActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(stringExtra3)));
                    } catch (Exception unused) {
                        Bundle bundle = new Bundle();
                        bundle.putString(INTENTS.EXTRA_STRING, stringExtra3);
                        bundle.putString(INTENTS.EXTRA_STRING_2, BuildConfig.VERSION_NAME);
                        j1 j1Var = new j1();
                        j1Var.setArguments(bundle);
                        j1Var.u(mainComposeActivity.getSupportFragmentManager(), "RemoteUrlDialogFragment");
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(INTENTS.EXTRA_STRING, stringExtra3);
                    bundle2.putString(INTENTS.EXTRA_STRING_2, BuildConfig.VERSION_NAME);
                    j1 j1Var2 = new j1();
                    j1Var2.setArguments(bundle2);
                    j1Var2.u(mainComposeActivity.getSupportFragmentManager(), "RemoteUrlDialogFragment");
                }
            }
            String stringExtra4 = mainComposeActivity.getIntent().getStringExtra("type");
            if (stringExtra4 != null) {
                if (stringExtra4.equals("WHY_LEARN_LINGODEER")) {
                    int i44 = RemoteWhyLearnActivity.P;
                    mainComposeActivity.startActivity(new Intent(mainComposeActivity, (Class<?>) RemoteWhyLearnActivity.class));
                } else {
                    stringExtra4.equals("SBP");
                }
            }
        }
        languageItem7 = languageItem;
        languageItem7 = languageItem2;
        languageItem7 = languageItem3;
        languageItem7 = languageItem4;
        languageItem7 = languageItem5;
        languageItem7 = languageItem6;
        Uri uri2 = LingoSkillApplication.f21668e;
        Uri EMPTY = Uri.EMPTY;
        if (!m.a(uri2, EMPTY)) {
            mainComposeActivity.o(LingoSkillApplication.f21668e);
            m.e(EMPTY, "EMPTY");
            LingoSkillApplication.f21668e = EMPTY;
        }
        if (new t(mainComposeActivity).f43230a.areNotificationsEnabled()) {
            c();
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a5.j jVar = new a5.j(this, 1);
            RxPermissions rxPermissions = new RxPermissions(mainComposeActivity);
            rxPermissions.setLogging(true);
            if (rxPermissions.isGranted("android.permission.POST_NOTIFICATIONS")) {
                jVar.m();
            } else {
                rxPermissions.request("android.permission.POST_NOTIFICATIONS").h(new u(16, jVar, mainComposeActivity), vx.b.f54316e);
            }
        }
    }

    public final void c() {
        MainComposeActivity mainComposeActivity = this.f2842a;
        vy.d dVar = null;
        e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new c(this, dVar, 0), 3);
        e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new b(this, dVar, 0), 3);
        er.c.h();
        er.c cVar = er.c.f25748a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication);
        cVar.j(lingoSkillApplication);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (r13 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(xy.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ar.d
            if (r0 == 0) goto L13
            r0 = r13
            ar.d r0 = (ar.d) r0
            int r1 = r0.f2841c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2841c = r1
            goto L18
        L13:
            ar.d r0 = new ar.d
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f2839a
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f2841c
            qy.b0 r3 = qy.b0.f48488a
            com.lingo.main.ui.MainComposeActivity r4 = r12.f2842a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L37
            if (r2 != r5) goto L2f
            com.bumptech.glide.e.F(r13)
            goto La4
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L37:
            com.bumptech.glide.e.F(r13)
            goto L4d
        L3b:
            com.bumptech.glide.e.F(r13)
            wt.o0 r13 = r4.n()
            wt.m0 r13 = r13.f55339f
            r0.f2841c = r6
            java.lang.Object r13 = uz.x0.u(r13, r0)
            if (r13 != r1) goto L4d
            goto La3
        L4d:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto Lb6
            n4.t r13 = new n4.t
            r13.<init>(r4)
            android.app.NotificationManager r13 = r13.f43230a
            boolean r13 = r13.areNotificationsEnabled()
            if (r13 == 0) goto Lb6
            vt.n0 r13 = xt.b.c()
            fr.o0 r13 = (fr.o0) r13
            com.lingodeer.data.env.Env r13 = r13.f27733a
            boolean r13 = r13.hasReadBillingPage
            if (r13 == 0) goto Lb6
            vt.n0 r13 = xt.b.c()
            fr.o0 r13 = (fr.o0) r13
            com.lingodeer.data.env.Env r13 = r13.f27733a
            long r6 = r13.firstEnterBillingPage
            r8 = 0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto Lb6
            vt.n0 r13 = xt.b.c()
            long r8 = java.lang.System.currentTimeMillis()
            r0.f2841c = r5
            r7 = r13
            fr.o0 r7 = (fr.o0) r7
            r7.getClass()
            yz.f r13 = rz.o0.f50940a
            yz.e r13 = yz.e.f58387a
            fr.h0 r6 = new fr.h0
            r10 = 0
            r11 = 3
            r6.<init>(r7, r8, r10, r11)
            java.lang.Object r13 = rz.e0.M(r13, r6, r0)
            if (r13 != r1) goto La0
            goto La1
        La0:
            r13 = r3
        La1:
            if (r13 != r1) goto La4
        La3:
            return r1
        La4:
            er.c r13 = er.c.f25748a
            long r0 = java.lang.System.currentTimeMillis()
            r4 = 300000(0x493e0, double:1.482197E-318)
            long r0 = r0 + r4
            com.lingo.lingoskill.LingoSkillApplication r2 = com.lingo.lingoskill.LingoSkillApplication.f21665b
            kotlin.jvm.internal.m.c(r2)
            r13.f(r2, r0)
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.e.d(xy.c):java.lang.Object");
    }
}
