package com.lingo.fluent.widget;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WaveView$mCreateCircle$1 implements Runnable {
    final /* synthetic */ WaveView this$0;

    public WaveView$mCreateCircle$1(WaveView waveView) {
        this.this$0 = waveView;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.this$0.mIsRunning) {
            this.this$0.newCircle();
            WaveView waveView = this.this$0;
            waveView.postDelayed(this, waveView.mSpeed);
        }
    }
}
