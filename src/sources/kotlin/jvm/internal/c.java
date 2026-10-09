package kotlin.jvm.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements mz.b, Serializable {
    public static final Object NO_RECEIVER = b.f38349a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient mz.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z11) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z11;
    }

    @Override // mz.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // mz.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public mz.b compute() {
        mz.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        mz.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract mz.b computeReflected();

    @Override // mz.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // mz.b
    public String getName() {
        return this.name;
    }

    public mz.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return z.a(cls);
        }
        z.f38362a.getClass();
        return new q(cls, BuildConfig.VERSION_NAME);
    }

    @Override // mz.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract mz.b getReflected();

    @Override // mz.b
    public mz.k getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // mz.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // mz.b
    public mz.l getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // mz.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // mz.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // mz.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
