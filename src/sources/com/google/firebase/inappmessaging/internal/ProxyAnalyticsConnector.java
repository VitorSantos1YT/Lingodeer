package com.google.firebase.inappmessaging.internal;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Deferred;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyAnalyticsConnector implements AnalyticsConnector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f20055a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ProxyAnalyticsConnectorHandle implements AnalyticsConnector.AnalyticsConnectorHandle {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Object f20056c = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashSet f20057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile AnalyticsConnector.AnalyticsConnectorHandle f20058b;

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public final void a(Set set) {
            AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandle = this.f20058b;
            if (analyticsConnectorHandle == f20056c) {
                return;
            }
            if (analyticsConnectorHandle != null) {
                analyticsConnectorHandle.a(set);
            } else {
                synchronized (this) {
                    this.f20057a.addAll(set);
                }
            }
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final Map a(boolean z11) {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void c(Object obj, String str) {
        Object obj2 = this.f20055a;
        AnalyticsConnector analyticsConnector = obj2 instanceof AnalyticsConnector ? (AnalyticsConnector) obj2 : null;
        if (analyticsConnector != null) {
            analyticsConnector.c(obj, str);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void d(String str, String str2, Bundle bundle) {
        Object obj = this.f20055a;
        AnalyticsConnector analyticsConnector = obj instanceof AnalyticsConnector ? (AnalyticsConnector) obj : null;
        if (analyticsConnector != null) {
            analyticsConnector.d(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final int e(String str) {
        return 0;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final List g(String str) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final AnalyticsConnector.AnalyticsConnectorHandle h(String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        Object obj = this.f20055a;
        if (obj instanceof AnalyticsConnector) {
            return ((AnalyticsConnector) obj).h(str, analyticsConnectorListener);
        }
        ProxyAnalyticsConnectorHandle proxyAnalyticsConnectorHandle = new ProxyAnalyticsConnectorHandle();
        proxyAnalyticsConnectorHandle.f20057a = new HashSet();
        ((Deferred) obj).a(new u(proxyAnalyticsConnectorHandle, str, analyticsConnectorListener, 0));
        return proxyAnalyticsConnectorHandle;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void b(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void f(String str) {
    }
}
