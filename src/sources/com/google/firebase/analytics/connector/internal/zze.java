package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzlt;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zze implements zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f17792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsConnector.AnalyticsConnectorListener f17793b;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f17793b = analyticsConnectorListener;
        appMeasurementSdk.f12596a.k(new zzd(this));
        this.f17792a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void a(Set set) {
        HashSet hashSet = this.f17792a;
        hashSet.clear();
        HashSet hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet2.size() >= 50) {
                break;
            }
            ImmutableSet immutableSet = zzc.f17785a;
            if (str != null && str.length() != 0) {
                int iCodePointAt = str.codePointAt(0);
                if (!Character.isLetter(iCodePointAt)) {
                    if (iCodePointAt == 95) {
                        iCodePointAt = 95;
                    }
                }
                int length = str.length();
                int iCharCount = Character.charCount(iCodePointAt);
                while (true) {
                    if (iCharCount >= length) {
                        if (str.length() != 0) {
                            int iCodePointAt2 = str.codePointAt(0);
                            if (!Character.isLetter(iCodePointAt2)) {
                                break;
                            }
                            int length2 = str.length();
                            int iCharCount2 = Character.charCount(iCodePointAt2);
                            while (true) {
                                if (iCharCount2 < length2) {
                                    int iCodePointAt3 = str.codePointAt(iCharCount2);
                                    if (iCodePointAt3 != 95 && !Character.isLetterOrDigit(iCodePointAt3)) {
                                        break;
                                    } else {
                                        iCharCount2 += Character.charCount(iCodePointAt3);
                                    }
                                } else {
                                    String strB = zzlt.b(str, zzjm.f13207a, zzjm.f13212f);
                                    if (strB != null) {
                                        str = strB;
                                    }
                                    hashSet2.add(str);
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    } else {
                        int iCodePointAt4 = str.codePointAt(iCharCount);
                        if (iCodePointAt4 != 95 && !Character.isLetterOrDigit(iCodePointAt4)) {
                            break;
                        } else {
                            iCharCount += Character.charCount(iCodePointAt4);
                        }
                    }
                }
            }
        }
        hashSet.addAll(hashSet2);
    }
}
