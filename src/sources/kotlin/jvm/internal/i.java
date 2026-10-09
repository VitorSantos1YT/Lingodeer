package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends c implements h, mz.e {
    private final int arity;
    private final int flags;

    public i(int i11, int i12, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i12 & 1) == 1);
        this.arity = i11;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.c
    public mz.b computeReflected() {
        z.f38362a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.flags == iVar.flags && this.arity == iVar.arity && m.a(getBoundReceiver(), iVar.getBoundReceiver()) && m.a(getOwner(), iVar.getOwner());
        }
        if (obj instanceof mz.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // mz.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // mz.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // mz.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // mz.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // mz.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        mz.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.c
    public mz.e getReflected() {
        mz.b bVarCompute = compute();
        if (bVarCompute != this) {
            return (mz.e) bVarCompute;
        }
        throw new ez.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
