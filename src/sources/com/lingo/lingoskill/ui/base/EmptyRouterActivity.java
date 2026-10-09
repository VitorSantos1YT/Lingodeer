package com.lingo.lingoskill.ui.base;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import bp.p1;
import bq.r;
import com.adjust.sdk.Constants;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.speak.ui.SpeakIndexActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;
import ji.b;
import kotlin.jvm.internal.m;
import oz.x;
import th.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyRouterActivity extends b {
    public EmptyRouterActivity() {
        super(BuildConfig.VERSION_NAME, p1.f4756a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x0211  */
    /* JADX WARN: Code duplicated, block: B:73:0x0249  */
    /* JADX WARN: Code duplicated, block: B:74:0x0266  */
    /* JADX WARN: Code duplicated, block: B:75:0x0283  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:78:0x02da  */
    /* JADX WARN: Code duplicated, block: B:79:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x03be  */
    /* JADX WARN: Code duplicated, block: B:91:0x03f5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ji.b
    public final void p(Uri uri) {
        uri.toString();
        Object systemService = getSystemService("activity");
        m.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        boolean z11 = false;
        for (ActivityManager.AppTask appTask : ((ActivityManager) systemService).getAppTasks()) {
            String.valueOf(appTask.getTaskInfo());
            ComponentName component = appTask.getTaskInfo().baseIntent.getComponent();
            if (component != null) {
                String className = component.getClassName();
                m.e(className, "getClassName(...)");
                if (x.k0(className, "EmptyRouterActivity", false)) {
                    z11 = true;
                }
            }
        }
        if (!z11) {
            String string = uri.toString();
            LanguageItem languageItem = null;
            switch (string.hashCode()) {
                case -1748713420:
                    if (!string.equals("https://lingodeer.com/adbilling")) {
                        s(uri);
                    }
                    break;
                case -576032064:
                    if (string.equals("https://lingodeer.com/tp")) {
                        int iD = j.d();
                        if (iD == 40) {
                            int i11 = ((o0) l()).f27733a.locateLanguage;
                            int[] iArr = r.f4959a;
                            languageItem = new LanguageItem(45, i11, bq.m.s(this, j.d()));
                        } else if (iD == 51) {
                            int i12 = ((o0) l()).f27733a.locateLanguage;
                            int[] iArr2 = r.f4959a;
                            languageItem = new LanguageItem(52, i12, bq.m.s(this, j.d()));
                        } else if (iD == 57) {
                            int i13 = ((o0) l()).f27733a.locateLanguage;
                            int[] iArr3 = r.f4959a;
                            languageItem = new LanguageItem(59, i13, bq.m.s(this, j.d()));
                        } else if (iD == 61) {
                            int i14 = ((o0) l()).f27733a.locateLanguage;
                            int[] iArr4 = r.f4959a;
                            languageItem = new LanguageItem(62, i14, bq.m.s(this, j.d()));
                        } else if (iD == 63) {
                            int i15 = ((o0) l()).f27733a.locateLanguage;
                            int[] iArr5 = r.f4959a;
                            languageItem = new LanguageItem(64, i15, bq.m.s(this, j.d()));
                        } else if (iD == 65) {
                            int i16 = ((o0) l()).f27733a.locateLanguage;
                            int[] iArr6 = r.f4959a;
                            languageItem = new LanguageItem(66, i16, bq.m.s(this, j.d()));
                        } else if (iD != 69) {
                            switch (iD) {
                                case 0:
                                    int i17 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr7 = r.f4959a;
                                    languageItem = new LanguageItem(32, i17, bq.m.s(this, j.d()));
                                    break;
                                case 1:
                                    int i18 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr8 = r.f4959a;
                                    languageItem = new LanguageItem(37, i18, bq.m.s(this, j.d()));
                                    break;
                                case 2:
                                    int i19 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr9 = r.f4959a;
                                    languageItem = new LanguageItem(38, i19, bq.m.s(this, j.d()));
                                    break;
                                case 3:
                                    int i21 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr10 = r.f4959a;
                                    languageItem = new LanguageItem(44, i21, bq.m.s(this, j.d()));
                                    break;
                                case 4:
                                    int i22 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr11 = r.f4959a;
                                    languageItem = new LanguageItem(39, i22, bq.m.s(this, j.d()));
                                    break;
                                case 5:
                                    int i23 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr12 = r.f4959a;
                                    languageItem = new LanguageItem(36, i23, bq.m.s(this, j.d()));
                                    break;
                                case 6:
                                    int i24 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr13 = r.f4959a;
                                    languageItem = new LanguageItem(43, i24, bq.m.s(this, j.d()));
                                    break;
                                case 7:
                                    int i25 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr14 = r.f4959a;
                                    languageItem = new LanguageItem(56, i25, bq.m.s(this, j.d()));
                                    break;
                                case 8:
                                    int i26 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr15 = r.f4959a;
                                    languageItem = new LanguageItem(46, i26, bq.m.s(this, j.d()));
                                    break;
                                default:
                                    switch (iD) {
                                        case 10:
                                        case 22:
                                            int i27 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr16 = r.f4959a;
                                            languageItem = new LanguageItem(41, i27, bq.m.s(this, j.d()));
                                            break;
                                        case 11:
                                            int i110 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr17 = r.f4959a;
                                            languageItem = new LanguageItem(32, i110, bq.m.s(this, j.d()));
                                            break;
                                        case 12:
                                            int i111 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr18 = r.f4959a;
                                            languageItem = new LanguageItem(37, i111, bq.m.s(this, j.d()));
                                            break;
                                        case 13:
                                            int i112 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr19 = r.f4959a;
                                            languageItem = new LanguageItem(38, i112, bq.m.s(this, j.d()));
                                            break;
                                        case 14:
                                            int i28 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr110 = r.f4959a;
                                            languageItem = new LanguageItem(39, i28, bq.m.s(this, j.d()));
                                            break;
                                        case 15:
                                            int i29 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr111 = r.f4959a;
                                            languageItem = new LanguageItem(36, i29, bq.m.s(this, j.d()));
                                            break;
                                        case 16:
                                            int i210 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr112 = r.f4959a;
                                            languageItem = new LanguageItem(43, i210, bq.m.s(this, j.d()));
                                            break;
                                        case 17:
                                            int i211 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr113 = r.f4959a;
                                            languageItem = new LanguageItem(46, i211, bq.m.s(this, j.d()));
                                            break;
                                        case 18:
                                            int i30 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr20 = r.f4959a;
                                            languageItem = new LanguageItem(67, i30, bq.m.s(this, j.d()));
                                            break;
                                        case 19:
                                            int i31 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr21 = r.f4959a;
                                            languageItem = new LanguageItem(68, i31, bq.m.s(this, j.d()));
                                            break;
                                        case 20:
                                            int i113 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr22 = r.f4959a;
                                            languageItem = new LanguageItem(45, i113, bq.m.s(this, j.d()));
                                            break;
                                        case 21:
                                            int i32 = ((o0) l()).f27733a.locateLanguage;
                                            int[] iArr23 = r.f4959a;
                                            languageItem = new LanguageItem(60, i32, bq.m.s(this, j.d()));
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            int i33 = ((o0) l()).f27733a.locateLanguage;
                            int[] iArr24 = r.f4959a;
                            languageItem = new LanguageItem(70, i33, bq.m.s(this, j.d()));
                        }
                        if (languageItem != null) {
                            Intent intent = new Intent(this, (Class<?>) SwitchLanguageActivity.class);
                            intent.putExtra(INTENTS.EXTRA_OBJECT, languageItem);
                            intent.putExtra(INTENTS.EXTRA_BOOLEAN, true);
                            intent.putExtra(INTENTS.EXTRA_STRING, BuildConfig.VERSION_NAME);
                            startActivity(intent);
                        }
                    } else {
                        s(uri);
                    }
                    break;
                case 783403191:
                    if (string.equals("https://lingodeer.com/billing")) {
                        Intent intent2 = new Intent(this, (Class<?>) Subscription2Activity.class);
                        intent2.putExtra(INTENTS.EXTRA_STRING, Constants.DEEPLINK);
                        startActivity(intent2);
                    } else {
                        s(uri);
                    }
                    break;
                case 835556448:
                    if (string.equals("https://lingodeer.com/fluent")) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        int i34 = cf.x.n().keyLanguage;
                        if (i34 == 0) {
                            int i35 = ((o0) l()).f27733a.locateLanguage;
                            int[] iArr25 = r.f4959a;
                            languageItem = new LanguageItem(35, i35, bq.m.s(this, cf.x.n().keyLanguage));
                        } else if (i34 == 1) {
                            int i36 = ((o0) l()).f27733a.locateLanguage;
                            int[] iArr26 = r.f4959a;
                            languageItem = new LanguageItem(30, i36, bq.m.s(this, cf.x.n().keyLanguage));
                        } else if (i34 != 2) {
                            switch (i34) {
                                case 11:
                                    int i37 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr27 = r.f4959a;
                                    languageItem = new LanguageItem(35, i37, bq.m.s(this, cf.x.n().keyLanguage));
                                    break;
                                case 12:
                                    int i38 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr28 = r.f4959a;
                                    languageItem = new LanguageItem(30, i38, bq.m.s(this, cf.x.n().keyLanguage));
                                    break;
                                case 13:
                                    int i39 = ((o0) l()).f27733a.locateLanguage;
                                    int[] iArr29 = r.f4959a;
                                    languageItem = new LanguageItem(31, i39, bq.m.s(this, cf.x.n().keyLanguage));
                                    break;
                            }
                        } else {
                            int i310 = ((o0) l()).f27733a.locateLanguage;
                            int[] iArr210 = r.f4959a;
                            languageItem = new LanguageItem(31, i310, bq.m.s(this, cf.x.n().keyLanguage));
                        }
                        if (languageItem != null) {
                            Intent intent3 = new Intent(this, (Class<?>) SwitchLanguageActivity.class);
                            intent3.putExtra(INTENTS.EXTRA_OBJECT, languageItem);
                            intent3.putExtra(INTENTS.EXTRA_BOOLEAN, true);
                            intent3.putExtra(INTENTS.EXTRA_STRING, BuildConfig.VERSION_NAME);
                            startActivity(intent3);
                        }
                    } else {
                        s(uri);
                    }
                    break;
                case 1289878358:
                    if (!string.equals("https://lingodeer.com/specialDiscount")) {
                        s(uri);
                    }
                    break;
                case 1358719280:
                    if (string.equals("https://lingodeer.com/xuehua")) {
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (cf.x.n().keyLanguage == 0) {
                            Intent intent4 = new Intent(this, (Class<?>) SpeakIndexActivity.class);
                            intent4.putExtra(INTENTS.EXTRA_INT, 46);
                            intent4.putExtra(INTENTS.EXTRA_LONG, 1L);
                            startActivity(intent4);
                        }
                    } else {
                        s(uri);
                    }
                    break;
                default:
                    s(uri);
                    break;
            }
        } else {
            Intent intent5 = new Intent(this, (Class<?>) SplashActivity.class);
            intent5.setFlags(268468224);
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                intent5.putExtras(extras);
            }
            intent5.putExtra(Constants.DEEPLINK, uri.toString());
            startActivity(intent5);
        }
        finish();
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
    }
}
