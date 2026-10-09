package app.rive.runtime.kotlin.core;

import android.content.Context;
import app.rive.runtime.kotlin.RiveAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FallbackAssetLoader extends FileAssetLoader {
    public static final int $stable = 8;
    private final List<FileAssetLoader> loaders;

    public /* synthetic */ FallbackAssetLoader(Context context, boolean z11, FileAssetLoader fileAssetLoader, int i11, f fVar) {
        this(context, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? null : fileAssetLoader);
    }

    private final void resetCDNLoader(boolean z11, Context context) {
        Iterator<FileAssetLoader> it = this.loaders.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next() instanceof CDNAssetLoader) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1 && z11) {
            Context applicationContext = context.getApplicationContext();
            m.e(applicationContext, "getApplicationContext(...)");
            appendLoader(new CDNAssetLoader(applicationContext));
        } else {
            if (i11 < 0 || z11) {
                return;
            }
            FileAssetLoader fileAssetLoaderRemove = this.loaders.remove(i11);
            getDependencies().remove(fileAssetLoaderRemove);
            fileAssetLoaderRemove.release();
        }
    }

    public final void appendLoader(FileAssetLoader loader) {
        m.f(loader, "loader");
        this.loaders.add(loader);
        getDependencies().add(loader);
    }

    public final List<FileAssetLoader> getLoaders() {
        return this.loaders;
    }

    @Override // app.rive.runtime.kotlin.core.FileAssetLoader
    public boolean loadContents(FileAsset asset, byte[] inBandBytes) {
        m.f(asset, "asset");
        m.f(inBandBytes, "inBandBytes");
        List<FileAssetLoader> list = this.loaders;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((FileAssetLoader) it.next()).loadContents(asset, inBandBytes)) {
                return true;
            }
        }
        return false;
    }

    public final void prependLoader(FileAssetLoader loader) {
        m.f(loader, "loader");
        this.loaders.add(0, loader);
        getDependencies().add(loader);
    }

    public final void resetWith$kotlin_release(RiveAnimationView.Builder builder) {
        m.f(builder, "builder");
        FileAssetLoader assetLoader$kotlin_release = builder.getAssetLoader$kotlin_release();
        if (assetLoader$kotlin_release != null) {
            prependLoader(assetLoader$kotlin_release);
        }
        boolean shouldLoadCDNAssets$kotlin_release = builder.getShouldLoadCDNAssets$kotlin_release();
        Context applicationContext = builder.getContext$kotlin_release().getApplicationContext();
        m.e(applicationContext, "getApplicationContext(...)");
        resetCDNLoader(shouldLoadCDNAssets$kotlin_release, applicationContext);
    }

    public FallbackAssetLoader(Context context, boolean z11, FileAssetLoader fileAssetLoader) {
        m.f(context, "context");
        this.loaders = new ArrayList();
        if (fileAssetLoader != null) {
            appendLoader(fileAssetLoader);
        }
        if (z11) {
            Context applicationContext = context.getApplicationContext();
            m.e(applicationContext, "getApplicationContext(...)");
            appendLoader(new CDNAssetLoader(applicationContext));
        }
    }

    public static /* synthetic */ void getLoaders$annotations() {
    }
}
