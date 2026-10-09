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
public final class LanConfig {
    private String bannerPic1300Url;
    private String bannerPicUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return LanConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LanConfig() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void write$Self$app_release(LanConfig lanConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(lanConfig.bannerPicUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, lanConfig.bannerPicUrl);
        }
        if (!bVar.G(gVar) && m.a(lanConfig.bannerPic1300Url, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 1, lanConfig.bannerPic1300Url);
    }

    public final String getBannerPic1300Url() {
        return this.bannerPic1300Url;
    }

    public final String getBannerPicUrl() {
        return this.bannerPicUrl;
    }

    public final void setBannerPic1300Url(String str) {
        m.f(str, "<set-?>");
        this.bannerPic1300Url = str;
    }

    public final void setBannerPicUrl(String str) {
        m.f(str, "<set-?>");
        this.bannerPicUrl = str;
    }

    public /* synthetic */ LanConfig(int i11, String str, String str2, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.bannerPicUrl = BuildConfig.VERSION_NAME;
        } else {
            this.bannerPicUrl = str;
        }
        if ((i11 & 2) == 0) {
            this.bannerPic1300Url = BuildConfig.VERSION_NAME;
        } else {
            this.bannerPic1300Url = str2;
        }
    }

    public LanConfig(String bannerPicUrl, String bannerPic1300Url) {
        m.f(bannerPicUrl, "bannerPicUrl");
        m.f(bannerPic1300Url, "bannerPic1300Url");
        this.bannerPicUrl = bannerPicUrl;
        this.bannerPic1300Url = bannerPic1300Url;
    }

    public /* synthetic */ LanConfig(String str, String str2, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
