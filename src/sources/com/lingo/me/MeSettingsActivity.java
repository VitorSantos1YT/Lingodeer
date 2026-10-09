package com.lingo.me;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwnerKt;
import at.f;
import b0.a1;
import bp.g1;
import bq.u;
import bt.z6;
import cf.x;
import ch.z;
import com.google.accompanist.permissions.a;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ui.base.AboutLingodeerActivity;
import com.lingo.lingoskill.ui.base.RemindIndexActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingo.me.MeSettingsActivity;
import com.lingo.me.OfflineAllActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import fz.c;
import l1.b1;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import rz.e0;
import xg.d;
import xu.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MeSettingsActivity extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f22221t = 0;

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(513974500);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var2 = (b1) objQ2;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(256289216);
                boolean zH = sVar.h(this) | sVar.h(context);
                Object objQ3 = sVar.Q();
                if (zH || objQ3 == gVar) {
                    objQ3 = new a(3, this, context);
                    sVar.o0(objQ3);
                }
                c cVar = (c) objQ3;
                Object objQ4 = sVar.Q();
                if (objQ4 == gVar) {
                    objQ4 = new z6(25, b1Var);
                    sVar.o0(objQ4);
                }
                g1.d("settings", 0, cVar, (fz.a) objQ4, sVar, 3078);
            } else {
                sVar.d0(253747774);
            }
            sVar.p(false);
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar.d0(256790331);
                Object objQ5 = sVar.Q();
                if (objQ5 == gVar) {
                    objQ5 = new z6(26, b1Var2);
                    sVar.o0(objQ5);
                }
                cr.a.a((fz.a) objQ5, sVar, 6);
            } else {
                sVar.d0(253747774);
            }
            sVar.p(false);
            boolean zH2 = sVar.h(this);
            Object objQ6 = sVar.Q();
            if (zH2 || objQ6 == gVar) {
                final int i13 = 5;
                objQ6 = new fz.a(this) { // from class: cr.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MeSettingsActivity f22448b;

                    {
                        this.f22448b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        String str;
                        int i14 = i13;
                        b0 b0Var = b0.f48488a;
                        MeSettingsActivity context2 = this.f22448b;
                        switch (i14) {
                            case 0:
                                int i15 = MeSettingsActivity.f22221t;
                                e0.B(LifecycleOwnerKt.getLifecycleScope(context2), null, null, new a1(context2, null, 18), 3);
                                break;
                            case 1:
                                int i16 = MeSettingsActivity.f22221t;
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                int i17 = x.n().locateLanguage;
                                if (i17 == 1) {
                                    str = "https://lingodeer.freshdesk.com/ja-JP/support/home";
                                } else if (i17 == 2) {
                                    str = "https://lingodeer.freshdesk.com/ko/support/home";
                                } else if (i17 != 18) {
                                    switch (i17) {
                                        case 4:
                                            str = "https://lingodeer.freshdesk.com/es-LA/support/home";
                                            break;
                                        case 5:
                                            str = "https://lingodeer.freshdesk.com/fr/support/home";
                                            break;
                                        case 6:
                                            str = "https://lingodeer.freshdesk.com/de/support/home";
                                            break;
                                        case 7:
                                        default:
                                            str = "https://lingodeer.freshdesk.com/en/support/home";
                                            break;
                                        case 8:
                                            str = "https://lingodeer.freshdesk.com/pt-BR/support/home";
                                            break;
                                        case 9:
                                            str = "https://lingodeer.freshdesk.com/zh-TW/support/home";
                                            break;
                                        case 10:
                                            str = "https://lingodeer.freshdesk.com/ru-RU/support/home";
                                            break;
                                    }
                                } else {
                                    str = "https://lingodeer.freshdesk.com/id/support/home";
                                }
                                String string = context2.getString(R.string.faq);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent = new Intent(context2, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, str);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context2.startActivity(intent);
                                context2.m().c("jxz_click_helpcenter", new u(28));
                                break;
                            case 2:
                                int i18 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) AboutLingodeerActivity.class));
                                b7.e0.A(context2.m(), "jxz_me_click_about_lingodeer");
                                break;
                            case 3:
                                int i19 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) UpdateLessonActivity.class));
                                break;
                            case 4:
                                int i21 = MeSettingsActivity.f22221t;
                                kotlin.jvm.internal.m.f(context2, "context");
                                context2.startActivity(new Intent(context2, (Class<?>) OfflineAllActivity.class));
                                break;
                            case 5:
                                int i22 = MeSettingsActivity.f22221t;
                                context2.finish();
                                break;
                            default:
                                int i23 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) RemindIndexActivity.class));
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ6);
            }
            fz.a aVar = (fz.a) objQ6;
            boolean zH3 = sVar.h(this);
            Object objQ7 = sVar.Q();
            if (zH3 || objQ7 == gVar) {
                final int i14 = 6;
                objQ7 = new fz.a(this) { // from class: cr.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MeSettingsActivity f22448b;

                    {
                        this.f22448b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        String str;
                        int i15 = i14;
                        b0 b0Var = b0.f48488a;
                        MeSettingsActivity context2 = this.f22448b;
                        switch (i15) {
                            case 0:
                                int i16 = MeSettingsActivity.f22221t;
                                e0.B(LifecycleOwnerKt.getLifecycleScope(context2), null, null, new a1(context2, null, 18), 3);
                                break;
                            case 1:
                                int i17 = MeSettingsActivity.f22221t;
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                int i18 = x.n().locateLanguage;
                                if (i18 == 1) {
                                    str = "https://lingodeer.freshdesk.com/ja-JP/support/home";
                                } else if (i18 == 2) {
                                    str = "https://lingodeer.freshdesk.com/ko/support/home";
                                } else if (i18 != 18) {
                                    switch (i18) {
                                        case 4:
                                            str = "https://lingodeer.freshdesk.com/es-LA/support/home";
                                            break;
                                        case 5:
                                            str = "https://lingodeer.freshdesk.com/fr/support/home";
                                            break;
                                        case 6:
                                            str = "https://lingodeer.freshdesk.com/de/support/home";
                                            break;
                                        case 7:
                                        default:
                                            str = "https://lingodeer.freshdesk.com/en/support/home";
                                            break;
                                        case 8:
                                            str = "https://lingodeer.freshdesk.com/pt-BR/support/home";
                                            break;
                                        case 9:
                                            str = "https://lingodeer.freshdesk.com/zh-TW/support/home";
                                            break;
                                        case 10:
                                            str = "https://lingodeer.freshdesk.com/ru-RU/support/home";
                                            break;
                                    }
                                } else {
                                    str = "https://lingodeer.freshdesk.com/id/support/home";
                                }
                                String string = context2.getString(R.string.faq);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent = new Intent(context2, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, str);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context2.startActivity(intent);
                                context2.m().c("jxz_click_helpcenter", new u(28));
                                break;
                            case 2:
                                int i19 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) AboutLingodeerActivity.class));
                                b7.e0.A(context2.m(), "jxz_me_click_about_lingodeer");
                                break;
                            case 3:
                                int i110 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) UpdateLessonActivity.class));
                                break;
                            case 4:
                                int i21 = MeSettingsActivity.f22221t;
                                kotlin.jvm.internal.m.f(context2, "context");
                                context2.startActivity(new Intent(context2, (Class<?>) OfflineAllActivity.class));
                                break;
                            case 5:
                                int i22 = MeSettingsActivity.f22221t;
                                context2.finish();
                                break;
                            default:
                                int i23 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) RemindIndexActivity.class));
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ7);
            }
            fz.a aVar2 = (fz.a) objQ7;
            boolean zH4 = sVar.h(this);
            Object objQ8 = sVar.Q();
            if (zH4 || objQ8 == gVar) {
                objQ8 = new com.google.firebase.datastorage.a(this, 7);
                sVar.o0(objQ8);
            }
            c cVar2 = (c) objQ8;
            boolean zH5 = sVar.h(this);
            Object objQ9 = sVar.Q();
            if (zH5 || objQ9 == gVar) {
                final int i15 = 0;
                objQ9 = new fz.a(this) { // from class: cr.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MeSettingsActivity f22448b;

                    {
                        this.f22448b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        String str;
                        int i16 = i15;
                        b0 b0Var = b0.f48488a;
                        MeSettingsActivity context2 = this.f22448b;
                        switch (i16) {
                            case 0:
                                int i17 = MeSettingsActivity.f22221t;
                                e0.B(LifecycleOwnerKt.getLifecycleScope(context2), null, null, new a1(context2, null, 18), 3);
                                break;
                            case 1:
                                int i18 = MeSettingsActivity.f22221t;
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                int i19 = x.n().locateLanguage;
                                if (i19 == 1) {
                                    str = "https://lingodeer.freshdesk.com/ja-JP/support/home";
                                } else if (i19 == 2) {
                                    str = "https://lingodeer.freshdesk.com/ko/support/home";
                                } else if (i19 != 18) {
                                    switch (i19) {
                                        case 4:
                                            str = "https://lingodeer.freshdesk.com/es-LA/support/home";
                                            break;
                                        case 5:
                                            str = "https://lingodeer.freshdesk.com/fr/support/home";
                                            break;
                                        case 6:
                                            str = "https://lingodeer.freshdesk.com/de/support/home";
                                            break;
                                        case 7:
                                        default:
                                            str = "https://lingodeer.freshdesk.com/en/support/home";
                                            break;
                                        case 8:
                                            str = "https://lingodeer.freshdesk.com/pt-BR/support/home";
                                            break;
                                        case 9:
                                            str = "https://lingodeer.freshdesk.com/zh-TW/support/home";
                                            break;
                                        case 10:
                                            str = "https://lingodeer.freshdesk.com/ru-RU/support/home";
                                            break;
                                    }
                                } else {
                                    str = "https://lingodeer.freshdesk.com/id/support/home";
                                }
                                String string = context2.getString(R.string.faq);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent = new Intent(context2, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, str);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context2.startActivity(intent);
                                context2.m().c("jxz_click_helpcenter", new u(28));
                                break;
                            case 2:
                                int i110 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) AboutLingodeerActivity.class));
                                b7.e0.A(context2.m(), "jxz_me_click_about_lingodeer");
                                break;
                            case 3:
                                int i111 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) UpdateLessonActivity.class));
                                break;
                            case 4:
                                int i21 = MeSettingsActivity.f22221t;
                                kotlin.jvm.internal.m.f(context2, "context");
                                context2.startActivity(new Intent(context2, (Class<?>) OfflineAllActivity.class));
                                break;
                            case 5:
                                int i22 = MeSettingsActivity.f22221t;
                                context2.finish();
                                break;
                            default:
                                int i23 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) RemindIndexActivity.class));
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ9);
            }
            fz.a aVar3 = (fz.a) objQ9;
            Object objQ10 = sVar.Q();
            if (objQ10 == gVar) {
                objQ10 = new z6(24, b1Var);
                sVar.o0(objQ10);
            }
            fz.a aVar4 = (fz.a) objQ10;
            boolean zH6 = sVar.h(this);
            Object objQ11 = sVar.Q();
            if (zH6 || objQ11 == gVar) {
                final int i16 = 1;
                objQ11 = new fz.a(this) { // from class: cr.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MeSettingsActivity f22448b;

                    {
                        this.f22448b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        String str;
                        int i17 = i16;
                        b0 b0Var = b0.f48488a;
                        MeSettingsActivity context2 = this.f22448b;
                        switch (i17) {
                            case 0:
                                int i18 = MeSettingsActivity.f22221t;
                                e0.B(LifecycleOwnerKt.getLifecycleScope(context2), null, null, new a1(context2, null, 18), 3);
                                break;
                            case 1:
                                int i19 = MeSettingsActivity.f22221t;
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                int i110 = x.n().locateLanguage;
                                if (i110 == 1) {
                                    str = "https://lingodeer.freshdesk.com/ja-JP/support/home";
                                } else if (i110 == 2) {
                                    str = "https://lingodeer.freshdesk.com/ko/support/home";
                                } else if (i110 != 18) {
                                    switch (i110) {
                                        case 4:
                                            str = "https://lingodeer.freshdesk.com/es-LA/support/home";
                                            break;
                                        case 5:
                                            str = "https://lingodeer.freshdesk.com/fr/support/home";
                                            break;
                                        case 6:
                                            str = "https://lingodeer.freshdesk.com/de/support/home";
                                            break;
                                        case 7:
                                        default:
                                            str = "https://lingodeer.freshdesk.com/en/support/home";
                                            break;
                                        case 8:
                                            str = "https://lingodeer.freshdesk.com/pt-BR/support/home";
                                            break;
                                        case 9:
                                            str = "https://lingodeer.freshdesk.com/zh-TW/support/home";
                                            break;
                                        case 10:
                                            str = "https://lingodeer.freshdesk.com/ru-RU/support/home";
                                            break;
                                    }
                                } else {
                                    str = "https://lingodeer.freshdesk.com/id/support/home";
                                }
                                String string = context2.getString(R.string.faq);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent = new Intent(context2, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, str);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context2.startActivity(intent);
                                context2.m().c("jxz_click_helpcenter", new u(28));
                                break;
                            case 2:
                                int i111 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) AboutLingodeerActivity.class));
                                b7.e0.A(context2.m(), "jxz_me_click_about_lingodeer");
                                break;
                            case 3:
                                int i112 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) UpdateLessonActivity.class));
                                break;
                            case 4:
                                int i21 = MeSettingsActivity.f22221t;
                                kotlin.jvm.internal.m.f(context2, "context");
                                context2.startActivity(new Intent(context2, (Class<?>) OfflineAllActivity.class));
                                break;
                            case 5:
                                int i22 = MeSettingsActivity.f22221t;
                                context2.finish();
                                break;
                            default:
                                int i23 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) RemindIndexActivity.class));
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ11);
            }
            fz.a aVar5 = (fz.a) objQ11;
            boolean zH7 = sVar.h(this);
            Object objQ12 = sVar.Q();
            if (zH7 || objQ12 == gVar) {
                objQ12 = new f(21, this, b1Var2);
                sVar.o0(objQ12);
            }
            fz.a aVar6 = (fz.a) objQ12;
            boolean zH8 = sVar.h(this);
            Object objQ13 = sVar.Q();
            if (zH8 || objQ13 == gVar) {
                final int i17 = 2;
                objQ13 = new fz.a(this) { // from class: cr.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MeSettingsActivity f22448b;

                    {
                        this.f22448b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        String str;
                        int i18 = i17;
                        b0 b0Var = b0.f48488a;
                        MeSettingsActivity context2 = this.f22448b;
                        switch (i18) {
                            case 0:
                                int i19 = MeSettingsActivity.f22221t;
                                e0.B(LifecycleOwnerKt.getLifecycleScope(context2), null, null, new a1(context2, null, 18), 3);
                                break;
                            case 1:
                                int i110 = MeSettingsActivity.f22221t;
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                int i111 = x.n().locateLanguage;
                                if (i111 == 1) {
                                    str = "https://lingodeer.freshdesk.com/ja-JP/support/home";
                                } else if (i111 == 2) {
                                    str = "https://lingodeer.freshdesk.com/ko/support/home";
                                } else if (i111 != 18) {
                                    switch (i111) {
                                        case 4:
                                            str = "https://lingodeer.freshdesk.com/es-LA/support/home";
                                            break;
                                        case 5:
                                            str = "https://lingodeer.freshdesk.com/fr/support/home";
                                            break;
                                        case 6:
                                            str = "https://lingodeer.freshdesk.com/de/support/home";
                                            break;
                                        case 7:
                                        default:
                                            str = "https://lingodeer.freshdesk.com/en/support/home";
                                            break;
                                        case 8:
                                            str = "https://lingodeer.freshdesk.com/pt-BR/support/home";
                                            break;
                                        case 9:
                                            str = "https://lingodeer.freshdesk.com/zh-TW/support/home";
                                            break;
                                        case 10:
                                            str = "https://lingodeer.freshdesk.com/ru-RU/support/home";
                                            break;
                                    }
                                } else {
                                    str = "https://lingodeer.freshdesk.com/id/support/home";
                                }
                                String string = context2.getString(R.string.faq);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent = new Intent(context2, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, str);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context2.startActivity(intent);
                                context2.m().c("jxz_click_helpcenter", new u(28));
                                break;
                            case 2:
                                int i112 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) AboutLingodeerActivity.class));
                                b7.e0.A(context2.m(), "jxz_me_click_about_lingodeer");
                                break;
                            case 3:
                                int i113 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) UpdateLessonActivity.class));
                                break;
                            case 4:
                                int i21 = MeSettingsActivity.f22221t;
                                kotlin.jvm.internal.m.f(context2, "context");
                                context2.startActivity(new Intent(context2, (Class<?>) OfflineAllActivity.class));
                                break;
                            case 5:
                                int i22 = MeSettingsActivity.f22221t;
                                context2.finish();
                                break;
                            default:
                                int i23 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) RemindIndexActivity.class));
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ13);
            }
            fz.a aVar7 = (fz.a) objQ13;
            boolean zH9 = sVar.h(this);
            Object objQ14 = sVar.Q();
            if (zH9 || objQ14 == gVar) {
                final int i18 = 3;
                objQ14 = new fz.a(this) { // from class: cr.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MeSettingsActivity f22448b;

                    {
                        this.f22448b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        String str;
                        int i19 = i18;
                        b0 b0Var = b0.f48488a;
                        MeSettingsActivity context2 = this.f22448b;
                        switch (i19) {
                            case 0:
                                int i110 = MeSettingsActivity.f22221t;
                                e0.B(LifecycleOwnerKt.getLifecycleScope(context2), null, null, new a1(context2, null, 18), 3);
                                break;
                            case 1:
                                int i111 = MeSettingsActivity.f22221t;
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                int i112 = x.n().locateLanguage;
                                if (i112 == 1) {
                                    str = "https://lingodeer.freshdesk.com/ja-JP/support/home";
                                } else if (i112 == 2) {
                                    str = "https://lingodeer.freshdesk.com/ko/support/home";
                                } else if (i112 != 18) {
                                    switch (i112) {
                                        case 4:
                                            str = "https://lingodeer.freshdesk.com/es-LA/support/home";
                                            break;
                                        case 5:
                                            str = "https://lingodeer.freshdesk.com/fr/support/home";
                                            break;
                                        case 6:
                                            str = "https://lingodeer.freshdesk.com/de/support/home";
                                            break;
                                        case 7:
                                        default:
                                            str = "https://lingodeer.freshdesk.com/en/support/home";
                                            break;
                                        case 8:
                                            str = "https://lingodeer.freshdesk.com/pt-BR/support/home";
                                            break;
                                        case 9:
                                            str = "https://lingodeer.freshdesk.com/zh-TW/support/home";
                                            break;
                                        case 10:
                                            str = "https://lingodeer.freshdesk.com/ru-RU/support/home";
                                            break;
                                    }
                                } else {
                                    str = "https://lingodeer.freshdesk.com/id/support/home";
                                }
                                String string = context2.getString(R.string.faq);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent = new Intent(context2, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, str);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context2.startActivity(intent);
                                context2.m().c("jxz_click_helpcenter", new u(28));
                                break;
                            case 2:
                                int i113 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) AboutLingodeerActivity.class));
                                b7.e0.A(context2.m(), "jxz_me_click_about_lingodeer");
                                break;
                            case 3:
                                int i114 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) UpdateLessonActivity.class));
                                break;
                            case 4:
                                int i21 = MeSettingsActivity.f22221t;
                                kotlin.jvm.internal.m.f(context2, "context");
                                context2.startActivity(new Intent(context2, (Class<?>) OfflineAllActivity.class));
                                break;
                            case 5:
                                int i22 = MeSettingsActivity.f22221t;
                                context2.finish();
                                break;
                            default:
                                int i23 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) RemindIndexActivity.class));
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ14);
            }
            fz.a aVar8 = (fz.a) objQ14;
            boolean zH10 = sVar.h(this);
            Object objQ15 = sVar.Q();
            if (zH10 || objQ15 == gVar) {
                final int i19 = 4;
                objQ15 = new fz.a(this) { // from class: cr.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MeSettingsActivity f22448b;

                    {
                        this.f22448b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        String str;
                        int i110 = i19;
                        b0 b0Var = b0.f48488a;
                        MeSettingsActivity context2 = this.f22448b;
                        switch (i110) {
                            case 0:
                                int i111 = MeSettingsActivity.f22221t;
                                e0.B(LifecycleOwnerKt.getLifecycleScope(context2), null, null, new a1(context2, null, 18), 3);
                                break;
                            case 1:
                                int i112 = MeSettingsActivity.f22221t;
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                int i113 = x.n().locateLanguage;
                                if (i113 == 1) {
                                    str = "https://lingodeer.freshdesk.com/ja-JP/support/home";
                                } else if (i113 == 2) {
                                    str = "https://lingodeer.freshdesk.com/ko/support/home";
                                } else if (i113 != 18) {
                                    switch (i113) {
                                        case 4:
                                            str = "https://lingodeer.freshdesk.com/es-LA/support/home";
                                            break;
                                        case 5:
                                            str = "https://lingodeer.freshdesk.com/fr/support/home";
                                            break;
                                        case 6:
                                            str = "https://lingodeer.freshdesk.com/de/support/home";
                                            break;
                                        case 7:
                                        default:
                                            str = "https://lingodeer.freshdesk.com/en/support/home";
                                            break;
                                        case 8:
                                            str = "https://lingodeer.freshdesk.com/pt-BR/support/home";
                                            break;
                                        case 9:
                                            str = "https://lingodeer.freshdesk.com/zh-TW/support/home";
                                            break;
                                        case 10:
                                            str = "https://lingodeer.freshdesk.com/ru-RU/support/home";
                                            break;
                                    }
                                } else {
                                    str = "https://lingodeer.freshdesk.com/id/support/home";
                                }
                                String string = context2.getString(R.string.faq);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent = new Intent(context2, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, str);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context2.startActivity(intent);
                                context2.m().c("jxz_click_helpcenter", new u(28));
                                break;
                            case 2:
                                int i114 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) AboutLingodeerActivity.class));
                                b7.e0.A(context2.m(), "jxz_me_click_about_lingodeer");
                                break;
                            case 3:
                                int i115 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) UpdateLessonActivity.class));
                                break;
                            case 4:
                                int i21 = MeSettingsActivity.f22221t;
                                kotlin.jvm.internal.m.f(context2, "context");
                                context2.startActivity(new Intent(context2, (Class<?>) OfflineAllActivity.class));
                                break;
                            case 5:
                                int i22 = MeSettingsActivity.f22221t;
                                context2.finish();
                                break;
                            default:
                                int i23 = MeSettingsActivity.f22221t;
                                context2.startActivity(new Intent(context2, (Class<?>) RemindIndexActivity.class));
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ15);
            }
            q1.f(aVar, aVar2, cVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, (fz.a) objQ15, null, sVar, 24576);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(this, i11, 13, bundle);
        }
    }
}
