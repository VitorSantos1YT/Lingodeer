package okhttp3.internal;

import java.nio.charset.Charset;
import okhttp3.MediaType;
import oz.a;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Internal {
    public static final l a(MediaType mediaType) {
        Charset charset = a.f46133a;
        if (mediaType != null) {
            Charset charsetA = MediaType.a(mediaType);
            if (charsetA == null) {
                MediaType.f45062e.getClass();
                mediaType = MediaType.Companion.b(mediaType + "; charset=utf-8");
            } else {
                charset = charsetA;
            }
        }
        return new l(charset, mediaType);
    }
}
