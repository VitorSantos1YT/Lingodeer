package androidx.lifecycle;

import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.y;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Transformations {

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$switchMap$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass2 implements Observer {
        final /* synthetic */ MediatorLiveData $result;
        final /* synthetic */ u.a $switchMapFunction;
        private LiveData liveData;

        public AnonymousClass2(u.a aVar, MediatorLiveData mediatorLiveData) {
            this.$switchMapFunction = aVar;
            this.$result = mediatorLiveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b0 onChanged$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return b0.f48488a;
        }

        public final LiveData getLiveData() {
            return this.liveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            LiveData liveData = (LiveData) this.$switchMapFunction.apply(obj);
            LiveData liveData2 = this.liveData;
            if (liveData2 == liveData) {
                return;
            }
            if (liveData2 != null) {
                this.$result.removeSource(liveData2);
            }
            this.liveData = liveData;
            if (liveData != null) {
                MediatorLiveData mediatorLiveData = this.$result;
                mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new c(mediatorLiveData, 2)));
            }
        }

        public final void setLiveData(LiveData liveData) {
            this.liveData = liveData;
        }
    }

    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        MediatorLiveData mediatorLiveData;
        m.f(liveData, "<this>");
        u uVar = new u();
        uVar.f38357a = true;
        if (liveData.isInitialized()) {
            uVar.f38357a = false;
            mediatorLiveData = new MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new i(mediatorLiveData, uVar, 1)));
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 distinctUntilChanged$lambda$4(MediatorLiveData mediatorLiveData, u uVar, Object obj) {
        T value = mediatorLiveData.getValue();
        if (uVar.f38357a || ((value == 0 && obj != null) || (value != 0 && !value.equals(obj)))) {
            uVar.f38357a = false;
            mediatorLiveData.setValue(obj);
        }
        return b0.f48488a;
    }

    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, fz.c transform) {
        m.f(liveData, "<this>");
        m.f(transform, "transform");
        MediatorLiveData mediatorLiveData = liveData.isInitialized() ? new MediatorLiveData(transform.invoke(liveData.getValue())) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new i(mediatorLiveData, transform, 0)));
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 map$lambda$0(MediatorLiveData mediatorLiveData, fz.c cVar, Object obj) {
        mediatorLiveData.setValue(cVar.invoke(obj));
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 map$lambda$1(MediatorLiveData mediatorLiveData, u.a aVar, Object obj) {
        mediatorLiveData.setValue(aVar.apply(obj));
        return b0.f48488a;
    }

    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, fz.c transform) {
        LiveData liveData2;
        m.f(liveData, "<this>");
        m.f(transform, "transform");
        y yVar = new y();
        MediatorLiveData mediatorLiveData = (liveData.isInitialized() && (liveData2 = (LiveData) transform.invoke(liveData.getValue())) != null && liveData2.isInitialized()) ? new MediatorLiveData(liveData2.getValue()) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new aj.c(transform, yVar, mediatorLiveData, 1)));
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 switchMap$lambda$3(fz.c cVar, y yVar, MediatorLiveData mediatorLiveData, Object obj) {
        LiveData liveData = (LiveData) cVar.invoke(obj);
        Object obj2 = yVar.f38361a;
        if (obj2 != liveData) {
            if (obj2 != null) {
                mediatorLiveData.removeSource((LiveData) obj2);
            }
            yVar.f38361a = liveData;
            if (liveData != null) {
                mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new c(mediatorLiveData, 1)));
            }
        }
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 switchMap$lambda$3$lambda$2(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(obj);
        return b0.f48488a;
    }

    @qy.c
    public static final /* synthetic */ LiveData map(LiveData liveData, u.a mapFunction) {
        m.f(liveData, "<this>");
        m.f(mapFunction, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new i(mediatorLiveData, mapFunction, 2)));
        return mediatorLiveData;
    }

    @qy.c
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, u.a switchMapFunction) {
        m.f(liveData, "<this>");
        m.f(switchMapFunction, "switchMapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new AnonymousClass2(switchMapFunction, mediatorLiveData));
        return mediatorLiveData;
    }
}
