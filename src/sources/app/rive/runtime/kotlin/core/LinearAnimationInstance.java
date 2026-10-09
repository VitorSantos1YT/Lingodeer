package app.rive.runtime.kotlin.core;

import androidx.drawerlayout.widget.ktFt.FpIL;
import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LinearAnimationInstance extends NativeObject implements PlayableInstance {
    public static final int $stable = 8;
    private final ReentrantLock lock;
    private float mix;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvanceResult.values().length];
            try {
                iArr[AdvanceResult.ADVANCED.ordinal()] = 1;
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
                iArr[AdvanceResult.ONESHOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvanceResult.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ LinearAnimationInstance(long j11, ReentrantLock reentrantLock, float f5, int i11, f fVar) {
        this(j11, reentrantLock, (i11 & 4) != 0 ? 1.0f : f5);
    }

    private final native Loop cppAdvance(long j11, float f5);

    private final native AdvanceResult cppAdvanceAndGetResult(long j11, float f5);

    private final native void cppApply(long j11, float f5);

    private final native int cppDuration(long j11);

    private final native int cppFps(long j11);

    private final native int cppGetDirection(long j11);

    private final native int cppGetLoop(long j11);

    private final native float cppGetTime(long j11);

    private final native String cppName(long j11);

    private final native void cppSetDirection(long j11, int i11);

    private final native void cppSetLoop(long j11, int i11);

    private final native void cppSetTime(long j11, float f5);

    private final native int cppWorkEnd(long j11);

    private final native int cppWorkStart(long j11);

    @c
    public final Loop advance(float f5) {
        Loop loopCppAdvance;
        synchronized (this.lock) {
            loopCppAdvance = cppAdvance(getCppPointer(), f5);
        }
        return loopCppAdvance;
    }

    public final AdvanceResult advanceAndGetResult(float f5) {
        AdvanceResult advanceResultCppAdvanceAndGetResult;
        synchronized (this.lock) {
            advanceResultCppAdvanceAndGetResult = cppAdvanceAndGetResult(getCppPointer(), f5);
        }
        return advanceResultCppAdvanceAndGetResult;
    }

    public final void apply() {
        synchronized (this.lock) {
            cppApply(getCppPointer(), this.mix);
        }
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j11);

    public final Direction getDirection() {
        Direction directionFromInt = Direction.Companion.fromInt(cppGetDirection(getCppPointer()));
        if (directionFromInt != null) {
            return directionFromInt;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int getDuration() {
        return cppDuration(getCppPointer());
    }

    public final int getEffectiveDuration() {
        return getWorkStart() == -1 ? getDuration() : getWorkEnd() - getWorkStart();
    }

    public final float getEffectiveDurationInSeconds() {
        return getEffectiveDuration() / getFps();
    }

    public final float getEndTime() {
        float workEnd;
        int fps;
        if (getWorkEnd() == -1) {
            workEnd = getDuration();
            fps = getFps();
        } else {
            workEnd = getWorkEnd();
            fps = getFps();
        }
        return workEnd / fps;
    }

    public final int getFps() {
        return cppFps(getCppPointer());
    }

    public final Loop getLoop() {
        return Loop.Companion.fromIndex(cppGetLoop(getCppPointer()));
    }

    public final float getMix() {
        return this.mix;
    }

    @Override // app.rive.runtime.kotlin.core.PlayableInstance
    public String getName() {
        return cppName(getCppPointer());
    }

    public final float getStartTime() {
        return getWorkStart() == -1 ? CropImageView.DEFAULT_ASPECT_RATIO : getWorkStart() / getFps();
    }

    public final float getTime() {
        return cppGetTime(getCppPointer());
    }

    public final int getWorkEnd() {
        return cppWorkEnd(getCppPointer());
    }

    public final int getWorkStart() {
        return cppWorkStart(getCppPointer());
    }

    public final void setLoop(Loop loop) {
        m.f(loop, "loop");
        synchronized (this.lock) {
            cppSetLoop(getCppPointer(), loop.ordinal());
        }
    }

    public final void setMix(float f5) {
        this.mix = f5;
    }

    public final void time(float f5) {
        synchronized (this.lock) {
            cppSetTime(getCppPointer(), f5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearAnimationInstance(long j11, ReentrantLock lock, float f5) {
        super(j11);
        m.f(lock, "lock");
        this.lock = lock;
        this.mix = f5;
    }

    public final boolean apply(float f5) {
        synchronized (this.lock) {
            cppApply(getCppPointer(), this.mix);
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[advanceAndGetResult(f5).ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return true;
        }
        if (i11 == 4 || i11 == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void setDirection(Direction direction) {
        m.f(direction, FpIL.HoUSmsNoEYMilq);
        synchronized (this.lock) {
            cppSetDirection(getCppPointer(), direction.getValue());
        }
    }
}
