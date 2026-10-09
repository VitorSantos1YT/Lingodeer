package er;

import android.app.AlarmManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import ay.k0;
import com.adjust.sdk.Constants;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import i0.pKy.shrCcjmOhAmRC;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import oz.q;
import oz.x;
import pt.ImS.aYZzTH;
import ry.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f25748a = new c();

    static {
        String str;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        b bVarB = b(lingoSkillApplication);
        boolean z11 = true;
        boolean z12 = lingoSkillApplication.checkSelfPermission("android.permission.RECEIVE_BOOT_COMPLETED") == 0;
        try {
            kotlin.jvm.internal.m.e(lingoSkillApplication.getPackageManager().getReceiverInfo(new ComponentName(lingoSkillApplication, "com.lingo.notification.SystemBootReceiver"), 0), "getReceiverInfo(...)");
        } catch (Exception unused) {
            z11 = false;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.m.e(MANUFACTURER, "MANUFACTURER");
        String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        if (q.v0(lowerCase, Constants.REFERRER_API_XIAOMI, false)) {
            str = "小米设备：设置 -> 应用管理 -> 权限 -> 自启动管理 -> 允许LingoDeer自启动";
        } else if (q.v0(lowerCase, "huawei", false)) {
            str = "华为设备：手机管家 -> 应用启动管理 -> LingoDeer -> 手动管理 -> 允许自启动";
        } else if (q.v0(lowerCase, "oppo", false)) {
            str = "OPPO设备：设置 -> 应用管理 -> 应用列表 -> LingoDeer -> 权限管理 -> 自启动";
        } else if (q.v0(lowerCase, Constants.REFERRER_API_VIVO, false)) {
            str = "VIVO设备：i管家 -> 应用管理 -> 自启动管理 -> LingoDeer -> 允许";
        } else if (q.v0(lowerCase, "oneplus", false)) {
            str = "一加设备：设置 -> 应用管理 -> 应用自动启动 -> LingoDeer -> 允许";
        } else if (q.v0(lowerCase, Constants.REFERRER_API_SAMSUNG, false)) {
            str = "三星设备：设置 -> 应用程序 -> LingoDeer -> 电池 -> 允许后台活动";
        } else {
            str = q.v0(lowerCase, "honor", false) ? "荣耀设备：手机管家 -> 应用启动管理 -> LingoDeer -> 手动管理 -> 允许自启动" : "设置 -> 应用管理 -> LingoDeer -> 权限管理 -> 自启动权限";
        }
        "  厂商: ".concat(MANUFACTURER);
        "  通知权限: ".concat(bVarB.f25744a ? "✅ 已授权" : "❌ 未授权");
        "  精确闹钟权限: ".concat(bVarB.f25745b ? "✅ 已授权" : "❌ 未授权");
        "  电池优化: ".concat(bVarB.f25746c ? "✅ 已关闭" : "❌ 未关闭");
        "  开机启动权限: ".concat(z12 ? "✅ 已授权" : "❌ 未授权");
        "  启动接收器: ".concat(z11 ? "✅ 已配置" : "❌ 未配置");
        "  自启动配置: ".concat((z12 && z11) ? "✅ 完整" : "⚠️ 不完整");
        "  自启动设置: ".concat(str);
        int i11 = bVarB.f25744a ? 20 : 0;
        if (bVarB.f25745b) {
            i11 += 20;
        }
        if (bVarB.f25746c) {
            i11 += 20;
        }
        if (z12) {
            i11 += 20;
        }
        if (z11) {
            i11 += 20;
        }
        if (i11 < 90 && i11 >= 70) {
            "  开机后自动恢复通知: ".concat((z12 && z11) ? "✅ 支持" : "❌ 需要手动设置");
        }
    }

    public static void a(e notificationType, Context context) {
        try {
            k0 k0Var = f.f25749c;
            kotlin.jvm.internal.m.f(notificationType, "notificationType");
            kotlin.jvm.internal.m.f(context, "context");
            if (k0Var.s(context).a(notificationType)) {
                notificationType.name();
            } else {
                notificationType.name();
            }
        } catch (Exception unused) {
            notificationType.name();
        }
    }

    public static long d(int i11, String str) {
        try {
            List listW0 = q.W0(str, new String[]{":"}, 0, 6);
            if (listW0.size() != 2) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, i11);
                calendar.set(12, 40);
                calendar.set(13, 0);
                calendar.set(14, 0);
                if (calendar.getTimeInMillis() <= System.currentTimeMillis()) {
                    calendar.add(6, 1);
                }
                return calendar.getTimeInMillis();
            }
            Integer numT0 = x.t0(q.i1((String) listW0.get(0)).toString());
            int iIntValue = numT0 != null ? numT0.intValue() : i11;
            Integer numT1 = x.t0(q.i1((String) listW0.get(1)).toString());
            int iIntValue2 = numT1 != null ? numT1.intValue() : 40;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, iIntValue);
            calendar2.set(12, iIntValue2);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            if (calendar2.getTimeInMillis() <= System.currentTimeMillis()) {
                calendar2.add(6, 1);
            }
            return calendar2.getTimeInMillis();
        } catch (Exception unused) {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.set(11, i11);
            calendar3.set(12, 40);
            calendar3.set(13, 0);
            calendar3.set(14, 0);
            if (calendar3.getTimeInMillis() <= System.currentTimeMillis()) {
                calendar3.add(6, 1);
            }
            return calendar3.getTimeInMillis();
        }
    }

    public static void e(c cVar, e eVar, long j11, a aVar, Context context, int i11) {
        e eVar2;
        Exception exc;
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        a aVar2 = aVar;
        try {
            try {
                b bVarB = b(context);
                try {
                    if (!bVarB.f25744a || !bVarB.f25745b || !bVarB.f25746c) {
                        bVarB.toString();
                    }
                    eVar2 = eVar;
                    try {
                        if (f.f25749c.u(eVar2, j11, aVar2, context)) {
                            eVar2.name();
                            new Date(j11).toString();
                            eVar2.name();
                            long jCurrentTimeMillis = (j11 - System.currentTimeMillis()) / ((long) 1000);
                        } else {
                            eVar2.name();
                            eVar2.name();
                        }
                    } catch (Exception e8) {
                        e = e8;
                        exc = e;
                        eVar2.name();
                        exc.getMessage();
                        eVar2.name();
                    }
                } catch (Exception e10) {
                    exc = e10;
                    eVar2 = eVar;
                    eVar2.name();
                    exc.getMessage();
                    eVar2.name();
                }
            } catch (Exception e11) {
                e = e11;
                eVar2 = eVar;
            }
        } catch (Exception unused) {
        }
    }

    public static void h() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        f25748a.g(lingoSkillApplication);
    }

    public final void c(Context context) {
        try {
            b bVarB = b(context);
            bVarB.toString();
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            Env envN = cf.x.n();
            if (envN.learningRemind) {
                try {
                    g(context);
                } catch (Exception unused) {
                }
            }
            if (envN.smartReviewReminderEnabled) {
                try {
                    j(context);
                } catch (Exception unused2) {
                }
            }
            Objects.toString(bVarB);
        } catch (Exception unused3) {
        }
    }

    public final void f(Context context, long j11) {
        kotlin.jvm.internal.m.f(context, "context");
        String string = context.getString(R.string.how_do_paid_users_feel_about_their_purchases);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        String string2 = context.getString(R.string.is_lingodeer_worth_it);
        kotlin.jvm.internal.m.e(string2, "getString(...)");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String str = cf.x.n().locateLanguage == 1 ? "https://blog.lingodeer.com/why-lingodeer-premium-osusume-jp/" : "https://blog.lingodeer.com/is-lingodeer-premium-worth-it/";
        e eVar = e.BILLING_5MIN;
        e(this, eVar, j11, new a(string, string2, eVar.c(), ry.x.X(new qy.l("url", str))), context, 48);
    }

    public final void g(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        Env envN = cf.x.n();
        if (envN.learningRemind) {
            String learnAlarmTime = envN.learnAlarmTime;
            kotlin.jvm.internal.m.e(learnAlarmTime, "learnAlarmTime");
            e(this, e.DAILY_LEARN, d(19, learnAlarmTime), null, context, 52);
        }
    }

    public final void i(Context context, long j11) {
        String string = context.getString(R.string.sale_ends_in);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        String string2 = context.getString(R.string.notifi_save_50_today);
        kotlin.jvm.internal.m.e(string2, "getString(...)");
        e eVar = e.DISCOUNT_LAST_1H;
        e(this, eVar, j11, new a(string, string2, eVar.c(), s.f50855a), context, 48);
    }

    public static b b(Context context) {
        String str;
        kotlin.jvm.internal.m.f(context, "context");
        b bVar = new b();
        bVar.f25744a = false;
        bVar.f25745b = false;
        bVar.f25746c = false;
        bVar.f25747d = BuildConfig.VERSION_NAME;
        int i11 = Build.VERSION.SDK_INT;
        boolean zCanScheduleExactAlarms = true;
        bVar.f25744a = i11 < 33 || context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0;
        if (i11 >= 31) {
            Object systemService = context.getSystemService("alarm");
            AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
            zCanScheduleExactAlarms = alarmManager != null ? alarmManager.canScheduleExactAlarms() : false;
        }
        bVar.f25745b = zCanScheduleExactAlarms;
        Object systemService2 = context.getSystemService("power");
        PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
        bVar.f25746c = powerManager != null ? powerManager.isIgnoringBatteryOptimizations(context.getPackageName()) : false;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.m.e(MANUFACTURER, "MANUFACTURER");
        String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        if (q.v0(lowerCase, shrCcjmOhAmRC.PULneXkw, false)) {
            str = "小米设备：请在 设置 -> 应用管理 -> 自启动管理 中允许本应用自启动";
        } else if (q.v0(lowerCase, "huawei", false)) {
            str = "华为设备：请在 设置 -> 电池 -> 受保护应用 中将本应用加入白名单";
        } else if (q.v0(lowerCase, "oppo", false)) {
            str = "OPPO设备：请在 设置 -> 电池 -> 应用耗电管理 中关闭本应用的电池优化";
        } else if (q.v0(lowerCase, Constants.REFERRER_API_VIVO, false)) {
            str = "VIVO设备：请在 设置 -> 电池 -> 后台应用管理 中允许本应用后台运行";
        } else {
            str = q.v0(lowerCase, Constants.REFERRER_API_SAMSUNG, false) ? "三星设备：请在 设置 -> 应用程序 -> 特殊访问权限 中关闭本应用的睡眠优化" : "原生Android：系统兼容性较好，请确保通知权限已开启";
        }
        bVar.f25747d = str;
        bVar.toString();
        return bVar;
    }

    public final void j(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        Env envN = cf.x.n();
        if (envN.smartReviewReminderEnabled) {
            String str = envN.smartReviewReminderTime;
            kotlin.jvm.internal.m.e(str, aYZzTH.slRwKEmWr);
            e(this, e.SRS_REVIEW, d(21, str), null, context, 52);
        }
    }
}
