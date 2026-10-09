package i1;

import android.content.Context;
import android.os.Build;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import d0.l1;
import f0.h1;
import h1.h2;
import h1.ua;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DecimalStyle;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.w1;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j3.h0 f34056a = new j3.h0(null, new j3.f0());

    public static final void a(long j11, j3.y0 y0Var, fz.e eVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-716124955);
        if ((i11 & 6) == 0) {
            i12 = (sVar.e(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(y0Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(eVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            l1.d0 d0Var = ua.f31167a;
            l1.t.b(new w1[]{h2.f30320a.a(new g2.x(j11)), d0Var.a(((j3.y0) sVar.j(d0Var)).d(y0Var))}, eVar, sVar, ((i12 >> 3) & 112) | 8);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t0(j11, y0Var, eVar, i11, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(fz.a aVar, fz.e eVar, xy.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i11 = nVar.f34046b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f34046b = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(cVar);
            }
        } else {
            nVar = new n(cVar);
        }
        Object obj = nVar.f34045a;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = nVar.f34046b;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                fr.c cVar2 = new fr.c(17, aVar, eVar, (vy.d) null);
                nVar.f34046b = 1;
                if (rz.e0.l(cVar2, nVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
        } catch (j unused) {
        }
        return qy.b0.f48488a;
    }

    public static final Object c(ob.s sVar, Object obj, float f5, xy.i iVar) {
        Object objD = sVar.d(obj, l1.Default, new m(sVar, f5, null), iVar);
        return objD == wy.a.COROUTINE_SUSPENDED ? objD : qy.b0.f48488a;
    }

    public static final a0 d(String input) {
        Pattern patternCompile = Pattern.compile("[^dMy/\\-.]");
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        kotlin.jvm.internal.m.f(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll(BuildConfig.VERSION_NAME);
        kotlin.jvm.internal.m.e(strReplaceAll, "replaceAll(...)");
        Pattern patternCompile2 = Pattern.compile("d{1,2}");
        kotlin.jvm.internal.m.e(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("dd");
        kotlin.jvm.internal.m.e(strReplaceAll2, "replaceAll(...)");
        Pattern patternCompile3 = Pattern.compile("M{1,2}");
        kotlin.jvm.internal.m.e(patternCompile3, "compile(...)");
        String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("MM");
        kotlin.jvm.internal.m.e(strReplaceAll3, "replaceAll(...)");
        Pattern patternCompile4 = Pattern.compile("y{1,4}");
        kotlin.jvm.internal.m.e(patternCompile4, "compile(...)");
        String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll("yyyy");
        kotlin.jvm.internal.m.e(strReplaceAll4, "replaceAll(...)");
        String strS0 = oz.q.S0(oz.x.q0(strReplaceAll4, "My", "M/y"), ".");
        Pattern patternCompile5 = Pattern.compile("[/\\-.]");
        kotlin.jvm.internal.m.e(patternCompile5, "compile(...)");
        Matcher matcher = patternCompile5.matcher(strS0);
        kotlin.jvm.internal.m.e(matcher, "matcher(...)");
        oz.l lVarE = se.k.e(matcher, 0, strS0);
        kotlin.jvm.internal.m.c(lVarE);
        oz.i iVarD = lVarE.f46171c.d(0);
        kotlin.jvm.internal.m.c(iVarD);
        int i11 = iVarD.f46164b.f40532a;
        String strSubstring = strS0.substring(i11, i11 + 1);
        kotlin.jvm.internal.m.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new a0(strS0, strSubstring.charAt(0));
    }

    public static final z1.r e(z1.r rVar, ob.s sVar, h1 h1Var, fz.e eVar) {
        return rVar.i(new c0(sVar, eVar, h1Var));
    }

    public static String f(long j11, String str, Locale locale, Map map) {
        String str2 = "P:" + str + locale.toLanguageTag();
        Object objWithDecimalStyle = map.get(str2);
        if (objWithDecimalStyle == null) {
            objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            map.put(str2, objWithDecimalStyle);
        }
        kotlin.jvm.internal.m.d(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
        return Instant.ofEpochMilli(j11).atZone(y.f34099d).l().format((DateTimeFormatter) objWithDecimalStyle);
    }

    public static String g(long j11, String str, Locale locale, Map map) {
        StringBuilder sbN = ep.a.n(str);
        sbN.append(locale.toLanguageTag());
        String string = sbN.toString();
        Object obj = map.get(string);
        Object obj2 = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(j0.f34030d);
            map.put(string, simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        Calendar calendar = Calendar.getInstance(j0.f34030d);
        calendar.setTimeInMillis(j11);
        return ((SimpleDateFormat) obj2).format(Long.valueOf(calendar.getTimeInMillis()));
    }

    public static final String h(long j11, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object bestDateTimePattern = linkedHashMap.get(str2);
        if (bestDateTimePattern == null) {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
            linkedHashMap.put(str2, bestDateTimePattern);
        }
        String string = bestDateTimePattern.toString();
        if (Build.VERSION.SDK_INT >= 26) {
            ZoneId zoneId = y.f34099d;
            return f(j11, string, locale, linkedHashMap);
        }
        TimeZone timeZone = j0.f34030d;
        return g(j11, string, locale, linkedHashMap);
    }

    public static final String i(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.j(AndroidCompositionLocals_androidKt.f1199a);
        return ((Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b)).getResources().getString(i11);
    }
}
