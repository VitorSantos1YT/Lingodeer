package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.i;
import com.android.billingclient.api.j;
import com.android.billingclient.api.s;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.data.model.AchievementLevelType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12272a = Runtime.getRuntime().availableProcessors();

    public static int a(String str, Bundle bundle) {
        if (bundle == null) {
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            h(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        return 6;
    }

    public static void b(long j11, Bundle bundle, String str, String str2) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j11);
    }

    public static Bundle c(j jVar, zzie zzieVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", jVar.f7519a);
        bundle.putString("DEBUG_MESSAGE", jVar.f7521c);
        bundle.putInt("LOG_REASON", zzieVar.zza());
        return bundle;
    }

    public static j e(Intent intent, String str) {
        if (intent == null) {
            i iVarA = j.a();
            iVarA.f7515a = 6;
            iVarA.f7517c = "An internal error occurred.";
            return iVarA.a();
        }
        i iVarA2 = j.a();
        iVarA2.f7515a = a(str, intent.getExtras());
        iVarA2.f7517c = f(str, intent.getExtras());
        return iVarA2.a();
    }

    public static String f(String str, Bundle bundle) {
        if (bundle == null) {
            return BuildConfig.VERSION_NAME;
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            h(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return BuildConfig.VERSION_NAME;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        "Unexpected type for debug message: ".concat(obj.getClass().getName());
        return BuildConfig.VERSION_NAME;
    }

    public static String g(int i11) {
        return zzb.a(i11).toString();
    }

    public static void h(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i11 = 40000;
        while (!str2.isEmpty() && i11 > 0) {
            int iMin = Math.min(str2.length(), Math.min(AchievementLevelType.XP_LV_6, i11));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i11 -= iMin;
        }
    }

    public static Purchase i(String str, String str2) {
        if (str == null || str2 == null) {
            h("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e8) {
            "Got JSONException while parsing purchase data: ".concat(e8.toString());
            return null;
        }
    }

    public static Bundle d(String str, String str2, ArrayList arrayList, zza zzaVar, long j11) {
        Bundle bundle = new Bundle();
        b(j11, bundle, str, str2);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        zzci zzciVar = zzbt.f12261b;
        String str3 = MzwEyWCkjXL.HouoyURMnCPUg;
        Object[] objArr = {"subs", str3};
        zzbz.a(2, objArr);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(zzbt.l(2, objArr)));
        Object[] objArr2 = {str3};
        zzbz.a(1, objArr2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(zzbt.l(1, objArr2)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            s sVar = (s) arrayList.get(i11);
            arrayList2.add(null);
            z11 |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z12 |= !TextUtils.isEmpty(null);
            if (sVar.f7574b.equals("first_party")) {
                throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z11) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z12) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }
}
