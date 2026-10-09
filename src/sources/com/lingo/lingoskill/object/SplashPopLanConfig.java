package com.lingo.lingoskill.object;

import c00.e;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class SplashPopLanConfig {
    private boolean isPopupPage;
    private String picUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return SplashPopLanConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SplashPopLanConfig() {
        this(false, (String) null, 3, (f) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void write$Self$app_release(SplashPopLanConfig splashPopLanConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || splashPopLanConfig.isPopupPage) {
            bVar.B(gVar, 0, splashPopLanConfig.isPopupPage);
        }
        if (!bVar.G(gVar) && m.a(splashPopLanConfig.picUrl, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 1, splashPopLanConfig.picUrl);
    }

    public final String getPicUrl() {
        return this.picUrl;
    }

    public final boolean isPopupPage() {
        return this.isPopupPage;
    }

    public final void setPicUrl(String str) {
        m.f(str, "<set-?>");
        this.picUrl = str;
    }

    public final void setPopupPage(boolean z11) {
        this.isPopupPage = z11;
    }

    public /* synthetic */ SplashPopLanConfig(int i11, boolean z11, String str, o1 o1Var) {
        this.isPopupPage = (i11 & 1) == 0 ? false : z11;
        if ((i11 & 2) == 0) {
            this.picUrl = BuildConfig.VERSION_NAME;
        } else {
            this.picUrl = str;
        }
    }

    public SplashPopLanConfig(boolean z11, String picUrl) {
        m.f(picUrl, "picUrl");
        this.isPopupPage = z11;
        this.picUrl = picUrl;
    }

    public /* synthetic */ SplashPopLanConfig(boolean z11, String str, int i11, f fVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str);
    }
}
