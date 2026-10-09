package app.rive.runtime.kotlin.core;

import com.bumptech.glide.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FileAsset extends NativeObject {
    public static final int $stable = 8;
    private final h cdnUrl$delegate;
    private final h name$delegate;
    private final RendererType rendererType;
    private final h uniqueFilename$delegate;

    public /* synthetic */ FileAsset(long j11, int i11, f fVar) {
        this(j11, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppCDNUrl(long j11);

    private final native boolean cppDecode(long j11, byte[] bArr, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppName(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppUniqueFilename(long j11);

    public final boolean decode(byte[] bytes) {
        m.f(bytes, "bytes");
        return cppDecode(getCppPointer(), bytes, this.rendererType.getValue());
    }

    public final String getCdnUrl() {
        return (String) this.cdnUrl$delegate.getValue();
    }

    public final String getName() {
        return (String) this.name$delegate.getValue();
    }

    public final String getUniqueFilename() {
        return (String) this.uniqueFilename$delegate.getValue();
    }

    private FileAsset(long j11, int i11) {
        super(j11);
        this.rendererType = RendererType.Companion.fromIndex(i11);
        this.name$delegate = d.v(new FileAsset$name$2(this));
        this.uniqueFilename$delegate = d.v(new FileAsset$uniqueFilename$2(this));
        this.cdnUrl$delegate = d.v(new FileAsset$cdnUrl$2(this));
    }
}
