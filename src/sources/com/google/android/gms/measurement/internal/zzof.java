package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzof {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImmutableList f13542a = ImmutableList.w("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, BuildConfig.VERSION_NAME);
        } catch (ClassCastException unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public static final boolean b(zzabw zzabwVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i11, int i12, int i13, String str, String str2, String str3, boolean z11, boolean z12) {
        zzoe zzoeVar;
        char c11;
        int iC = c(zzabwVar);
        if (iC > 0 && (i12 != 1 || i11 != 1)) {
            cArr[iC] = '2';
        }
        if (g(zzabwVar, immutableMap2) == zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c11 = '3';
        } else {
            if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i13 == 1 && immutableSet.contains(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (immutableMap.containsKey(zzabwVar) && (zzoeVar = (zzoe) immutableMap.get(zzabwVar)) != null) {
                int iOrdinal = zzoeVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(zzabwVar, immutableMap2) == zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? f(zzabwVar, cArr, str3, z12) : e(zzabwVar, cArr, str2, z11);
                        }
                        if (iOrdinal == 3) {
                            return g(zzabwVar, immutableMap2) == zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? e(zzabwVar, cArr, str2, z11) : f(zzabwVar, cArr, str3, z12);
                        }
                        c11 = '0';
                    } else if (g(zzabwVar, immutableMap2) != zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return f(zzabwVar, cArr, str3, z12);
                    }
                } else if (g(zzabwVar, immutableMap2) != zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return e(zzabwVar, cArr, str2, z11);
                }
                c11 = '8';
            } else {
                c11 = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c11;
        return false;
    }

    public static final int c(zzabw zzabwVar) {
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzabwVar == zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(zzabw zzabwVar, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < zzabwVar.zza()) ? "0" : String.valueOf(str.charAt(zzabwVar.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= zzabwVar.zza()) {
            strValueOf = String.valueOf(str2.charAt(zzabwVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(zzabw zzabwVar, char[] cArr, String str, boolean z11) {
        char c11;
        int iC = c(zzabwVar);
        if (!z11) {
            c11 = '4';
        } else {
            if (str.length() >= zzabwVar.zza()) {
                char cCharAt = str.charAt(zzabwVar.zza() - 1);
                boolean z12 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z12;
            }
            c11 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c11;
        }
        return false;
    }

    public static final boolean f(zzabw zzabwVar, char[] cArr, String str, boolean z11) {
        char c11;
        int iC = c(zzabwVar);
        if (!z11) {
            c11 = '5';
        } else {
            if (str.length() >= zzabwVar.zza()) {
                char cCharAt = str.charAt(zzabwVar.zza() - 1);
                boolean z12 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z12;
            }
            c11 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c11;
        }
        return false;
    }

    public static final zzabx g(zzabw zzabwVar, ImmutableMap immutableMap) {
        Object obj = zzabx.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = immutableMap.get(zzabwVar);
        if (obj2 != null) {
            obj = obj2;
        }
        return (zzabx) obj;
    }
}
