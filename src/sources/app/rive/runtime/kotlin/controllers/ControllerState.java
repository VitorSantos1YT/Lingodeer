package app.rive.runtime.kotlin.controllers;

import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ControllerState {
    public static final int $stable = 8;
    private final Artboard activeArtboard;
    private final List<LinearAnimationInstance> animations;
    private final File file;
    private final boolean isActive;
    private final HashSet<LinearAnimationInstance> playingAnimations;
    private final HashSet<StateMachineInstance> playingStateMachines;
    private final List<StateMachineInstance> stateMachines;

    public ControllerState(File file, Artboard activeArtboard, List<LinearAnimationInstance> animations, HashSet<LinearAnimationInstance> playingAnimations, List<StateMachineInstance> stateMachines, HashSet<StateMachineInstance> playingStateMachines, boolean z11) {
        m.f(file, "file");
        m.f(activeArtboard, "activeArtboard");
        m.f(animations, "animations");
        m.f(playingAnimations, "playingAnimations");
        m.f(stateMachines, "stateMachines");
        m.f(playingStateMachines, "playingStateMachines");
        this.file = file;
        this.activeArtboard = activeArtboard;
        this.animations = animations;
        this.playingAnimations = playingAnimations;
        this.stateMachines = stateMachines;
        this.playingStateMachines = playingStateMachines;
        this.isActive = z11;
    }

    public final void dispose() {
        this.file.release();
        this.activeArtboard.release();
    }

    public final Artboard getActiveArtboard() {
        return this.activeArtboard;
    }

    public final List<LinearAnimationInstance> getAnimations() {
        return this.animations;
    }

    public final File getFile() {
        return this.file;
    }

    public final HashSet<LinearAnimationInstance> getPlayingAnimations() {
        return this.playingAnimations;
    }

    public final HashSet<StateMachineInstance> getPlayingStateMachines() {
        return this.playingStateMachines;
    }

    public final List<StateMachineInstance> getStateMachines() {
        return this.stateMachines;
    }

    public final boolean isActive() {
        return this.isActive;
    }
}
