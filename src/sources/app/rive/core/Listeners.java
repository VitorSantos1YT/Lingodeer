package app.rive.core;

import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Listeners {
    public static final int $stable = 0;
    private final long artboardListener;
    private final long audioListener;
    private final long fileListener;
    private final long fontListener;
    private final long imageListener;
    private final long stateMachineListener;
    private final long viewModelInstanceListener;

    public Listeners(long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.fileListener = j11;
        this.artboardListener = j12;
        this.stateMachineListener = j13;
        this.viewModelInstanceListener = j14;
        this.imageListener = j15;
        this.audioListener = j16;
        this.fontListener = j17;
    }

    private final native void cppDelete(long j11, long j12, long j13, long j14, long j15, long j16, long j17);

    public final long component1() {
        return this.fileListener;
    }

    public final long component2() {
        return this.artboardListener;
    }

    public final long component3() {
        return this.stateMachineListener;
    }

    public final long component4() {
        return this.viewModelInstanceListener;
    }

    public final long component5() {
        return this.imageListener;
    }

    public final long component6() {
        return this.audioListener;
    }

    public final long component7() {
        return this.fontListener;
    }

    public final Listeners copy(long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        return new Listeners(j11, j12, j13, j14, j15, j16, j17);
    }

    public final void dispose$kotlin_release() {
        cppDelete(this.fileListener, this.artboardListener, this.stateMachineListener, this.viewModelInstanceListener, this.imageListener, this.audioListener, this.fontListener);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Listeners)) {
            return false;
        }
        Listeners listeners = (Listeners) obj;
        return this.fileListener == listeners.fileListener && this.artboardListener == listeners.artboardListener && this.stateMachineListener == listeners.stateMachineListener && this.viewModelInstanceListener == listeners.viewModelInstanceListener && this.imageListener == listeners.imageListener && this.audioListener == listeners.audioListener && this.fontListener == listeners.fontListener;
    }

    public final long getArtboardListener() {
        return this.artboardListener;
    }

    public final long getAudioListener() {
        return this.audioListener;
    }

    public final long getFileListener() {
        return this.fileListener;
    }

    public final long getFontListener() {
        return this.fontListener;
    }

    public final long getImageListener() {
        return this.imageListener;
    }

    public final long getStateMachineListener() {
        return this.stateMachineListener;
    }

    public final long getViewModelInstanceListener() {
        return this.viewModelInstanceListener;
    }

    public int hashCode() {
        return Long.hashCode(this.fontListener) + e.f(this.audioListener, e.f(this.imageListener, e.f(this.viewModelInstanceListener, e.f(this.stateMachineListener, e.f(this.artboardListener, Long.hashCode(this.fileListener) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "Listeners(fileListener=" + this.fileListener + ", artboardListener=" + this.artboardListener + ", stateMachineListener=" + this.stateMachineListener + ", viewModelInstanceListener=" + this.viewModelInstanceListener + ", imageListener=" + this.imageListener + ", audioListener=" + this.audioListener + ", fontListener=" + this.fontListener + ')';
    }
}
