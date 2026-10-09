package tv;

import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.PlayableInstance;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements RiveFileController.Listener {
    @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
    public final void notifyAdvance(float f5) {
        RiveFileController.Listener.DefaultImpls.notifyAdvance(this, f5);
    }

    @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
    public final void notifyLoop(PlayableInstance animation) {
        m.f(animation, "animation");
    }

    @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
    public final void notifyPause(PlayableInstance animation) {
        m.f(animation, "animation");
    }

    @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
    public final void notifyPlay(PlayableInstance animation) {
        m.f(animation, "animation");
    }

    @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
    public final void notifyStateChanged(String stateMachineName, String stateName) {
        m.f(stateMachineName, "stateMachineName");
        m.f(stateName, "stateName");
    }

    @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
    public final void notifyStop(PlayableInstance animation) {
        m.f(animation, "animation");
    }
}
