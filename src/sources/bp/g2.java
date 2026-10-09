package bp;

import com.google.api.Service;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.Gson;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.AreaAndAge;
import com.lingo.lingoskill.object.AzureAreaKey;
import com.lingo.lingoskill.object.BillingPageRecomConfig;
import com.lingo.lingoskill.object.LifetimeIapConfig;
import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingo.lingoskill.object.NewBillingTheme;
import com.lingo.lingoskill.object.NewBillingThemeBillingPage;
import com.lingo.lingoskill.object.NewBillingThemeIntroPage;
import com.lingo.lingoskill.object.NewBillingThemeLearnPage;
import com.lingo.lingoskill.object.SaleActivityConfig;
import com.lingo.lingoskill.object.ShowBottomSaleCardCondition;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4600a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f4600a = i12;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4600a) {
            case 0:
                return new g2(2, 0, dVar);
            case 1:
                return new g2(2, 1, dVar);
            case 2:
                return new g2(2, 2, dVar);
            case 3:
                return new g2(2, 3, dVar);
            case 4:
                return new g2(2, 4, dVar);
            case 5:
                return new g2(2, 5, dVar);
            case 6:
                return new g2(2, 6, dVar);
            case 7:
                return new g2(2, 7, dVar);
            case 8:
                return new g2(2, 8, dVar);
            case 9:
                return new g2(2, 9, dVar);
            case 10:
                return new g2(2, 10, dVar);
            case 11:
                return new g2(2, 11, dVar);
            case 12:
                return new g2(2, 12, dVar);
            case 13:
                return new g2(2, 13, dVar);
            case 14:
                return new g2(2, 14, dVar);
            case 15:
                return new g2(2, 15, dVar);
            case 16:
                return new g2(2, 16, dVar);
            case 17:
                return new g2(2, 17, dVar);
            case 18:
                return new g2(2, 18, dVar);
            case 19:
                return new g2(2, 19, dVar);
            case 20:
                return new g2(2, 20, dVar);
            case 21:
                return new g2(2, 21, dVar);
            case 22:
                return new g2(2, 22, dVar);
            case 23:
                return new g2(2, 23, dVar);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new g2(2, 24, dVar);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new g2(2, 25, dVar);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new g2(2, 26, dVar);
            case 27:
                return new g2(2, 27, dVar);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new g2(2, 28, dVar);
            default:
                return new g2(2, 29, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4600a) {
            case 0:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                g2 g2Var = (g2) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                g2Var.invokeSuspend(b0Var);
                return b0Var;
            case 2:
                g2 g2Var2 = (g2) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                g2Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 3:
                g2 g2Var3 = (g2) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                g2Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 4:
                g2 g2Var4 = (g2) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var4 = qy.b0.f48488a;
                g2Var4.invokeSuspend(b0Var4);
                return b0Var4;
            case 5:
                g2 g2Var5 = (g2) create((f0.n1) obj, (vy.d) obj2);
                qy.b0 b0Var5 = qy.b0.f48488a;
                g2Var5.invokeSuspend(b0Var5);
                return b0Var5;
            case 6:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                g2 g2Var6 = (g2) create(Long.valueOf(((Number) obj).longValue()), (vy.d) obj2);
                qy.b0 b0Var6 = qy.b0.f48488a;
                g2Var6.invokeSuspend(b0Var6);
                return b0Var6;
            case 8:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                g2 g2Var7 = (g2) create((s2.w) obj, (vy.d) obj2);
                qy.b0 b0Var7 = qy.b0.f48488a;
                g2Var7.invokeSuspend(b0Var7);
                return b0Var7;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                g2 g2Var8 = (g2) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var8 = qy.b0.f48488a;
                g2Var8.invokeSuspend(b0Var8);
                return b0Var8;
            default:
                g2 g2Var9 = (g2) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var9 = qy.b0.f48488a;
                g2Var9.invokeSuspend(b0Var9);
                return b0Var9;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        MergedBillingThemeBillingPage mergedBillingThemeBillingPage;
        SaleActivityConfig saleActivityConfig;
        int i11 = this.f4600a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    h00.s sVar = xt.c.f56291a;
                    String strF = FirebaseRemoteConfig.d().f("child_age_limit");
                    sVar.getClass();
                    return (AreaAndAge) sVar.b(AreaAndAge.Companion.serializer(), strF);
                } catch (Exception unused) {
                    return new AreaAndAge("Others", -1);
                }
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                xt.a aVarA = xt.b.a();
                String strE = xt.b.a().e();
                aVarA.getClass();
                xt.a.a(strE);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication);
                com.bumptech.glide.c.c(lingoSkillApplication).a();
                return b0Var;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                return new Integer(cf.x.n().keyLanguage);
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return FirebaseRemoteConfig.d().f("annual_bottom_button_text");
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Long l9 = new Long(FirebaseRemoteConfig.d().e("annual_product_free_trail_day_type"));
                xt.b.f56284f.setValue(Boolean.valueOf(l9.longValue() > 0));
                return l9;
            case 10:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    String strF2 = FirebaseRemoteConfig.d().f("azure_area_key");
                    return strF2.length() > 0 ? (AzureAreaKey) new Gson().fromJson(strF2, AzureAreaKey.class) : new AzureAreaKey(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME);
                } catch (Exception unused2) {
                    return new AzureAreaKey(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME);
                }
            case 11:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    h00.s sVar2 = xt.c.f56291a;
                    String strF3 = FirebaseRemoteConfig.d().f("billing_page_recom_config");
                    sVar2.getClass();
                    return (BillingPageRecomConfig) sVar2.b(BillingPageRecomConfig.Companion.serializer(), strF3);
                } catch (Exception unused3) {
                    return new BillingPageRecomConfig(0, 0L, false, false, 15, (kotlin.jvm.internal.f) null);
                }
            case 12:
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return FirebaseRemoteConfig.d().f("billing_ad_page_title_1_text");
            case 13:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    if (oz.q.v0("release", "debug", false)) {
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    }
                    h00.s sVar3 = xt.c.f56291a;
                    String strF4 = FirebaseRemoteConfig.d().f("new_billing_theme");
                    sVar3.getClass();
                    return (NewBillingTheme) sVar3.b(NewBillingTheme.Companion.serializer(), strF4);
                } catch (Exception unused4) {
                    return new NewBillingTheme((NewBillingThemeLearnPage) null, (NewBillingThemeIntroPage) null, (NewBillingThemeBillingPage) null, 7, (kotlin.jvm.internal.f) null);
                }
            case 14:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication4);
                if (32 != (lingoSkillApplication4.getResources().getConfiguration().uiMode & 48)) {
                    return c.a.v();
                }
                try {
                    if (!oz.q.v0("release", "debug", false) || LingoSkillApplication.f21667d.length() <= 0) {
                        h00.s sVar4 = xt.c.f56291a;
                        String strF5 = FirebaseRemoteConfig.d().f("merged_billing_theme_dark");
                        sVar4.getClass();
                        mergedBillingThemeBillingPage = (MergedBillingThemeBillingPage) sVar4.b(MergedBillingThemeBillingPage.Companion.serializer(), strF5);
                    } else {
                        h00.s sVar5 = xt.c.f56291a;
                        String str = LingoSkillApplication.f21667d;
                        sVar5.getClass();
                        mergedBillingThemeBillingPage = (MergedBillingThemeBillingPage) sVar5.b(MergedBillingThemeBillingPage.Companion.serializer(), str);
                    }
                    return mergedBillingThemeBillingPage;
                } catch (Exception unused5) {
                    return new MergedBillingThemeBillingPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, 255, (kotlin.jvm.internal.f) null);
                }
            case 15:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return FirebaseRemoteConfig.d().f("lifetime_bottom_button_text");
            case 16:
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    h00.s sVar6 = xt.c.f56291a;
                    String strF6 = FirebaseRemoteConfig.d().f("lifetime_iap_config");
                    sVar6.getClass();
                    return (LifetimeIapConfig) sVar6.b(LifetimeIapConfig.Companion.serializer(), strF6);
                } catch (Exception unused6) {
                    return new LifetimeIapConfig(false, false, 3, (kotlin.jvm.internal.f) null);
                }
            case 17:
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    h00.s sVar7 = xt.c.f56291a;
                    String strF7 = FirebaseRemoteConfig.d().f("sale_activity_config");
                    sVar7.getClass();
                    saleActivityConfig = (SaleActivityConfig) sVar7.b(SaleActivityConfig.Companion.serializer(), strF7);
                    break;
                } catch (Exception unused7) {
                    saleActivityConfig = new SaleActivityConfig((String) null, (String) null, (String) null, (String) null, 15, (kotlin.jvm.internal.f) null);
                }
                Objects.toString(saleActivityConfig);
                return saleActivityConfig;
            case 18:
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return FirebaseRemoteConfig.d().f("sale_bar_free_trial_title");
            case 19:
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return FirebaseRemoteConfig.d().f("sale_bar_title");
            case 20:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    h00.s sVar8 = xt.c.f56291a;
                    String strF8 = FirebaseRemoteConfig.d().f("show_bottom_sale_card_condition");
                    sVar8.getClass();
                    return (ShowBottomSaleCardCondition) sVar8.b(ShowBottomSaleCardCondition.Companion.serializer(), strF8);
                } catch (Exception unused8) {
                    return new ShowBottomSaleCardCondition(true, 1);
                }
            case 21:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return FirebaseRemoteConfig.d().f("sub_page_button_text");
            case 22:
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return FirebaseRemoteConfig.d().f("sub_page_lifetime_tag");
            case 23:
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return FirebaseRemoteConfig.d().f("sub_page_title");
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return FirebaseRemoteConfig.d().f("sub_page_yearly_title");
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new SimpleDateFormat("yyyyMMdd", Locale.US).format(Calendar.getInstance().getTime());
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new SimpleDateFormat("yyyyMMdd", Locale.US).format(Calendar.getInstance().getTime());
            case 27:
                wy.a aVar28 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                wy.a aVar29 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            default:
                wy.a aVar30 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                cf.x.n().hasFindPerfectTime = Boolean.TRUE;
                cf.x.n().updateEntry("hasFindPerfectTime");
                cf.x.n().learnAlarmTime = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
                cf.x.n().updateEntry("learnAlarmTime");
                er.c.h();
                return b0Var;
        }
    }
}
