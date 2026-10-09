package com.google.android.datatransport.runtime.firebase.transport;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ClientMetrics {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8069e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeWindow f8070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GlobalMetrics f8072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8073d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TimeWindow f8074a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f8075b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public GlobalMetrics f8076c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8077d = BuildConfig.VERSION_NAME;
    }

    static {
        Collections.unmodifiableList(new Builder().f8075b);
    }

    public ClientMetrics(TimeWindow timeWindow, List list, GlobalMetrics globalMetrics, String str) {
        this.f8070a = timeWindow;
        this.f8071b = list;
        this.f8072c = globalMetrics;
        this.f8073d = str;
    }
}
