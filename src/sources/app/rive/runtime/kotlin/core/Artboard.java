package app.rive.runtime.kotlin.core;

import aj.uZCn.evRpcb;
import android.graphics.RectF;
import app.rive.runtime.kotlin.core.errors.AnimationException;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import hh.p0;
import hz.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m;
import lz.g;
import nv.p;
import ry.n;
import ry.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Artboard extends NativeObject {
    public static final int $stable = 8;
    private final ReentrantLock lock;
    private ViewModelInstance viewModelInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Artboard(long j11, ReentrantLock lock) {
        super(j11);
        m.f(lock, "lock");
        this.lock = lock;
    }

    private native boolean cppAdvance(long j11, float f5);

    private native long cppAnimationByIndex(long j11, int i11);

    private native long cppAnimationByName(long j11, String str);

    private native int cppAnimationCount(long j11);

    private native String cppAnimationNameByIndex(long j11, int i11);

    private native RectF cppBounds(long j11);

    private native void cppDraw(long j11, long j12);

    private native void cppDrawAligned(long j11, long j12, Fit fit, Alignment alignment, float f5);

    private native long cppFindTextValueRun(long j11, String str);

    private native long cppFindTextValueRunAtPath(long j11, String str, String str2);

    private native String cppFindValueOfTextValueRun(long j11, String str);

    private native String cppFindValueOfTextValueRunAtPath(long j11, String str, String str2);

    private native float cppGetArtboardHeight(long j11);

    private native float cppGetArtboardWidth(long j11);

    private native float cppGetVolume(long j11);

    private native long cppInputByNameAtPath(long j11, String str, String str2);

    private native String cppName(long j11);

    private native void cppResetArtboardSize(long j11);

    private native void cppSetArtboardHeight(long j11, float f5);

    private native void cppSetArtboardWidth(long j11, float f5);

    private native boolean cppSetValueOfTextValueRun(long j11, String str, String str2);

    private native boolean cppSetValueOfTextValueRunAtPath(long j11, String str, String str2, String str3);

    private native void cppSetViewModelInstance(long j11, long j12);

    private native void cppSetVolume(long j11, float f5);

    private native long cppStateMachineByIndex(long j11, int i11);

    private native long cppStateMachineByName(long j11, String str);

    private native int cppStateMachineCount(long j11);

    private native String cppStateMachineNameByIndex(long j11, int i11);

    public static /* synthetic */ void draw$default(Artboard artboard, long j11, Fit fit, Alignment alignment, float f5, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw");
        }
        if ((i11 & 8) != 0) {
            f5 = 1.0f;
        }
        artboard.draw(j11, fit, alignment, f5);
    }

    public boolean advance(float f5) {
        boolean zCppAdvance;
        synchronized (this.lock) {
            zCppAdvance = cppAdvance(getCppPointer(), f5);
        }
        return zCppAdvance;
    }

    public LinearAnimationInstance animation(int i11) throws AnimationException {
        long jCppAnimationByIndex = cppAnimationByIndex(getCppPointer(), i11);
        if (jCppAnimationByIndex == 0) {
            throw new AnimationException(p.o("No Animation found at index ", i11, '.'));
        }
        LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByIndex, this.lock, CropImageView.DEFAULT_ASPECT_RATIO, 4, null);
        getDependencies().add(linearAnimationInstance);
        return linearAnimationInstance;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j11);

    public void draw(long j11) {
        synchronized (this.lock) {
            cppDraw(getCppPointer(), j11);
        }
    }

    public int getAnimationCount() {
        return cppAnimationCount(getCppPointer());
    }

    public List<String> getAnimationNames() {
        g gVarU = b.U(0, getAnimationCount());
        ArrayList arrayList = new ArrayList(n.W(gVarU, 10));
        Iterator it = gVarU.iterator();
        while (it.hasNext()) {
            arrayList.add(cppAnimationNameByIndex(getCppPointer(), ((w) it).nextInt()));
        }
        return arrayList;
    }

    public RectF getBounds() {
        return cppBounds(getCppPointer());
    }

    public LinearAnimationInstance getFirstAnimation() {
        return animation(0);
    }

    public StateMachineInstance getFirstStateMachine() {
        return stateMachine(0);
    }

    public float getHeight() {
        return cppGetArtboardHeight(getCppPointer());
    }

    public String getName() {
        return cppName(getCppPointer());
    }

    public int getStateMachineCount() {
        return cppStateMachineCount(getCppPointer());
    }

    public List<String> getStateMachineNames() {
        g gVarU = b.U(0, getStateMachineCount());
        ArrayList arrayList = new ArrayList(n.W(gVarU, 10));
        Iterator it = gVarU.iterator();
        while (it.hasNext()) {
            arrayList.add(cppStateMachineNameByIndex(getCppPointer(), ((w) it).nextInt()));
        }
        return arrayList;
    }

    public String getTextRunValue(String name) {
        m.f(name, "name");
        return cppFindValueOfTextValueRun(getCppPointer(), name);
    }

    public ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public float getVolume() {
        return cppGetVolume(getCppPointer());
    }

    public float getWidth() {
        return cppGetArtboardWidth(getCppPointer());
    }

    public SMIInput input(String name, String path) throws StateMachineInputException {
        m.f(name, "name");
        m.f(path, "path");
        long jCppInputByNameAtPath = cppInputByNameAtPath(getCppPointer(), name, path);
        if (jCppInputByNameAtPath != 0) {
            return convertInput(new SMIInput(jCppInputByNameAtPath));
        }
        throw new StateMachineInputException("No StateMachineInput found with name \"" + name + "\" in nested artboard " + path + '.');
    }

    public ViewModelInstance receiveViewModelInstance(ViewModelInstance.Transfer transfer) {
        m.f(transfer, "transfer");
        ViewModelInstance viewModelInstanceEnd$kotlin_release = transfer.end$kotlin_release();
        getDependencies().add(viewModelInstanceEnd$kotlin_release);
        setViewModelInstance(viewModelInstanceEnd$kotlin_release);
        return viewModelInstanceEnd$kotlin_release;
    }

    public void resetArtboardSize() {
        cppResetArtboardSize(getCppPointer());
    }

    public void setHeight(float f5) {
        cppSetArtboardHeight(getCppPointer(), f5);
    }

    public void setTextRunValue(String name, String textValue) {
        m.f(name, "name");
        m.f(textValue, "textValue");
        if (!cppSetValueOfTextValueRun(getCppPointer(), name, textValue)) {
            throw new TextValueRunException(ep.a.g("Could not set text run. No Rive TextValueRun found with name \"", name, ".\""));
        }
    }

    public void setViewModelInstance(ViewModelInstance viewModelInstance) {
        if (viewModelInstance != null) {
            cppSetViewModelInstance(getCppPointer(), viewModelInstance.getCppPointer());
            this.viewModelInstance = viewModelInstance;
        }
    }

    public void setVolume$kotlin_release(float f5) {
        cppSetVolume(getCppPointer(), f5);
    }

    public void setWidth(float f5) {
        cppSetArtboardWidth(getCppPointer(), f5);
    }

    public StateMachineInstance stateMachine(int i11) throws StateMachineException {
        long jCppStateMachineByIndex = cppStateMachineByIndex(getCppPointer(), i11);
        if (jCppStateMachineByIndex == 0) {
            throw new StateMachineException(p.o("No StateMachine found at index ", i11, '.'));
        }
        StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByIndex, this.lock);
        getDependencies().add(stateMachineInstance);
        return stateMachineInstance;
    }

    public RiveTextValueRun textRun(String name) throws TextValueRunException {
        m.f(name, "name");
        long jCppFindTextValueRun = cppFindTextValueRun(getCppPointer(), name);
        if (jCppFindTextValueRun == 0) {
            throw new TextValueRunException(ep.a.g("No Rive TextValueRun found with name \"", name, ".\""));
        }
        RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRun);
        getDependencies().add(riveTextValueRun);
        return riveTextValueRun;
    }

    public void draw(long j11, Fit fit, Alignment alignment, float f5) {
        m.f(fit, "fit");
        m.f(alignment, "alignment");
        synchronized (this.lock) {
            cppDrawAligned(getCppPointer(), j11, fit, alignment, f5);
        }
    }

    public String getTextRunValue(String name, String path) {
        m.f(name, "name");
        m.f(path, "path");
        return cppFindValueOfTextValueRunAtPath(getCppPointer(), name, path);
    }

    private SMIInput convertInput(SMIInput sMIInput) throws StateMachineInputException {
        if (sMIInput.isBoolean()) {
            return new SMIBoolean(sMIInput.getCppPointer());
        }
        if (sMIInput.isTrigger()) {
            return new SMITrigger(sMIInput.getCppPointer());
        }
        if (sMIInput.isNumber()) {
            return new SMINumber(sMIInput.getCppPointer());
        }
        throw new StateMachineInputException(evRpcb.pQw + sMIInput.getName() + '.');
    }

    public void setTextRunValue(String name, String textValue, String path) {
        m.f(name, "name");
        m.f(textValue, "textValue");
        m.f(path, "path");
        if (!cppSetValueOfTextValueRunAtPath(getCppPointer(), name, textValue, path)) {
            throw new TextValueRunException(ep.a.h("Could not set text run value at path. No Rive TextValueRun found with name \"", name, ".\" in nested artboard \"", path, ".\""));
        }
    }

    public LinearAnimationInstance animation(String name) throws AnimationException {
        m.f(name, "name");
        long jCppAnimationByName = cppAnimationByName(getCppPointer(), name);
        if (jCppAnimationByName == 0) {
            StringBuilder sbQ = p0.q("Animation \"", name, "\" not found. Available Animations: ");
            List<String> animationNames = getAnimationNames();
            ArrayList arrayList = new ArrayList(n.W(animationNames, 10));
            Iterator<T> it = animationNames.iterator();
            while (it.hasNext()) {
                arrayList.add("\"" + ((String) it.next()) + '\"');
            }
            sbQ.append(arrayList);
            sbQ.append('\"');
            throw new AnimationException(sbQ.toString());
        }
        LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByName, this.lock, CropImageView.DEFAULT_ASPECT_RATIO, 4, null);
        getDependencies().add(linearAnimationInstance);
        return linearAnimationInstance;
    }

    public StateMachineInstance stateMachine(String name) {
        m.f(name, "name");
        long jCppStateMachineByName = cppStateMachineByName(getCppPointer(), name);
        if (jCppStateMachineByName != 0) {
            StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByName, this.lock);
            getDependencies().add(stateMachineInstance);
            return stateMachineInstance;
        }
        throw new StateMachineException(p.q("No StateMachine found with name ", name, '.'));
    }

    public RiveTextValueRun textRun(String name, String path) throws TextValueRunException {
        m.f(name, "name");
        m.f(path, "path");
        long jCppFindTextValueRunAtPath = cppFindTextValueRunAtPath(getCppPointer(), name, path);
        if (jCppFindTextValueRunAtPath != 0) {
            RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRunAtPath);
            getDependencies().add(riveTextValueRun);
            return riveTextValueRun;
        }
        throw new TextValueRunException(e.n("No Rive TextValueRun found with name \"", name, ".\" in nested artboard ", path));
    }
}
