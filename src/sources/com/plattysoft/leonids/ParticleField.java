package com.plattysoft.leonids;

import android.graphics.Canvas;
import android.view.View;
import fw.b;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class ParticleField extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f22394a;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.f22394a) {
            for (int i11 = 0; i11 < this.f22394a.size(); i11++) {
                try {
                    ((b) this.f22394a.get(i11)).a(canvas);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
