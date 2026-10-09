package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.FileAssetLoader;
import app.rive.runtime.kotlin.core.RendererType;
import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import pd.e;
import pd.h;
import pd.j;
import pd.k;
import pd.l;
import se.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveFileRequest extends h {
    public static final int $stable = 8;
    private final FileAssetLoader assetLoader;
    private final k listener;
    private final RendererType rendererType;

    public /* synthetic */ RiveFileRequest(String str, RendererType rendererType, k kVar, j jVar, FileAssetLoader fileAssetLoader, int i11, f fVar) {
        this(str, rendererType, kVar, jVar, (i11 & 16) != 0 ? null : fileAssetLoader);
    }

    @Override // pd.h
    public l parseNetworkResponse(e eVar) {
        byte[] bArr;
        if (eVar != null) {
            try {
                bArr = eVar.f46783a;
            } catch (UnsupportedEncodingException e8) {
                return new l(new ParseError(e8));
            }
        } else {
            bArr = null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new l(new File(bArr, this.rendererType, this.assetLoader), i.z(eVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFileRequest(String url, RendererType rendererType, k listener, j errorListener, FileAssetLoader fileAssetLoader) {
        super(url, errorListener);
        m.f(url, "url");
        m.f(rendererType, "rendererType");
        m.f(listener, "listener");
        m.f(errorListener, "errorListener");
        this.rendererType = rendererType;
        this.listener = listener;
        this.assetLoader = fileAssetLoader;
    }

    @Override // pd.h
    public void deliverResponse(File response) {
        m.f(response, "response");
        RiveAnimationView.loadFromNetwork$lambda$4(((a) this.listener).f2819a, response);
    }
}
