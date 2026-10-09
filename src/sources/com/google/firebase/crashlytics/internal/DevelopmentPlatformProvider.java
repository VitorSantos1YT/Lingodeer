package com.google.firebase.crashlytics.internal;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DevelopmentPlatformProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DevelopmentPlatform f18220b = null;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class DevelopmentPlatform {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f18222b;

        public DevelopmentPlatform(DevelopmentPlatformProvider developmentPlatformProvider) {
            Context context = developmentPlatformProvider.f18219a;
            int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.unity_version", "string");
            if (iD != 0) {
                this.f18221a = "Unity";
                this.f18222b = context.getResources().getString(iD);
                return;
            }
            if (context.getAssets() != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    this.f18221a = "Flutter";
                    this.f18222b = null;
                    return;
                } catch (IOException unused) {
                }
            }
            this.f18221a = null;
            this.f18222b = null;
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.f18219a = context;
    }

    public final String a() {
        if (this.f18220b == null) {
            this.f18220b = new DevelopmentPlatform(this);
        }
        return this.f18220b.f18221a;
    }

    public final String b() {
        if (this.f18220b == null) {
            this.f18220b = new DevelopmentPlatform(this);
        }
        return this.f18220b.f18222b;
    }
}
