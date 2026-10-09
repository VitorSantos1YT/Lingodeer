package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends c implements mz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38356a;

    public t(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f38356a = (i11 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.c
    public final mz.b compute() {
        return this.f38356a ? this : super.compute();
    }

    @Override // kotlin.jvm.internal.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final mz.j getReflected() {
        if (this.f38356a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        mz.b bVarCompute = compute();
        if (bVarCompute != this) {
            return (mz.j) bVarCompute;
        }
        throw new ez.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return getOwner().equals(tVar.getOwner()) && getName().equals(tVar.getName()) && getSignature().equals(tVar.getSignature()) && m.a(getBoundReceiver(), tVar.getBoundReceiver());
        }
        if (obj instanceof mz.j) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        mz.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
