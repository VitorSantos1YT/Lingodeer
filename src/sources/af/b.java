package af;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f685a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static CustomAudienceManager f688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ye.a f689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f690f;

    static {
        "Fledge: ".concat(b.class.getSimpleName());
    }

    public static final void a() {
        String string;
        if (qf.a.b(b.class)) {
            return;
        }
        try {
            f687c = true;
            Context contextA = s.a();
            f689e = new ye.a(contextA);
            f690f = "https://www." + s.f49217r + "/privacy_sandbox/pa/logic";
            try {
                CustomAudienceManager customAudienceManager = CustomAudienceManager.get(contextA);
                f688d = customAudienceManager;
                if (customAudienceManager != null) {
                    f686b = true;
                }
                string = null;
            } catch (Error e8) {
                string = e8.toString();
                e8.toString();
            } catch (Exception e10) {
                string = e10.toString();
                e10.toString();
            }
            if (f686b) {
                return;
            }
            ye.a aVar = f689e;
            if (aVar == null) {
                m.n("gpsDebugLogger");
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            aVar.a("gps_pa_failed", bundle);
        } catch (Throwable th2) {
            qf.a.a(b.class, th2);
        }
    }

    public final void b(String str, String str2) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            String strC = c(str, str2);
            if (strC == null) {
                return;
            }
            try {
                try {
                    a aVar = new a(0);
                    AdData.Builder builder = new AdData.Builder();
                    String str3 = f690f;
                    if (str3 == null) {
                        m.n("baseUri");
                        throw null;
                    }
                    Uri uri = Uri.parse(str3.concat("/ad"));
                    m.b(uri, "Uri.parse(this)");
                    AdData adDataBuild = builder.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                    m.e(adDataBuild, "Builder()\n              …\n                .build()");
                    TrustedBiddingData.Builder builder2 = new TrustedBiddingData.Builder();
                    String str4 = f690f;
                    if (str4 == null) {
                        m.n("baseUri");
                        throw null;
                    }
                    Uri uri2 = Uri.parse(str4.concat("?trusted_bidding"));
                    m.b(uri2, "Uri.parse(this)");
                    TrustedBiddingData trustedBiddingDataBuild = builder2.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(o.K(BuildConfig.VERSION_NAME)).build();
                    m.e(trustedBiddingDataBuild, "Builder()\n              …\n                .build()");
                    CustomAudience.Builder buyer = new CustomAudience.Builder().setName(strC).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                    StringBuilder sb2 = new StringBuilder();
                    String str5 = f690f;
                    if (str5 == null) {
                        m.n("baseUri");
                        throw null;
                    }
                    sb2.append(str5);
                    sb2.append("?daily&app_id=");
                    sb2.append(str);
                    Uri uri3 = Uri.parse(sb2.toString());
                    m.b(uri3, "Uri.parse(this)");
                    CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(uri3);
                    String str6 = f690f;
                    if (str6 == null) {
                        m.n("baseUri");
                        throw null;
                    }
                    Uri uri4 = Uri.parse(str6.concat("?bidding"));
                    m.b(uri4, "Uri.parse(this)");
                    CustomAudience customAudienceBuild = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString("{}")).setAds(o.K(adDataBuild)).build();
                    m.e(customAudienceBuild, "Builder()\n              …(listOf(dummyAd)).build()");
                    JoinCustomAudienceRequest joinCustomAudienceRequestBuild = new JoinCustomAudienceRequest.Builder().setCustomAudience(customAudienceBuild).build();
                    m.e(joinCustomAudienceRequestBuild, "Builder().setCustomAudience(ca).build()");
                    CustomAudienceManager customAudienceManager = f688d;
                    if (customAudienceManager != null) {
                        customAudienceManager.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), aVar);
                    }
                } catch (Exception e8) {
                    e8.toString();
                    ye.a aVar2 = f689e;
                    if (aVar2 == null) {
                        m.n("gpsDebugLogger");
                        throw null;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("gps_pa_failed_reason", e8.toString());
                    aVar2.a("gps_pa_failed", bundle);
                }
            } catch (Error e10) {
                e10.toString();
                ye.a aVar3 = f689e;
                if (aVar3 == null) {
                    m.n("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e10.toString());
                aVar3.a("gps_pa_failed", bundle2);
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final String c(String str, String str2) {
        if (!qf.a.b(this) && str2 != null) {
            try {
                if (!str2.equals("_removed_") && !q.v0(str2, "gps", false)) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / ((long) 1000)) + "@1";
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }
}
