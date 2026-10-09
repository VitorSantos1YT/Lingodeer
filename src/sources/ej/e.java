package ej;

import androidx.lifecycle.Observer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Observer, kotlin.jvm.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f25685b;

    public /* synthetic */ e(fz.c cVar, int i11) {
        this.f25684a = i11;
        this.f25685b = cVar;
    }

    public final boolean equals(Object obj) {
        switch (this.f25684a) {
            case 0:
                if (!(obj instanceof Observer) || !(obj instanceof kotlin.jvm.internal.g)) {
                    return false;
                }
                return this.f25685b.equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
            case 1:
                if (!(obj instanceof Observer) || !(obj instanceof kotlin.jvm.internal.g)) {
                    return false;
                }
                return this.f25685b.equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof Observer) || !(obj instanceof kotlin.jvm.internal.g)) {
                    return false;
                }
                return this.f25685b.equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
        }
    }

    @Override // kotlin.jvm.internal.g
    public final qy.e getFunctionDelegate() {
        switch (this.f25684a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f25685b;
    }

    public final int hashCode() {
        switch (this.f25684a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f25685b.hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        switch (this.f25684a) {
            case 0:
                this.f25685b.invoke(obj);
                break;
            case 1:
                this.f25685b.invoke(obj);
                break;
            default:
                this.f25685b.invoke(obj);
                break;
        }
    }
}
