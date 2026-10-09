package bp;

import androidx.lifecycle.Observer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f1 implements Observer, kotlin.jvm.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f4568b;

    public /* synthetic */ f1(fz.c cVar, int i11) {
        this.f4567a = i11;
        this.f4568b = cVar;
    }

    public final boolean equals(Object obj) {
        switch (this.f4567a) {
            case 0:
                if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((aj.c) this.f4568b).equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((a00.c) this.f4568b).equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((gr.s) this.f4568b).equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            case 3:
                if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((d1.a) this.f4568b).equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            case 4:
                if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((gr.s) this.f4568b).equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((gr.s) this.f4568b).equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // kotlin.jvm.internal.g
    public final qy.e getFunctionDelegate() {
        switch (this.f4567a) {
            case 0:
                return (aj.c) this.f4568b;
            case 1:
                return (a00.c) this.f4568b;
            case 2:
                return (gr.s) this.f4568b;
            case 3:
                return (d1.a) this.f4568b;
            case 4:
                return (gr.s) this.f4568b;
            default:
                return (gr.s) this.f4568b;
        }
    }

    public final int hashCode() {
        switch (this.f4567a) {
            case 0:
                return ((aj.c) this.f4568b).hashCode();
            case 1:
                return ((a00.c) this.f4568b).hashCode();
            case 2:
                return ((gr.s) this.f4568b).hashCode();
            case 3:
                return ((d1.a) this.f4568b).hashCode();
            case 4:
                return ((gr.s) this.f4568b).hashCode();
            default:
                return ((gr.s) this.f4568b).hashCode();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) throws Exception {
        switch (this.f4567a) {
            case 0:
                ((aj.c) this.f4568b).invoke(obj);
                break;
            case 1:
                ((a00.c) this.f4568b).invoke(obj);
                break;
            case 2:
                ((gr.s) this.f4568b).invoke(obj);
                break;
            case 3:
                ((d1.a) this.f4568b).invoke(obj);
                break;
            case 4:
                ((gr.s) this.f4568b).invoke(obj);
                break;
            default:
                ((gr.s) this.f4568b).invoke(obj);
                break;
        }
    }
}
