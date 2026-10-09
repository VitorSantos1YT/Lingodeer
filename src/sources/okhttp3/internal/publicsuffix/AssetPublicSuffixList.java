package okhttp3.internal.publicsuffix;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.m;
import m00.b;
import m00.i0;
import okhttp3.internal.platform.ContextAwarePlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.PlatformRegistry;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class AssetPublicSuffixList extends BasePublicSuffixList {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f45555g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45556f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        f45555g = "PublicSuffixDatabase.list";
    }

    public AssetPublicSuffixList() {
        this(0);
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final i0 b() throws IOException {
        AssetManager assets;
        PlatformRegistry.f45530a.getClass();
        Platform.f45527a.getClass();
        Object obj = Platform.f45528b;
        ContextAwarePlatform contextAwarePlatform = obj != null ? (ContextAwarePlatform) obj : null;
        Context contextB = contextAwarePlatform != null ? contextAwarePlatform.b() : null;
        if (contextB == null || (assets = contextB.getAssets()) == null) {
            throw new IOException("Platform applicationContext not initialized");
        }
        InputStream inputStreamOpen = assets.open(this.f45556f);
        m.e(inputStreamOpen, "open(...)");
        return b.i(inputStreamOpen);
    }

    public AssetPublicSuffixList(int i11) {
        String path = f45555g;
        m.f(path, "path");
        this.f45556f = path;
    }
}
