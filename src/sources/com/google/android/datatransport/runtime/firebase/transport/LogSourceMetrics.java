package com.google.android.datatransport.runtime.firebase.transport;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LogSourceMetrics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8086c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8088b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8089a = BuildConfig.VERSION_NAME;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f8090b = new ArrayList();
    }

    static {
        Collections.unmodifiableList(new Builder().f8090b);
    }

    public LogSourceMetrics(String str, List list) {
        this.f8087a = str;
        this.f8088b = list;
    }
}
