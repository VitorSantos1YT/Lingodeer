package j2;

import android.graphics.Canvas;
import android.graphics.Picture;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Picture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f35647a;

    public m(c cVar) {
        this.f35647a = cVar;
    }

    @Override // android.graphics.Picture
    public final Canvas beginRecording(int i11, int i12) {
        return new Canvas();
    }

    @Override // android.graphics.Picture
    public final void draw(Canvas canvas) {
        Canvas canvas2 = g2.d.f28542a;
        g2.c cVar = new g2.c();
        cVar.f28539a = canvas;
        this.f35647a.c(cVar, null);
    }

    @Override // android.graphics.Picture
    public final int getHeight() {
        return (int) (this.f35647a.f35563u & 4294967295L);
    }

    @Override // android.graphics.Picture
    public final int getWidth() {
        return (int) (this.f35647a.f35563u >> 32);
    }

    @Override // android.graphics.Picture
    public final boolean requiresHardwareAcceleration() {
        return true;
    }

    @Override // android.graphics.Picture
    public final void endRecording() {
    }
}
