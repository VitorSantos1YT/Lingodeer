package app.rive.runtime.kotlin.controllers;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.drawerlayout.widget.ktFt.FpIL;
import app.rive.runtime.kotlin.ChangedInput;
import app.rive.runtime.kotlin.Observable;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.core.AdvanceResult;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.Direction;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.Helpers;
import app.rive.runtime.kotlin.core.LayerState;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.Loop;
import app.rive.runtime.kotlin.core.PlayableInstance;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RiveEvent;
import app.rive.runtime.kotlin.core.SMIBoolean;
import app.rive.runtime.kotlin.core.SMIInput;
import app.rive.runtime.kotlin.core.SMINumber;
import app.rive.runtime.kotlin.core.SMITrigger;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.ViewModelInstance;
import app.rive.runtime.kotlin.renderers.PointerEvents;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fz.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.f;
import ns.o;
import ry.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveFileController implements Observable<Listener>, RefCount {
    public static final String TAG = "RiveFileController";
    private Set<RiveEventListener> _eventListeners;
    private Set<Listener> _listeners;
    private Artboard activeArtboard;
    private Alignment alignment;
    private List<LinearAnimationInstance> animationList;
    private boolean autoplay;
    private final ConcurrentLinkedQueue<ChangedInput> changedInputs;
    private File file;
    private Fit fit;
    private boolean isActive;
    private Float layoutScaleFactor;
    private float layoutScaleFactorAutomatic;
    private Loop loop;
    private a onStart;
    private Set<LinearAnimationInstance> playingAnimationSet;
    private Set<StateMachineInstance> playingStateMachineSet;
    private AtomicInteger refs;
    private AtomicBoolean requireArtboardResize;
    private final ReentrantLock startStopLock;
    private List<StateMachineInstance> stateMachineList;
    private RectF targetBounds;
    private Float userSetVolume;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface RiveEventListener {
        void notifyEvent(RiveEvent riveEvent);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdvanceResult.values().length];
            try {
                iArr[AdvanceResult.ONESHOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvanceResult.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvanceResult.PINGPONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvanceResult.ADVANCED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvanceResult.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PointerEvents.values().length];
            try {
                iArr2[PointerEvents.POINTER_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PointerEvents.POINTER_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PointerEvents.POINTER_MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RiveFileController() {
        this(null, false, null, null, null, null, 63, null);
    }

    private final List<LinearAnimationInstance> animations(String str) {
        return animations(o.K(str));
    }

    public static /* synthetic */ void fireState$default(RiveFileController riveFileController, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        riveFileController.fireState(str, str2, str3);
    }

    public static /* synthetic */ void getEventListeners$annotations() {
    }

    public static /* synthetic */ void getListeners$annotations() {
    }

    private final List<StateMachineInstance> getOrCreateStateMachines(String str) {
        Artboard artboard;
        List<StateMachineInstance> listStateMachines = stateMachines(str);
        if (!listStateMachines.isEmpty() || (artboard = this.activeArtboard) == null) {
            return listStateMachines;
        }
        StateMachineInstance stateMachineInstanceStateMachine = artboard.stateMachine(str);
        this.stateMachineList.add(stateMachineInstanceStateMachine);
        return o.K(stateMachineInstanceStateMachine);
    }

    private final void notifyAdvance(float f5) {
        Iterator it = m.a1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyAdvance(f5);
        }
    }

    private final void notifyEvent(RiveEvent riveEvent) {
        Iterator it = m.a1(getEventListeners()).iterator();
        while (it.hasNext()) {
            ((RiveEventListener) it.next()).notifyEvent(riveEvent);
        }
    }

    private final void notifyLoop(PlayableInstance playableInstance) {
        Iterator it = m.a1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyLoop(playableInstance);
        }
    }

    private final void notifyPause(PlayableInstance playableInstance) {
        Iterator it = m.a1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPause(playableInstance);
        }
    }

    private final void notifyPlay(PlayableInstance playableInstance) {
        Iterator it = m.a1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPlay(playableInstance);
        }
    }

    private final void notifyStateChanged(StateMachineInstance stateMachineInstance, LayerState layerState) {
        Iterator it = m.a1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStateChanged(stateMachineInstance.getName(), layerState.toString());
        }
    }

    private final void notifyStop(PlayableInstance playableInstance) {
        Iterator it = m.a1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStop(playableInstance);
        }
    }

    public static /* synthetic */ void pause$default(RiveFileController riveFileController, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        riveFileController.pause((List<String>) list, z11);
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, List list, Loop loop, Direction direction, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i11 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            z12 = true;
        }
        riveFileController.play((List<String>) list, loop2, direction2, z13, z12);
    }

    public static /* synthetic */ void play$kotlin_release$default(RiveFileController riveFileController, StateMachineInstance stateMachineInstance, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        riveFileController.play$kotlin_release(stateMachineInstance, z11);
    }

    private final void playAnimation(String str, Loop loop, Direction direction, boolean z11, boolean z12) {
        Artboard artboard;
        if (z11) {
            Iterator<T> it = getOrCreateStateMachines(str).iterator();
            while (it.hasNext()) {
                play$kotlin_release((StateMachineInstance) it.next(), z12);
            }
            return;
        }
        List<LinearAnimationInstance> listAnimations = animations(str);
        Iterator<T> it2 = listAnimations.iterator();
        while (it2.hasNext()) {
            play$kotlin_release((LinearAnimationInstance) it2.next(), loop, direction);
        }
        if (!listAnimations.isEmpty() || (artboard = this.activeArtboard) == null) {
            return;
        }
        play$kotlin_release(artboard.animation(str), loop, direction);
    }

    public static /* synthetic */ void playAnimation$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i11 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            z12 = true;
        }
        riveFileController.playAnimation(str, loop2, direction2, z13, z12);
    }

    private final void processAllInputs() {
        ChangedInput changedInputPoll;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (!this.changedInputs.isEmpty() && (changedInputPoll = this.changedInputs.poll()) != null) {
            if (changedInputPoll.getNestedArtboardPath() == null) {
                for (StateMachineInstance stateMachineInstance : getOrCreateStateMachines(changedInputPoll.getStateMachineName())) {
                    linkedHashSet.add(stateMachineInstance);
                    SMIInput sMIInputInput = stateMachineInstance.input(changedInputPoll.getName());
                    if (sMIInputInput instanceof SMITrigger) {
                        ((SMITrigger) sMIInputInput).fire$kotlin_release();
                    } else if (sMIInputInput instanceof SMIBoolean) {
                        Object value = changedInputPoll.getValue();
                        kotlin.jvm.internal.m.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                        ((SMIBoolean) sMIInputInput).setValue$kotlin_release(((Boolean) value).booleanValue());
                    } else if (sMIInputInput instanceof SMINumber) {
                        Object value2 = changedInputPoll.getValue();
                        kotlin.jvm.internal.m.d(value2, "null cannot be cast to non-null type kotlin.Float");
                        ((SMINumber) sMIInputInput).setValue$kotlin_release(((Float) value2).floatValue());
                    }
                }
            } else {
                Artboard artboard = this.activeArtboard;
                SMIInput sMIInputInput2 = artboard != null ? artboard.input(changedInputPoll.getName(), changedInputPoll.getNestedArtboardPath()) : null;
                if (sMIInputInput2 instanceof SMITrigger) {
                    ((SMITrigger) sMIInputInput2).fire$kotlin_release();
                } else if (sMIInputInput2 instanceof SMIBoolean) {
                    Object value3 = changedInputPoll.getValue();
                    kotlin.jvm.internal.m.d(value3, "null cannot be cast to non-null type kotlin.Boolean");
                    ((SMIBoolean) sMIInputInput2).setValue$kotlin_release(((Boolean) value3).booleanValue());
                } else if (sMIInputInput2 instanceof SMINumber) {
                    Object value4 = changedInputPoll.getValue();
                    kotlin.jvm.internal.m.d(value4, "null cannot be cast to non-null type kotlin.Float");
                    ((SMINumber) sMIInputInput2).setValue$kotlin_release(((Float) value4).floatValue());
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    private final void queueInput(String str, String str2, Object obj, String str3) {
        queueInputs$kotlin_release(new ChangedInput(str, str2, obj, str3));
    }

    public static /* synthetic */ void queueInput$default(RiveFileController riveFileController, String str, String str2, Object obj, String str3, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            obj = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        riveFileController.queueInput(str, str2, obj, str3);
    }

    private final boolean resolveStateMachineAdvance(StateMachineInstance stateMachineInstance, float f5) {
        if (!getEventListeners().isEmpty()) {
            Iterator<T> it = stateMachineInstance.getEventsReported().iterator();
            while (it.hasNext()) {
                notifyEvent((RiveEvent) it.next());
            }
        }
        boolean zAdvance = stateMachineInstance.advance(f5);
        if (!getListeners().isEmpty()) {
            Iterator<T> it2 = stateMachineInstance.getStatesChanged().iterator();
            while (it2.hasNext()) {
                notifyStateChanged(stateMachineInstance, (LayerState) it2.next());
            }
        }
        return zAdvance;
    }

    public static /* synthetic */ void selectArtboard$default(RiveFileController riveFileController, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        riveFileController.selectArtboard(str);
    }

    private final void setArtboard(Artboard artboard) {
        if (kotlin.jvm.internal.m.a(artboard, this.activeArtboard)) {
            return;
        }
        stopAnimations();
        setActiveArtboard(artboard);
        autoplay();
    }

    public static /* synthetic */ void setBooleanState$default(RiveFileController riveFileController, String str, String str2, boolean z11, String str3, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        riveFileController.setBooleanState(str, str2, z11, str3);
    }

    public static /* synthetic */ void setNumberState$default(RiveFileController riveFileController, String str, String str2, float f5, String str3, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        riveFileController.setNumberState(str, str2, f5, str3);
    }

    public static /* synthetic */ void setRiveFile$default(RiveFileController riveFileController, File file, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        riveFileController.setRiveFile(file, str);
    }

    private final List<StateMachineInstance> stateMachines(String str) {
        return stateMachines(o.K(str));
    }

    private final void stop(LinearAnimationInstance linearAnimationInstance) {
        this.playingAnimationSet.remove(linearAnimationInstance);
        if (this.animationList.remove(linearAnimationInstance)) {
            notifyStop(linearAnimationInstance);
        }
    }

    public static /* synthetic */ void stopAnimations$default(RiveFileController riveFileController, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        riveFileController.stopAnimations((List<String>) list, z11);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int acquire() {
        return RefCount.DefaultImpls.acquire(this);
    }

    public final void addEventListener(RiveEventListener listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        synchronized (this.startStopLock) {
            this._eventListeners.add(listener);
        }
    }

    public final void advance(float f5) {
        ReentrantLock lock;
        File file = this.file;
        if (file == null || (lock = file.getLock()) == null) {
            return;
        }
        synchronized (lock) {
            try {
                Artboard artboard = this.activeArtboard;
                if (artboard != null) {
                    processAllInputs();
                    int i11 = 0;
                    boolean zIsEmpty = false;
                    for (LinearAnimationInstance linearAnimationInstance : getAnimations()) {
                        if (getPlayingAnimations().contains(linearAnimationInstance)) {
                            AdvanceResult advanceResultAdvanceAndGetResult = linearAnimationInstance.advanceAndGetResult(f5);
                            linearAnimationInstance.apply();
                            int i12 = WhenMappings.$EnumSwitchMapping$0[advanceResultAdvanceAndGetResult.ordinal()];
                            if (i12 == 1) {
                                stop(linearAnimationInstance);
                            } else if (i12 == 2 || i12 == 3) {
                                notifyLoop(linearAnimationInstance);
                            } else if (i12 == 4) {
                                zIsEmpty = getPlayingStateMachines().isEmpty();
                            }
                        }
                    }
                    if (zIsEmpty) {
                        artboard.advance(f5);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (StateMachineInstance stateMachineInstance : getStateMachines()) {
                        if (getPlayingStateMachines().contains(stateMachineInstance) && !resolveStateMachineAdvance(stateMachineInstance, f5)) {
                            arrayList.add(stateMachineInstance);
                        }
                    }
                    if (f5 > 0.0d) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList.get(i13);
                            i13++;
                            pause((StateMachineInstance) obj);
                        }
                    }
                    HashSet<StateMachineInstance> playingStateMachines = getPlayingStateMachines();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = playingStateMachines.iterator();
                    while (it.hasNext()) {
                        ViewModelInstance viewModelInstance = ((StateMachineInstance) it.next()).getViewModelInstance();
                        if (viewModelInstance != null) {
                            arrayList2.add(viewModelInstance);
                        }
                    }
                    int size2 = arrayList2.size();
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        ((ViewModelInstance) obj2).pollChanges$kotlin_release();
                    }
                    notifyAdvance(f5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void autoplay() {
        if (this.autoplay) {
            play$default(this, null, null, true, 3, null);
            return;
        }
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.advance(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        synchronized (this.startStopLock) {
            a aVar = this.onStart;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public final void fireState(String stateMachineName, String inputName, String str) {
        kotlin.jvm.internal.m.f(stateMachineName, "stateMachineName");
        kotlin.jvm.internal.m.f(inputName, "inputName");
        queueInput$default(this, stateMachineName, inputName, null, str, 4, null);
    }

    public final void fireStateAtPath(String inputName, String path) {
        kotlin.jvm.internal.m.f(inputName, "inputName");
        kotlin.jvm.internal.m.f(path, "path");
        queueInput$default(this, BuildConfig.VERSION_NAME, inputName, null, path, 4, null);
    }

    public final Artboard getActiveArtboard() {
        return this.activeArtboard;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final List<LinearAnimationInstance> getAnimations() {
        List<LinearAnimationInstance> listA1;
        List<LinearAnimationInstance> animationList = this.animationList;
        kotlin.jvm.internal.m.e(animationList, "animationList");
        synchronized (animationList) {
            List<LinearAnimationInstance> animationList2 = this.animationList;
            kotlin.jvm.internal.m.e(animationList2, "animationList");
            listA1 = m.a1(animationList2);
        }
        return listA1;
    }

    public final RectF getArtboardBounds() {
        RectF bounds;
        Artboard artboard = this.activeArtboard;
        return (artboard == null || (bounds = artboard.getBounds()) == null) ? new RectF() : bounds;
    }

    public final boolean getAutoplay() {
        return this.autoplay;
    }

    public final ConcurrentLinkedQueue<ChangedInput> getChangedInputs$kotlin_release() {
        return this.changedInputs;
    }

    public final HashSet<RiveEventListener> getEventListeners() {
        HashSet<RiveEventListener> hashSetY0;
        synchronized (this._eventListeners) {
            hashSetY0 = m.Y0(this._eventListeners);
        }
        return hashSetY0;
    }

    public final File getFile() {
        return this.file;
    }

    public final Fit getFit() {
        return this.fit;
    }

    public final Float getLayoutScaleFactor() {
        return this.layoutScaleFactor;
    }

    public final float getLayoutScaleFactorActive$kotlin_release() {
        Float f5 = this.layoutScaleFactor;
        return f5 != null ? f5.floatValue() : this.layoutScaleFactorAutomatic;
    }

    public final float getLayoutScaleFactorAutomatic() {
        return this.layoutScaleFactorAutomatic;
    }

    public final HashSet<Listener> getListeners() {
        HashSet<Listener> hashSetY0;
        synchronized (this._listeners) {
            hashSetY0 = m.Y0(this._listeners);
        }
        return hashSetY0;
    }

    public final Loop getLoop() {
        return this.loop;
    }

    public final a getOnStart() {
        return this.onStart;
    }

    public final Set<LinearAnimationInstance> getPausedAnimations() {
        return m.T0(getAnimations(), getPlayingAnimations());
    }

    public final Set<StateMachineInstance> getPausedStateMachines() {
        return m.T0(getStateMachines(), getPlayingStateMachines());
    }

    public final HashSet<LinearAnimationInstance> getPlayingAnimations() {
        HashSet<LinearAnimationInstance> hashSetY0;
        Set<LinearAnimationInstance> playingAnimationSet = this.playingAnimationSet;
        kotlin.jvm.internal.m.e(playingAnimationSet, "playingAnimationSet");
        synchronized (playingAnimationSet) {
            Set<LinearAnimationInstance> playingAnimationSet2 = this.playingAnimationSet;
            kotlin.jvm.internal.m.e(playingAnimationSet2, "playingAnimationSet");
            hashSetY0 = m.Y0(playingAnimationSet2);
        }
        return hashSetY0;
    }

    public final HashSet<StateMachineInstance> getPlayingStateMachines() {
        HashSet<StateMachineInstance> hashSetY0;
        Set<StateMachineInstance> playingStateMachineSet = this.playingStateMachineSet;
        kotlin.jvm.internal.m.e(playingStateMachineSet, "playingStateMachineSet");
        synchronized (playingStateMachineSet) {
            Set<StateMachineInstance> playingStateMachineSet2 = this.playingStateMachineSet;
            kotlin.jvm.internal.m.e(playingStateMachineSet2, "playingStateMachineSet");
            hashSetY0 = m.Y0(playingStateMachineSet2);
        }
        return hashSetY0;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int getRefCount() {
        return RefCount.DefaultImpls.getRefCount(this);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public AtomicInteger getRefs() {
        return this.refs;
    }

    public final AtomicBoolean getRequireArtboardResize$kotlin_release() {
        return this.requireArtboardResize;
    }

    public final ReentrantLock getStartStopLock$kotlin_release() {
        return this.startStopLock;
    }

    public final List<StateMachineInstance> getStateMachines() {
        List<StateMachineInstance> listA1;
        List<StateMachineInstance> stateMachineList = this.stateMachineList;
        kotlin.jvm.internal.m.e(stateMachineList, "stateMachineList");
        synchronized (stateMachineList) {
            List<StateMachineInstance> stateMachineList2 = this.stateMachineList;
            kotlin.jvm.internal.m.e(stateMachineList2, "stateMachineList");
            listA1 = m.a1(stateMachineList2);
        }
        return listA1;
    }

    public final RectF getTargetBounds() {
        return this.targetBounds;
    }

    public final String getTextRunValue(String textRunName) {
        kotlin.jvm.internal.m.f(textRunName, "textRunName");
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return artboard.getTextRunValue(textRunName);
        }
        return null;
    }

    public final Float getVolume() {
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return Float.valueOf(artboard.getVolume());
        }
        return null;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isAdvancing() {
        Set<LinearAnimationInstance> playingAnimationSet = this.playingAnimationSet;
        kotlin.jvm.internal.m.e(playingAnimationSet, "playingAnimationSet");
        if (!playingAnimationSet.isEmpty()) {
            return true;
        }
        Set<StateMachineInstance> playingStateMachineSet = this.playingStateMachineSet;
        kotlin.jvm.internal.m.e(playingStateMachineSet, "playingStateMachineSet");
        return (playingStateMachineSet.isEmpty() && this.changedInputs.isEmpty()) ? false : true;
    }

    public final void pause() {
        Iterator<T> it = getPlayingAnimations().iterator();
        while (it.hasNext()) {
            pause((LinearAnimationInstance) it.next());
        }
        Iterator<T> it2 = getPlayingStateMachines().iterator();
        while (it2.hasNext()) {
            pause((StateMachineInstance) it2.next());
        }
    }

    public final void play(String animationName, Loop loop, Direction direction, boolean z11, boolean z12) {
        kotlin.jvm.internal.m.f(animationName, "animationName");
        kotlin.jvm.internal.m.f(loop, "loop");
        kotlin.jvm.internal.m.f(direction, "direction");
        playAnimation(animationName, loop, direction, z11, z12);
    }

    public final void play$kotlin_release(StateMachineInstance stateMachineInstance, boolean z11) {
        kotlin.jvm.internal.m.f(stateMachineInstance, "stateMachineInstance");
        if (!this.stateMachineList.contains(stateMachineInstance)) {
            this.stateMachineList.add(stateMachineInstance);
        }
        if (z11) {
            resolveStateMachineAdvance(stateMachineInstance, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        synchronized (this.startStopLock) {
            this.playingStateMachineSet.add(stateMachineInstance);
            a aVar = this.onStart;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        notifyPlay(stateMachineInstance);
    }

    public final void pointerEvent(PointerEvents eventType, float f5, float f11) {
        RectF rectF;
        kotlin.jvm.internal.m.f(eventType, "eventType");
        Helpers helpers = Helpers.INSTANCE;
        RectF rectF2 = this.targetBounds;
        PointF pointF = new PointF(f5, f11);
        Fit fit = this.fit;
        Alignment alignment = this.alignment;
        Artboard artboard = this.activeArtboard;
        if (artboard == null || (rectF = artboard.getBounds()) == null) {
            rectF = new RectF();
        }
        PointF pointFConvertToArtboardSpace = helpers.convertToArtboardSpace(rectF2, pointF, fit, alignment, rectF, getLayoutScaleFactorActive$kotlin_release());
        for (StateMachineInstance stateMachineInstance : getStateMachines()) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[eventType.ordinal()];
            if (i11 == 1) {
                stateMachineInstance.pointerDown(pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
            } else if (i11 == 2) {
                stateMachineInstance.pointerUp(pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
            } else if (i11 == 3) {
                stateMachineInstance.pointerMove(pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
            }
            play$kotlin_release(stateMachineInstance, false);
        }
    }

    public final void queueInputs$kotlin_release(ChangedInput... inputs) {
        kotlin.jvm.internal.m.f(inputs, "inputs");
        synchronized (this.startStopLock) {
            m.e0(this.changedInputs, inputs);
            a aVar = this.onStart;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease = RefCount.DefaultImpls.release(this);
        if (iRelease < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iRelease != 0) {
            return iRelease;
        }
        if (this.isActive) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        setFile(null);
        return iRelease;
    }

    public final void removeEventListener(RiveEventListener listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        synchronized (this.startStopLock) {
            this._eventListeners.remove(listener);
        }
    }

    public final void reset$kotlin_release() {
        this.playingAnimationSet.clear();
        this.animationList.clear();
        this.playingStateMachineSet.clear();
        this.stateMachineList.clear();
        this.changedInputs.clear();
        setActiveArtboard(null);
    }

    public final void restoreControllerState(ControllerState state) {
        Object lock;
        kotlin.jvm.internal.m.f(state, "state");
        File file = this.file;
        if (file == null || (lock = file.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                reset$kotlin_release();
                setFile(state.getFile());
                setActiveArtboard(state.getActiveArtboard());
                Iterator<T> it = state.getAnimations().iterator();
                while (it.hasNext()) {
                    this.animationList.add((LinearAnimationInstance) it.next());
                }
                Iterator<T> it2 = state.getStateMachines().iterator();
                while (it2.hasNext()) {
                    this.stateMachineList.add((StateMachineInstance) it2.next());
                }
                for (LinearAnimationInstance linearAnimationInstance : state.getPlayingAnimations()) {
                    play$kotlin_release(linearAnimationInstance, linearAnimationInstance.getLoop(), linearAnimationInstance.getDirection());
                }
                Iterator<T> it3 = state.getPlayingStateMachines().iterator();
                while (it3.hasNext()) {
                    play$kotlin_release$default(this, (StateMachineInstance) it3.next(), false, 2, null);
                }
                this.isActive = state.isActive();
                state.dispose();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ControllerState saveControllerState() {
        Artboard artboard;
        File file = this.file;
        if (file == null || (artboard = this.activeArtboard) == null) {
            return null;
        }
        synchronized (file.getLock()) {
            if (!file.getHasCppObject()) {
                return null;
            }
            file.acquire();
            artboard.acquire();
            List<LinearAnimationInstance> animationList = this.animationList;
            kotlin.jvm.internal.m.e(animationList, "animationList");
            List listA1 = m.a1(animationList);
            HashSet hashSetY0 = m.Y0(getPlayingAnimations());
            List<StateMachineInstance> stateMachineList = this.stateMachineList;
            kotlin.jvm.internal.m.e(stateMachineList, "stateMachineList");
            return new ControllerState(file, artboard, listA1, hashSetY0, m.a1(stateMachineList), m.Y0(getPlayingStateMachines()), this.isActive);
        }
    }

    public final void selectArtboard(String str) {
        File file = this.file;
        if (file != null) {
            setArtboard(str != null ? file.artboard(str) : file.getFirstArtboard());
        }
    }

    public final void setActive(boolean z11) {
        this.isActive = z11;
    }

    public final void setActiveArtboard(Artboard artboard) {
        Object lock;
        if (kotlin.jvm.internal.m.a(artboard, this.activeArtboard)) {
            return;
        }
        File file = this.file;
        if (file == null || (lock = file.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                Artboard artboard2 = this.activeArtboard;
                if (artboard2 != null) {
                    artboard2.release();
                }
                this.activeArtboard = artboard;
                if (artboard != null) {
                    artboard.acquire();
                }
                Float f5 = this.userSetVolume;
                if (f5 != null) {
                    float fFloatValue = f5.floatValue();
                    Artboard artboard3 = this.activeArtboard;
                    if (artboard3 != null) {
                        artboard3.setVolume$kotlin_release(fFloatValue);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setAlignment(Alignment value) {
        kotlin.jvm.internal.m.f(value, "value");
        this.alignment = value;
        synchronized (this.startStopLock) {
            a aVar = this.onStart;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public final void setAutoplay(boolean z11) {
        this.autoplay = z11;
    }

    public final void setBooleanState(String stateMachineName, String inputName, boolean z11, String str) {
        kotlin.jvm.internal.m.f(stateMachineName, "stateMachineName");
        kotlin.jvm.internal.m.f(inputName, "inputName");
        queueInput(stateMachineName, inputName, Boolean.valueOf(z11), str);
    }

    public final void setBooleanStateAtPath(String inputName, boolean z11, String path) {
        kotlin.jvm.internal.m.f(inputName, "inputName");
        kotlin.jvm.internal.m.f(path, "path");
        queueInput(BuildConfig.VERSION_NAME, inputName, Boolean.valueOf(z11), path);
    }

    public final void setFile(File file) {
        Object lock;
        if (kotlin.jvm.internal.m.a(file, this.file)) {
            return;
        }
        File file2 = this.file;
        if (file2 == null || (lock = file2.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                File file3 = this.file;
                if (file3 != null) {
                    reset$kotlin_release();
                    file3.release();
                }
                this.file = file;
                if (file != null) {
                    file.acquire();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setFit(Fit value) {
        kotlin.jvm.internal.m.f(value, "value");
        this.fit = value;
        this.requireArtboardResize.set(true);
        synchronized (this.startStopLock) {
            a aVar = this.onStart;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public final void setLayoutScaleFactor(Float f5) {
        this.layoutScaleFactor = f5;
        this.requireArtboardResize.set(true);
        synchronized (this.startStopLock) {
            a aVar = this.onStart;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public final void setLayoutScaleFactorAutomatic$kotlin_release(float f5) {
        this.layoutScaleFactorAutomatic = f5;
        this.requireArtboardResize.set(true);
        synchronized (this.startStopLock) {
            a aVar = this.onStart;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public final void setLoop(Loop loop) {
        kotlin.jvm.internal.m.f(loop, "<set-?>");
        this.loop = loop;
    }

    public final void setNumberState(String stateMachineName, String inputName, float f5, String str) {
        kotlin.jvm.internal.m.f(stateMachineName, "stateMachineName");
        kotlin.jvm.internal.m.f(inputName, "inputName");
        queueInput(stateMachineName, inputName, Float.valueOf(f5), str);
    }

    public final void setNumberStateAtPath(String inputName, float f5, String path) {
        kotlin.jvm.internal.m.f(inputName, "inputName");
        kotlin.jvm.internal.m.f(path, "path");
        queueInput(BuildConfig.VERSION_NAME, inputName, Float.valueOf(f5), path);
    }

    public final void setOnStart(a aVar) {
        this.onStart = aVar;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public void setRefs(AtomicInteger atomicInteger) {
        kotlin.jvm.internal.m.f(atomicInteger, "<set-?>");
        this.refs = atomicInteger;
    }

    public final void setRequireArtboardResize$kotlin_release(AtomicBoolean atomicBoolean) {
        kotlin.jvm.internal.m.f(atomicBoolean, "<set-?>");
        this.requireArtboardResize = atomicBoolean;
    }

    public final void setRiveFile(File file, String str) {
        kotlin.jvm.internal.m.f(file, "file");
        if (file.equals(this.file)) {
            return;
        }
        setFile(file);
        selectArtboard(str);
    }

    public final void setTargetBounds(RectF rectF) {
        kotlin.jvm.internal.m.f(rectF, "<set-?>");
        this.targetBounds = rectF;
    }

    public final void setTextRunValue(String textRunName, String textValue) {
        kotlin.jvm.internal.m.f(textRunName, "textRunName");
        kotlin.jvm.internal.m.f(textValue, "textValue");
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.setTextRunValue(textRunName, textValue);
        }
        Iterator<T> it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    public final void setVolume(float f5) {
        this.userSetVolume = Float.valueOf(f5);
        Artboard artboard = this.activeArtboard;
        if (artboard == null) {
            return;
        }
        artboard.setVolume$kotlin_release(f5);
    }

    public final void setupScene$kotlin_release(RiveAnimationView.RendererAttributes rendererAttributes) {
        Artboard artboard;
        kotlin.jvm.internal.m.f(rendererAttributes, "rendererAttributes");
        File file = this.file;
        if (file == null) {
            return;
        }
        reset$kotlin_release();
        this.autoplay = rendererAttributes.getAutoplay();
        setAlignment(rendererAttributes.getAlignment());
        setFit(rendererAttributes.getFit());
        this.loop = rendererAttributes.getLoop();
        String artboardName = rendererAttributes.getArtboardName();
        setActiveArtboard(artboardName != null ? file.artboard(artboardName) : file.getFirstArtboard());
        if (rendererAttributes.getAutoBind() && (artboard = this.activeArtboard) != null) {
            kotlin.jvm.internal.m.c(artboard);
            ViewModelInstance viewModelInstanceCreateDefaultInstance = file.defaultViewModelForArtboard(artboard).createDefaultInstance();
            artboard.setViewModelInstance(viewModelInstanceCreateDefaultInstance);
            String stateMachineName = rendererAttributes.getStateMachineName();
            if (stateMachineName == null) {
                stateMachineName = (String) m.s0(artboard.getStateMachineNames());
            }
            if (stateMachineName != null) {
                getOrCreateStateMachines(stateMachineName);
            }
            Iterator<T> it = getStateMachines().iterator();
            while (it.hasNext()) {
                ((StateMachineInstance) it.next()).setViewModelInstance(viewModelInstanceCreateDefaultInstance);
            }
        }
        if (!this.autoplay) {
            Artboard artboard2 = this.activeArtboard;
            if (artboard2 != null) {
                artboard2.advance(CropImageView.DEFAULT_ASPECT_RATIO);
            }
            synchronized (this.startStopLock) {
                a aVar = this.onStart;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            return;
        }
        String animationName = rendererAttributes.getAnimationName();
        String stateMachineName2 = rendererAttributes.getStateMachineName();
        if (animationName != null) {
            play$default(this, animationName, (Loop) null, (Direction) null, false, false, 30, (Object) null);
        } else if (stateMachineName2 != null) {
            play$default(this, stateMachineName2, (Loop) null, (Direction) null, true, true, 6, (Object) null);
        } else {
            play$default(this, null, null, true, 3, null);
        }
    }

    public final void stopAnimations() {
        List<LinearAnimationInstance> animationList = this.animationList;
        kotlin.jvm.internal.m.e(animationList, "animationList");
        if (!animationList.isEmpty()) {
            Iterator<T> it = getAnimations().iterator();
            while (it.hasNext()) {
                stop((LinearAnimationInstance) it.next());
            }
        }
        List<StateMachineInstance> stateMachineList = this.stateMachineList;
        kotlin.jvm.internal.m.e(stateMachineList, "stateMachineList");
        if (stateMachineList.isEmpty()) {
            return;
        }
        Iterator<T> it2 = getStateMachines().iterator();
        while (it2.hasNext()) {
            stop((StateMachineInstance) it2.next());
        }
    }

    public RiveFileController(Loop loop, boolean z11, File file, Artboard artboard, a aVar, ConcurrentLinkedQueue<ChangedInput> changedInputs) {
        kotlin.jvm.internal.m.f(loop, "loop");
        kotlin.jvm.internal.m.f(changedInputs, "changedInputs");
        this.loop = loop;
        this.autoplay = z11;
        this.onStart = aVar;
        this.changedInputs = changedInputs;
        this.refs = new AtomicInteger(1);
        this.requireArtboardResize = new AtomicBoolean(false);
        this.fit = Fit.CONTAIN;
        this.alignment = Alignment.CENTER;
        this.layoutScaleFactorAutomatic = 1.0f;
        this.file = file;
        this.activeArtboard = artboard;
        this.animationList = Collections.synchronizedList(new ArrayList());
        this.stateMachineList = Collections.synchronizedList(new ArrayList());
        this.playingAnimationSet = Collections.synchronizedSet(new HashSet());
        this.playingStateMachineSet = Collections.synchronizedSet(new HashSet());
        this.startStopLock = new ReentrantLock();
        this.targetBounds = new RectF();
        Set<Listener> setSynchronizedSet = Collections.synchronizedSet(new HashSet());
        kotlin.jvm.internal.m.e(setSynchronizedSet, "synchronizedSet(...)");
        this._listeners = setSynchronizedSet;
        Set<RiveEventListener> setSynchronizedSet2 = Collections.synchronizedSet(new HashSet());
        kotlin.jvm.internal.m.e(setSynchronizedSet2, "synchronizedSet(...)");
        this._eventListeners = setSynchronizedSet2;
    }

    private final List<LinearAnimationInstance> animations(Collection<String> collection) {
        List<LinearAnimationInstance> animations = getAnimations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : animations) {
            if (collection.contains(((LinearAnimationInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void pause$default(RiveFileController riveFileController, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        riveFileController.pause(str, z11);
    }

    private final List<StateMachineInstance> stateMachines(Collection<String> collection) {
        List<StateMachineInstance> stateMachines = getStateMachines();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stateMachines) {
            if (collection.contains(((StateMachineInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void stopAnimations$default(RiveFileController riveFileController, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        riveFileController.stopAnimations(str, z11);
    }

    public final String getTextRunValue(String textRunName, String path) {
        kotlin.jvm.internal.m.f(textRunName, "textRunName");
        kotlin.jvm.internal.m.f(path, "path");
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return artboard.getTextRunValue(textRunName, path);
        }
        return null;
    }

    public final void play(Loop loop, Direction direction, boolean z11) {
        kotlin.jvm.internal.m.f(loop, "loop");
        kotlin.jvm.internal.m.f(direction, "direction");
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            if (!getPausedAnimations().isEmpty() || !getPausedStateMachines().isEmpty()) {
                Iterator<T> it = getAnimations().iterator();
                while (it.hasNext()) {
                    play$kotlin_release((LinearAnimationInstance) it.next(), loop, direction);
                }
                Iterator<T> it2 = getStateMachines().iterator();
                while (it2.hasNext()) {
                    play$kotlin_release((StateMachineInstance) it2.next(), z11);
                }
                return;
            }
            List<String> animationNames = artboard.getAnimationNames();
            if (!animationNames.isEmpty()) {
                playAnimation$default(this, (String) m.q0(animationNames), loop, direction, false, false, 24, null);
            }
            List<String> stateMachineNames = artboard.getStateMachineNames();
            if (stateMachineNames.isEmpty()) {
                return;
            }
            playAnimation((String) m.q0(stateMachineNames), loop, direction, true, z11);
        }
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void registerListener(Listener listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        synchronized (this.startStopLock) {
            this._listeners.add(listener);
        }
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void unregisterListener(Listener listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        synchronized (this.startStopLock) {
            this._listeners.remove(listener);
        }
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i11 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            z12 = true;
        }
        riveFileController.play(str, loop2, direction2, z13, z12);
    }

    private final void stop(StateMachineInstance stateMachineInstance) {
        this.playingStateMachineSet.remove(stateMachineInstance);
        if (this.stateMachineList.remove(stateMachineInstance)) {
            notifyStop(stateMachineInstance);
        }
    }

    public final void setTextRunValue(String textRunName, String textValue, String path) {
        kotlin.jvm.internal.m.f(textRunName, "textRunName");
        kotlin.jvm.internal.m.f(textValue, "textValue");
        kotlin.jvm.internal.m.f(path, "path");
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.setTextRunValue(textRunName, textValue, path);
        }
        Iterator<T> it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, Loop loop, Direction direction, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            loop = Loop.AUTO;
        }
        if ((i11 & 2) != 0) {
            direction = Direction.AUTO;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        riveFileController.play(loop, direction, z11);
    }

    public final void pause(List<String> animationNames, boolean z11) {
        kotlin.jvm.internal.m.f(animationNames, "animationNames");
        if (z11) {
            Iterator<T> it = stateMachines(animationNames).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationNames).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void stopAnimations(List<String> animationNames, boolean z11) {
        kotlin.jvm.internal.m.f(animationNames, "animationNames");
        if (z11) {
            Iterator<T> it = stateMachines(animationNames).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationNames).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void play$kotlin_release(LinearAnimationInstance animationInstance, Loop loop, Direction direction) {
        kotlin.jvm.internal.m.f(animationInstance, "animationInstance");
        kotlin.jvm.internal.m.f(loop, "loop");
        kotlin.jvm.internal.m.f(direction, "direction");
        Loop loop2 = Loop.AUTO;
        if (loop == loop2) {
            loop = this.loop;
        }
        if (loop != loop2) {
            animationInstance.setLoop(loop);
        }
        if (!this.animationList.contains(animationInstance)) {
            if (direction == Direction.BACKWARDS) {
                animationInstance.time(animationInstance.getEndTime());
            }
            this.animationList.add(animationInstance);
        }
        if (direction != Direction.AUTO) {
            animationInstance.setDirection(direction);
        }
        synchronized (this.startStopLock) {
            this.playingAnimationSet.add(animationInstance);
            a aVar = this.onStart;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        notifyPlay(animationInstance);
    }

    public final void pause(String animationName, boolean z11) {
        kotlin.jvm.internal.m.f(animationName, "animationName");
        if (z11) {
            Iterator<T> it = stateMachines(animationName).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationName).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void stopAnimations(String animationName, boolean z11) {
        kotlin.jvm.internal.m.f(animationName, "animationName");
        if (z11) {
            Iterator<T> it = stateMachines(animationName).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationName).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void play(List<String> animationNames, Loop loop, Direction direction, boolean z11, boolean z12) {
        kotlin.jvm.internal.m.f(animationNames, "animationNames");
        kotlin.jvm.internal.m.f(loop, FpIL.QaIdWIuHzzFFnru);
        kotlin.jvm.internal.m.f(direction, "direction");
        Iterator<T> it = animationNames.iterator();
        while (it.hasNext()) {
            playAnimation((String) it.next(), loop, direction, z11, z12);
        }
    }

    private final void pause(LinearAnimationInstance linearAnimationInstance) {
        if (this.playingAnimationSet.remove(linearAnimationInstance)) {
            notifyPause(linearAnimationInstance);
        }
    }

    private final void pause(StateMachineInstance stateMachineInstance) {
        if (this.playingStateMachineSet.remove(stateMachineInstance)) {
            notifyPause(stateMachineInstance);
        }
    }

    public /* synthetic */ RiveFileController(Loop loop, boolean z11, File file, Artboard artboard, a aVar, ConcurrentLinkedQueue concurrentLinkedQueue, int i11, f fVar) {
        this((i11 & 1) != 0 ? Loop.AUTO : loop, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? null : file, (i11 & 8) != 0 ? null : artboard, (i11 & 16) != 0 ? null : aVar, (i11 & 32) != 0 ? new ConcurrentLinkedQueue() : concurrentLinkedQueue);
    }

    public /* synthetic */ RiveFileController(Loop loop, boolean z11, File file, Artboard artboard, a aVar, int i11, f fVar) {
        this((i11 & 1) != 0 ? Loop.AUTO : loop, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? null : file, (i11 & 8) != 0 ? null : artboard, (i11 & 16) != 0 ? null : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveFileController(Loop loop, boolean z11, File file, Artboard artboard, a aVar) {
        this(loop, z11, file, artboard, aVar, new ConcurrentLinkedQueue());
        kotlin.jvm.internal.m.f(loop, "loop");
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Listener {
        void notifyAdvance(float f5);

        void notifyLoop(PlayableInstance playableInstance);

        void notifyPause(PlayableInstance playableInstance);

        void notifyPlay(PlayableInstance playableInstance);

        void notifyStateChanged(String str, String str2);

        void notifyStop(PlayableInstance playableInstance);

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class DefaultImpls {
            public static void notifyAdvance(Listener listener, float f5) {
            }
        }
    }
}
