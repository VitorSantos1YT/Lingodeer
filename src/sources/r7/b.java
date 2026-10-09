package r7;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import e7.g;
import java.nio.ByteBuffer;
import u8.h;
import u8.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g implements u8.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f48830n;

    public b(k kVar) {
        super(new h[2], new u8.c[2]);
        int i11 = this.f25128g;
        e7.d[] dVarArr = this.f25126e;
        b7.a.j(i11 == dVarArr.length);
        for (e7.d dVar : dVarArr) {
            dVar.q(1024);
        }
        this.f48830n = kVar;
    }

    @Override // e7.g
    public final e7.d f() {
        return new h(1);
    }

    @Override // e7.g
    public final e7.e g() {
        return new u8.c(this);
    }

    @Override // e7.g
    public final DecoderException h(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    @Override // e7.g
    public final DecoderException i(e7.d dVar, e7.e eVar, boolean z11) {
        h hVar = (h) dVar;
        u8.c cVar = (u8.c) eVar;
        try {
            ByteBuffer byteBuffer = hVar.f25115e;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            k kVar = this.f48830n;
            if (z11) {
                kVar.reset();
            }
            u8.d dVarH = kVar.h(bArrArray, 0, iLimit);
            long j11 = hVar.f25117t;
            long j12 = hVar.L;
            cVar.f25118c = j11;
            cVar.f52825e = dVarH;
            if (j12 != Long.MAX_VALUE) {
                j11 = j12;
            }
            cVar.f52826f = j11;
            cVar.f25119d = false;
            return null;
        } catch (SubtitleDecoderException e8) {
            return e8;
        }
    }

    @Override // u8.e
    public final void b(long j11) {
    }
}
