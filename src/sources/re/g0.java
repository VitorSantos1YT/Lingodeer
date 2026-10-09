package re;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.ktFt.FpIL;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.FacebookException;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.lingodeer.database.CharacterStrokeDatabase;
import fr.p3;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lf.v0;
import lf.x0;
import lf.y0;
import org.json.JSONException;
import org.json.JSONObject;
import re.d0;
import re.g0;
import re.s;
import re.v;
import re.y;
import ry.r;
import se.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class g0 implements u8.i, fv.e, tx.c, vy.h, x7.f, z4.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49155a;

    public /* synthetic */ g0(int i11) {
        this.f49155a = i11;
    }

    private final void c(Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #6 {all -> 0x006d, blocks: (B:16:0x0041, B:28:0x0060, B:24:0x0057, B:20:0x004c), top: B:88:0x0041, inners: #2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(se.f fVar, se.b accessTokenAppId) {
        Object[] objArr;
        String str = fVar.f51596e;
        boolean z11 = fVar.f51594c;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = se.m.f51605c;
        se.g gVar = se.j.f51601a;
        if (!qf.a.b(se.j.class)) {
            try {
                kotlin.jvm.internal.m.f(accessTokenAppId, "accessTokenAppId");
                se.j.f51602b.execute(new pb.b(3, accessTokenAppId, fVar));
            } catch (Throwable th2) {
                qf.a.a(se.j.class, th2);
            }
        }
        boolean z12 = false;
        z12 = false;
        if (lf.a0.b(lf.x.OnDevicePostInstallEventProcessing) && gf.c.a()) {
            String str2 = accessTokenAppId.f51580a;
            if (!qf.a.b(gf.c.class)) {
                try {
                    gf.c cVar = gf.c.f29180a;
                    if (!qf.a.b(cVar)) {
                        if (z11) {
                            try {
                                if (gf.c.f29181b.contains(str)) {
                                    objArr = true;
                                } else {
                                    objArr = false;
                                }
                                if (z11 || objArr != false) {
                                    s.d().execute(new gf.a(str2, fVar, z12 ? 1 : 0));
                                }
                            } catch (Throwable th3) {
                                qf.a.a(cVar, th3);
                            }
                        } else {
                            objArr = false;
                            if (z11) {
                                s.d().execute(new gf.a(str2, fVar, z12 ? 1 : 0));
                            } else {
                                s.d().execute(new gf.a(str2, fVar, z12 ? 1 : 0));
                            }
                        }
                    }
                } catch (Throwable th4) {
                    qf.a.a(gf.c.class, th4);
                }
            }
        }
        if (lf.a0.b(lf.x.GPSARATriggers)) {
            ze.a.f59209a.d(accessTokenAppId.f51580a, fVar);
        }
        if (lf.a0.b(lf.x.GPSPACAProcessing)) {
            af.b bVar = af.b.f685a;
            String str3 = accessTokenAppId.f51580a;
            if (!qf.a.b(bVar)) {
                try {
                    if (!af.b.f687c) {
                        af.b.a();
                    }
                    if (af.b.f686b) {
                        String string = null;
                        try {
                            JSONObject jSONObject = fVar.f51592a;
                            if (jSONObject != null) {
                                string = jSONObject.getString("_eventName");
                            }
                        } catch (JSONException unused) {
                        }
                        bVar.b(str3, string);
                    }
                } catch (Throwable th5) {
                    qf.a.a(bVar, th5);
                }
            }
        }
        if (z11) {
            return;
        }
        if (!qf.a.b(se.m.class)) {
            try {
                z12 = se.m.f51609g;
            } catch (Throwable th6) {
                qf.a.a(se.m.class, th6);
            }
        }
        if (z12) {
            return;
        }
        if (!kotlin.jvm.internal.m.a(str, "fb_mobile_activate_app")) {
            p3 p3Var = y0.f40132d;
            p3.r(d0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
        } else {
            if (qf.a.b(se.m.class)) {
                return;
            }
            try {
                se.m.f51609g = true;
            } catch (Throwable th7) {
                qf.a.a(se.m.class, th7);
            }
        }
    }

    public static void e(Application application, final String str) {
        if (!s.f49215p.get()) {
            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
        }
        if (!se.d.f51586c) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = se.m.f51605c;
            if (se.m.b() == null) {
                p();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = se.m.b();
            if (scheduledThreadPoolExecutorB == null) {
                throw new IllegalStateException("Required value was null.");
            }
            scheduledThreadPoolExecutorB.execute(new cf.c(12));
        }
        se.z zVar = se.z.f51623a;
        if (!qf.a.b(se.z.class)) {
            try {
                if (!se.z.f51625c.get()) {
                    se.z.f51623a.b();
                }
            } catch (Throwable th2) {
                qf.a.a(se.z.class, th2);
            }
        }
        if (str == null) {
            str = s.b();
        }
        final int i11 = 1;
        final int i12 = 0;
        if (!qf.a.b(s.class)) {
            try {
                final Context applicationContext = application.getApplicationContext();
                if (applicationContext != null) {
                    if (!lf.c0.b("app_events_killswitch", s.b(), false)) {
                        s.d().execute(new Runnable() { // from class: gf.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                h hVar = h.f29185a;
                                int i13 = i11;
                                String str2 = str;
                                Context context = applicationContext;
                                switch (i13) {
                                    case 0:
                                        if (qf.a.b(c.class)) {
                                            return;
                                        }
                                        try {
                                            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                            String strConcat = str2.concat("pingForOnDevice");
                                            if (sharedPreferences.getLong(strConcat, 0L) == 0) {
                                                if (!qf.a.b(h.class)) {
                                                    try {
                                                        hVar.b(e.MOBILE_APP_INSTALL, str2, r.f50854a);
                                                    } catch (Throwable th3) {
                                                        qf.a.a(h.class, th3);
                                                    }
                                                    break;
                                                }
                                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                editorEdit.putLong(strConcat, System.currentTimeMillis());
                                                editorEdit.apply();
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th4) {
                                            qf.a.a(c.class, th4);
                                            return;
                                        }
                                    default:
                                        String str3 = ypOOxsaJG.ZsRPJyofnbSkHP;
                                        s sVar = s.f49201a;
                                        if (qf.a.b(sVar)) {
                                            return;
                                        }
                                        try {
                                            lf.d dVarA = v0.a(context);
                                            SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                            String strConcat2 = str2.concat(str3);
                                            long j11 = sharedPreferences2.getLong(strConcat2, 0L);
                                            try {
                                                JSONObject jSONObjectA = ef.g.a(ef.f.MOBILE_INSTALL_EVENT, dVarA, v10.c.l(context), s.g(context), context);
                                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = m.f51605c;
                                                String strM = g0.m();
                                                if (strM != null) {
                                                    jSONObjectA.put(Constants.INSTALL_REFERRER, strM);
                                                }
                                                String str4 = String.format("%s/activities", Arrays.copyOf(new Object[]{str2}, 1));
                                                s.f49218s.getClass();
                                                String str5 = y.f49225j;
                                                y yVarC = v.C(null, str4, jSONObjectA, null);
                                                if (j11 == 0 && yVarC.c().f49125c == null) {
                                                    SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                                                    editorEdit2.putLong(strConcat2, System.currentTimeMillis());
                                                    editorEdit2.apply();
                                                    p3 p3Var = y0.f40132d;
                                                    p3.r(d0.APP_EVENTS, "re.s", "MOBILE_APP_INSTALL has been logged");
                                                    return;
                                                }
                                                return;
                                            } catch (JSONException e8) {
                                                throw new FacebookException("An error occurred while publishing install.", e8);
                                            }
                                        } catch (Exception unused) {
                                            return;
                                        } catch (Throwable th5) {
                                            qf.a.a(sVar, th5);
                                            return;
                                        }
                                }
                            }
                        });
                    }
                    if (lf.a0.b(lf.x.OnDeviceEventProcessing) && gf.c.a() && !qf.a.b(gf.c.class)) {
                        try {
                            final Context contextA = s.a();
                            s.d().execute(new Runnable() { // from class: gf.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    h hVar = h.f29185a;
                                    int i13 = i12;
                                    String str2 = str;
                                    Context context = contextA;
                                    switch (i13) {
                                        case 0:
                                            if (qf.a.b(c.class)) {
                                                return;
                                            }
                                            try {
                                                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                String strConcat = str2.concat("pingForOnDevice");
                                                if (sharedPreferences.getLong(strConcat, 0L) == 0) {
                                                    if (!qf.a.b(h.class)) {
                                                        try {
                                                            hVar.b(e.MOBILE_APP_INSTALL, str2, r.f50854a);
                                                        } catch (Throwable th3) {
                                                            qf.a.a(h.class, th3);
                                                        }
                                                        break;
                                                    }
                                                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                    editorEdit.putLong(strConcat, System.currentTimeMillis());
                                                    editorEdit.apply();
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable th4) {
                                                qf.a.a(c.class, th4);
                                                return;
                                            }
                                        default:
                                            String str3 = ypOOxsaJG.ZsRPJyofnbSkHP;
                                            s sVar = s.f49201a;
                                            if (qf.a.b(sVar)) {
                                                return;
                                            }
                                            try {
                                                lf.d dVarA = v0.a(context);
                                                SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                String strConcat2 = str2.concat(str3);
                                                long j11 = sharedPreferences2.getLong(strConcat2, 0L);
                                                try {
                                                    JSONObject jSONObjectA = ef.g.a(ef.f.MOBILE_INSTALL_EVENT, dVarA, v10.c.l(context), s.g(context), context);
                                                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = m.f51605c;
                                                    String strM = g0.m();
                                                    if (strM != null) {
                                                        jSONObjectA.put(Constants.INSTALL_REFERRER, strM);
                                                    }
                                                    String str4 = String.format("%s/activities", Arrays.copyOf(new Object[]{str2}, 1));
                                                    s.f49218s.getClass();
                                                    String str5 = y.f49225j;
                                                    y yVarC = v.C(null, str4, jSONObjectA, null);
                                                    if (j11 == 0 && yVarC.c().f49125c == null) {
                                                        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                                                        editorEdit2.putLong(strConcat2, System.currentTimeMillis());
                                                        editorEdit2.apply();
                                                        p3 p3Var = y0.f40132d;
                                                        p3.r(d0.APP_EVENTS, "re.s", "MOBILE_APP_INSTALL has been logged");
                                                        return;
                                                    }
                                                    return;
                                                } catch (JSONException e8) {
                                                    throw new FacebookException("An error occurred while publishing install.", e8);
                                                }
                                            } catch (Exception unused) {
                                                return;
                                            } catch (Throwable th5) {
                                                qf.a.a(sVar, th5);
                                                return;
                                            }
                                    }
                                }
                            });
                        } catch (Throwable th3) {
                            qf.a.a(gf.c.class, th3);
                        }
                    }
                }
            } catch (Throwable th4) {
                qf.a.a(s.class, th4);
            }
        }
        ef.d.c(application, str);
        if (lf.a0.b(lf.x.GPSPACAProcessing)) {
            af.b bVar = af.b.f685a;
            if (!qf.a.b(bVar)) {
                try {
                    if (!af.b.f687c) {
                        af.b.a();
                    }
                    if (af.b.f686b) {
                        bVar.b(str, "fb_mobile_app_install");
                    }
                } catch (Throwable th5) {
                    qf.a.a(bVar, th5);
                }
            }
        }
        if (lf.a0.b(lf.x.GPSARATriggers)) {
            ze.a.f59209a.d(str, new se.f("unknown", "MOBILE_INSTALL_EVENT", null, null, false, ef.d.f25510k == 0, ef.d.b(), null));
        }
    }

    public static qy.l f(Bundle bundle, se.t tVar, boolean z11) {
        String str = ef.k.c() ? "1" : "0";
        Map map = se.t.f51614b;
        se.u uVar = se.u.IAPParameters;
        qy.l lVarI = ve.i.i(uVar, "is_implicit_purchase_logging_enabled", str, bundle, tVar);
        Object objY = ve.i.y(uVar, "fb_iap_product_id", bundle, tVar);
        String str2 = objY instanceof String ? (String) objY : null;
        if (!z11) {
            if ((bundle != null ? bundle.getString("fb_content_id") : null) == null && str2 != null) {
                qy.l lVarI2 = ve.i.i(uVar, "fb_content_id", str2, bundle, tVar);
                lVarI = ve.i.i(uVar, "android_dynamic_ads_content_id", "client_manual", (Bundle) lVarI2.f48495a, (se.t) lVarI2.f48496b);
            }
        }
        qy.l lVarI3 = ve.i.i(uVar, "is_autolog_app_events_enabled", i0.c() ? "1" : "0", (Bundle) lVarI.f48495a, (se.t) lVarI.f48496b);
        return new qy.l((Bundle) lVarI3.f48495a, (se.t) lVarI3.f48496b);
    }

    public static CharacterStrokeDatabase i(Context context, String str, File file) {
        if (!file.exists()) {
            throw new IllegalStateException(ep.a.e("Pre-generated database file missing: ", file.getAbsolutePath()).toString());
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.m.e(applicationContext, "getApplicationContext(...)");
        w9.q qVarN = gb.r.n(applicationContext, CharacterStrokeDatabase.class, str);
        qVarN.f54848r = file;
        return (CharacterStrokeDatabase) qVarN.b();
    }

    public static zt.a j(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == 'a') {
                sb2.append('z');
            } else if (cCharAt == 'A') {
                sb2.append('Z');
            } else if ((cCharAt <= 'a' || cCharAt > 'z') && (cCharAt <= 'A' || cCharAt > 'Z')) {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt - 1));
            }
        }
        try {
            return new zt.a(new String(Base64.decode(sb2.toString().getBytes(Constants.ENCODING), 2), Constants.ENCODING));
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException(e8);
        } catch (NullPointerException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static se.l k() {
        se.l lVar;
        synchronized (se.m.c()) {
            lVar = null;
            if (!qf.a.b(se.m.class)) {
                try {
                    lVar = se.m.f51606d;
                } catch (Throwable th2) {
                    qf.a.a(se.m.class, th2);
                }
            }
        }
        return lVar;
    }

    public static String m() {
        e0 e0Var = new e0(1);
        if (!s.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(s.a()).build();
            try {
                installReferrerClientBuild.startConnection(new x0(installReferrerClientBuild, e0Var));
            } catch (Exception unused) {
            }
        }
        return s.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString(Constants.INSTALL_REFERRER, null);
    }

    @Override // x7.f
    public long a(long j11) {
        return j11;
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f49155a) {
            case 8:
                break;
            default:
                Objects.requireNonNull(obj, "value is null");
                Object obj2 = new qx.f(obj).f48468a;
                Throwable th2 = obj2 instanceof gy.g ? ((gy.g) obj2).f29894a : null;
                if (th2 != null) {
                    th2.printStackTrace();
                }
                break;
        }
    }

    @Override // u8.i
    public int b(y6.p pVar) {
        String str = pVar.f57291n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(ep.a.e("Unsupported MIME type: ", str));
    }

    @Override // fv.e
    public void g() {
    }

    @Override // u8.i
    public u8.k h(y6.p pVar) {
        String str = pVar.f57291n;
        List list = pVar.f57294q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new w8.h(list);
                case "application/pgs":
                    return new dm.c(18);
                case "application/x-mp4-vtt":
                    return new a5.j(9);
                case "text/vtt":
                    return new b1.p(6);
                case "application/x-quicktime-tx3g":
                    return new b9.a(list);
                case "text/x-ssa":
                    return new y8.a(list);
                case "application/vobsub":
                    return new dm.c(list);
                case "application/x-subrip":
                    return new z8.a();
                case "application/ttml+xml":
                    return new a9.f();
            }
        }
        throw new IllegalArgumentException(ep.a.e("Unsupported MIME type: ", str));
    }

    @Override // u8.i
    public boolean l(y6.p pVar) {
        String str = pVar.f57291n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public synchronized k n() {
        k kVar;
        try {
            if (k.f49184g == null) {
                x6.b bVarA = x6.b.a(s.a());
                kotlin.jvm.internal.m.e(bVarA, "getInstance(applicationContext)");
                k.f49184g = new k(bVarA, new n9.q(23));
            }
            kVar = k.f49184g;
            if (kVar == null) {
                kotlin.jvm.internal.m.n("instance");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return kVar;
    }

    public Signature[] o(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // z4.y
    public void onScrollLimit(int i11, int i12, int i13, boolean z11) {
    }

    @Override // z4.y
    public void onScrollProgress(int i11, int i12, int i13, int i14) {
    }

    public void q(qp.b bVar, float f5) {
        x.a aVar = (x.a) ((Drawable) bVar.f47832b);
        CardView cardView = (CardView) bVar.f47833c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f5 != aVar.f55560e || aVar.f55561f != useCompatPadding || aVar.f55562g != preventCornerOverlap) {
            aVar.f55560e = f5;
            aVar.f55561f = useCompatPadding;
            aVar.f55562g = preventCornerOverlap;
            aVar.b(null);
            aVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            bVar.d(0, 0, 0, 0);
            return;
        }
        x.a aVar2 = (x.a) ((Drawable) bVar.f47832b);
        float f11 = aVar2.f55560e;
        float f12 = aVar2.f55556a;
        int iCeil = (int) Math.ceil(x.b.a(f11, f12, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(x.b.b(f11, f12, cardView.getPreventCornerOverlap()));
        bVar.d(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // fv.e
    public void r() {
    }

    public String toString() {
        switch (this.f49155a) {
            case 8:
                return "EmptyConsumer";
            case 14:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public static void p() {
        synchronized (se.m.c()) {
            if (se.m.b() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!qf.a.b(se.m.class)) {
                try {
                    se.m.f51605c = scheduledThreadPoolExecutor;
                } catch (Throwable th2) {
                    qf.a.a(se.m.class, th2);
                }
            }
            cf.c cVar = new cf.c(15);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = se.m.b();
            if (scheduledThreadPoolExecutorB != null) {
                scheduledThreadPoolExecutorB.scheduleAtFixedRate(cVar, 0L, 86400L, TimeUnit.SECONDS);
                return;
            }
            throw new IllegalStateException(FpIL.yYPbSsVm);
        }
    }
}
