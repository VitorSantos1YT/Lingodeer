package com.google.firebase.abt;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseABTesting {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f17755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f17757c = null;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
    }

    public FirebaseABTesting(Provider provider, String str) {
        this.f17755a = provider;
        this.f17756b = str;
    }

    public static boolean b(ArrayList arrayList, AbtExperimentInfo abtExperimentInfo) {
        String str = abtExperimentInfo.f17749a;
        String str2 = abtExperimentInfo.f17750b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            AbtExperimentInfo abtExperimentInfo2 = (AbtExperimentInfo) obj;
            if (abtExperimentInfo2.f17749a.equals(str) && abtExperimentInfo2.f17750b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final void a(ArrayList arrayList) {
        Provider provider = this.f17755a;
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        String str = this.f17756b;
        ArrayDeque arrayDeque = new ArrayDeque(analyticsConnector.g(str));
        if (this.f17757c == null) {
            this.f17757c = Integer.valueOf(((AnalyticsConnector) provider.get()).e(str));
        }
        int iIntValue = this.f17757c.intValue();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) obj;
            while (arrayDeque.size() >= iIntValue) {
                ((AnalyticsConnector) provider.get()).f(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).f17766b);
            }
            AnalyticsConnector.ConditionalUserProperty conditionalUserPropertyB = abtExperimentInfo.b(str);
            ((AnalyticsConnector) provider.get()).b(conditionalUserPropertyB);
            arrayDeque.offer(conditionalUserPropertyB);
        }
    }

    public final void c(ArrayList arrayList) throws AbtException {
        d();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            arrayList2.add(AbtExperimentInfo.a((Map) obj));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        String str = this.f17756b;
        Provider provider = this.f17755a;
        if (zIsEmpty) {
            d();
            Iterator it = ((AnalyticsConnector) provider.get()).g(str).iterator();
            while (it.hasNext()) {
                ((AnalyticsConnector) provider.get()).f(((AnalyticsConnector.ConditionalUserProperty) it.next()).f17766b);
            }
            return;
        }
        d();
        List<AnalyticsConnector.ConditionalUserProperty> listG = ((AnalyticsConnector) provider.get()).g(str);
        ArrayList arrayList3 = new ArrayList();
        for (AnalyticsConnector.ConditionalUserProperty conditionalUserProperty : listG) {
            String[] strArr = AbtExperimentInfo.f17747g;
            String str2 = conditionalUserProperty.f17768d;
            if (str2 == null) {
                str2 = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
            }
            arrayList3.add(new AbtExperimentInfo(conditionalUserProperty.f17766b, String.valueOf(conditionalUserProperty.f17767c), str2, new Date(conditionalUserProperty.m), conditionalUserProperty.f17769e, conditionalUserProperty.f17774j));
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList3.get(i13);
            i13++;
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) obj2;
            if (!b(arrayList2, abtExperimentInfo)) {
                arrayList4.add(abtExperimentInfo.b(str));
            }
        }
        int size3 = arrayList4.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList4.get(i14);
            i14++;
            ((AnalyticsConnector) provider.get()).f(((AnalyticsConnector.ConditionalUserProperty) obj3).f17766b);
        }
        ArrayList arrayList5 = new ArrayList();
        int size4 = arrayList2.size();
        while (i11 < size4) {
            Object obj4 = arrayList2.get(i11);
            i11++;
            AbtExperimentInfo abtExperimentInfo2 = (AbtExperimentInfo) obj4;
            if (!b(arrayList3, abtExperimentInfo2)) {
                arrayList5.add(abtExperimentInfo2);
            }
        }
        a(arrayList5);
    }

    public final void d() throws AbtException {
        if (this.f17755a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
