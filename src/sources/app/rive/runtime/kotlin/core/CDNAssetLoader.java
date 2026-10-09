package app.rive.runtime.kotlin.core;

import android.content.Context;
import com.android.volley.VolleyError;
import com.bumptech.glide.d;
import kotlin.jvm.internal.m;
import pd.i;
import qy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class CDNAssetLoader extends FileAssetLoader {
    public static final int $stable = 8;
    private final h queue$delegate;
    private final String tag;

    public CDNAssetLoader(Context context) {
        m.f(context, "context");
        this.tag = getClass().getSimpleName();
        this.queue$delegate = d.v(new CDNAssetLoader$queue$2(context));
    }

    private final i getQueue() {
        return (i) this.queue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadContents$lambda$0(CDNAssetLoader this$0, VolleyError volleyError) {
        m.f(this$0, "this$0");
        volleyError.printStackTrace();
    }

    @Override // app.rive.runtime.kotlin.core.FileAssetLoader
    public boolean loadContents(FileAsset asset, byte[] inBandBytes) {
        m.f(asset, "asset");
        m.f(inBandBytes, "inBandBytes");
        String cdnUrl = asset.getCdnUrl();
        if (cdnUrl.length() == 0) {
            return false;
        }
        getQueue().a(new BytesRequest(cdnUrl, new CDNAssetLoader$loadContents$request$1(asset), new a(this, 0)));
        return true;
    }
}
