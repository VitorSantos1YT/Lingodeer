package ef;

import android.os.Bundle;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import cf.p;
import cf.q;
import cf.v;
import cf.w;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lf.a0;
import lf.c0;
import lf.e0;
import lf.h0;
import lf.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import re.g0;
import re.i0;
import re.s;
import se.t;
import se.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o20.i f25521a = new o20.i(s.a(), 23);

    public static final boolean c() {
        e0 e0VarB = h0.b(s.b());
        return e0VarB != null && i0.c() && e0VarB.f40005i;
    }

    public static j a(String str, Bundle bundle, t tVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str.equals(w.SUBS.a())) {
            Map map = t.f51614b;
            u uVar = u.IAPParameters;
            String string = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            kotlin.jvm.internal.m.e(string, "toString(\n              …      )\n                )");
            ve.i.h(uVar, SemtNwfPgIhi.atdmtijnGtZNP, string, bundle, tVar);
            String strOptString = jSONObject2.optString("subscriptionPeriod");
            kotlin.jvm.internal.m.e(strOptString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            ve.i.h(uVar, "fb_iap_subs_period", strOptString, bundle, tVar);
            String strOptString2 = jSONObject2.optString("freeTrialPeriod");
            kotlin.jvm.internal.m.e(strOptString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            ve.i.h(uVar, "fb_free_trial_period", strOptString2, bundle, tVar);
            String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
            kotlin.jvm.internal.m.e(introductoryPriceCycles, "introductoryPriceCycles");
            if (introductoryPriceCycles.length() > 0) {
                ve.i.h(uVar, "fb_intro_price_cycles", introductoryPriceCycles, bundle, tVar);
            }
            String introductoryPricePeriod = jSONObject2.optString("introductoryPricePeriod");
            kotlin.jvm.internal.m.e(introductoryPricePeriod, "introductoryPricePeriod");
            if (introductoryPricePeriod.length() > 0) {
                ve.i.h(uVar, "fb_intro_period", introductoryPricePeriod, bundle, tVar);
            }
            String introductoryPriceAmountMicros = jSONObject2.optString("introductoryPriceAmountMicros");
            kotlin.jvm.internal.m.e(introductoryPriceAmountMicros, "introductoryPriceAmountMicros");
            if (introductoryPriceAmountMicros.length() > 0) {
                ve.i.h(uVar, "fb_intro_price_amount_micros", introductoryPriceAmountMicros, bundle, tVar);
            }
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        kotlin.jvm.internal.m.e(currency, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new j(bigDecimal, currency, bundle, tVar);
    }

    public static ArrayList b(String str, Bundle bundle, t tVar, JSONObject jSONObject) throws JSONException {
        if (!str.equals(w.SUBS.a())) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("priceCurrencyCode"));
            kotlin.jvm.internal.m.e(currency, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
            return ns.o.M(new j(bigDecimal, currency, bundle, tVar));
        }
        ArrayList arrayList = new ArrayList();
        String str2 = "subscriptionOfferDetails";
        JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        int i11 = 0;
        while (i11 < length) {
            JSONObject jSONObject3 = jSONObject.getJSONArray(str2).getJSONObject(i11);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            t tVar2 = new t();
            LinkedHashMap linkedHashMap = tVar.f51615a;
            for (u uVar : linkedHashMap.keySet()) {
                Map map = (Map) linkedHashMap.get(uVar);
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        String str4 = str2;
                        int i12 = length;
                        Object obj = map.get(str3);
                        if (obj != null) {
                            tVar2.a(uVar, str3, obj);
                        }
                        str2 = str4;
                        length = i12;
                    }
                }
            }
            String str5 = str2;
            int i13 = length;
            String basePlanId = jSONObject3.getString("basePlanId");
            Map map2 = t.f51614b;
            u uVar2 = u.IAPParameters;
            kotlin.jvm.internal.m.e(basePlanId, "basePlanId");
            ve.i.h(uVar2, "fb_iap_base_plan", basePlanId, bundle2, tVar2);
            JSONArray jSONArray2 = jSONObject3.getJSONArray("pricingPhases");
            JSONObject jSONObject4 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            String strOptString = jSONObject4.optString("billingPeriod");
            kotlin.jvm.internal.m.e(strOptString, "subscriptionJSON.optStri…IOD\n                    )");
            ve.i.h(uVar2, "fb_iap_subs_period", strOptString, bundle2, tVar2);
            if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                ve.i.h(uVar2, "fb_iap_subs_auto_renewing", DytezVyM.hofUqHGDmieLy, bundle2, tVar2);
            } else {
                ve.i.h(uVar2, "fb_iap_subs_auto_renewing", "true", bundle2, tVar2);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
            kotlin.jvm.internal.m.e(currency2, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
            arrayList.add(new j(bigDecimal2, currency2, bundle2, tVar2));
            i11++;
            str2 = str5;
            length = i13;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0174  */
    public static final void d(String purchase, String skuDetails, boolean z11, v vVar, boolean z12) {
        ArrayList arrayListM;
        String str;
        String str2;
        kotlin.jvm.internal.m.f(purchase, "purchase");
        kotlin.jvm.internal.m.f(skuDetails, "skuDetails");
        if (c()) {
            HashMap map = new HashMap();
            Bundle bundleC = null;
            try {
                JSONObject jSONObject = new JSONObject(purchase);
                JSONObject jSONObject2 = new JSONObject(skuDetails);
                Bundle bundle = new Bundle(1);
                t tVar = new t();
                if (vVar != null) {
                    ve.i.h(u.IAPParameters, "fb_iap_sdk_supported_library_versions", vVar.a(), bundle, tVar);
                }
                u uVar = u.IAPParameters;
                String string = jSONObject.getString("productId");
                kotlin.jvm.internal.m.e(string, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
                ve.i.h(uVar, "fb_iap_product_id", string, bundle, tVar);
                String string2 = jSONObject.getString("productId");
                kotlin.jvm.internal.m.e(string2, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
                ve.i.h(uVar, "fb_content_id", string2, bundle, tVar);
                ve.i.h(uVar, "android_dynamic_ads_content_id", "client_implicit", bundle, tVar);
                String string3 = jSONObject.getString(scqhIrGXy.liblQrFlYmFfeka);
                kotlin.jvm.internal.m.e(string3, "purchaseJSON.getString(C…nts.GP_IAP_PURCHASE_TIME)");
                ve.i.h(uVar, "fb_iap_purchase_time", string3, bundle, tVar);
                String string4 = jSONObject.getString("purchaseToken");
                kotlin.jvm.internal.m.e(string4, "purchaseJSON.getString(C…ts.GP_IAP_PURCHASE_TOKEN)");
                ve.i.h(uVar, "fb_iap_purchase_token", string4, bundle, tVar);
                String strOptString = jSONObject.optString("packageName");
                kotlin.jvm.internal.m.e(strOptString, "purchaseJSON.optString(C…ants.GP_IAP_PACKAGE_NAME)");
                ve.i.h(uVar, "fb_iap_package_name", strOptString, bundle, tVar);
                String strOptString2 = jSONObject2.optString("title");
                kotlin.jvm.internal.m.e(strOptString2, "skuDetailsJSON.optString(Constants.GP_IAP_TITLE)");
                ve.i.h(uVar, "fb_iap_product_title", strOptString2, bundle, tVar);
                String strOptString3 = jSONObject2.optString("description");
                kotlin.jvm.internal.m.e(strOptString3, "skuDetailsJSON.optString…tants.GP_IAP_DESCRIPTION)");
                ve.i.h(uVar, "fb_iap_product_description", strOptString3, bundle, tVar);
                String type = jSONObject2.optString("type");
                kotlin.jvm.internal.m.e(type, "type");
                ve.i.h(uVar, "fb_iap_product_type", type, bundle, tVar);
                cf.t tVar2 = cf.t.f6985a;
                if (qf.a.b(cf.t.class)) {
                    str2 = null;
                } else {
                    try {
                        str2 = cf.t.f6988d;
                    } catch (Throwable th2) {
                        qf.a.a(cf.t.class, th2);
                        str2 = null;
                    }
                }
                if (str2 != null) {
                    Map map2 = t.f51614b;
                    ve.i.h(u.IAPParameters, "fb_iap_client_library_version", str2, bundle, tVar);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    Map map3 = t.f51614b;
                    ve.i.h(u.IAPParameters, str3, str4, bundle, tVar);
                }
                arrayListM = jSONObject2.has("price_amount_micros") ? ns.o.M(a(type, bundle, tVar, jSONObject, jSONObject2)) : (jSONObject2.has("subscriptionOfferDetails") || jSONObject2.has("oneTimePurchaseOfferDetails")) ? b(type, bundle, tVar, jSONObject2) : null;
            } catch (JSONException | Exception unused) {
            }
            if (arrayListM == null || arrayListM.isEmpty()) {
                return;
            }
            if (!z11 || !c0.b("app_events_if_auto_log_subs", s.b(), false)) {
                str = z12 ? "fb_mobile_purchase_restored" : "fb_mobile_purchase";
            } else if (z12) {
                str = "SubscriptionRestore";
            } else {
                q qVar = q.f6977a;
                if (qf.a.b(qVar)) {
                    str = "Subscribe";
                } else {
                    try {
                        String strOptString4 = new JSONObject(skuDetails).optString("freeTrialPeriod");
                        if (strOptString4 == null || strOptString4.length() <= 0) {
                            str = "Subscribe";
                        } else {
                            str = "StartTrial";
                        }
                    } catch (JSONException unused2) {
                    } catch (Throwable th3) {
                        qf.a.a(qVar, th3);
                    }
                }
            }
            String str5 = str;
            if (z11 && a0.b(x.AndroidManualImplicitSubsDedupe)) {
                synchronized (k.class) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        int size = arrayListM.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayListM.get(i11);
                            i11++;
                            j jVar = (j) obj;
                            arrayList.add(new cf.a(str5, jVar.f25517a.doubleValue(), jVar.f25518b));
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayListM, 10));
                        int size2 = arrayListM.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayListM.get(i12);
                            i12++;
                            j jVar2 = (j) obj2;
                            arrayList2.add(new qy.l(jVar2.f25519c, jVar2.f25520d));
                        }
                        bundleC = cf.t.c(arrayList, jCurrentTimeMillis, true, arrayList2);
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } else if (!z11 && a0.b(x.AndroidManualImplicitPurchaseDedupe)) {
                synchronized (k.class) {
                    j jVar3 = (j) arrayListM.get(0);
                    bundleC = cf.t.c(ns.o.K(new cf.a("fb_mobile_purchase", jVar3.f25517a.doubleValue(), jVar3.f25518b)), System.currentTimeMillis(), true, ns.o.K(new qy.l(jVar3.f25519c, jVar3.f25520d)));
                }
            }
            List list = p.f6973a;
            p.a(bundleC, ((j) arrayListM.get(0)).f25519c, ((j) arrayListM.get(0)).f25520d);
            if (!str5.equals("fb_mobile_purchase")) {
                o20.i iVar = f25521a;
                BigDecimal bigDecimal = ((j) arrayListM.get(0)).f25517a;
                Currency currency = ((j) arrayListM.get(0)).f25518b;
                Bundle bundle2 = ((j) arrayListM.get(0)).f25519c;
                t tVar3 = ((j) arrayListM.get(0)).f25520d;
                iVar.getClass();
                s sVar = s.f49201a;
                if (i0.c()) {
                    se.m mVar = (se.m) iVar.f44522b;
                    mVar.getClass();
                    if (qf.a.b(mVar)) {
                        return;
                    }
                    try {
                        bundle2.putString("fb_currency", currency.getCurrencyCode());
                        mVar.e(str5, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, d.b(), tVar3);
                        return;
                    } catch (Throwable th5) {
                        qf.a.a(mVar, th5);
                        return;
                    }
                }
                return;
            }
            o20.i iVar2 = f25521a;
            BigDecimal bigDecimal2 = ((j) arrayListM.get(0)).f25517a;
            Currency currency2 = ((j) arrayListM.get(0)).f25518b;
            Bundle bundle3 = ((j) arrayListM.get(0)).f25519c;
            t tVar4 = ((j) arrayListM.get(0)).f25520d;
            iVar2.getClass();
            s sVar2 = s.f49201a;
            if (i0.c()) {
                se.m mVar2 = (se.m) iVar2.f44522b;
                mVar2.getClass();
                if (qf.a.b(mVar2)) {
                    return;
                }
                try {
                    if (qf.a.b(mVar2)) {
                        return;
                    }
                    try {
                        bundle3.putString("fb_currency", currency2.getCurrencyCode());
                        mVar2.e("fb_mobile_purchase", Double.valueOf(bigDecimal2.doubleValue()), bundle3, true, d.b(), tVar4);
                        if (g0.k() != se.l.EXPLICIT_ONLY) {
                            se.j.c(se.q.EAGER_FLUSHING_EVENT);
                            return;
                        }
                        return;
                    } catch (Throwable th6) {
                        qf.a.a(mVar2, th6);
                        return;
                    }
                    qf.a.a(mVar2, th);
                } catch (Throwable th7) {
                    qf.a.a(mVar2, th7);
                }
            }
        }
    }
}
