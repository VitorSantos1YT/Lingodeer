package com.google.firebase.analytics.connector;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface AnalyticsConnector {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface AnalyticsConnectorHandle {
        void a(Set set);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface AnalyticsConnectorListener {
        void a(int i11, Bundle bundle);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ConditionalUserProperty {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f17767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f17768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f17769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f17770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bundle f17771g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f17772h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Bundle f17773i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f17774j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f17775k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Bundle f17776l;
        public long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f17777n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f17778o;
    }

    Map a(boolean z11);

    void b(ConditionalUserProperty conditionalUserProperty);

    void c(Object obj, String str);

    void d(String str, String str2, Bundle bundle);

    int e(String str);

    void f(String str);

    List g(String str);

    AnalyticsConnectorHandle h(String str, AnalyticsConnectorListener analyticsConnectorListener);
}
